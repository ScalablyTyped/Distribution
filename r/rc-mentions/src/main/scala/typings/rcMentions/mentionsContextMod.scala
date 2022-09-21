package typings.rcMentions

import org.scalablytyped.runtime.Shortcut
import typings.rcMentions.optionMod.OptionProps
import typings.react.mod.Context
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mentionsContextMod extends Shortcut {
  
  @JSImport("rc-mentions/es/MentionsContext", JSImport.Default)
  @js.native
  val default: Context[MentionsContextProps] = js.native
  
  trait MentionsContextProps extends StObject {
    
    var activeIndex: Double
    
    var notFoundContent: ReactNode
    
    var onBlur: FocusEventHandler[HTMLElement]
    
    var onFocus: FocusEventHandler[HTMLElement]
    
    def selectOption(option: OptionProps): Unit
    
    def setActiveIndex(index: Double): Unit
  }
  object MentionsContextProps {
    
    inline def apply(
      activeIndex: Double,
      onBlur: FocusEvent[HTMLElement, Element] => Unit,
      onFocus: FocusEvent[HTMLElement, Element] => Unit,
      selectOption: OptionProps => Unit,
      setActiveIndex: Double => Unit
    ): MentionsContextProps = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), selectOption = js.Any.fromFunction1(selectOption), setActiveIndex = js.Any.fromFunction1(setActiveIndex))
      __obj.asInstanceOf[MentionsContextProps]
    }
    
    extension [Self <: MentionsContextProps](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setNotFoundContent(value: ReactNode): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      inline def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: FocusEvent[HTMLElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setSelectOption(value: OptionProps => Unit): Self = StObject.set(x, "selectOption", js.Any.fromFunction1(value))
      
      inline def setSetActiveIndex(value: Double => Unit): Self = StObject.set(x, "setActiveIndex", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[MentionsContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `mentionsContextMod.foo` */
  override def _to: Context[MentionsContextProps] = default
}
