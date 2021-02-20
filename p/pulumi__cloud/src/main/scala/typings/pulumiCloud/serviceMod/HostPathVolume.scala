package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostPathVolume extends Volume {
  
  var kind: typings.pulumiCloud.pulumiCloudStrings.HostPathVolume = js.native
  
  var path: String = js.native
}
object HostPathVolume {
  
  @JSImport("@pulumi/cloud/service", "HostPathVolume")
  @js.native
  val ^ : HostPathVolumeConstructor = js.native
  
  @scala.inline
  implicit class HostPathVolumeMutableBuilder[Self <: HostPathVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: typings.pulumiCloud.pulumiCloudStrings.HostPathVolume): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
