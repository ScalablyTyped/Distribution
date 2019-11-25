package typings.atPulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiCloud.serviceMod.SharedVolume
  - typings.atPulumiCloud.serviceMod.HostPathVolume
*/
trait Volume extends js.Object

object Volume {
  @scala.inline
  def SharedVolume(kind: typings.atPulumiCloud.atPulumiCloudStrings.SharedVolume, name: String): Volume = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Volume]
  }
  @scala.inline
  def HostPathVolume(kind: typings.atPulumiCloud.atPulumiCloudStrings.HostPathVolume, path: String): Volume = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Volume]
  }
}

