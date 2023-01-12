package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptGroupMod extends Shortcut {
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select/lib/OptGroup", JSImport.Default)
  @js.native
  val default: OptionGroupFC = js.native
  
  /* Inlined parent std.Omit<rc-select.rc-select/lib/Select.DefaultOptionType, 'options'> */
  trait OptGroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: ReactNode
    
    var value: js.UndefOr[String | Double | Null] = js.undefined
  }
  object OptGroupProps {
    
    inline def apply(): OptGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptGroupProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait OptionGroupFC
    extends StObject
       with FunctionComponent[OptGroupProps] {
    
    /** Legacy for check if is a Option Group */
    var isSelectOptGroup: Boolean = js.native
  }
  
  type _To = OptionGroupFC
  
  /* This means you don't have to write `default`, but can instead just say `libOptGroupMod.foo` */
  override def _to: OptionGroupFC = default
}
