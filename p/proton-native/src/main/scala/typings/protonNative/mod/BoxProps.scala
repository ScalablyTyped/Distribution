package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * Whether the Box is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether there is extra space between the children in the Box.
    */
  var padded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the Box arranges its children vertically or horizontally.
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the Box and its children can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object BoxProps {
  
  @scala.inline
  def apply(): BoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxProps]
  }
  
  @scala.inline
  implicit class BoxPropsMutableBuilder[Self <: BoxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setPadded(value: Boolean): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
    
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
