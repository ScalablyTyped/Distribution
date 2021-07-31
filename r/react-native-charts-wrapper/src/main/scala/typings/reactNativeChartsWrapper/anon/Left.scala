package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left extends StObject {
  
  var left: js.UndefOr[Max] = js.undefined
  
  var right: js.UndefOr[Max] = js.undefined
}
object Left {
  
  @scala.inline
  def apply(): Left = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Left]
  }
  
  @scala.inline
  implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Max): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Max): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
  }
}
