package typings
package shallowequalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shallowequal", JSImport.Namespace)
@js.native
object shallowequalMod extends js.Object {
  def apply(objA: js.Any, objB: js.Any): scala.Boolean = js.native
  def apply(
    objA: js.Any,
    objB: js.Any,
    compare: js.Function3[
      /* objA */ js.Any, 
      /* objB */ js.Any, 
      /* indexOrKey */ js.UndefOr[scala.Double | java.lang.String], 
      js.UndefOr[scala.Boolean]
    ]
  ): scala.Boolean = js.native
  def apply(
    objA: js.Any,
    objB: js.Any,
    compare: js.Function3[
      /* objA */ js.Any, 
      /* objB */ js.Any, 
      /* indexOrKey */ js.UndefOr[scala.Double | java.lang.String], 
      js.UndefOr[scala.Boolean]
    ],
    compareContext: js.Any
  ): scala.Boolean = js.native
}

