package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionMod extends Shortcut {
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select/lib/Option", JSImport.Default)
  @js.native
  val default: OptionFC = js.native
  
  @js.native
  trait OptionFC
    extends StObject
       with FunctionComponent[OptionProps] {
    
    /** Legacy for check if is a Option Group */
    var isSelectOption: Boolean = js.native
  }
  
  /* Inlined parent std.Omit<rc-select.rc-select/lib/Select.DefaultOptionType, 'label'> */
  trait OptionProps
    extends StObject
       with /** Save for customize data */
  /* prop */ StringDictionary[Any] {
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String | Double | Null] = js.undefined
  }
  object OptionProps {
    
    inline def apply(): OptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionProps]
    }
    
    extension [Self <: OptionProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = OptionFC
  
  /* This means you don't have to write `default`, but can instead just say `optionMod.foo` */
  override def _to: OptionFC = default
}
