package typings
package reactDashMosaicDashComponentLib.libMosaicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicControlledProps[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */]
  extends MosaicBaseProps[T]
     with MosaicProps[T] {
  /**
    * The tree to render
    */
  var value: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null = js.native
  @JSName("onChange")
  def onChange_MMosaicControlledProps(): scala.Unit = js.native
  @JSName("onChange")
  def onChange_MMosaicControlledProps(newNode: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T]): scala.Unit = js.native
}

