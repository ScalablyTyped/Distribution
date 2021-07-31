package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridProps extends StObject {
  
  /**
    * Whether the Grid is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether there is padding between the components
    */
  var padded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the Grid can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object GridProps {
  
  @scala.inline
  def apply(): GridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps]
  }
  
  @scala.inline
  implicit class GridPropsMutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setPadded(value: Boolean): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
