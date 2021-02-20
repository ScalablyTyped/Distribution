package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundImageBackgroundProp extends StObject {
  
  var background: CSSImageStyleBackgroundProps | js.Array[CSSImageStyleBackgroundProps] = js.native
}
object BackgroundImageBackgroundProp {
  
  @scala.inline
  def apply(background: CSSImageStyleBackgroundProps | js.Array[CSSImageStyleBackgroundProps]): BackgroundImageBackgroundProp = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImageBackgroundProp]
  }
  
  @scala.inline
  implicit class BackgroundImageBackgroundPropMutableBuilder[Self <: BackgroundImageBackgroundProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: CSSImageStyleBackgroundProps | js.Array[CSSImageStyleBackgroundProps]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundVarargs(value: CSSImageStyleBackgroundProps*): Self = StObject.set(x, "background", js.Array(value :_*))
  }
}
