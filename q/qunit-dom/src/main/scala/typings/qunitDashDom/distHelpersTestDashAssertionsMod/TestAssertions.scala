package typings.qunitDashDom.distHelpersTestDashAssertionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAssertions extends js.Object {
  var results: js.Array[_]
  def dom(target: js.Any, rootElement: js.Any): typings.qunitDashDom.distAssertionsMod.default
  def pushResult(result: js.Any): Unit
}

object TestAssertions {
  @scala.inline
  def apply(
    dom: (js.Any, js.Any) => typings.qunitDashDom.distAssertionsMod.default,
    pushResult: js.Any => Unit,
    results: js.Array[_]
  ): TestAssertions = {
    val __obj = js.Dynamic.literal(dom = js.Any.fromFunction2(dom), pushResult = js.Any.fromFunction1(pushResult), results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestAssertions]
  }
}

