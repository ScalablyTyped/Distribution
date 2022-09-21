package typings.steamcommunity.mod

import typings.steamcommunity.anon.Errorkeystringany
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * @param err `null` on success, an `Error` object on failure.
  */
type Callback = js.Function1[/* err */ CallbackError, Any]

/** `null` on success, an `Error` object on failure. */
type CallbackError = Errorkeystringany | Null

type EventEmitter = typings.node.eventsMod.^

type SteamID = typings.steamid.mod.^

type appid = Double

/** Unique and can change after a trade. */
type assetid = Double | String

type cid = Double | String

/**
  * In a nutshell, a classid "owns" an instanceid. The classid is all you need to get a general overview of an item.
  * For example, items with the same classid will pretty much always have the same name and image.
  */
type classid = Double

/** 2 for csgo... */
type contextid = Double

type gid = SteamID | String

/** An ID that describes an item instance that inherits properties from a class with the class id being noted in the instance (totally not unique). */
type instanceid = Double

type packageid = Double | String

type userid = SteamID | String
