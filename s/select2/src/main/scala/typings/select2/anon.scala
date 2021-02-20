package typings.select2

import typings.select2.mod.DataFormat
import typings.select2.mod.GroupedDataFormat
import typings.select2.mod.IdTextPair
import typings.select2.mod.Select2Require
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data extends StObject {
    
    var data: IdTextPair = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: IdTextPair): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: IdTextPair): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait More extends StObject {
    
    var more: Boolean = js.native
  }
  object More {
    
    @scala.inline
    def apply(more: Boolean): More = {
      val __obj = js.Dynamic.literal(more = more.asInstanceOf[js.Any])
      __obj.asInstanceOf[More]
    }
    
    @scala.inline
    implicit class MoreMutableBuilder[Self <: More] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMore(value: Boolean): Self = StObject.set(x, "more", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var options: typings.select2.mod.Options[DataFormat | GroupedDataFormat, _] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(options: typings.select2.mod.Options[DataFormat | GroupedDataFormat, _]): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: typings.select2.mod.Options[DataFormat | GroupedDataFormat, _]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Require extends StObject {
    
    def require(module: String): js.Any = js.native
    def require(modules: js.Array[String]): Unit = js.native
    def require(modules: js.Array[String], ready: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    def require(
      modules: js.Array[String],
      ready: js.Function1[/* repeated */ js.Any, Unit],
      errback: js.Function1[/* err */ js.Any, Unit]
    ): Unit = js.native
    @JSName("require")
    var require_Original: Select2Require = js.native
  }
  
  @js.native
  trait Reset extends StObject {
    
    def reset(): Unit = js.native
    
    def set(key: String, value: js.Any): Unit = js.native
  }
  object Reset {
    
    @scala.inline
    def apply(reset: () => Unit, set: (String, js.Any) => Unit): Reset = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Reset]
    }
    
    @scala.inline
    implicit class ResetMutableBuilder[Self <: Reset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
