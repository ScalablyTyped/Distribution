package typings.proxyDashVerifier.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions extends js.Object {
  var testUrl: String
  def testFn(data: String, status: Double, headers: Headers): Unit
}

object TestOptions {
  @scala.inline
  def apply(testFn: (String, Double, Headers) => Unit, testUrl: String): TestOptions = {
    val __obj = js.Dynamic.literal(testFn = js.Any.fromFunction3(testFn), testUrl = testUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestOptions]
  }
}

