package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- js.Thenable because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- js.Promise because Inheritance from two classes. Inlined `then`, `then`, executor, `catch` */ @js.native
trait ThenableWebDriver extends WebDriver {
  
  def `catch`[B](onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Promise[B] = js.native
  
  val executor: js.Function2[js.Function1[WebDriver | js.Thenable[WebDriver], ?], js.Function1[Any, ?], ?] = js.native
  
  def `then`[B](
    onFulfilled: js.Function1[WebDriver, B | js.Thenable[B]],
    onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]
  ): js.Promise[B] = js.native
  def `then`[B](onFulfilled: Unit, onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Promise[B] = js.native
}
