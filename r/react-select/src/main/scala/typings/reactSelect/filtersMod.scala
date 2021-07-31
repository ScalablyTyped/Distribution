package typings.reactSelect

import typings.reactSelect.reactSelectStrings.any
import typings.reactSelect.reactSelectStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filtersMod {
  
  @JSImport("react-select/src/filters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createFilter(): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")().asInstanceOf[js.Function2[/* option */ Option, /* rawInput */ String, Boolean]]
  @scala.inline
  def createFilter(config: Config): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* option */ Option, /* rawInput */ String, Boolean]]
  
  trait Config extends StObject {
    
    var ignoreAccents: js.UndefOr[Boolean] = js.undefined
    
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    var matchFrom: js.UndefOr[any | start] = js.undefined
    
    var stringify: js.UndefOr[js.Function1[/* obj */ js.Any, String]] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreAccents(value: Boolean): Self = StObject.set(x, "ignoreAccents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreAccentsUndefined: Self = StObject.set(x, "ignoreAccents", js.undefined)
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      @scala.inline
      def setMatchFrom(value: any | start): Self = StObject.set(x, "matchFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchFromUndefined: Self = StObject.set(x, "matchFrom", js.undefined)
      
      @scala.inline
      def setStringify(value: /* obj */ js.Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  trait Option extends StObject {
    
    var data: js.Any
    
    var label: String
    
    var value: String
  }
  object Option {
    
    @scala.inline
    def apply(data: js.Any, label: String, value: String): Option = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
