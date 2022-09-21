package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AccountIDMask: /* 0xFFFFFFFF */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("AccountIDMask").asInstanceOf[/* 0xFFFFFFFF */ Double]

inline def AccountInstanceMask: /* 0x000FFFFF */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("AccountInstanceMask").asInstanceOf[/* 0x000FFFFF */ Double]

inline def fromIndividualAccountID(accountid: String): SteamID = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIndividualAccountID")(accountid.asInstanceOf[js.Any]).asInstanceOf[SteamID]
inline def fromIndividualAccountID(accountid: js.BigInt): SteamID = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIndividualAccountID")(accountid.asInstanceOf[js.Any]).asInstanceOf[SteamID]
/**
  * Create an individual SteamID in the public universe given an accountid
  * @param accountid - The user's account ID
  */
inline def fromIndividualAccountID(accountid: Double): SteamID = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIndividualAccountID")(accountid.asInstanceOf[js.Any]).asInstanceOf[SteamID]

type getSteam2RenderedID = js.Function1[/* newerFormat */ js.UndefOr[Boolean], String]

/**
  * Renders the ID in Steam3 format (e.g. "[U:1:46143802]")
  */
type getSteam3RenderedID = js.Function0[String]

/**
  * Renders the ID in 64-bit decimal format, as a string (e.g. "76561198006409530")
  */
type getSteamID64 = js.Function0[String]
