package typings.reactDashMosaicDashComponent

import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMosaicWindowMod {
  type InternalMosaicWindowProps[T /* <: MosaicKey */] = MosaicWindowProps[T] with InternalDropTargetProps with InternalDragSourceProps
}
