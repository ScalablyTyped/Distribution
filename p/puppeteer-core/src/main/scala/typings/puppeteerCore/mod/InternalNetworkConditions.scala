package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalNetworkConditions
  extends StObject
     with NetworkConditions_ {
  
  var offline: Boolean
}
object InternalNetworkConditions {
  
  inline def apply(download: Double, latency: Double, offline: Boolean, upload: Double): InternalNetworkConditions = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalNetworkConditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternalNetworkConditions] (val x: Self) extends AnyVal {
    
    inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
  }
}
