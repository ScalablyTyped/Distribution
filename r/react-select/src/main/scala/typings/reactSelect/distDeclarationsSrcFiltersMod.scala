package typings.reactSelect

import typings.reactSelect.reactSelectStrings.any
import typings.reactSelect.reactSelectStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcFiltersMod {
  
  @JSImport("react-select/dist/declarations/src/filters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFilter[Option](): js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")().asInstanceOf[js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean]]
  inline def createFilter[Option](config: Config[Option]): js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean]]
  
  trait Config[Option] extends StObject {
    
    val ignoreAccents: js.UndefOr[Boolean] = js.undefined
    
    val ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    val matchFrom: js.UndefOr[any | start] = js.undefined
    
    val stringify: js.UndefOr[js.Function1[/* option */ FilterOptionOption[Option], String]] = js.undefined
    
    val trim: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply[Option](): Config[Option] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[Option]]
    }
    
    extension [Self <: Config[?], Option](x: Self & Config[Option]) {
      
      inline def setIgnoreAccents(value: Boolean): Self = StObject.set(x, "ignoreAccents", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAccentsUndefined: Self = StObject.set(x, "ignoreAccents", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setMatchFrom(value: any | start): Self = StObject.set(x, "matchFrom", value.asInstanceOf[js.Any])
      
      inline def setMatchFromUndefined: Self = StObject.set(x, "matchFrom", js.undefined)
      
      inline def setStringify(value: /* option */ FilterOptionOption[Option] => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  trait FilterOptionOption[Option] extends StObject {
    
    val data: Option
    
    val label: String
    
    val value: String
  }
  object FilterOptionOption {
    
    inline def apply[Option](data: Option, label: String, value: String): FilterOptionOption[Option] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterOptionOption[Option]]
    }
    
    extension [Self <: FilterOptionOption[?], Option](x: Self & FilterOptionOption[Option]) {
      
      inline def setData(value: Option): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
