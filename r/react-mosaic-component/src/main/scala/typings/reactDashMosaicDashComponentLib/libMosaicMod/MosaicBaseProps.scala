package typings
package reactDashMosaicDashComponentLib.libMosaicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicBaseProps[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] extends js.Object {
  /**
    * Additional classes to affix to the root element
    * Default: 'mosaic-blueprint-theme'
    */
  var className: js.UndefOr[java.lang.String] = js.native
  /**
    * Called when a user initiates any change to the tree (removing, adding, moving, resizing, etc.)
    */
  var onChange: js.UndefOr[
    js.Function1[
      /* newNode */ reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Called when a user completes a change (fires like above except for the interpolation during resizing)
    */
  var onRelease: js.UndefOr[
    js.Function1[
      /* newNode */ reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Lookup function to convert `T` to a displayable `JSX.Element`
    */
  @JSName("renderTile")
  var renderTile_Original: reactDashMosaicDashComponentLib.libTypesMod.TileRenderer[T] = js.native
  /**
    * Options that control resizing
    * @see: [[ResizeOptions]]
    */
  var resize: js.UndefOr[reactDashMosaicDashComponentLib.libTypesMod.ResizeOptions] = js.native
  /**
    * View to display when the current value is `null`
    * default: Simple NonIdealState view
    */
  var zeroStateView: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.native
  /**
    * Lookup function to convert `T` to a displayable `JSX.Element`
    */
  def renderTile(t: T, path: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicBranch]): reactLib.reactMod.Global.JSXNs.Element = js.native
}

