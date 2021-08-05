package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addons {
  
  @JSImport("react-native", "addons.TestModule")
  @js.native
  val TestModule: TestModuleStatic = js.native
  type TestModule = TestModuleStatic
  
  trait TestModuleStatic extends StObject {
    
    def markTestCompleted(): Unit
    
    def markTestPassed(indicator: js.Any): Unit
    
    def verifySnapshot(done: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit]): Unit
  }
  object TestModuleStatic {
    
    inline def apply(
      markTestCompleted: () => Unit,
      markTestPassed: js.Any => Unit,
      verifySnapshot: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit] => Unit
    ): TestModuleStatic = {
      val __obj = js.Dynamic.literal(markTestCompleted = js.Any.fromFunction0(markTestCompleted), markTestPassed = js.Any.fromFunction1(markTestPassed), verifySnapshot = js.Any.fromFunction1(verifySnapshot))
      __obj.asInstanceOf[TestModuleStatic]
    }
    
    extension [Self <: TestModuleStatic](x: Self) {
      
      inline def setMarkTestCompleted(value: () => Unit): Self = StObject.set(x, "markTestCompleted", js.Any.fromFunction0(value))
      
      inline def setMarkTestPassed(value: js.Any => Unit): Self = StObject.set(x, "markTestPassed", js.Any.fromFunction1(value))
      
      inline def setVerifySnapshot(value: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit] => Unit): Self = StObject.set(x, "verifySnapshot", js.Any.fromFunction1(value))
    }
  }
}
