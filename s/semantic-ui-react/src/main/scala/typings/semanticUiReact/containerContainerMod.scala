package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerContainerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Container/Container", JSImport.Default)
  @js.native
  val default: StatelessComponent[ContainerProps] = js.native
  
  trait ContainerProps
    extends StObject
       with StrictContainerProps
       with /* key */ StringDictionary[js.Any]
  object ContainerProps {
    
    inline def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
  }
  
  trait StrictContainerProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Container has no maximum width. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** Reduce maximum width to more naturally accommodate text. */
    var text: js.UndefOr[Boolean] = js.undefined
    
    /** Describes how the text inside this component should be aligned. */
    var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.undefined
  }
  object StrictContainerProps {
    
    inline def apply(): StrictContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictContainerProps]
    }
    
    extension [Self <: StrictContainerProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type _To = StatelessComponent[ContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `containerContainerMod.foo` */
  override def _to: StatelessComponent[ContainerProps] = default
}
