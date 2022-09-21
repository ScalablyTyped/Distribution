package typings.reactWidgets

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAddToListOptionMod {
  
  object default {
    
    inline def apply(hasChildrenProps: AddToListOptionProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/esm/AddToListOption", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-widgets/esm/AddToListOption", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/esm/AddToListOption", "default.propTypes.activeId")
      @js.native
      def activeId: Requireable[String] = js.native
      inline def activeId_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeId")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/AddToListOption", "default.propTypes.focused")
      @js.native
      def focused: Requireable[Boolean] = js.native
      inline def focused_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focused")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/AddToListOption", "default.propTypes.onSelect")
      @js.native
      def onSelect: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onSelect_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/AddToListOption", "default.propTypes.searchTerm")
      @js.native
      def searchTerm: Requireable[String] = js.native
      inline def searchTerm_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("searchTerm")(x.asInstanceOf[js.Any])
    }
  }
  
  trait AddToListOptionProps extends StObject {
    
    var children: ReactNode
    
    def onSelect(event: MouseEvent[typings.std.Element, NativeMouseEvent]): Unit
  }
  object AddToListOptionProps {
    
    inline def apply(onSelect: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): AddToListOptionProps = {
      val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect))
      __obj.asInstanceOf[AddToListOptionProps]
    }
    
    extension [Self <: AddToListOptionProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnSelect(value: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    }
  }
}
