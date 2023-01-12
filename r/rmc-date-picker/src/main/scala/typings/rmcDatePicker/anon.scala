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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Am] (val x: Self) extends AnyVal {
      
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
    
    var children: js.Array[Any]
  }
  object Children {
    
    inline def apply(children: js.Array[Any]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait Cols extends StObject {
    
    var cols: js.Array[Key]
    
    var selMinute: Any
  }
  object Cols {
    
    inline def apply(cols: js.Array[Key], selMinute: Any): Cols = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], selMinute = selMinute.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cols]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cols] (val x: Self) extends AnyVal {
      
      inline def setCols(value: js.Array[Key]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsVarargs(value: Key*): Self = StObject.set(x, "cols", js.Array(value*))
      
      inline def setSelMinute(value: Any): Self = StObject.set(x, "selMinute", value.asInstanceOf[js.Any])
    }
  }
  
  trait Date extends StObject {
    
    var date: Any
  }
  object Date {
    
    inline def apply(date: Any): Date = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var cols: js.Array[Any]
    
    var value: js.Array[Any]
  }
  object Value {
    
    inline def apply(cols: js.Array[Any], value: js.Array[Any]): Value = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setCols(value: js.Array[Any]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsVarargs(value: Any*): Self = StObject.set(x, "cols", js.Array(value*))
      
      inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
