package typings.seleniumWebdriver.mod

import typings.seleniumWebdriver.httpMod.Executor
import typings.seleniumWebdriver.seleniumWebdriverStrings.denied
import typings.seleniumWebdriver.seleniumWebdriverStrings.granted
import typings.seleniumWebdriver.seleniumWebdriverStrings.prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "ChromiumWebDriver")
@js.native
open class ChromiumWebDriver protected () extends WebDriver {
  def this(session: js.Promise[Session], executor: Executor) = this()
  // region Constructors
  /**
    * @param {!(Session|Promise<!Session>)} session Either a
    *     known session or a promise that will be resolved to a session.
    * @param {!command.Executor} executor The executor to use when sending
    *     commands to the browser.
    */
  def this(session: Session, executor: Executor) = this()
  
  /**
    * Schedules a command to delete Chromium network emulation settings.
    * @return {!Promise} A promise that will be resolved when network
    *     emulation settings have been deleted.
    */
  def deleteNetworkConditions(): js.Promise[Any] = js.native
  
  /**
    * Returns an error message when there is any issue in a Cast session.
    * @return {!promise.Thenable<void>} A promise that will be resolved
    *     when the mirror command has been issued to the device.
    */
  def getCastIssueMessage(): js.Promise[String] = js.native
  
  /**
    * Returns the list of cast sinks (Cast devices) available to the Chrome media router.
    *
    * @return {!promise.Thenable<void>} A promise that will be resolved with an array of Strings
    *   containing the friendly device names of available cast sink targets.
    */
  def getCastSinks(): js.Promise[js.Array[String]] = js.native
  
  /**
    * Schedules a command to get Chromium network emulation settings.
    * @return {!Promise} A promise that will be resolved when network
    *     emulation settings are retrievied.
    */
  def getNetworkConditions(): js.Promise[Any] = js.native
  
  /**
    * Schedules a command to launch Chrome App with given ID.
    * @param {string} id ID of the App to launch.
    * @return {!Promise<void>} A promise that will be resolved
    *     when app is launched.
    */
  def launchApp(id: String): js.Promise[Unit] = js.native
  
  /**
    * Sends an arbitrary devtools command to the browser and get the result.
    *
    * @param {string} cmd The name of the command to send.
    * @param {Object=} params The command parameters.
    * @return {!Promise<string>} A promise that will be resolved when the command
    *     has finished.
    * @see <https://chromedevtools.github.io/devtools-protocol/>
    */
  def sendAndGetDevToolsCommand(cmd: String, params: js.Object): js.Promise[String] = js.native
  
  /**
    * Sends an arbitrary devtools command to the browser.
    *
    * @param {string} cmd The name of the command to send.
    * @param {Object=} params The command parameters.
    * @return {!Promise<void>} A promise that will be resolved when the command
    *     has finished.
    * @see <https://chromedevtools.github.io/devtools-protocol/>
    */
  def sendDevToolsCommand(cmd: String, params: js.Object): js.Promise[Unit] = js.native
  
  /**
    * Selects a cast sink (Cast device) as the recipient of media router intents (connect or play).
    *
    * @param {String} deviceName name of the target device.
    * @return {!promise.Thenable<void>} A promise that will be resolved
    *     when the target device has been selected to respond further webdriver commands.
    */
  def setCastSinkToUse(deviceName: String): js.Promise[Unit] = js.native
  
  /**
    * Sends a DevTools command to change the browser's download directory.
    *
    * @param {string} path The desired download directory.
    * @return {!Promise<void>} A promise that will be resolved when the command
    *     has finished.
    * @see #sendDevToolsCommand
    */
  def setDownloadPath(path: String): js.Promise[Unit] = js.native
  
  /**
    * This function is a no-op as file detectors are not supported by this
    * implementation.
    * @override
    */
  def setFileDetector(): Unit = js.native
  
  /**
    * Schedules a command to set Chromium network emulation settings.
    *
    * __Sample Usage:__
    *
    *  driver.setNetworkConditions({
    *    offline: false,
    *    latency: 5, // Additional latency (ms).
    *    download_throughput: 500 * 1024, // Maximal aggregated download throughput.
    *    upload_throughput: 500 * 1024 // Maximal aggregated upload throughput.
    * });
    *
    * @param {Object} spec Defines the network conditions to set
    * @return {!Promise<void>} A promise that will be resolved when network
    *     emulation settings are set.
    */
  def setNetworkConditions(spec: js.Object): js.Promise[Unit] = js.native
  
  /**
    * Set a permission state to the given value.
    *
    * @param {string} name A name of the permission to update.
    * @param {('granted'|'denied'|'prompt')} state State to set permission to.
    * @returns {!Promise<Object>} A promise that will be resolved when the
    *     command has finished.
    * @see <https://w3c.github.io/permissions/#permission-registry> for valid
    *     names
    */
  def setPermission(name: String, state: granted | denied | prompt): js.Promise[js.Object] = js.native
  
  /**
    * Initiates tab mirroring for the current browser tab on the specified device.
    *
    * @param {String} deviceName name of the target device.
    * @return {!promise.Thenable<void>} A promise that will be resolved
    *     when the mirror command has been issued to the device.
    */
  def startCastTabMirroring(deviceName: String): js.Promise[Unit] = js.native
  
  /**
    * Initiates desktop mirroring for the current browser tab on the specified device.
    *
    * @param {String} deviceName name of the target device.
    * @return {!promise.Thenable<void>} A promise that will be resolved
    *     when the mirror command has been issued to the device.
    */
  def startDesktopMirroring(deviceName: String): js.Promise[Unit] = js.native
  
  /**
    * Stops casting from media router to the specified device, if connected.
    *
    * @param {String} deviceName name of the target device.
    * @return {!promise.Thenable<void>} A promise that will be resolved
    *     when the stop command has been issued to the device.
    */
  def stopCasting(deviceName: String): js.Promise[Unit] = js.native
}
