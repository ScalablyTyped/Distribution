package typings
package protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtractorHttpMock extends js.Object {
  /**
    * Module configuration to setup
    */
  var config: protractorDashHttpDashMockLib.Anon_RootDirectory = js.native
  /**
    * Instantiate mock modules from files. This must be done before the browser connects.
    *
    * @param mocks An array of mock module names relative to the rootDirectory configuration.
    * @param plugins An array of Plugin objects.
    * @param skipDefaults Set true to skip loading of default mocks.
    */
  def apply(mocks: js.Array[java.lang.String]): ProtractorHttpMock = js.native
  def apply(mocks: js.Array[java.lang.String], plugins: js.Array[Plugin | java.lang.String]): ProtractorHttpMock = js.native
  def apply(
    mocks: js.Array[java.lang.String],
    plugins: js.Array[Plugin | java.lang.String],
    skipDefaults: scala.Boolean
  ): ProtractorHttpMock = js.native
  /**
    * Instantiate mock module. This must be done before the browser connects.
    *
    * @param mocks An array of mock modules to load into the application.
    * @param plugins An array of Plugin objects.
    * @param skipDefaults Set true to skip loading of default mocks.
    */
  def apply[TResponse, TPayload](): ProtractorHttpMock = js.native
  /**
    * Add mocks during test execution.
    * Returns a promise that will be resolved with a true boolean
    * when mocks are added.
    *
    * @param mocks An array of mock modules to load into the application.
    */
  def add[T1, T2](
    mocks: js.Array[
      protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.AllRequests[T1, T2]
    ]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean] = js.native
  /**
    * Returns a promise that will be resolved with a true boolean
    * when all matched HTTP requests are cleared.
    */
  def clearRequests(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean] = js.native
  /**
    * Remove mocks during test execution.
    * Returns a promise that will be resolved with a true boolean
    * when the supplied mocks are removed.
    *
    * @param mocks An array of mock modules to remove from the application.
    */
  def remove[T1, T2](
    mocks: js.Array[
      protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.AllRequests[T1, T2]
    ]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean] = js.native
  /**
    * Returns a promise that will be resolved with an array of
    * all matched HTTP requests.
    */
  def requestsMade(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[ReceivedRequest]] = js.native
  /**
    * Clean up.
    * Typically done in the afterEach call to ensure the teardown
    * is executed regardless of what happens in the test execution.
    */
  def teardown(): scala.Unit = js.native
}

