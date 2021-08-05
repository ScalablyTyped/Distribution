package typings.storybookComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compact extends StObject {
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var inAddonPanel: js.UndefOr[Boolean] = js.undefined
}
object Compact {
  
  inline def apply(): Compact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compact]
  }
  
  extension [Self <: Compact](x: Self) {
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setInAddonPanel(value: Boolean): Self = StObject.set(x, "inAddonPanel", value.asInstanceOf[js.Any])
    
    inline def setInAddonPanelUndefined: Self = StObject.set(x, "inAddonPanel", js.undefined)
  }
}
