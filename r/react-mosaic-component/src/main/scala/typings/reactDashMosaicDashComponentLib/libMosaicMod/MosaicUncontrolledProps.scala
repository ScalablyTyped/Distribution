package typings
package reactDashMosaicDashComponentLib.libMosaicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicUncontrolledProps[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */]
  extends MosaicBaseProps[T]
     with MosaicProps[T] {
  /**
    * The initial tree to render, can be modified by the user
    */
  var initialValue: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null
}

object MosaicUncontrolledProps {
  @scala.inline
  def apply[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    renderTile: reactDashMosaicDashComponentLib.libTypesMod.TileRenderer[T],
    className: java.lang.String = null,
    initialValue: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] = null,
    onChange: /* newNode */ reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null => scala.Unit = null,
    onRelease: /* newNode */ reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null => scala.Unit = null,
    resize: reactDashMosaicDashComponentLib.libTypesMod.ResizeOptions = null,
    zeroStateView: reactLib.reactMod.Global.JSXNs.Element = null
  ): MosaicUncontrolledProps[T] = {
    val __obj = js.Dynamic.literal(renderTile = renderTile)
    if (className != null) __obj.updateDynamic("className")(className)
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (zeroStateView != null) __obj.updateDynamic("zeroStateView")(zeroStateView)
    __obj.asInstanceOf[MosaicUncontrolledProps[T]]
  }
}

