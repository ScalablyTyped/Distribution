package typings.qiniuJs.anon

import typings.qiniuJs.qiniuJsStrings.`up-cn-east-2DotqiniupDotcom`
import typings.qiniuJs.qiniuJsStrings.`upload-cn-east-2DotqiniupDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  val cdnUphost: js.Array[`upload-cn-east-2DotqiniupDotcom`]
  
  val srcUphost: js.Array[`up-cn-east-2DotqiniupDotcom`]
}
object `2` {
  
  inline def apply(
    cdnUphost: js.Array[`upload-cn-east-2DotqiniupDotcom`],
    srcUphost: js.Array[`up-cn-east-2DotqiniupDotcom`]
  ): `2` = {
    val __obj = js.Dynamic.literal(cdnUphost = cdnUphost.asInstanceOf[js.Any], srcUphost = srcUphost.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setCdnUphost(value: js.Array[`upload-cn-east-2DotqiniupDotcom`]): Self = StObject.set(x, "cdnUphost", value.asInstanceOf[js.Any])
    
    inline def setCdnUphostVarargs(value: `upload-cn-east-2DotqiniupDotcom`*): Self = StObject.set(x, "cdnUphost", js.Array(value*))
    
    inline def setSrcUphost(value: js.Array[`up-cn-east-2DotqiniupDotcom`]): Self = StObject.set(x, "srcUphost", value.asInstanceOf[js.Any])
    
    inline def setSrcUphostVarargs(value: `up-cn-east-2DotqiniupDotcom`*): Self = StObject.set(x, "srcUphost", js.Array(value*))
  }
}
