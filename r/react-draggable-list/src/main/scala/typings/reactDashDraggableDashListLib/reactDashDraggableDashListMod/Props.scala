package typings
package reactDashDraggableDashListLib.reactDashDraggableDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[I, C, T] extends js.Object {
  var autoScrollMaxSpeed: js.UndefOr[scala.Double] = js.undefined
  var autoScrollRegionSize: js.UndefOr[scala.Double] = js.undefined
  var commonProps: js.UndefOr[C] = js.undefined
  var constrainDrag: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[js.Function0[js.UndefOr[reactLib.HTMLElement | scala.Null]]] = js.undefined
  var itemKey: java.lang.String | (js.Function1[/* item */ I, java.lang.String])
  var list: js.Array[I]
  var onMoveEnd: js.UndefOr[
    js.Function4[
      /* newList */ js.Array[I], 
      /* movedItem */ I, 
      /* oldIndex */ scala.Double, 
      /* newIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var springConfig: js.UndefOr[js.Object] = js.undefined
  var template: org.scalablytyped.runtime.Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[/* context */ js.Any], T]
  var unsetZIndex: js.UndefOr[scala.Boolean] = js.undefined
}

