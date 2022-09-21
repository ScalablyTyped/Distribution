package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemProps extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
}
object ItemProps {
  
  inline def apply(): ItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemProps]
  }
  
  extension [Self <: ItemProps](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
