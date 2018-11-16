package typings
package qlikDashVisualizationextensionsLib.RootAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRoot extends js.Object {
  var navigation: qlikDashVisualizationextensionsLib.NavigationAPINs.INavigation = js.native
  /**
           * Calls the Qlik Sense repository.
           * @param path - Path to the Qlik Sense repository.
           * Refer to Qlik Sense repository documentation for the available paths.
           * @param [method] - Optional. HTTP method. Default is GET.
           * @param [body] - Optional. Body of the post.
           * @return - A promise of a Qlik engine reply.
           */
  def callRepository(path: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Calls the Qlik Sense repository.
           * @param path - Path to the Qlik Sense repository.
           * Refer to Qlik Sense repository documentation for the available paths.
           * @param [method] - Optional. HTTP method. Default is GET.
           * @param [body] - Optional. Body of the post.
           * @return - A promise of a Qlik engine reply.
           */
  def callRepository(path: java.lang.String, method: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Calls the Qlik Sense repository.
           * @param path - Path to the Qlik Sense repository.
           * Refer to Qlik Sense repository documentation for the available paths.
           * @param [method] - Optional. HTTP method. Default is GET.
           * @param [body] - Optional. Body of the post.
           * @return - A promise of a Qlik engine reply.
           */
  def callRepository(path: java.lang.String, method: java.lang.String, body: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets a reference to the current app. Use the currApp method in an extension to get a reference to the app currently displayed.
           * @param [reference] - Optional. Reference to extension object. Introduced in version 1.1.
           * @return - An App JavaScript object with app methods.
           */
  def currApp(): qlikDashVisualizationextensionsLib.AppAPINs.IApp = js.native
  /**
           * Gets a reference to the current app. Use the currApp method in an extension to get a reference to the app currently displayed.
           * @param [reference] - Optional. Reference to extension object. Introduced in version 1.1.
           * @return - An App JavaScript object with app methods.
           */
  def currApp(`object`: js.Any): qlikDashVisualizationextensionsLib.AppAPINs.IApp = js.native
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
  def getAppList(callback: js.Any): scala.Unit = js.native
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
  def getAppList(callback: js.Any, config: js.Any): scala.Unit = js.native
  /**
           * Gets a list of extensions installed for Qlik Sense. The reply contains all extensions,
           * that is widget libraries, visualization extensions and mashups.
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def getExtensionList(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets a list of extensions installed for Qlik Sense. The reply contains all extensions,
           * that is widget libraries, visualization extensions and mashups.
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def getExtensionList(callback: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
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
  def getGlobal(config: js.Any): js.Any = js.native
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
  def openApp(appId: java.lang.String): js.Any = js.native
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
  def openApp(appId: java.lang.String, config: js.Any): js.Any = js.native
  /**
           * Registers an extension for use in this mashup. The extension is not installed on the
           * Qlik Sense server and only available in the session where it is created.
           * As long as a JavaScript module is created in the correct format, it can be sent to
           * the registerExtension function.
           * @param id - Set the ID of the visualization extension.
           * @param impl - Set the extension implementation.
           * @param [metadata] - Optional. Extension meta-data, same format as the QEXT file. Default: {"type":"visualization"}
           */
  def registerExtension(id: java.lang.String, impl: js.Any): scala.Unit = js.native
  /**
           * Registers an extension for use in this mashup. The extension is not installed on the
           * Qlik Sense server and only available in the session where it is created.
           * As long as a JavaScript module is created in the correct format, it can be sent to
           * the registerExtension function.
           * @param id - Set the ID of the visualization extension.
           * @param impl - Set the extension implementation.
           * @param [metadata] - Optional. Extension meta-data, same format as the QEXT file. Default: {"type":"visualization"}
           */
  def registerExtension(id: java.lang.String, impl: js.Any, metadata: js.Any): scala.Unit = js.native
  /**
           * Sends a resize event to all Qlik Sense objects.
           * @param [ID] - Object id. Optional: if no ID resize event will be sent to all objects.
           */
  def resize(): scala.Unit = js.native
  /**
           * Sends a resize event to all Qlik Sense objects.
           * @param [ID] - Object id. Optional: if no ID resize event will be sent to all objects.
           */
  def resize(ID: java.lang.String): scala.Unit = js.native
  /**
           * Creates a session app JavaScript object with app methods.
           * @param [config] - Additional configuration parameters
           * @return - App JavaScript object with app methods.
           */
  def sessionApp(): qlikDashVisualizationextensionsLib.AppAPINs.IApp = js.native
  /**
           * Creates a session app JavaScript object with app methods.
           * @param [config] - Additional configuration parameters
           * @return - App JavaScript object with app methods.
           */
  def sessionApp(config: ISessionAppConfig): qlikDashVisualizationextensionsLib.AppAPINs.IApp = js.native
  /**
           * Creates a session app JavaScript object with app methods from an existing app. You can create one session app per app.
           * @param [appId] - App id of the app to base the session app upon.
           * @param [config] - Additional configuration parameters.
           * @return - App JavaScript object with app methods.
           */
  def sessionAppFromApp(appId: java.lang.String): qlikDashVisualizationextensionsLib.AppAPINs.IApp = js.native
  /**
           * Creates a session app JavaScript object with app methods from an existing app. You can create one session app per app.
           * @param [appId] - App id of the app to base the session app upon.
           * @param [config] - Additional configuration parameters.
           * @return - App JavaScript object with app methods.
           */
  def sessionAppFromApp(appId: java.lang.String, config: ISessionAppConfig): qlikDashVisualizationextensionsLib.AppAPINs.IApp = js.native
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
  def setLanguage(lang: java.lang.String): scala.Unit = js.native
  /**
           * Registers a callback for error handling. Standard Qlik Sense error
           * handling is used if this method is not called.
           * @param onError - Error handling function
           * @param [onWarning] - Optional. Warning handling function. Introduced in version 2.1.
           */
  def setOnError(onError: js.Any): scala.Unit = js.native
  /**
           * Registers a callback for error handling. Standard Qlik Sense error
           * handling is used if this method is not called.
           * @param onError - Error handling function
           * @param [onWarning] - Optional. Warning handling function. Introduced in version 2.1.
           */
  def setOnError(onError: js.Any, onWarning: js.Any): scala.Unit = js.native
  /**
           * Create a QTable object that wraps data in your extension and provides an object oriented interface.
           * @param ext - Extension or angular scope for the extension.
           * @param [path] - Optional. Path to the hypercube. Default: qHyperCube
           * @return - A QTable object that holds data and options for the table.
           */
  def table(ext: js.Any): qlikDashVisualizationextensionsLib.TableAPINs.IQTable = js.native
  /**
           * Create a QTable object that wraps data in your extension and provides an object oriented interface.
           * @param ext - Extension or angular scope for the extension.
           * @param [path] - Optional. Path to the hypercube. Default: qHyperCube
           * @return - A QTable object that holds data and options for the table.
           */
  def table(ext: js.Any, path: java.lang.String): qlikDashVisualizationextensionsLib.TableAPINs.IQTable = js.native
}

