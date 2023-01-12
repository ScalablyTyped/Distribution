package typings.reactBootstrapTypeahead.mod

import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenProps
  extends StObject
     with HTMLProps[HTMLDivElement] {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var option: Option
}
object TokenProps {
  
  inline def apply(option: Option): TokenProps = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenProps] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setOnRemove(value: () => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction0(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
