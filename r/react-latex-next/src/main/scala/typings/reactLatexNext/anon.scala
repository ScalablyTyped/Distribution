package typings.reactLatexNext

import typings.reactLatexNext.typesMod.Delimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-latex-next.react-latex-next/dist/Latex.LatexProps> */
  @js.native
  trait PartialLatexProps extends StObject {
    
    var children: js.UndefOr[String] = js.native
    
    var delimiters: js.UndefOr[js.Array[Delimiter]] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object PartialLatexProps {
    
    @scala.inline
    def apply(): PartialLatexProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLatexProps]
    }
    
    @scala.inline
    implicit class PartialLatexPropsMutableBuilder[Self <: PartialLatexProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDelimiters(value: js.Array[Delimiter]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      @scala.inline
      def setDelimitersVarargs(value: Delimiter*): Self = StObject.set(x, "delimiters", js.Array(value :_*))
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
