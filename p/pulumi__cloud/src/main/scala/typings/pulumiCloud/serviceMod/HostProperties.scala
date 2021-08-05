package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostProperties extends StObject {
  
  /**
    * The operating system of the host.
    *
    * Default is "linux".
    */
  var os: js.UndefOr[HostOperatingSystem] = js.undefined
}
object HostProperties {
  
  inline def apply(): HostProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostProperties]
  }
  
  extension [Self <: HostProperties](x: Self) {
    
    inline def setOs(value: HostOperatingSystem): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
  }
}
