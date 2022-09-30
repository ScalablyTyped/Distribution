package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot extends StObject {
  
  var height: Double
  
  var image: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Image */ Any) | Null
  
  val imageSource: String
  
  val timestamp: Milliseconds
  
  var width: Double
}
object Snapshot {
  
  inline def apply(height: Double, imageSource: String, timestamp: Milliseconds, width: Double): Snapshot = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], imageSource = imageSource.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], image = null)
    __obj.asInstanceOf[Snapshot]
  }
  
  extension [Self <: Snapshot](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImage(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Image */ Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageSource(value: String): Self = StObject.set(x, "imageSource", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Milliseconds): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
