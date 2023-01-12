package typings.reactElementToJsxString

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-element-to-jsx-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: ReactNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(element: ReactNode, options: ReactElementToJSXStringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type FilterPropsFunction = js.Function2[/* value */ Any, /* key */ String, Boolean]
  
  trait ReactElementToJSXStringOptions extends StObject {
    
    var displayName: js.UndefOr[js.Function1[/* element */ ReactNode, String]] = js.undefined
    
    var filterProps: js.UndefOr[js.Array[String] | FilterPropsFunction] = js.undefined
    
    var functionValue: js.UndefOr[js.Function1[/* fn */ Any, Any]] = js.undefined
    
    var maxInlineAttributesLineLength: js.UndefOr[Double] = js.undefined
    
    var showDefaultProps: js.UndefOr[Boolean] = js.undefined
    
    var showFunctions: js.UndefOr[Boolean] = js.undefined
    
    var sortProps: js.UndefOr[Boolean] = js.undefined
    
    var tabStop: js.UndefOr[Double] = js.undefined
    
    var useBooleanShorthandSyntax: js.UndefOr[Boolean] = js.undefined
    
    var useFragmentShortSyntax: js.UndefOr[Boolean] = js.undefined
  }
  object ReactElementToJSXStringOptions {
    
    inline def apply(): ReactElementToJSXStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactElementToJSXStringOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactElementToJSXStringOptions] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: /* element */ ReactNode => String): Self = StObject.set(x, "displayName", js.Any.fromFunction1(value))
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setFilterProps(value: js.Array[String] | FilterPropsFunction): Self = StObject.set(x, "filterProps", value.asInstanceOf[js.Any])
      
      inline def setFilterPropsFunction2(value: (/* value */ Any, /* key */ String) => Boolean): Self = StObject.set(x, "filterProps", js.Any.fromFunction2(value))
      
      inline def setFilterPropsUndefined: Self = StObject.set(x, "filterProps", js.undefined)
      
      inline def setFilterPropsVarargs(value: String*): Self = StObject.set(x, "filterProps", js.Array(value*))
      
      inline def setFunctionValue(value: /* fn */ Any => Any): Self = StObject.set(x, "functionValue", js.Any.fromFunction1(value))
      
      inline def setFunctionValueUndefined: Self = StObject.set(x, "functionValue", js.undefined)
      
      inline def setMaxInlineAttributesLineLength(value: Double): Self = StObject.set(x, "maxInlineAttributesLineLength", value.asInstanceOf[js.Any])
      
      inline def setMaxInlineAttributesLineLengthUndefined: Self = StObject.set(x, "maxInlineAttributesLineLength", js.undefined)
      
      inline def setShowDefaultProps(value: Boolean): Self = StObject.set(x, "showDefaultProps", value.asInstanceOf[js.Any])
      
      inline def setShowDefaultPropsUndefined: Self = StObject.set(x, "showDefaultProps", js.undefined)
      
      inline def setShowFunctions(value: Boolean): Self = StObject.set(x, "showFunctions", value.asInstanceOf[js.Any])
      
      inline def setShowFunctionsUndefined: Self = StObject.set(x, "showFunctions", js.undefined)
      
      inline def setSortProps(value: Boolean): Self = StObject.set(x, "sortProps", value.asInstanceOf[js.Any])
      
      inline def setSortPropsUndefined: Self = StObject.set(x, "sortProps", js.undefined)
      
      inline def setTabStop(value: Double): Self = StObject.set(x, "tabStop", value.asInstanceOf[js.Any])
      
      inline def setTabStopUndefined: Self = StObject.set(x, "tabStop", js.undefined)
      
      inline def setUseBooleanShorthandSyntax(value: Boolean): Self = StObject.set(x, "useBooleanShorthandSyntax", value.asInstanceOf[js.Any])
      
      inline def setUseBooleanShorthandSyntaxUndefined: Self = StObject.set(x, "useBooleanShorthandSyntax", js.undefined)
      
      inline def setUseFragmentShortSyntax(value: Boolean): Self = StObject.set(x, "useFragmentShortSyntax", value.asInstanceOf[js.Any])
      
      inline def setUseFragmentShortSyntaxUndefined: Self = StObject.set(x, "useFragmentShortSyntax", js.undefined)
    }
  }
}
