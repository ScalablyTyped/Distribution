package typings.reactDashMosaicDashComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMosaicWindowMod {
  import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey

  type InternalMosaicWindowProps[T /* <: MosaicKey */] = MosaicWindowProps[T] with InternalDropTargetProps with InternalDragSourceProps
}
