package typings.reachVisuallyHidden

import typings.reachPolymorphic.mod.ForwardRefComponent
import typings.reachVisuallyHidden.reachVisuallyHiddenStrings.span
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Welcome to @reach/visually-hidden!
    *
    * Provides text for screen readers that is visually hidden.
    * It is the logical opposite of the `aria-hidden` attribute.
    *
    * @see https://snook.ca/archives/html_and_css/hiding-content-for-accessibility
    * @see https://a11yproject.com/posts/how-to-hide-content/
    * @see Docs     https://reach.tech/visually-hidden
    * @see Source   https://github.com/reach/reach-ui/tree/main/packages/visually-hidden
    */
  /**
    * VisuallyHidden
    *
    * Provides text for screen readers that is visually hidden.
    * It is the logical opposite of the `aria-hidden` attribute.
    */
  @JSImport("@reach/visually-hidden", "VisuallyHidden")
  @js.native
  val VisuallyHidden: ForwardRefComponent[span, VisuallyHiddenProps] = js.native
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VisuallyHiddenProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
