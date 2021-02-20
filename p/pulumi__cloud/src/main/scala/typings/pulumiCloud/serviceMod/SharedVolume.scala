package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedVolume extends Volume {
  
  var kind: typings.pulumiCloud.pulumiCloudStrings.SharedVolume = js.native
  
  var name: String = js.native
}
object SharedVolume {
  
  @JSImport("@pulumi/cloud/service", "SharedVolume")
  @js.native
  val ^ : SharedVolumeConstructor = js.native
  
  @scala.inline
  implicit class SharedVolumeMutableBuilder[Self <: SharedVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: typings.pulumiCloud.pulumiCloudStrings.SharedVolume): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
