package typings.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOptions extends js.Object {
  var testUrl: String = js.native
  def testFn(data: String, status: Double, headers: Headers): Unit = js.native
}

object TestOptions {
  @scala.inline
  def apply(testFn: (String, Double, Headers) => Unit, testUrl: String): TestOptions = {
    val __obj = js.Dynamic.literal(testFn = js.Any.fromFunction3(testFn), testUrl = testUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions]
  }
  @scala.inline
  implicit class TestOptionsOps[Self <: TestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTestFn(value: (String, Double, Headers) => Unit): Self = this.set("testFn", js.Any.fromFunction3(value))
    @scala.inline
    def setTestUrl(value: String): Self = this.set("testUrl", value.asInstanceOf[js.Any])
  }
  
}

