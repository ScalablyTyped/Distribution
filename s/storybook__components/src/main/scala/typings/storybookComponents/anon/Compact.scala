package typings.storybookComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compact extends StObject {
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var inAddonPanel: js.UndefOr[Boolean] = js.native
}
object Compact {
  
  @scala.inline
  def apply(): Compact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compact]
  }
  
  @scala.inline
  implicit class CompactMutableBuilder[Self <: Compact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setInAddonPanel(value: Boolean): Self = StObject.set(x, "inAddonPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAddonPanelUndefined: Self = StObject.set(x, "inAddonPanel", js.undefined)
  }
}
