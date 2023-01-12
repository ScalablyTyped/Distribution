package typings.reactLatexNext

import typings.react.mod.Component
import typings.reactLatexNext.anon.PartialLatexProps
import typings.reactLatexNext.distRenderLatexMod.Macros
import typings.reactLatexNext.distTypesMod.Delimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLatexMod {
  
  @JSImport("react-latex-next/dist/Latex", JSImport.Default)
  @js.native
  open class default () extends Latex
  /* static members */
  object default {
    
    @JSImport("react-latex-next/dist/Latex", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-latex-next/dist/Latex", "default.defaultProps")
    @js.native
    def defaultProps: PartialLatexProps = js.native
    inline def defaultProps_=(x: PartialLatexProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Latex
    extends Component[LatexProps, js.Object, Any]
  
  trait LatexProps extends StObject {
    
    var children: String
    
    var delimiters: js.UndefOr[js.Array[Delimiter]] = js.undefined
    
    var macros: js.UndefOr[Macros] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object LatexProps {
    
    inline def apply(children: String): LatexProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[LatexProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LatexProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDelimiters(value: js.Array[Delimiter]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      inline def setDelimitersVarargs(value: Delimiter*): Self = StObject.set(x, "delimiters", js.Array(value*))
      
      inline def setMacros(value: Macros): Self = StObject.set(x, "macros", value.asInstanceOf[js.Any])
      
      inline def setMacrosUndefined: Self = StObject.set(x, "macros", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
