package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotDraggingStyle extends StObject {
  
  /**
    * This value will actually be `null` instead of `undefined`.
    *
    * The type is fudged because `null` is not compatible with the
    * `React.CSSProperties` type.
    *
    * The `style` prop should interpret `null` and `undefined` the same way.
    */
  var transform: js.UndefOr[String] = js.undefined
  
  /**
    * This value will actually be `null` instead of `undefined`.
    *
    * The type is fudged because `null` is not compatible with the
    * `React.CSSProperties` type.
    *
    * The `style` prop should interpret `null` and `undefined` the same way.
    */
  var transition: js.UndefOr[none] = js.undefined
}
object NotDraggingStyle {
  
  inline def apply(): NotDraggingStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotDraggingStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotDraggingStyle] (val x: Self) extends AnyVal {
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransition(value: none): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
