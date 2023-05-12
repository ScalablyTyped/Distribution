package typings.smoothScrollbar

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsDebounceMod {
  
  @JSImport("smooth-scrollbar/utils/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce[T /* <: js.Function1[/* repeated */ Any, Unit] */](fn: T): js.ThisFunction1[/* this */ Any, /* args */ Parameters[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction1[/* this */ Any, /* args */ Parameters[T], Unit]]
  inline def debounce[T /* <: js.Function1[/* repeated */ Any, Unit] */](fn: T, wait: Double): js.ThisFunction1[/* this */ Any, /* args */ Parameters[T], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ Any, /* args */ Parameters[T], Unit]]
  inline def debounce[T /* <: js.Function1[/* repeated */ Any, Unit] */](fn: T, wait: Double, leading: Boolean): js.ThisFunction1[/* this */ Any, /* args */ Parameters[T], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], leading.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ Any, /* args */ Parameters[T], Unit]]
  inline def debounce[T /* <: js.Function1[/* repeated */ Any, Unit] */](fn: T, wait: Unit, leading: Boolean): js.ThisFunction1[/* this */ Any, /* args */ Parameters[T], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], leading.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ Any, /* args */ Parameters[T], Unit]]
}
