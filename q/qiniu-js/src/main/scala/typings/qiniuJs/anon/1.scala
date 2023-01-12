package typings.qiniuJs.anon

import typings.qiniuJs.qiniuJsStrings.`up-as0DotqiniupDotcom`
import typings.qiniuJs.qiniuJsStrings.`upload-as0DotqiniupDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  val cdnUphost: js.Array[`upload-as0DotqiniupDotcom`]
  
  val srcUphost: js.Array[`up-as0DotqiniupDotcom`]
}
object `1` {
  
  inline def apply(cdnUphost: js.Array[`upload-as0DotqiniupDotcom`], srcUphost: js.Array[`up-as0DotqiniupDotcom`]): `1` = {
    val __obj = js.Dynamic.literal(cdnUphost = cdnUphost.asInstanceOf[js.Any], srcUphost = srcUphost.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setCdnUphost(value: js.Array[`upload-as0DotqiniupDotcom`]): Self = StObject.set(x, "cdnUphost", value.asInstanceOf[js.Any])
    
    inline def setCdnUphostVarargs(value: `upload-as0DotqiniupDotcom`*): Self = StObject.set(x, "cdnUphost", js.Array(value*))
    
    inline def setSrcUphost(value: js.Array[`up-as0DotqiniupDotcom`]): Self = StObject.set(x, "srcUphost", value.asInstanceOf[js.Any])
    
    inline def setSrcUphostVarargs(value: `up-as0DotqiniupDotcom`*): Self = StObject.set(x, "srcUphost", js.Array(value*))
  }
}
