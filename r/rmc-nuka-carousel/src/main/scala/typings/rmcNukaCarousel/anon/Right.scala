package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Right extends StObject {
  
  var WebkitTransform: String
  
  var msTransform: String
  
  var position: String
  
  var right: Double
  
  var top: String
  
  var transform: String
}
object Right {
  
  inline def apply(
    WebkitTransform: String,
    msTransform: String,
    position: String,
    right: Double,
    top: String,
    transform: String
  ): Right = {
    val __obj = js.Dynamic.literal(WebkitTransform = WebkitTransform.asInstanceOf[js.Any], msTransform = msTransform.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
  
  extension [Self <: Right](x: Self) {
    
    inline def setMsTransform(value: String): Self = StObject.set(x, "msTransform", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setWebkitTransform(value: String): Self = StObject.set(x, "WebkitTransform", value.asInstanceOf[js.Any])
  }
}
