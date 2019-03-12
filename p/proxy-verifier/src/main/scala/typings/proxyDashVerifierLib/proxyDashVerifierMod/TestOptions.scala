package typings
package proxyDashVerifierLib.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions extends js.Object {
  var testUrl: java.lang.String
  def testFn(data: java.lang.String, status: scala.Double, headers: Headers): scala.Unit
}

object TestOptions {
  @scala.inline
  def apply(testFn: (java.lang.String, scala.Double, Headers) => scala.Unit, testUrl: java.lang.String): TestOptions = {
    val __obj = js.Dynamic.literal(testFn = js.Any.fromFunction3(testFn), testUrl = testUrl)
  
    __obj.asInstanceOf[TestOptions]
  }
}

