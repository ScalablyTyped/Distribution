package typings.qiniuJs.anon

import typings.qiniuJs.qiniuJsStrings.`up-na0DotqiniupDotcom`
import typings.qiniuJs.qiniuJsStrings.`upload-na0DotqiniupDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  val cdnUphost: js.Array[`upload-na0DotqiniupDotcom`]
  
  val srcUphost: js.Array[`up-na0DotqiniupDotcom`]
}
object `0` {
  
  inline def apply(cdnUphost: js.Array[`upload-na0DotqiniupDotcom`], srcUphost: js.Array[`up-na0DotqiniupDotcom`]): `0` = {
    val __obj = js.Dynamic.literal(cdnUphost = cdnUphost.asInstanceOf[js.Any], srcUphost = srcUphost.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setCdnUphost(value: js.Array[`upload-na0DotqiniupDotcom`]): Self = StObject.set(x, "cdnUphost", value.asInstanceOf[js.Any])
    
    inline def setCdnUphostVarargs(value: `upload-na0DotqiniupDotcom`*): Self = StObject.set(x, "cdnUphost", js.Array(value*))
    
    inline def setSrcUphost(value: js.Array[`up-na0DotqiniupDotcom`]): Self = StObject.set(x, "srcUphost", value.asInstanceOf[js.Any])
    
    inline def setSrcUphostVarargs(value: `up-na0DotqiniupDotcom`*): Self = StObject.set(x, "srcUphost", js.Array(value*))
  }
}
