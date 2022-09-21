package typings.qiniuJs.anon

import typings.qiniuJs.qiniuJsStrings.`up-z2DotqiniupDotcom`
import typings.qiniuJs.qiniuJsStrings.`upload-z2DotqiniupDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CdnUphostSrcUphost extends StObject {
  
  val cdnUphost: js.Array[`upload-z2DotqiniupDotcom`]
  
  val srcUphost: js.Array[`up-z2DotqiniupDotcom`]
}
object CdnUphostSrcUphost {
  
  inline def apply(cdnUphost: js.Array[`upload-z2DotqiniupDotcom`], srcUphost: js.Array[`up-z2DotqiniupDotcom`]): CdnUphostSrcUphost = {
    val __obj = js.Dynamic.literal(cdnUphost = cdnUphost.asInstanceOf[js.Any], srcUphost = srcUphost.asInstanceOf[js.Any])
    __obj.asInstanceOf[CdnUphostSrcUphost]
  }
  
  extension [Self <: CdnUphostSrcUphost](x: Self) {
    
    inline def setCdnUphost(value: js.Array[`upload-z2DotqiniupDotcom`]): Self = StObject.set(x, "cdnUphost", value.asInstanceOf[js.Any])
    
    inline def setCdnUphostVarargs(value: `upload-z2DotqiniupDotcom`*): Self = StObject.set(x, "cdnUphost", js.Array(value*))
    
    inline def setSrcUphost(value: js.Array[`up-z2DotqiniupDotcom`]): Self = StObject.set(x, "srcUphost", value.asInstanceOf[js.Any])
    
    inline def setSrcUphostVarargs(value: `up-z2DotqiniupDotcom`*): Self = StObject.set(x, "srcUphost", js.Array(value*))
  }
}
