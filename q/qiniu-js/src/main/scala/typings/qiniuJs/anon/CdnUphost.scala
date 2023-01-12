package typings.qiniuJs.anon

import typings.qiniuJs.qiniuJsStrings.upDotqiniupDotcom
import typings.qiniuJs.qiniuJsStrings.uploadDotqiniupDotcom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CdnUphost extends StObject {
  
  val cdnUphost: js.Array[uploadDotqiniupDotcom]
  
  val srcUphost: js.Array[upDotqiniupDotcom]
}
object CdnUphost {
  
  inline def apply(cdnUphost: js.Array[uploadDotqiniupDotcom], srcUphost: js.Array[upDotqiniupDotcom]): CdnUphost = {
    val __obj = js.Dynamic.literal(cdnUphost = cdnUphost.asInstanceOf[js.Any], srcUphost = srcUphost.asInstanceOf[js.Any])
    __obj.asInstanceOf[CdnUphost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CdnUphost] (val x: Self) extends AnyVal {
    
    inline def setCdnUphost(value: js.Array[uploadDotqiniupDotcom]): Self = StObject.set(x, "cdnUphost", value.asInstanceOf[js.Any])
    
    inline def setCdnUphostVarargs(value: uploadDotqiniupDotcom*): Self = StObject.set(x, "cdnUphost", js.Array(value*))
    
    inline def setSrcUphost(value: js.Array[upDotqiniupDotcom]): Self = StObject.set(x, "srcUphost", value.asInstanceOf[js.Any])
    
    inline def setSrcUphostVarargs(value: upDotqiniupDotcom*): Self = StObject.set(x, "srcUphost", js.Array(value*))
  }
}
