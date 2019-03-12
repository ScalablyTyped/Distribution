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
  var container: js.UndefOr[js.Function0[js.UndefOr[stdLib.HTMLElement | scala.Null]]] = js.undefined
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

object Props {
  @scala.inline
  def apply[I, C, T](
    itemKey: java.lang.String | (js.Function1[/* item */ I, java.lang.String]),
    list: js.Array[I],
    template: org.scalablytyped.runtime.Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[/* context */ js.Any], T],
    autoScrollMaxSpeed: scala.Int | scala.Double = null,
    autoScrollRegionSize: scala.Int | scala.Double = null,
    commonProps: C = null,
    constrainDrag: js.UndefOr[scala.Boolean] = js.undefined,
    container: () => js.UndefOr[stdLib.HTMLElement | scala.Null] = null,
    onMoveEnd: (/* newList */ js.Array[I], /* movedItem */ I, /* oldIndex */ scala.Double, /* newIndex */ scala.Double) => scala.Unit = null,
    padding: scala.Int | scala.Double = null,
    springConfig: js.Object = null,
    unsetZIndex: js.UndefOr[scala.Boolean] = js.undefined
  ): Props[I, C, T] = {
    val __obj = js.Dynamic.literal(itemKey = itemKey.asInstanceOf[js.Any], list = list, template = template)
    if (autoScrollMaxSpeed != null) __obj.updateDynamic("autoScrollMaxSpeed")(autoScrollMaxSpeed.asInstanceOf[js.Any])
    if (autoScrollRegionSize != null) __obj.updateDynamic("autoScrollRegionSize")(autoScrollRegionSize.asInstanceOf[js.Any])
    if (commonProps != null) __obj.updateDynamic("commonProps")(commonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainDrag)) __obj.updateDynamic("constrainDrag")(constrainDrag)
    if (container != null) __obj.updateDynamic("container")(js.Any.fromFunction0(container))
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(js.Any.fromFunction4(onMoveEnd))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig)
    if (!js.isUndefined(unsetZIndex)) __obj.updateDynamic("unsetZIndex")(unsetZIndex)
    __obj.asInstanceOf[Props[I, C, T]]
  }
}

