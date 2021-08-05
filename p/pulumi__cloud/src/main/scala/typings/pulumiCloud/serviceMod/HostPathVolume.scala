package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostPathVolume
  extends StObject
     with Volume {
  
  var kind: typings.pulumiCloud.pulumiCloudStrings.HostPathVolume
  
  var path: String
}
object HostPathVolume {
  
  @JSImport("@pulumi/cloud/service", "HostPathVolume")
  @js.native
  val ^ : HostPathVolumeConstructor = js.native
  
  extension [Self <: HostPathVolume](x: Self) {
    
    inline def setKind(value: typings.pulumiCloud.pulumiCloudStrings.HostPathVolume): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
