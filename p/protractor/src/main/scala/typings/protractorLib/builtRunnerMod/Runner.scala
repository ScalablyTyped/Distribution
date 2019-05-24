package typings
package protractorLib.builtRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/runner", "Runner")
@js.native
class Runner protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(config: protractorLib.builtConfigMod.Config) = this()
  var config_ : protractorLib.builtConfigMod.Config = js.native
  var driverprovider_ : protractorLib.builtDriverProvidersMod.DriverProvider = js.native
  var frameworkUsesAfterEach: scala.Boolean = js.native
  var o: js.Any = js.native
  var plugins_ : protractorLib.builtPluginsMod.Plugins = js.native
  var preparer_ : js.Any = js.native
  var ready_ : js.UndefOr[js.Promise[scala.Unit]] = js.native
  var restartPromise: qLib.qMod.Promise[_] = js.native
  /**
    * Called after each test finishes.
    *
    * Responsible for `restartBrowserBetweenTests`
    *
    * @public
    * @return {q.Promise} A promise that will resolve when the work here is done
    */
  def afterEach(): qLib.qMod.Promise[scala.Unit] = js.native
  /**
    * Get the control flow used by this runner.
    * @return {Object} WebDriver control flow.
    */
  def controlFlow(): js.Any = js.native
  /**
    * Create a new driver from a driverProvider. Then set up a
    * new protractor instance using this driver.
    * This is used to set up the initial protractor instances and any
    * future ones.
    *
    * @param {Plugin} plugins The plugin functions
    * @param {ProtractorBrowser=} parentBrowser The browser which spawned this one
    *
    * @return {Protractor} a protractor instance.
    * @public
    */
  def createBrowser(plugins: js.Any): js.Any = js.native
  def createBrowser(plugins: js.Any, parentBrowser: protractorLib.builtBrowserMod.ProtractorBrowser): js.Any = js.native
  /**
    * Responsible for cleaning up test run and exiting the process.
    * @private
    * @param {int} Standard unix exit code
    */
  def exit_(exitCode: scala.Double): js.Any = js.native
  /**
    * Getter for the Runner config object
    * @public
    * @return {Object} config
    */
  def getConfig(): protractorLib.builtConfigMod.Config = js.native
  /**
    * Grab driver provider based on type
    * @private
    *
    * Priority
    * 1) if directConnect is true, use that
    * 2) if seleniumAddress is given, use that
    * 3) if a Sauce Labs account is given, use that
    * 4) if a seleniumServerJar is specified, use that
    * 5) try to find the seleniumServerJar in protractor/selenium
    */
  def loadDriverProvider_(config: protractorLib.builtConfigMod.Config): scala.Unit = js.native
  /**
    * The primary workhorse interface. Kicks off the test running process.
    *
    * @return {q.Promise} A promise which resolves to the exit code of the tests.
    * @public
    */
  def run(): qLib.qMod.Promise[_] = js.native
  /**
    * Executor of testPreparer
    * @public
    * @param {string[]=} An optional list of command line arguments the framework will accept.
    * @return {q.Promise} A promise that will resolve when the test preparers
    *     are finished.
    */
  def runTestPreparer(): qLib.qMod.Promise[_] = js.native
  def runTestPreparer(extraFlags: js.Array[java.lang.String]): qLib.qMod.Promise[_] = js.native
  /**
    * Registrar for testPreparers - executed right before tests run.
    * @public
    * @param {string/Fn} filenameOrFn
    */
  def setTestPreparer(filenameOrFn: java.lang.String): scala.Unit = js.native
  def setTestPreparer(filenameOrFn: js.Function): scala.Unit = js.native
  /**
    * Sets up convenience globals for test specs
    * @private
    */
  def setupGlobals_(browser_ : protractorLib.builtBrowserMod.ProtractorBrowser): scala.Unit = js.native
  /**
    * Final cleanup on exiting the runner.
    *
    * @return {q.Promise} A promise which resolves on finish.
    * @private
    */
  def shutdown_(): qLib.qMod.Promise[scala.Unit] = js.native
}

