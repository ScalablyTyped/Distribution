package typings.reactMdUtils

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdUtils.reactMdUtilsInts.`-1`
import typings.reactMdUtils.reactMdUtilsInts.`0`
import typings.reactMdUtils.typesWiaAriaRadioTypesMod.RadioWidgetAttributes
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaRadioRadioWidgetMod {
  
  @JSImport("@react-md/utils/types/wia-aria/radio/RadioWidget", "RadioWidget")
  @js.native
  val RadioWidget: ForwardRefExoticComponent[RadioWidgetProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait RadioWidgetProps
    extends StObject
       with RadioWidgetAttributes {
    
    /**
      * Boolean if the radio is currently checked.
      */
    var checked: Boolean
    
    /**
      * An id to use for the item that is required for a11y. This should normally
      * be handled and provided automatically by the `RadioGroup` component.
      */
    var id: String
    
    /**
      * The current tab index for the item that should normally be handled
      * automatically by the `RadioGroup` component. When there are no checked
      * radio items or the item is checked, this should be `0`. Otherwise this
      * should be set to `-1` so that it is shown that it can be focused but isn't
      * included in the tab index flow.
      */
    var tabIndex: `0` | `-1`
  }
  object RadioWidgetProps {
    
    inline def apply(checked: Boolean, id: String, tabIndex: `0` | `-1`): RadioWidgetProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioWidgetProps]
    }
    
    extension [Self <: RadioWidgetProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: `0` | `-1`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
}
