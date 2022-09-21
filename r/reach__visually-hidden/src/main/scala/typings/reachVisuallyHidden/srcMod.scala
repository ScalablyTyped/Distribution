package typings.reachVisuallyHidden

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod extends Shortcut {
  
  /**
    * VisuallyHidden
    *
    * Provides text for screen readers that is visually hidden.
    * It is the logical opposite of the `aria-hidden` attribute.
    */
  @JSImport("@reach/visually-hidden/dist/declarations/src", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'span', VisuallyHiddenProps> */ Any = js.native
  
  /**
    * VisuallyHidden
    *
    * Provides text for screen readers that is visually hidden.
    * It is the logical opposite of the `aria-hidden` attribute.
    */
  @JSImport("@reach/visually-hidden/dist/declarations/src", "VisuallyHidden")
  @js.native
  val VisuallyHidden: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'span', VisuallyHiddenProps> */ Any = js.native
  
  /**
    * @see Docs https://reach.tech/visually-hidden#visuallyhidden-props
    */
  trait VisuallyHiddenProps extends StObject {
    
    /**
      * @see Docs https://reach.tech/visually-hidden#visuallyhidden-children
      */
    var children: ReactNode
  }
  object VisuallyHiddenProps {
    
    inline def apply(): VisuallyHiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisuallyHiddenProps]
    }
    
    extension [Self <: VisuallyHiddenProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'span', VisuallyHiddenProps> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `srcMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'span', VisuallyHiddenProps> */ Any = default
}
