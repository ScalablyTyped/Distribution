package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revealContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Reveal/RevealContent", JSImport.Default)
  @js.native
  val default: StatelessComponent[RevealContentProps] = js.native
  
  trait RevealContentProps
    extends StObject
       with StrictRevealContentProps
       with /* key */ StringDictionary[js.Any]
  object RevealContentProps {
    
    inline def apply(): RevealContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevealContentProps]
    }
  }
  
  trait StrictRevealContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A reveal may contain content that is visible before interaction. */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /** A reveal may contain content that is hidden before user interaction. */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object StrictRevealContentProps {
    
    inline def apply(): StrictRevealContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRevealContentProps]
    }
    
    extension [Self <: StrictRevealContentProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = StatelessComponent[RevealContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `revealContentMod.foo` */
  override def _to: StatelessComponent[RevealContentProps] = default
}
