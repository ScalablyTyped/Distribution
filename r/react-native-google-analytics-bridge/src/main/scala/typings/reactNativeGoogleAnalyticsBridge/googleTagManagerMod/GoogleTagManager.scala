package typings.reactNativeGoogleAnalyticsBridge.googleTagManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Can only be used with one container. All functions returns a Promise.
  *
  * @name GoogleTagManager
  * @example
  * import { GoogleTagManager } from "react-native-google-analytics-bridge";
  * GoogleTagManager.openContainerWithId("GT-NZT48")
  *   .then(() => GoogleTagManager.stringForKey("pack"))
  *   .then(str => console.log("Pack: ", str));
  */
@js.native
trait GoogleTagManager extends js.Object

