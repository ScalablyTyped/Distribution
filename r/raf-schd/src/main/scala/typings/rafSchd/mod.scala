package typings.rafSchd

import typings.rafSchd.anon.Cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: js.Function1[/* repeated */ Any, Unit] */](fn: T): ScheduledFn[T] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[ScheduledFn[T]]
  
  @JSImport("raf-schd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ScheduledFn[T /* <: js.Function1[/* repeated */ Any, Unit] */] = T & Cancel
}
