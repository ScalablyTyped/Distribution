package typings.reactNativeGoogleAnalyticsBridge

import typings.reactNativeGoogleAnalyticsBridge.dataLayerEventMod.DataLayerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleTagManagerMod {
  
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
  class default ()
    extends StObject
       with GoogleTagManager
  object default {
    
    @JSImport("react-native-google-analytics-bridge/dist/GoogleTagManager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Retrieves a boolean value with the given key from the opened container.
      * @example GoogleTagManager.boolForKey("key").then(val => console.log(val));
      * @param {string} key
      * @returns {Promise<boolean>}
      */
    /* static member */
    @scala.inline
    def boolForKey(key: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("boolForKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Retrieves a number with the given key from the opened container.
      * @example GoogleTagManager.doubleForKey("key").then(val => console.log(val));
      * @param {string} key
      * @returns {Promise<number>}
      */
    /* static member */
    @scala.inline
    def doubleForKey(key: js.Any): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleForKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    
    /**
      * Call once to open the container for all subsequent static calls.
      * @example
      * GoogleTagManager.openContainerWithId('GT-NZT48').then((..) => ..)
      * @param {string} containerId
      * @returns {Promise<boolean>}
      */
    /* static member */
    @scala.inline
    def openContainerWithId(containerId: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("openContainerWithId")(containerId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
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
    /* static member */
    @scala.inline
    def pushDataLayerEvent(event: DataLayerEvent): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushDataLayerEvent")(event.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Refreshes the GTM container.
      * According to Tag Manager documentations for Android can be called once every 15 minutes.
      * No such limitations has been mentioned for iOS containers, though.
      * @example
      * GoogleTagManager.refreshContainer().then((..) => ..)
      * @returns {Promise<boolean>}
      */
    /* static member */
    @scala.inline
    def refreshContainer(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshContainer")().asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Register Function Call tag handler
      * @param {String} functionName
      * @param {Function} handler
      */
    /* static member */
    @scala.inline
    def registerFunctionCallTagHandler(functionName: js.Any, handler: js.Any): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunctionCallTagHandler")(functionName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Sets logger to verbose, default is warning
      * @param {boolean} enabled
      */
    /* static member */
    @scala.inline
    def setVerboseLoggingEnabled(enabled: Boolean): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("setVerboseLoggingEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Retrieves a string with the given key from the opened container.
      * @example GoogleTagManager.stringForKey("key").then(val => console.log(val));
      * @param {string} key
      * @returns {Promise<string>}
      */
    /* static member */
    @scala.inline
    def stringForKey(key: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringForKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
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
  trait GoogleTagManager extends StObject
}
