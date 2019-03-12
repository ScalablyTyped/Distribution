package typings
package reactDashMosaicDashComponentLib.libMosaicWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicWindowProps[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] extends js.Object {
  var additionalControlButtonText: js.UndefOr[java.lang.String] = js.undefined
  var additionalControls: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var createNode: js.UndefOr[reactDashMosaicDashComponentLib.libTypesMod.CreateNode[T]] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var onDragEnd: js.UndefOr[
    js.Function1[
      /* type */ reactDashMosaicDashComponentLib.reactDashMosaicDashComponentLibStrings.drop | reactDashMosaicDashComponentLib.reactDashMosaicDashComponentLibStrings.reset, 
      scala.Unit
    ]
  ] = js.undefined
  var onDragStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var path: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicBranch]
  var renderPreview: js.UndefOr[
    js.Function1[/* props */ MosaicWindowProps[T], reactLib.reactMod.Global.JSXNs.Element]
  ] = js.undefined
  var renderToolbar: js.UndefOr[
    (js.Function2[
      /* props */ MosaicWindowProps[T], 
      /* draggable */ js.UndefOr[scala.Boolean], 
      reactLib.reactMod.Global.JSXNs.Element
    ]) | scala.Null
  ] = js.undefined
  var title: java.lang.String
  var toolbarControls: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object MosaicWindowProps {
  @scala.inline
  def apply[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    path: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicBranch],
    title: java.lang.String,
    additionalControlButtonText: java.lang.String = null,
    additionalControls: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    createNode: reactDashMosaicDashComponentLib.libTypesMod.CreateNode[T] = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    onDragEnd: /* type */ reactDashMosaicDashComponentLib.reactDashMosaicDashComponentLibStrings.drop | reactDashMosaicDashComponentLib.reactDashMosaicDashComponentLibStrings.reset => scala.Unit = null,
    onDragStart: () => scala.Unit = null,
    renderPreview: /* props */ MosaicWindowProps[T] => reactLib.reactMod.Global.JSXNs.Element = null,
    renderToolbar: (/* props */ MosaicWindowProps[T], /* draggable */ js.UndefOr[scala.Boolean]) => reactLib.reactMod.Global.JSXNs.Element = null,
    toolbarControls: reactLib.reactMod.ReactNs.ReactNode = null
  ): MosaicWindowProps[T] = {
    val __obj = js.Dynamic.literal(path = path, title = title)
    if (additionalControlButtonText != null) __obj.updateDynamic("additionalControlButtonText")(additionalControlButtonText)
    if (additionalControls != null) __obj.updateDynamic("additionalControls")(additionalControls.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (createNode != null) __obj.updateDynamic("createNode")(createNode)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (renderPreview != null) __obj.updateDynamic("renderPreview")(js.Any.fromFunction1(renderPreview))
    if (renderToolbar != null) __obj.updateDynamic("renderToolbar")(js.Any.fromFunction2(renderToolbar))
    if (toolbarControls != null) __obj.updateDynamic("toolbarControls")(toolbarControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicWindowProps[T]]
  }
}

