package typings.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pulumiCloud.serviceMod.SharedVolume
  - typings.pulumiCloud.serviceMod.HostPathVolume
*/
trait Volume extends js.Object
object Volume {
  
  @scala.inline
  def SharedVolume(kind: typings.pulumiCloud.pulumiCloudStrings.SharedVolume, name: String): Volume = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  def HostPathVolume(kind: typings.pulumiCloud.pulumiCloudStrings.HostPathVolume, path: String): Volume = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
}
