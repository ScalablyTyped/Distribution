package typings.qlikVisualizationextensions

import typings.angular.mod.IPromise
import typings.qlikVisualizationextensions.AppAPI.IApp
import typings.qlikVisualizationextensions.NavigationAPI.INavigation
import typings.qlikVisualizationextensions.TableAPI.IQTable
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RootAPI {
  
  trait IAppConfig extends StObject {
    
    /**
      * Optional Qlik host.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. Unique identity for the session. If omitted, the session will be shared.
      */
    var identity: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. Use SSL.
      */
    var isSecure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional. Open app without loading data. Introduced in version 1.1.
      */
    var openWithoutData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Port number.
      */
    var port: String | Double
    
    /**
      * Optional. Qlik virtual proxy. "/" if no proxy.
      */
    var prefix: js.UndefOr[String] = js.undefined
  }
  object IAppConfig {
    
    inline def apply(port: String | Double): IAppConfig = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAppConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAppConfig] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
      
      inline def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
      
      inline def setOpenWithoutData(value: Boolean): Self = StObject.set(x, "openWithoutData", value.asInstanceOf[js.Any])
      
      inline def setOpenWithoutDataUndefined: Self = StObject.set(x, "openWithoutData", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait IGlobalConfig extends StObject {
    
    /**
      * Qlik Sense host
      */
    var host: String
    
    /**
      * Unique identity for the session. If omitted, the session will be shared.
      */
    var identity: String
    
    /**
      * Use SSL
      */
    var isSecure: Boolean
    
    /**
      * Port number
      */
    var port: String
    
    /**
      * Qlik Sense virtual proxy. / if no virtual proxy
      */
    var prefix: String
  }
  object IGlobalConfig {
    
    inline def apply(host: String, identity: String, isSecure: Boolean, port: String, prefix: String): IGlobalConfig = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGlobalConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGlobalConfig] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRoot extends StObject {
    
    /**
      * promise object
      * Promise utility that can be used for asynchronous operations.
      * Very useful for the paint method to indicate when the rendering is completed.
      * executor
      * Type: Function
      * The executing function with two parameters:
      * resolve
      * reject
      */
    var Promise: PromiseConstructor = js.native
    
    /**
      * Calls the Qlik Sense repository.
      * @param path - Path to the Qlik Sense repository.
      * Refer to Qlik Sense repository documentation for the available paths.
      * @param [method] - Optional. HTTP method. Default is GET.
      * @param [body] - Optional. Body of the post.
      * @return - A promise of a Qlik engine reply.
      */
    def callRepository(path: String): IPromise[Any] = js.native
    def callRepository(path: String, method: String): IPromise[Any] = js.native
    def callRepository(path: String, method: String, body: String): IPromise[Any] = js.native
    def callRepository(path: String, method: Unit, body: String): IPromise[Any] = js.native
    
    /**
      * Gets a reference to the current app. Use the currApp method in an extension to get a reference to the app currently displayed.
      * @param [reference] - Optional. Reference to extension object. Introduced in version 1.1.
      * @return - An App JavaScript object with app methods.
      */
    def currApp(): IApp = js.native
    def currApp(`object`: Any): IApp = js.native
    
    /**
      * Gets a list of Qlik Sense apps that you potentially can connect to and registers a callback to receive the data.
      * The getAppList method opens a WebSocket, gets the app list, and then closes the WebSocket.
      * @param callback - Callback method.
      * @param [config] - Optional. Additional configuration parameters:
      * Name | Type | Descr | Name
      * host | String | Optional. Qlik host. | host
      * port | String or integer | Port number. | port
      * prefix | String | Optional. Qlik virtual proxy. "/" if no proxy. | prefix
      * isSecure | Boolean | Optional. Use SSL. | isSecure
      * openWithoutData | Boolean | Optional. Open app without loading data. Introduced in version 1.1. | openWithoutData
      * identity | String | Optional. Unique identity for the session. If omitted, the session will be shared. | identity
      */
    def getAppList(callback: Any): Unit = js.native
    def getAppList(callback: Any, config: Any): Unit = js.native
    
    /**
      * Gets a list of extensions installed for Qlik Sense. The reply contains all extensions,
      * that is widget libraries, visualization extensions and mashups.
      * @param [callback] - Optional. Callback method.
      * @return - A promise of a Qlik engine reply.
      */
    def getExtensionList(): IPromise[Any] = js.native
    def getExtensionList(callback: Any): IPromise[Any] = js.native
    
    /**
      * Opens a WebSocekt connection to the Qlik engine for global methods.
      * @param [config] - Optional. Parameters:
      * Name | Type | Description
      * host | String | Qlik Sense host
      * port | String | Port number
      * prefix | String | Qlik Sense virtual proxy. / if no virtual proxy
      * isSecure | Boolean | Use SSL
      * identity | String | Unique identity for the session. If omitted, the session will be shared.
      * @return - A global JavaScript object with global methods.
      */
    def getGlobal(config: Any): Any = js.native
    
    var navigation: INavigation = js.native
    
    /**
      * Opens a Qlik Sense app. You can open multiple apps.
      * Most other methods are defined on the app.
      * @param appId The app id.
      * @param [config] Optional. Additional configuration parameters:
      *     Name   |   Type   | Descr
      *     host   |   String   |   Optional. Qlik host.
      *     port   |   String or Integer   |   Port number.
      *     prefix |   String   |   Optional. Qlik virtual proxy. "/" if no proxy.
      *     isSecure   |   Boolean   |   Optional. Use SSL.
      *     openWithoutData   |   Boolean   |   Optional. Open app without loading data. Introduced in version 1.1.
      *     identity   |   String   |   Optional. Unique identity for the session. If omitted, the session will be shared.
      *     Parameter updated in version 2.2.
      * @return - App JavaScript object with app methods.
      */
    def openApp(appId: String): Any = js.native
    def openApp(appId: String, config: Any): Any = js.native
    
    /**
      * Registers an extension for use in this mashup. The extension is not installed on the
      * Qlik Sense server and only available in the session where it is created.
      * As long as a JavaScript module is created in the correct format, it can be sent to
      * the registerExtension function.
      * @param id - Set the ID of the visualization extension.
      * @param impl - Set the extension implementation.
      * @param [metadata] - Optional. Extension meta-data, same format as the QEXT file. Default: {"type":"visualization"}
      */
    def registerExtension(id: String, impl: Any): Unit = js.native
    def registerExtension(id: String, impl: Any, metadata: Any): Unit = js.native
    
    /**
      * Sends a resize event to all Qlik Sense objects.
      * @param [ID] - Object id. Optional: if no ID resize event will be sent to all objects.
      */
    def resize(): Unit = js.native
    def resize(ID: String): Unit = js.native
    
    /**
      * Creates a session app JavaScript object with app methods.
      * @param [config] - Additional configuration parameters
      * @return - App JavaScript object with app methods.
      */
    def sessionApp(): IApp = js.native
    def sessionApp(config: ISessionAppConfig): IApp = js.native
    
    /**
      * Creates a session app JavaScript object with app methods from an existing app. You can create one session app per app.
      * @param [appId] - App id of the app to base the session app upon.
      * @param [config] - Additional configuration parameters.
      * @return - App JavaScript object with app methods.
      */
    def sessionAppFromApp(appId: String): IApp = js.native
    def sessionAppFromApp(appId: String, config: ISessionAppConfig): IApp = js.native
    
    /**
      * Sets a specific language for the Qlik Sense session.
      * Language should be defined before the app is opened meaning the setLanguage
      * method should be called before the openApp method is called.
      * @param lang - Language code. Can be:
      *       # German: short: de long: de-DE
      *       # English: short: en long: en-US
      *       # Spanish: short: es long: es-ES
      *       # French: short: fr long: fr-FR
      *       # Italian: short: it long: it-IT
      *       # Japanese: short: ja long: ja-JP
      *       # Korean: (introduced in version 3.0) short: ko long: ko-KR
      *       # Dutch: short: nl long: nl-NL
      *       # Polish: (introduced in version 3.0) short: pl long: pl-PL
      *       # Brazilian Portuguese: short: pt long: pt-BR
      *       # Russian: short: ru long: ru-RU
      *       # Swedish: short: sv long: sv-SE
      *       # Turkish: (introduced in version 3.0) short: tr long: tr-TR
      *       # Simplified Chinese: short: Do not use! long: zh-CN
      *       # Traditional Chinese: (introduced in version 3.0) short: Do not use! long: zh-TW
      */
    def setLanguage(lang: String): Unit = js.native
    
    /**
      * Registers a callback for error handling. Standard Qlik Sense error
      * handling is used if this method is not called.
      * @param onError - Error handling function
      * @param [onWarning] - Optional. Warning handling function. Introduced in version 2.1.
      */
    def setOnError(onError: Any): Unit = js.native
    def setOnError(onError: Any, onWarning: Any): Unit = js.native
    
    /**
      * Create a QTable object that wraps data in your extension and provides an object oriented interface.
      * @param ext - Extension or angular scope for the extension.
      * @param [path] - Optional. Path to the hypercube. Default: qHyperCube
      * @return - A QTable object that holds data and options for the table.
      */
    def table(ext: Any): IQTable = js.native
    def table(ext: Any, path: String): IQTable = js.native
  }
  
  trait ISessionAppConfig extends StObject {
    
    /**
      * Optional Qlik host.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. Unique identity for the session. If omitted, the session will be shared.
      */
    var identity: String
    
    /**
      * Optional. Use SSL.
      */
    var isSecure: Boolean
    
    /**
      * Optional. Open app without loading data.
      */
    var openWithoutData: Boolean
    
    /**
      * Port number.
      */
    var port: String | Double
    
    /**
      * Optional. Qlik virtual proxy. "/" if no proxy.
      */
    var prefix: String
  }
  object ISessionAppConfig {
    
    inline def apply(
      identity: String,
      isSecure: Boolean,
      openWithoutData: Boolean,
      port: String | Double,
      prefix: String
    ): ISessionAppConfig = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], openWithoutData = openWithoutData.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISessionAppConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISessionAppConfig] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
      
      inline def setOpenWithoutData(value: Boolean): Self = StObject.set(x, "openWithoutData", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
