package typings.rmcDatePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Am extends StObject {
    
    var am: String
    
    var day: String
    
    var hour: String
    
    var minute: String
    
    var month: String
    
    var pm: String
    
    var year: String
  }
  object Am {
    
    inline def apply(am: String, day: String, hour: String, minute: String, month: String, pm: String, year: String): Am = {
      val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Am]
    }
    
    extension [Self <: Am](x: Self) {
      
      inline def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: js.Array[js.Any]
  }
  object Children {
    
    inline def apply(children: js.Array[js.Any]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: js.Array[js.Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  trait Cols extends StObject {
    
    var cols: js.Array[Key]
    
    var selMinute: js.Any
  }
  object Cols {
    
    inline def apply(cols: js.Array[Key], selMinute: js.Any): Cols = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], selMinute = selMinute.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cols]
    }
    
    extension [Self <: Cols](x: Self) {
      
      inline def setCols(value: js.Array[Key]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsVarargs(value: Key*): Self = StObject.set(x, "cols", js.Array(value :_*))
      
      inline def setSelMinute(value: js.Any): Self = StObject.set(x, "selMinute", value.asInstanceOf[js.Any])
    }
  }
  
  trait Date extends StObject {
    
    var date: js.Any
  }
  object Date {
    
    inline def apply(date: js.Any): Date = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    extension [Self <: Date](x: Self) {
      
      inline def setDate(value: js.Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var props: Children
  }
  object Key {
    
    inline def apply(key: String, props: Children): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var cols: js.Array[js.Any]
    
    var value: js.Array[js.Any]
  }
  object Value {
    
    inline def apply(cols: js.Array[js.Any], value: js.Array[js.Any]): Value = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setCols(value: js.Array[js.Any]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsVarargs(value: js.Any*): Self = StObject.set(x, "cols", js.Array(value :_*))
      
      inline def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
