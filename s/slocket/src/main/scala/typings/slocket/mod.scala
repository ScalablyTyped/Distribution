package typings.slocket

import org.scalablytyped.runtime.Shortcut
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("slocket", JSImport.Namespace)
  @js.native
  class ^ protected () extends Slocket {
    def this(lockFile: String) = this()
    def this(lockFile: String, cb: js.Function2[/* error */ Error | Null, /* lock */ Lock, Unit]) = this()
  }
  @JSImport("slocket", JSImport.Namespace)
  @js.native
  val ^ : Slocket = js.native
  
  @js.native
  trait Lock extends StObject {
    
    def release(): Unit = js.native
    def release(sync: Boolean): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable2 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined  */ @js.native
  trait Slocket extends EventEmitter {
    
    def apply(lockFile: String): Slocket = js.native
    def apply(lockFile: String, cb: js.Function2[/* error */ Error | Null, /* lock */ Lock, Unit]): Slocket = js.native
    
    def `catch`[TResult](): js.Promise[Lock | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Lock | TResult] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Lock, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ Lock, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  }
  
  type _To = Slocket
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Slocket = ^
}
