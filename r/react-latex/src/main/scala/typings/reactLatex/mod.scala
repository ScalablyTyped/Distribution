package typings.reactLatex

import typings.react.mod.Component
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-latex", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[LatexProps, js.Object, Any]
  
  type Latex = Component[LatexProps, js.Object, Any]
  
  trait LatexProps extends StObject {
    
    var children: js.UndefOr[String] = js.undefined
    
    var colorIsTextColor: js.UndefOr[Boolean] = js.undefined
    
    var displayMode: js.UndefOr[Boolean] = js.undefined
    
    var errorColor: js.UndefOr[String] = js.undefined
    
    var fleqn: js.UndefOr[Boolean] = js.undefined
    
    var leqno: js.UndefOr[Boolean] = js.undefined
    
    var macros: js.UndefOr[Record[Any, Any]] = js.undefined
    
    var maxExpand: js.UndefOr[Double] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var minRuleThickness: js.UndefOr[Double] = js.undefined
    
    var strict: js.UndefOr[Boolean | String | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var throwOnError: js.UndefOr[Boolean] = js.undefined
    
    var trust: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Any])] = js.undefined
  }
  object LatexProps {
    
    inline def apply(): LatexProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LatexProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LatexProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColorIsTextColor(value: Boolean): Self = StObject.set(x, "colorIsTextColor", value.asInstanceOf[js.Any])
      
      inline def setColorIsTextColorUndefined: Self = StObject.set(x, "colorIsTextColor", js.undefined)
      
      inline def setDisplayMode(value: Boolean): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      inline def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setFleqn(value: Boolean): Self = StObject.set(x, "fleqn", value.asInstanceOf[js.Any])
      
      inline def setFleqnUndefined: Self = StObject.set(x, "fleqn", js.undefined)
      
      inline def setLeqno(value: Boolean): Self = StObject.set(x, "leqno", value.asInstanceOf[js.Any])
      
      inline def setLeqnoUndefined: Self = StObject.set(x, "leqno", js.undefined)
      
      inline def setMacros(value: Record[Any, Any]): Self = StObject.set(x, "macros", value.asInstanceOf[js.Any])
      
      inline def setMacrosUndefined: Self = StObject.set(x, "macros", js.undefined)
      
      inline def setMaxExpand(value: Double): Self = StObject.set(x, "maxExpand", value.asInstanceOf[js.Any])
      
      inline def setMaxExpandUndefined: Self = StObject.set(x, "maxExpand", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMinRuleThickness(value: Double): Self = StObject.set(x, "minRuleThickness", value.asInstanceOf[js.Any])
      
      inline def setMinRuleThicknessUndefined: Self = StObject.set(x, "minRuleThickness", js.undefined)
      
      inline def setStrict(value: Boolean | String | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "strict", js.Any.fromFunction1(value))
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setThrowOnError(value: Boolean): Self = StObject.set(x, "throwOnError", value.asInstanceOf[js.Any])
      
      inline def setThrowOnErrorUndefined: Self = StObject.set(x, "throwOnError", js.undefined)
      
      inline def setTrust(value: Boolean | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
      
      inline def setTrustFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "trust", js.Any.fromFunction1(value))
      
      inline def setTrustUndefined: Self = StObject.set(x, "trust", js.undefined)
    }
  }
}
