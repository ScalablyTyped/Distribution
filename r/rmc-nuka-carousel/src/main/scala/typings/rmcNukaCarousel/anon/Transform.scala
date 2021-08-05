package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  var WebkitTransform: String
  
  var left: String
  
  var msTransform: String
  
  var position: String
  
  var top: String
  
  var transform: String
}
object Transform {
  
  inline def apply(
    WebkitTransform: String,
    left: String,
    msTransform: String,
    position: String,
    top: String,
    transform: String
  ): Transform = {
    val __obj = js.Dynamic.literal(WebkitTransform = WebkitTransform.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], msTransform = msTransform.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  extension [Self <: Transform](x: Self) {
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setMsTransform(value: String): Self = StObject.set(x, "msTransform", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setWebkitTransform(value: String): Self = StObject.set(x, "WebkitTransform", value.asInstanceOf[js.Any])
  }
}
