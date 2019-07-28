package typings.reactDashMosaicDashComponent.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicUpdate[T /* <: MosaicKey */] extends js.Object {
  var path: MosaicPath
  var spec: MosaicUpdateSpec[T]
}

object MosaicUpdate {
  @scala.inline
  def apply[T /* <: MosaicKey */](path: MosaicPath, spec: MosaicUpdateSpec[T]): MosaicUpdate[T] = {
    val __obj = js.Dynamic.literal(path = path, spec = spec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MosaicUpdate[T]]
  }
}

