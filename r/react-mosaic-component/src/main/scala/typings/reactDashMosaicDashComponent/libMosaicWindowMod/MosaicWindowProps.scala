package typings.reactDashMosaicDashComponent.libMosaicWindowMod

import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.ReactNode
import typings.reactDashMosaicDashComponent.libTypesMod.CreateNode
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicBranch
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicNode
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.drop
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicWindowProps[T /* <: MosaicKey */] extends js.Object {
  var additionalControlButtonText: js.UndefOr[String] = js.undefined
  var additionalControls: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var createNode: js.UndefOr[CreateNode[T]] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* type */ drop | reset, Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var path: js.Array[MosaicBranch]
  var renderPreview: js.UndefOr[js.Function1[/* props */ MosaicWindowProps[T], Element]] = js.undefined
  var renderToolbar: js.UndefOr[
    (js.Function2[/* props */ MosaicWindowProps[T], /* draggable */ js.UndefOr[Boolean], Element]) | Null
  ] = js.undefined
  var title: String
  var toolbarControls: js.UndefOr[ReactNode] = js.undefined
}

object MosaicWindowProps {
  @scala.inline
  def apply[T /* <: MosaicKey */](
    path: js.Array[MosaicBranch],
    title: String,
    additionalControlButtonText: String = null,
    additionalControls: ReactNode = null,
    className: String = null,
    createNode: /* repeated */ js.Any => js.Promise[MosaicNode[T]] | MosaicNode[T] = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onDragEnd: /* type */ drop | reset => Unit = null,
    onDragStart: () => Unit = null,
    renderPreview: /* props */ MosaicWindowProps[T] => Element = null,
    renderToolbar: (/* props */ MosaicWindowProps[T], /* draggable */ js.UndefOr[Boolean]) => Element = null,
    toolbarControls: ReactNode = null
  ): MosaicWindowProps[T] = {
    val __obj = js.Dynamic.literal(path = path, title = title)
    if (additionalControlButtonText != null) __obj.updateDynamic("additionalControlButtonText")(additionalControlButtonText)
    if (additionalControls != null) __obj.updateDynamic("additionalControls")(additionalControls.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction1(createNode))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (renderPreview != null) __obj.updateDynamic("renderPreview")(js.Any.fromFunction1(renderPreview))
    if (renderToolbar != null) __obj.updateDynamic("renderToolbar")(js.Any.fromFunction2(renderToolbar))
    if (toolbarControls != null) __obj.updateDynamic("toolbarControls")(toolbarControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicWindowProps[T]]
  }
}

