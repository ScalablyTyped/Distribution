package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def AccountIDMask: /* 0xFFFFFFFF */ scala.Double = typings.steamid.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AccountIDMask").asInstanceOf[/* 0xFFFFFFFF */ scala.Double]

@scala.inline
def AccountInstanceMask: /* 0x000FFFFF */ scala.Double = typings.steamid.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AccountInstanceMask").asInstanceOf[/* 0x000FFFFF */ scala.Double]

@scala.inline
def fromIndividualAccountID(accountid: java.lang.String): typings.steamid.mod.SteamID = typings.steamid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fromIndividualAccountID")(accountid.asInstanceOf[js.Any]).asInstanceOf[typings.steamid.mod.SteamID]
/**
  * Create an individual SteamID in the public universe given an accountid
  * @param accountid - The user's account ID
  */
@scala.inline
def fromIndividualAccountID(accountid: scala.Double): typings.steamid.mod.SteamID = typings.steamid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fromIndividualAccountID")(accountid.asInstanceOf[js.Any]).asInstanceOf[typings.steamid.mod.SteamID]

type getSteam2RenderedID = js.Function1[/* newerFormat */ js.UndefOr[scala.Boolean], java.lang.String]

/**
  * Render this SteamID into Steam3 textual format
  */
type getSteam3RenderedID = js.Function0[java.lang.String]

/**
  * Render this SteamID into 64-bit numeric format
  */
type getSteamID64 = js.Function0[java.lang.String]
