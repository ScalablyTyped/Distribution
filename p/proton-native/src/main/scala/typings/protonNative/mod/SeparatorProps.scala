package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeparatorProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * Whether the Separator is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the line is vertical or horizontal.
    */
  var vertical: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the Separator can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object SeparatorProps {
  
  @scala.inline
  def apply(): SeparatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeparatorProps]
  }
  
  @scala.inline
  implicit class SeparatorPropsMutableBuilder[Self <: SeparatorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
