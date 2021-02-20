package typings.rmcPicker

import typings.react.mod.ReactNode
import typings.rmcPicker.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMixinMod {
  
  @JSImport("rmc-picker/lib/PickerMixin", JSImport.Default)
  @js.native
  def default(ComposedComponent: js.Any): Item = js.native
  
  @js.native
  trait IItemProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var value: js.Any = js.native
  }
  object IItemProps {
    
    @scala.inline
    def apply(value: js.Any): IItemProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IItemProps]
    }
    
    @scala.inline
    implicit class IItemPropsMutableBuilder[Self <: IItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
