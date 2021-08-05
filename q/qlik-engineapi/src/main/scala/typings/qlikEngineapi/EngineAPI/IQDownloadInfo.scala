package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQDownloadInfo extends StObject {
  
  /**
    * FileSize of the generated QVF
    */
  var qFileSize: Double
  
  /**
    * URL of the generated QVF
    */
  var qUrl: String
}
object IQDownloadInfo {
  
  inline def apply(qFileSize: Double, qUrl: String): IQDownloadInfo = {
    val __obj = js.Dynamic.literal(qFileSize = qFileSize.asInstanceOf[js.Any], qUrl = qUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQDownloadInfo]
  }
  
  extension [Self <: IQDownloadInfo](x: Self) {
    
    inline def setQFileSize(value: Double): Self = StObject.set(x, "qFileSize", value.asInstanceOf[js.Any])
    
    inline def setQUrl(value: String): Self = StObject.set(x, "qUrl", value.asInstanceOf[js.Any])
  }
}
