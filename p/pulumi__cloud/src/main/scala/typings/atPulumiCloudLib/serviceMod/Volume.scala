package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume extends js.Object {
  var kind: VolumeKind
}

object Volume {
  @scala.inline
  def apply(kind: VolumeKind): Volume = {
    val __obj = js.Dynamic.literal(kind = kind)
  
    __obj.asInstanceOf[Volume]
  }
}

