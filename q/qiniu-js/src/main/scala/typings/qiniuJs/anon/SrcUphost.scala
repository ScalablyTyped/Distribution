package typings.qiniuJs.anon

import typings.qiniuJs.qiniuJsStrings.`up-z1DotqiniupDotcom`
import typings.qiniuJs.qiniuJsStrings.`upload-z1DotqiniupDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SrcUphost extends StObject {
  
  val cdnUphost: js.Array[`upload-z1DotqiniupDotcom`]
  
  val srcUphost: js.Array[`up-z1DotqiniupDotcom`]
}
object SrcUphost {
  
  inline def apply(cdnUphost: js.Array[`upload-z1DotqiniupDotcom`], srcUphost: js.Array[`up-z1DotqiniupDotcom`]): SrcUphost = {
    val __obj = js.Dynamic.literal(cdnUphost = cdnUphost.asInstanceOf[js.Any], srcUphost = srcUphost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SrcUphost]
  }
  
  extension [Self <: SrcUphost](x: Self) {
    
    inline def setCdnUphost(value: js.Array[`upload-z1DotqiniupDotcom`]): Self = StObject.set(x, "cdnUphost", value.asInstanceOf[js.Any])
    
    inline def setCdnUphostVarargs(value: `upload-z1DotqiniupDotcom`*): Self = StObject.set(x, "cdnUphost", js.Array(value*))
    
    inline def setSrcUphost(value: js.Array[`up-z1DotqiniupDotcom`]): Self = StObject.set(x, "srcUphost", value.asInstanceOf[js.Any])
    
    inline def setSrcUphostVarargs(value: `up-z1DotqiniupDotcom`*): Self = StObject.set(x, "srcUphost", js.Array(value*))
  }
}
