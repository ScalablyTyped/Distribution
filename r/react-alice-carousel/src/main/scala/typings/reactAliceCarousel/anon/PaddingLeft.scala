package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingLeft extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var paddingLeft: String
  
  var paddingRight: String
  
  var transition: js.UndefOr[String] = js.undefined
}
object PaddingLeft {
  
  @scala.inline
  def apply(paddingLeft: String, paddingRight: String): PaddingLeft = {
    val __obj = js.Dynamic.literal(paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingLeft]
  }
  
  @scala.inline
  implicit class PaddingLeftMutableBuilder[Self <: PaddingLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: String): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRight(value: String): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
