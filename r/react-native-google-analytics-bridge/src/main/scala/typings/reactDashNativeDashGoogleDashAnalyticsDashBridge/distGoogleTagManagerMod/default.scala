package typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distGoogleTagManagerMod

import typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsDataLayerEventMod.DataLayerEvent
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
@JSImport("react-native-google-analytics-bridge/dist/GoogleTagManager", JSImport.Default)
@js.native
class default () extends GoogleTagManager

/* static members */
@JSImport("react-native-google-analytics-bridge/dist/GoogleTagManager", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Retrieves a boolean value with the given key from the opened container.
    * @example GoogleTagManager.boolForKey("key").then(val => console.log(val));
    * @param {string} key
    * @returns {Promise<boolean>}
    */
  def boolForKey(key: String): js.Promise[Boolean] = js.native
  /**
    * Retrieves a number with the given key from the opened container.
    * @example GoogleTagManager.doubleForKey("key").then(val => console.log(val));
    * @param {string} key
    * @returns {Promise<number>}
    */
  def doubleForKey(key: js.Any): js.Promise[Double] = js.native
  /**
    * Call once to open the container for all subsequent static calls.
    * @example
    * GoogleTagManager.openContainerWithId('GT-NZT48').then((..) => ..)
    * @param {string} containerId
    * @returns {Promise<boolean>}
    */
  def openContainerWithId(containerId: String): js.Promise[Boolean] = js.native
  /**
    * Push a datalayer event for Google Analytics through Google Tag Manager. The event must have at least one key "event" with event name.
    * @example
    * GoogleTagManager.pushDataLayerEvent({
    *   event: "eventName",
    *   pageId: "/home"
    * }).then(success => console.log(success));
    * @param {DataLayerEvent} event An Map<String, Object> containing key and value pairs. It must have at least one key "event" with event name
    * @returns {Promise<boolean>}
    */
  def pushDataLayerEvent(event: DataLayerEvent): js.Promise[Boolean] = js.native
  /**
    * Refreshes the GTM container.
    * According to Tag Manager documentations for Android can be called once every 15 minutes.
    * No such limitations has been mentioned for iOS containers, though.
    * @example
    * GoogleTagManager.refreshContainer().then((..) => ..)
    * @returns {Promise<boolean>}
    */
  def refreshContainer(): js.Promise[Boolean] = js.native
  /**
    * Register Function Call tag handler
    * @param {String} functionName
    * @param {Function} handler
    */
  def registerFunctionCallTagHandler(functionName: js.Any, handler: js.Any): js.Promise[Boolean] = js.native
  /**
    * Sets logger to verbose, default is warning
    * @param {boolean} enabled
    */
  def setVerboseLoggingEnabled(enabled: Boolean): js.Promise[Boolean] = js.native
  /**
    * Retrieves a string with the given key from the opened container.
    * @example GoogleTagManager.stringForKey("key").then(val => console.log(val));
    * @param {string} key
    * @returns {Promise<string>}
    */
  def stringForKey(key: String): js.Promise[String] = js.native
}

