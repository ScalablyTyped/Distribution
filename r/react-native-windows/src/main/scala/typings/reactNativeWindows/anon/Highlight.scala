package typings.reactNativeWindows.anon

import typings.reactNativeWindows.reactNativeWindowsStrings.leading
import typings.reactNativeWindows.reactNativeWindowsStrings.trailing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlight extends StObject {
  
  def highlight(): Unit
  
  def unhighlight(): Unit
  
  def updateProps(select: leading | trailing, newProps: Any): Unit
}
object Highlight {
  
  inline def apply(highlight: () => Unit, unhighlight: () => Unit, updateProps: (leading | trailing, Any) => Unit): Highlight = {
    val __obj = js.Dynamic.literal(highlight = js.Any.fromFunction0(highlight), unhighlight = js.Any.fromFunction0(unhighlight), updateProps = js.Any.fromFunction2(updateProps))
    __obj.asInstanceOf[Highlight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Highlight] (val x: Self) extends AnyVal {
    
    inline def setHighlight(value: () => Unit): Self = StObject.set(x, "highlight", js.Any.fromFunction0(value))
    
    inline def setUnhighlight(value: () => Unit): Self = StObject.set(x, "unhighlight", js.Any.fromFunction0(value))
    
    inline def setUpdateProps(value: (leading | trailing, Any) => Unit): Self = StObject.set(x, "updateProps", js.Any.fromFunction2(value))
  }
}
