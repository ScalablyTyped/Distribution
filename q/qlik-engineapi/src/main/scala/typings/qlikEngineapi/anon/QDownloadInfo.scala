package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QDownloadInfo extends StObject {
  
  var qDownloadInfo: Any
}
object QDownloadInfo {
  
  inline def apply(qDownloadInfo: Any): QDownloadInfo = {
    val __obj = js.Dynamic.literal(qDownloadInfo = qDownloadInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDownloadInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QDownloadInfo] (val x: Self) extends AnyVal {
    
    inline def setQDownloadInfo(value: Any): Self = StObject.set(x, "qDownloadInfo", value.asInstanceOf[js.Any])
  }
}
