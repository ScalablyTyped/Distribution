package typings.reactDashMosaicDashComponent.libMosaicMod

import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicControlledProps[T /* <: MosaicKey */]
  extends MosaicBaseProps[T]
     with MosaicProps[T] {
  /**
    * The tree to render
    */
  var value: MosaicNode[T] | Null = js.native
  @JSName("onChange")
  def onChange_MMosaicControlledProps(): Unit = js.native
  @JSName("onChange")
  def onChange_MMosaicControlledProps(newNode: MosaicNode[T]): Unit = js.native
}

