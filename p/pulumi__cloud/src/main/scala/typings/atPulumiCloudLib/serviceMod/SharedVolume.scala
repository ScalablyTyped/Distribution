package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedVolume extends Volume {
  var name: java.lang.String
}

object SharedVolume {
  @scala.inline
  def apply(kind: VolumeKind, name: java.lang.String): SharedVolume = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[SharedVolume]
  }
}

