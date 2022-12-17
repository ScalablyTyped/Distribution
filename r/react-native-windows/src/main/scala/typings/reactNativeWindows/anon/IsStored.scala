package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsStored extends StObject {
  
  var height: Double
  
  var isStored: js.UndefOr[Boolean] = js.undefined
  
  var playableDuration: Double
  
  var uri: String
  
  var width: Double
}
object IsStored {
  
  inline def apply(height: Double, playableDuration: Double, uri: String, width: Double): IsStored = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], playableDuration = playableDuration.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsStored]
  }
  
  extension [Self <: IsStored](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsStored(value: Boolean): Self = StObject.set(x, "isStored", value.asInstanceOf[js.Any])
    
    inline def setIsStoredUndefined: Self = StObject.set(x, "isStored", js.undefined)
    
    inline def setPlayableDuration(value: Double): Self = StObject.set(x, "playableDuration", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
