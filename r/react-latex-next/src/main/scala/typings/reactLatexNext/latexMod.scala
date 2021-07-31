package typings.reactLatexNext

import typings.react.mod.Component
import typings.reactLatexNext.anon.PartialLatexProps
import typings.reactLatexNext.typesMod.Delimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latexMod {
  
  @JSImport("react-latex-next/dist/Latex", JSImport.Default)
  @js.native
  class default () extends Latex
  /* static members */
  object default {
    
    @JSImport("react-latex-next/dist/Latex", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-latex-next/dist/Latex", "default.defaultProps")
    @js.native
    def defaultProps: PartialLatexProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialLatexProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Latex
    extends Component[LatexProps, js.Object, js.Any]
  
  trait LatexProps extends StObject {
    
    var children: String
    
    var delimiters: js.UndefOr[js.Array[Delimiter]] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object LatexProps {
    
    @scala.inline
    def apply(children: String): LatexProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[LatexProps]
    }
    
    @scala.inline
    implicit class LatexPropsMutableBuilder[Self <: LatexProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
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
