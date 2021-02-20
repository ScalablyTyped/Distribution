package typings.reactDatepicker

import typings.react.mod.ReactNode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ChangeMonth extends StObject {
    
    def changeMonth(month: Double): Unit = js.native
    
    def changeYear(year: Double): Unit = js.native
    
    var date: Date = js.native
    
    def decreaseMonth(): Unit = js.native
    
    def decreaseYear(): Unit = js.native
    
    def increaseMonth(): Unit = js.native
    
    def increaseYear(): Unit = js.native
    
    var nextMonthButtonDisabled: Boolean = js.native
    
    var nextYearButtonDisabled: Boolean = js.native
    
    var prevMonthButtonDisabled: Boolean = js.native
    
    var prevYearButtonDisabled: Boolean = js.native
  }
  object ChangeMonth {
    
    @scala.inline
    def apply(
      changeMonth: Double => Unit,
      changeYear: Double => Unit,
      date: Date,
      decreaseMonth: () => Unit,
      decreaseYear: () => Unit,
      increaseMonth: () => Unit,
      increaseYear: () => Unit,
      nextMonthButtonDisabled: Boolean,
      nextYearButtonDisabled: Boolean,
      prevMonthButtonDisabled: Boolean,
      prevYearButtonDisabled: Boolean
    ): ChangeMonth = {
      val __obj = js.Dynamic.literal(changeMonth = js.Any.fromFunction1(changeMonth), changeYear = js.Any.fromFunction1(changeYear), date = date.asInstanceOf[js.Any], decreaseMonth = js.Any.fromFunction0(decreaseMonth), decreaseYear = js.Any.fromFunction0(decreaseYear), increaseMonth = js.Any.fromFunction0(increaseMonth), increaseYear = js.Any.fromFunction0(increaseYear), nextMonthButtonDisabled = nextMonthButtonDisabled.asInstanceOf[js.Any], nextYearButtonDisabled = nextYearButtonDisabled.asInstanceOf[js.Any], prevMonthButtonDisabled = prevMonthButtonDisabled.asInstanceOf[js.Any], prevYearButtonDisabled = prevYearButtonDisabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeMonth]
    }
    
    @scala.inline
    implicit class ChangeMonthMutableBuilder[Self <: ChangeMonth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeMonth(value: Double => Unit): Self = StObject.set(x, "changeMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeYear(value: Double => Unit): Self = StObject.set(x, "changeYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecreaseMonth(value: () => Unit): Self = StObject.set(x, "decreaseMonth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDecreaseYear(value: () => Unit): Self = StObject.set(x, "decreaseYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIncreaseMonth(value: () => Unit): Self = StObject.set(x, "increaseMonth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIncreaseYear(value: () => Unit): Self = StObject.set(x, "increaseYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNextMonthButtonDisabled(value: Boolean): Self = StObject.set(x, "nextMonthButtonDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextYearButtonDisabled(value: Boolean): Self = StObject.set(x, "nextYearButtonDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevMonthButtonDisabled(value: Boolean): Self = StObject.set(x, "prevMonthButtonDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevYearButtonDisabled(value: Boolean): Self = StObject.set(x, "prevYearButtonDisabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: js.Array[ReactNode] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(children: js.Array[ReactNode]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Code extends StObject {
    
    var code: Double = js.native
    
    var msg: String = js.native
  }
  object Code {
    
    @scala.inline
    def apply(code: Double, msg: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
}
