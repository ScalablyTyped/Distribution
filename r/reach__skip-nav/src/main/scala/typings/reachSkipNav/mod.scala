package typings.reachSkipNav

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/skip-nav", "SkipNavContent")
  @js.native
  class SkipNavContent protected ()
    extends Component[SkipNavProps with HTMLProps[HTMLDivElement], js.Object, js.Any] {
    def this(props: SkipNavProps with HTMLProps[HTMLDivElement]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SkipNavProps with HTMLProps[HTMLDivElement], context: js.Any) = this()
  }
  
  @JSImport("@reach/skip-nav", "SkipNavLink")
  @js.native
  class SkipNavLink protected ()
    extends Component[SkipNavProps with HTMLProps[HTMLAnchorElement], js.Object, js.Any] {
    def this(props: SkipNavProps with HTMLProps[HTMLAnchorElement]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SkipNavProps with HTMLProps[HTMLAnchorElement], context: js.Any) = this()
  }
  
  @js.native
  trait SkipNavProps extends StObject {
    
    var children: js.UndefOr[String | ReactNode] = js.native
  }
  object SkipNavProps {
    
    @scala.inline
    def apply(): SkipNavProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipNavProps]
    }
    
    @scala.inline
    implicit class SkipNavPropsMutableBuilder[Self <: SkipNavProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
