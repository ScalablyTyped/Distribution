package typings.reactSketchapp.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: Requireable[Boolean]
  
  var fixedHeight: Requireable[Boolean]
  
  var fixedWidth: Requireable[Boolean]
  
  var left: Requireable[Boolean]
  
  var right: Requireable[Boolean]
  
  var top: Requireable[Boolean]
}
object Bottom {
  
  inline def apply(
    bottom: Requireable[Boolean],
    fixedHeight: Requireable[Boolean],
    fixedWidth: Requireable[Boolean],
    left: Requireable[Boolean],
    right: Requireable[Boolean],
    top: Requireable[Boolean]
  ): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], fixedHeight = fixedHeight.asInstanceOf[js.Any], fixedWidth = fixedWidth.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Requireable[Boolean]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setFixedHeight(value: Requireable[Boolean]): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
    
    inline def setFixedWidth(value: Requireable[Boolean]): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Requireable[Boolean]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Requireable[Boolean]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Requireable[Boolean]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
