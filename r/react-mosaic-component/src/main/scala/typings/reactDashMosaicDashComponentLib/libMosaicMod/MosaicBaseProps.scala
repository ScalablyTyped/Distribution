package typings
package reactDashMosaicDashComponentLib.libMosaicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicBaseProps[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] extends js.Object {
  /**
    * Additional classes to affix to the root element
    * Default: 'mosaic-blueprint-theme'
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called when a user initiates any change to the tree (removing, adding, moving, resizing, etc.)
    */
  var onChange: js.UndefOr[
    js.Function1[
      /* newNode */ reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when a user completes a change (fires like above except for the interpolation during resizing)
    */
  var onRelease: js.UndefOr[
    js.Function1[
      /* newNode */ reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Lookup function to convert `T` to a displayable `JSX.Element`
    */
  var renderTile: reactDashMosaicDashComponentLib.libTypesMod.TileRenderer[T]
  /**
    * Options that control resizing
    * @see: [[ResizeOptions]]
    */
  var resize: js.UndefOr[reactDashMosaicDashComponentLib.libTypesMod.ResizeOptions] = js.undefined
  /**
    * View to display when the current value is `null`
    * default: Simple NonIdealState view
    */
  var zeroStateView: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
}

object MosaicBaseProps {
  @scala.inline
  def apply[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    renderTile: reactDashMosaicDashComponentLib.libTypesMod.TileRenderer[T],
    className: java.lang.String = null,
    onChange: /* newNode */ reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null => scala.Unit = null,
    onRelease: /* newNode */ reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null => scala.Unit = null,
    resize: reactDashMosaicDashComponentLib.libTypesMod.ResizeOptions = null,
    zeroStateView: reactLib.reactMod.Global.JSXNs.Element = null
  ): MosaicBaseProps[T] = {
    val __obj = js.Dynamic.literal(renderTile = renderTile)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (zeroStateView != null) __obj.updateDynamic("zeroStateView")(zeroStateView)
    __obj.asInstanceOf[MosaicBaseProps[T]]
  }
}

