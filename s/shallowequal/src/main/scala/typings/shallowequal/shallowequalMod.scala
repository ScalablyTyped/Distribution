package typings.shallowequal

import typings.shallowequal.shallowequalMod.Customizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shallowequal", JSImport.Namespace)
@js.native
object shallowequalMod extends js.Object {
  def apply[TCtx](objA: js.Any, objB: js.Any): Boolean = js.native
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

