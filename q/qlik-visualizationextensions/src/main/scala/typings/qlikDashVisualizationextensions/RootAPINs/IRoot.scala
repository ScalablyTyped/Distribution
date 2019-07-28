package typings.qlikDashVisualizationextensions.RootAPINs

import typings.angular.angularMod.IPromise
import typings.qlikDashVisualizationextensions.AppAPINs.IApp
import typings.qlikDashVisualizationextensions.NavigationAPINs.INavigation
import typings.qlikDashVisualizationextensions.TableAPINs.IQTable
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRoot extends js.Object {
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
  var navigation: INavigation = js.native
  /**
    * Calls the Qlik Sense repository.
    * @param path - Path to the Qlik Sense repository.
    * Refer to Qlik Sense repository documentation for the available paths.
    * @param [method] - Optional. HTTP method. Default is GET.
    * @param [body] - Optional. Body of the post.
    * @return - A promise of a Qlik engine reply.
    */
  def callRepository(path: String): IPromise[_] = js.native
  def callRepository(path: String, method: String): IPromise[_] = js.native
  def callRepository(path: String, method: String, body: String): IPromise[_] = js.native
  /**
    * Gets a reference to the current app. Use the currApp method in an extension to get a reference to the app currently displayed.
    * @param [reference] - Optional. Reference to extension object. Introduced in version 1.1.
    * @return - An App JavaScript object with app methods.
    */
  def currApp(): IApp = js.native
  def currApp(`object`: js.Any): IApp = js.native
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
  def getAppList(callback: js.Any): Unit = js.native
  def getAppList(callback: js.Any, config: js.Any): Unit = js.native
  /**
    * Gets a list of extensions installed for Qlik Sense. The reply contains all extensions,
    * that is widget libraries, visualization extensions and mashups.
    * @param [callback] - Optional. Callback method.
    * @return - A promise of a Qlik engine reply.
    */
  def getExtensionList(): IPromise[_] = js.native
  def getExtensionList(callback: js.Any): IPromise[_] = js.native
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
  def openApp(appId: String): js.Any = js.native
  def openApp(appId: String, config: js.Any): js.Any = js.native
  /**
    * Registers an extension for use in this mashup. The extension is not installed on the
    * Qlik Sense server and only available in the session where it is created.
    * As long as a JavaScript module is created in the correct format, it can be sent to
    * the registerExtension function.
    * @param id - Set the ID of the visualization extension.
    * @param impl - Set the extension implementation.
    * @param [metadata] - Optional. Extension meta-data, same format as the QEXT file. Default: {"type":"visualization"}
    */
  def registerExtension(id: String, impl: js.Any): Unit = js.native
  def registerExtension(id: String, impl: js.Any, metadata: js.Any): Unit = js.native
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
  def setOnError(onError: js.Any): Unit = js.native
  def setOnError(onError: js.Any, onWarning: js.Any): Unit = js.native
  /**
    * Create a QTable object that wraps data in your extension and provides an object oriented interface.
    * @param ext - Extension or angular scope for the extension.
    * @param [path] - Optional. Path to the hypercube. Default: qHyperCube
    * @return - A QTable object that holds data and options for the table.
    */
  def table(ext: js.Any): IQTable = js.native
  def table(ext: js.Any, path: String): IQTable = js.native
}

