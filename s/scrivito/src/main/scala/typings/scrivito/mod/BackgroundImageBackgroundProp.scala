package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundImageBackgroundProp extends StObject {
  
  var background: CSSImageStyleBackgroundProps | js.Array[CSSImageStyleBackgroundProps]
}
object BackgroundImageBackgroundProp {
  
  inline def apply(background: CSSImageStyleBackgroundProps | js.Array[CSSImageStyleBackgroundProps]): BackgroundImageBackgroundProp = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImageBackgroundProp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundImageBackgroundProp] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: CSSImageStyleBackgroundProps | js.Array[CSSImageStyleBackgroundProps]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundVarargs(value: CSSImageStyleBackgroundProps*): Self = StObject.set(x, "background", js.Array(value*))
  }
}
