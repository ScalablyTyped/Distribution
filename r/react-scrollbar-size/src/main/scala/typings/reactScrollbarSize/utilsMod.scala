package typings.reactScrollbarSize

import typings.reactScrollbarSize.debounceMod.DebouncedFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-scrollbar-size/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce[F /* <: js.Function1[/* repeated */ Any, Unit] */](fn: F, waitFor: Double): DebouncedFn[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], waitFor.asInstanceOf[js.Any])).asInstanceOf[DebouncedFn[F]]
}
