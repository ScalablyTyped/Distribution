package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pulumiCloud.serviceMod.SharedVolume
  - typings.pulumiCloud.serviceMod.HostPathVolume
*/
trait Volume extends StObject
object Volume {
  
  inline def HostPathVolume(path: String): typings.pulumiCloud.serviceMod.HostPathVolume = {
    val __obj = js.Dynamic.literal(kind = "HostPathVolume", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pulumiCloud.serviceMod.HostPathVolume]
  }
  
  inline def SharedVolume(name: String): typings.pulumiCloud.serviceMod.SharedVolume = {
    val __obj = js.Dynamic.literal(kind = "SharedVolume", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pulumiCloud.serviceMod.SharedVolume]
  }
}
