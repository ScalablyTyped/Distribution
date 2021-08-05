package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.rcSelect.generatorMod.Key
import typings.react.mod.CSSProperties
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
  
  /* Inlined parent std.Omit<rc-select.rc-select/lib/interface.OptionCoreData, 'label'> */
  trait OptionProps
    extends StObject
       with /** Save for customize data */
  /* prop */ StringDictionary[js.Any] {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var value: Key
  }
  object OptionProps {
    
    inline def apply(value: Key): OptionProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionProps]
    }
    
    extension [Self <: OptionProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValue(value: Key): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OptionFC
  
  /* This means you don't have to write `default`, but can instead just say `optionMod.foo` */
  override def _to: OptionFC = default
}
