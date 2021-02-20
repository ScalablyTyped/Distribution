package typings.rcMentions

import typings.rcMentions.optionMod.OptionProps
import typings.react.mod.Consumer
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.Provider
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mentionsContextMod {
  
  @JSImport("rc-mentions/es/MentionsContext", "MentionsContextConsumer")
  @js.native
  val MentionsContextConsumer: Consumer[MentionsContextProps] = js.native
  
  @JSImport("rc-mentions/es/MentionsContext", "MentionsContextProvider")
  @js.native
  val MentionsContextProvider: Provider[MentionsContextProps] = js.native
  
  @js.native
  trait MentionsContextProps extends StObject {
    
    var activeIndex: Double = js.native
    
    var notFoundContent: ReactNode = js.native
    
    var onBlur: FocusEventHandler[HTMLElement] = js.native
    
    var onFocus: FocusEventHandler[HTMLElement] = js.native
    
    def selectOption(option: OptionProps): Unit = js.native
    
    def setActiveIndex(index: Double): Unit = js.native
  }
  object MentionsContextProps {
    
    @scala.inline
    def apply(
      activeIndex: Double,
      onBlur: FocusEvent[HTMLElement] => Unit,
      onFocus: FocusEvent[HTMLElement] => Unit,
      selectOption: OptionProps => Unit,
      setActiveIndex: Double => Unit
    ): MentionsContextProps = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), selectOption = js.Any.fromFunction1(selectOption), setActiveIndex = js.Any.fromFunction1(setActiveIndex))
      __obj.asInstanceOf[MentionsContextProps]
    }
    
    @scala.inline
    implicit class MentionsContextPropsMutableBuilder[Self <: MentionsContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContent(value: ReactNode): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectOption(value: OptionProps => Unit): Self = StObject.set(x, "selectOption", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetActiveIndex(value: Double => Unit): Self = StObject.set(x, "setActiveIndex", js.Any.fromFunction1(value))
    }
  }
}
