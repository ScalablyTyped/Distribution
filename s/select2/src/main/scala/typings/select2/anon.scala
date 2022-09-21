package typings.select2

import typings.select2.mod.DataFormat
import typings.select2.mod.GroupedDataFormat
import typings.select2.mod.IdTextPair
import typings.select2.mod.Select2Require
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: IdTextPair
  }
  object Data {
    
    inline def apply(data: IdTextPair): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: IdTextPair): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait More extends StObject {
    
    var more: Boolean
  }
  object More {
    
    inline def apply(more: Boolean): More = {
      val __obj = js.Dynamic.literal(more = more.asInstanceOf[js.Any])
      __obj.asInstanceOf[More]
    }
    
    extension [Self <: More](x: Self) {
      
      inline def setMore(value: Boolean): Self = StObject.set(x, "more", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var options: typings.select2.mod.Options[DataFormat | GroupedDataFormat, Any]
  }
  object Options {
    
    inline def apply(options: typings.select2.mod.Options[DataFormat | GroupedDataFormat, Any]): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: typings.select2.mod.Options[DataFormat | GroupedDataFormat, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Require extends StObject {
    
    def require(module: String): Any
    def require(modules: js.Array[String]): Unit
    def require(modules: js.Array[String], ready: js.Function1[/* repeated */ Any, Unit]): Unit
    def require(
      modules: js.Array[String],
      ready: js.Function1[/* repeated */ Any, Unit],
      errback: js.Function1[/* err */ Any, Unit]
    ): Unit
    @JSName("require")
    var require_Original: Select2Require
  }
  object Require {
    
    inline def apply(require: Select2Require): Require = {
      val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[Require]
    }
    
    extension [Self <: Require](x: Self) {
      
      inline def setRequire(value: Select2Require): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reset extends StObject {
    
    def reset(): Unit
    
    def set(key: String, value: Any): Unit
  }
  object Reset {
    
    inline def apply(reset: () => Unit, set: (String, Any) => Unit): Reset = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Reset]
    }
    
    extension [Self <: Reset](x: Self) {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
