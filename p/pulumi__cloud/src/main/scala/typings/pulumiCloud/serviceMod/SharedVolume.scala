package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedVolume
  extends StObject
     with Volume {
  
  var kind: typings.pulumiCloud.pulumiCloudStrings.SharedVolume
  
  var name: String
}
object SharedVolume {
  
  @JSImport("@pulumi/cloud/service", "SharedVolume")
  @js.native
  val ^ : SharedVolumeConstructor = js.native
  
  extension [Self <: SharedVolume](x: Self) {
    
    inline def setKind(value: typings.pulumiCloud.pulumiCloudStrings.SharedVolume): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
