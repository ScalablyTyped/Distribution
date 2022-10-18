package typings.reactLatexNext

import typings.reactLatexNext.distRenderLatexMod.Macros
import typings.reactLatexNext.distTypesMod.Delimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-latex-next.react-latex-next/dist/Latex.LatexProps> */
  trait PartialLatexProps extends StObject {
    
    var children: js.UndefOr[String] = js.undefined
    
    var delimiters: js.UndefOr[js.Array[Delimiter]] = js.undefined
    
    var macros: js.UndefOr[Macros] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object PartialLatexProps {
    
    inline def apply(): PartialLatexProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLatexProps]
    }
    
    extension [Self <: PartialLatexProps](x: Self) {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
