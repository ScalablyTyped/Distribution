package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardActionProps
  extends StObject
     with HTMLProps[Any] {
  
  var border: js.UndefOr[Boolean] = js.undefined
}
object CardActionProps {
  
  inline def apply(): CardActionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardActionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardActionProps] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
