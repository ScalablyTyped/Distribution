package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormProps
  extends GridChildrenProps
     with Stretchy {
  
  /**
    * Whether the Form is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether there is padding between the components
    */
  var padded: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the Form can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object FormProps {
  
  @scala.inline
  def apply(): FormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps]
  }
  
  @scala.inline
  implicit class FormPropsMutableBuilder[Self <: FormProps] (val x: Self) extends AnyVal {
    
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
