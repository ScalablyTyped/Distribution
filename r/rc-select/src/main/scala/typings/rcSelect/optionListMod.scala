package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcSelect.anon.Selected
import typings.rcSelect.generatorMod.FlattenOptionsType
import typings.rcSelect.generatorMod.RawValueType
import typings.rcSelect.interfaceMod.OnActiveValue
import typings.rcSelect.interfaceMod.OptionsType
import typings.rcSelect.interfaceMod.RenderNode
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.UIEventHandler
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionListMod extends Shortcut {
  
  @JSImport("rc-select/lib/OptionList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OptionListProps[OptionsType] & RefAttributes[RefOptionListProps]] = js.native
  
  @js.native
  trait OptionListProps[OptionsType /* <: js.Array[js.Object] */] extends StObject {
    
    var childrenAsData: Boolean = js.native
    
    var defaultActiveFirstOption: js.UndefOr[Boolean] = js.native
    
    var flattenOptions: FlattenOptionsType[OptionsType] = js.native
    
    var height: Double = js.native
    
    var id: String = js.native
    
    var itemHeight: Double = js.native
    
    var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.native
    
    var multiple: Boolean = js.native
    
    var notFoundContent: js.UndefOr[ReactNode] = js.native
    
    /** Tell Select that some value is now active to make accessibility work */
    var onActiveValue: OnActiveValue = js.native
    
    /** Tell Select that mouse enter the popup to force re-render */
    var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.native
    
    var onScroll: UIEventHandler[HTMLDivElement] = js.native
    
    def onSelect(value: RawValueType, option: Selected): Unit = js.native
    
    def onToggleOpen(): Unit = js.native
    def onToggleOpen(open: Boolean): Unit = js.native
    
    var open: Boolean = js.native
    
    var options: OptionsType = js.native
    
    var prefixCls: String = js.native
    
    var searchValue: String = js.native
    
    var values: Set[RawValueType] = js.native
    
    var virtual: Boolean = js.native
  }
  
  trait RefOptionListProps extends StObject {
    
    var onKeyDown: KeyboardEventHandler[Element]
    
    var onKeyUp: KeyboardEventHandler[Element]
    
    var scrollTo: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  }
  object RefOptionListProps {
    
    inline def apply(onKeyDown: KeyboardEvent[Element] => Unit, onKeyUp: KeyboardEvent[Element] => Unit): RefOptionListProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp))
      __obj.asInstanceOf[RefOptionListProps]
    }
    
    extension [Self <: RefOptionListProps](x: Self) {
      
      inline def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyUp(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setScrollTo(value: /* index */ Double => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[OptionListProps[OptionsType] & RefAttributes[RefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `optionListMod.foo` */
  override def _to: ForwardRefExoticComponent[OptionListProps[OptionsType] & RefAttributes[RefOptionListProps]] = default
}
