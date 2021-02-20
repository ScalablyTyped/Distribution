package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostProperties extends StObject {
  
  /**
    * The operating system of the host.
    *
    * Default is "linux".
    */
  var os: js.UndefOr[HostOperatingSystem] = js.native
}
object HostProperties {
  
  @scala.inline
  def apply(): HostProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostProperties]
  }
  
  @scala.inline
  implicit class HostPropertiesMutableBuilder[Self <: HostProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOs(value: HostOperatingSystem): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
  }
}
