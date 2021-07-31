package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotDraggingStyle extends StObject {
  
  var transform: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[none] = js.undefined
}
object NotDraggingStyle {
  
  @scala.inline
  def apply(): NotDraggingStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotDraggingStyle]
  }
  
  @scala.inline
  implicit class NotDraggingStyleMutableBuilder[Self <: NotDraggingStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTransition(value: none): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
