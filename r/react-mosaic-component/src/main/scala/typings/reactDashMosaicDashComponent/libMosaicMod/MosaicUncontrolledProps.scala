package typings.reactDashMosaicDashComponent.libMosaicMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicNode
import typings.reactDashMosaicDashComponent.libTypesMod.ResizeOptions
import typings.reactDashMosaicDashComponent.libTypesMod.TileRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicUncontrolledProps[T /* <: MosaicKey */]
  extends MosaicBaseProps[T]
     with MosaicProps[T] {
  /**
    * The initial tree to render, can be modified by the user
    */
  var initialValue: MosaicNode[T] | Null
}

object MosaicUncontrolledProps {
  @scala.inline
  def apply[T /* <: MosaicKey */](
    renderTile: TileRenderer[T],
    className: String = null,
    initialValue: MosaicNode[T] = null,
    onChange: /* newNode */ MosaicNode[T] | Null => Unit = null,
    onRelease: /* newNode */ MosaicNode[T] | Null => Unit = null,
    resize: ResizeOptions = null,
    zeroStateView: Element = null
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

