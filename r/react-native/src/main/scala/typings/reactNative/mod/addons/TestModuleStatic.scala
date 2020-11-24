package typings.reactNative.mod.addons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestModuleStatic extends js.Object {
  
  def markTestCompleted(): Unit = js.native
  
  def markTestPassed(indicator: js.Any): Unit = js.native
  
  def verifySnapshot(done: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit]): Unit = js.native
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
  
  @scala.inline
  implicit class TestModuleStaticOps[Self <: TestModuleStatic] (val x: Self) extends AnyVal {
    
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
    def setMarkTestCompleted(value: () => Unit): Self = this.set("markTestCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkTestPassed(value: js.Any => Unit): Self = this.set("markTestPassed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerifySnapshot(value: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit] => Unit): Self = this.set("verifySnapshot", js.Any.fromFunction1(value))
  }
}
