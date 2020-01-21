package typings.reactNative.mod.addons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestModuleStatic extends js.Object {
  def markTestCompleted(): Unit
  def markTestPassed(indicator: js.Any): Unit
  def verifySnapshot(done: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit]): Unit
}

object TestModuleStatic {
  @scala.inline
  def apply(
    markTestCompleted: () => Unit,
    markTestPassed: js.Any => Unit,
    verifySnapshot: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit] => Unit
  ): TestModuleStatic = {
    val __obj = js.Dynamic.literal(markTestCompleted = js.Any.fromFunction0(markTestCompleted), markTestPassed = js.Any.fromFunction1(markTestPassed), verifySnapshot = js.Any.fromFunction1(verifySnapshot))
  
    __obj.asInstanceOf[TestModuleStatic]
  }
}

