package typings.reactNativeMaps.libMapViewDottypesMod

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgePadding extends StObject {
  
  var bottom: Number
  
  var left: Number
  
  var right: Number
  
  var top: Number
}
object EdgePadding {
  
  inline def apply(bottom: Number, left: Number, right: Number, top: Number): EdgePadding = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgePadding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdgePadding] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Number): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Number): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Number): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Number): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
