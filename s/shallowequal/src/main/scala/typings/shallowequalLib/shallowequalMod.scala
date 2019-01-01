package typings
package shallowequalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shallowequal", JSImport.Namespace)
@js.native
object shallowequalMod extends js.Object {
  def apply[TCtx](objA: js.Any, objB: js.Any): scala.Boolean = js.native
  def apply[TCtx](
    objA: js.Any,
    objB: js.Any,
    compare: js.ThisFunction3[
      /* this */ TCtx, 
      /* objA */ js.Any, 
      /* objB */ js.Any, 
      /* indexOrKey */ js.UndefOr[scala.Double | java.lang.String], 
      scala.Boolean | scala.Unit
    ]
  ): scala.Boolean = js.native
  def apply[TCtx](
    objA: js.Any,
    objB: js.Any,
    compare: js.ThisFunction3[
      /* this */ TCtx, 
      /* objA */ js.Any, 
      /* objB */ js.Any, 
      /* indexOrKey */ js.UndefOr[scala.Double | java.lang.String], 
      scala.Boolean | scala.Unit
    ],
    compareContext: TCtx
  ): scala.Boolean = js.native
}

