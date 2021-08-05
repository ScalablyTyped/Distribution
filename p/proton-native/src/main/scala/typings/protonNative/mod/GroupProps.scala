package typings.protonNative.mod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * Group can only have one child. To have more than one child, use boxes.
    */
  var children: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the Group is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether there is a margin inside the group.
    */
  var margined: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the group.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the Grid can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object GroupProps {
  
  inline def apply(): GroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupProps]
  }
  
  extension [Self <: GroupProps](x: Self) {
    
    inline def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMargined(value: Boolean): Self = StObject.set(x, "margined", value.asInstanceOf[js.Any])
    
    inline def setMarginedUndefined: Self = StObject.set(x, "margined", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
