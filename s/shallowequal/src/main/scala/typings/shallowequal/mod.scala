package typings.shallowequal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shallowequal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[TCtx](objA: js.Any, objB: js.Any): Boolean = js.native
  def apply[TCtx](objA: js.Any, objB: js.Any, customizer: js.UndefOr[scala.Nothing], compareContext: TCtx): Boolean = js.native
  def apply[TCtx](objA: js.Any, objB: js.Any, customizer: Customizer[TCtx]): Boolean = js.native
  def apply[TCtx](objA: js.Any, objB: js.Any, customizer: Customizer[TCtx], compareContext: TCtx): Boolean = js.native
  type Customizer[T] = js.ThisFunction3[
    /* this */ T, 
    /* objA */ js.Any, 
    /* objB */ js.Any, 
    /* indexOrKey */ js.UndefOr[Double | String], 
    Boolean | Unit
  ]
}

