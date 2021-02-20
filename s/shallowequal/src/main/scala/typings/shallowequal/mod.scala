package typings.shallowequal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shallowequal", JSImport.Namespace)
  @js.native
  def apply[TCtx](objA: js.Any, objB: js.Any): Boolean = js.native
  @JSImport("shallowequal", JSImport.Namespace)
  @js.native
  def apply[TCtx](objA: js.Any, objB: js.Any, customizer: js.UndefOr[scala.Nothing], compareContext: TCtx): Boolean = js.native
  @JSImport("shallowequal", JSImport.Namespace)
  @js.native
  def apply[TCtx](objA: js.Any, objB: js.Any, customizer: Customizer[TCtx]): Boolean = js.native
  @JSImport("shallowequal", JSImport.Namespace)
  @js.native
  def apply[TCtx](objA: js.Any, objB: js.Any, customizer: Customizer[TCtx], compareContext: TCtx): Boolean = js.native
  
  type Customizer[T] = js.ThisFunction3[
    /* this */ T, 
    /* objA */ js.Any, 
    /* objB */ js.Any, 
    /* indexOrKey */ js.UndefOr[Double | String], 
    Boolean | Unit
  ]
}
