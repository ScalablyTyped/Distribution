package typings.reactDashMosaicDashComponent.libMosaicMod

import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicBranch
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicNode
import typings.reactDashMosaicDashComponent.libTypesMod.ResizeOptions
import typings.reactDashMosaicDashComponent.libTypesMod.TileRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicBaseProps[T /* <: MosaicKey */] extends js.Object {
  /**
    * Additional classes to affix to the root element
    * Default: 'mosaic-blueprint-theme'
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Called when a user initiates any change to the tree (removing, adding, moving, resizing, etc.)
    */
  var onChange: js.UndefOr[js.Function1[/* newNode */ MosaicNode[T] | Null, Unit]] = js.undefined
  /**
    * Called when a user completes a change (fires like above except for the interpolation during resizing)
    */
  var onRelease: js.UndefOr[js.Function1[/* newNode */ MosaicNode[T] | Null, Unit]] = js.undefined
  /**
    * Lookup function to convert `T` to a displayable `JSX.Element`
    */
  var renderTile: TileRenderer[T]
  /**
    * Options that control resizing
    * @see: [[ResizeOptions]]
    */
  var resize: js.UndefOr[ResizeOptions] = js.undefined
  /**
    * View to display when the current value is `null`
    * default: Simple NonIdealState view
    */
  var zeroStateView: js.UndefOr[Element] = js.undefined
}

object MosaicBaseProps {
  @scala.inline
  def apply[T /* <: MosaicKey */](
    renderTile: (T, /* path */ js.Array[MosaicBranch]) => Element,
    className: String = null,
    onChange: /* newNode */ MosaicNode[T] | Null => Unit = null,
    onRelease: /* newNode */ MosaicNode[T] | Null => Unit = null,
    resize: ResizeOptions = null,
    zeroStateView: Element = null
  ): MosaicBaseProps[T] = {
    val __obj = js.Dynamic.literal(renderTile = js.Any.fromFunction2(renderTile))
    if (className != null) __obj.updateDynamic("className")(className)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (zeroStateView != null) __obj.updateDynamic("zeroStateView")(zeroStateView)
    __obj.asInstanceOf[MosaicBaseProps[T]]
  }
}

