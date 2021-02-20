package typings.rmcDatePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Am extends StObject {
    
    var am: String = js.native
    
    var day: String = js.native
    
    var hour: String = js.native
    
    var minute: String = js.native
    
    var month: String = js.native
    
    var pm: String = js.native
    
    var year: String = js.native
  }
  object Am {
    
    @scala.inline
    def apply(am: String, day: String, hour: String, minute: String, month: String, pm: String, year: String): Am = {
      val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Am]
    }
    
    @scala.inline
    implicit class AmMutableBuilder[Self <: Am] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: js.Array[_] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(children: js.Array[_]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[_]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Cols extends StObject {
    
    var cols: js.Array[Key] = js.native
    
    var selMinute: js.Any = js.native
  }
  object Cols {
    
    @scala.inline
    def apply(cols: js.Array[Key], selMinute: js.Any): Cols = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], selMinute = selMinute.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cols]
    }
    
    @scala.inline
    implicit class ColsMutableBuilder[Self <: Cols] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: js.Array[Key]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsVarargs(value: Key*): Self = StObject.set(x, "cols", js.Array(value :_*))
      
      @scala.inline
      def setSelMinute(value: js.Any): Self = StObject.set(x, "selMinute", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Date extends StObject {
    
    var date: js.Any = js.native
  }
  object Date {
    
    @scala.inline
    def apply(date: js.Any): Date = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: String = js.native
    
    var props: Children = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String, props: Children): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var cols: js.Array[_] = js.native
    
    var value: js.Array[_] = js.native
  }
  object Value {
    
    @scala.inline
    def apply(cols: js.Array[_], value: js.Array[_]): Value = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: js.Array[_]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsVarargs(value: js.Any*): Self = StObject.set(x, "cols", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
