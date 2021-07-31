package typings.sinon.mod

import typings.sinon.anon.Create
import typings.sinon.anon.PartialSinonSandboxConfig
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonApi extends StObject {
  
  var FakeXMLHttpRequest: SinonFakeXMLHttpRequestStatic = js.native
  
  var clock: Create = js.native
  
  /**
    * Creates a new sandbox object with spies, stubs, and mocks.
    * @param config
    */
  def createSandbox(): SinonSandbox = js.native
  def createSandbox(config: PartialSinonSandboxConfig): SinonSandbox = js.native
  
  var defaultConfig: PartialSinonSandboxConfig = js.native
  
  var expectation: SinonExpectationStatic = js.native
  
  /**
    * Creates a basic fake, with no behavior
    */
  def fake(): SinonSpy[js.Array[js.Any], js.Any] = js.native
  /**
    * Wraps an existing Function to record all interactions, while leaving it up to the func to provide the behavior.
    * This is useful when complex behavior not covered by the sinon.fake.* methods is required or when wrapping an existing function or method.
    */
  def fake(fn: js.Function): SinonSpy[js.Array[js.Any], js.Any] = js.native
  
  var fakeServer: SinonFakeServerStatic = js.native
  
  var fakeServerWithClock: SinonFakeServerStatic = js.native
  
  @JSName("fake")
  var fake_Original: SinonFake = js.native
  
  /**
    * See custom matchers.
    */
  def `match`(callback: js.Function1[/* value */ js.Any, Boolean]): SinonMatcher = js.native
  def `match`(callback: js.Function1[/* value */ js.Any, Boolean], message: String): SinonMatcher = js.native
  /**
    * Requires the value to be a string and match the given regular expression.
    */
  def `match`(expr: RegExp): SinonMatcher = js.native
  /**
    * Requires the value to be not null or undefined and have at least the same properties as expectation.
    * This supports nested matchers.
    */
  def `match`(obj: js.Object): SinonMatcher = js.native
  /**
    * Requires the value to be a string and have the expectation as a substring.
    */
  def `match`(value: String): SinonMatcher = js.native
  /**
    * Requires the value to be == to the given number.
    */
  def `match`(value: Double): SinonMatcher = js.native
  @JSName("match")
  var match_Original: SinonMatch = js.native
  
  def spyCall(args: js.Any*): SinonSpyCall[js.Array[js.Any], js.Any] = js.native
}
