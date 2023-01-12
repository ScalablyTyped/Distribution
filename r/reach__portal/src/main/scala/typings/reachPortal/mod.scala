package typings.reachPortal

import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Welcome to @reach/portal!
    *
    * Creates and appends a DOM node to the end of `document.body` and renders a
    * React tree into it. Useful for rendering a natural React element hierarchy
    * with a different DOM hierarchy to prevent parent styles from clipping or
    * hiding content (for popovers, dropdowns, and modals).
    *
    * @see Docs   https://reach.tech/portal
    * @see Source https://github.com/reach/reach-ui/tree/main/packages/portal
    * @see React  https://reactjs.org/docs/portals.html
    */
  @JSImport("@reach/portal", "Portal")
  @js.native
  val Portal: FC[PortalProps] = js.native
  
  /**
    * @see Docs https://reach.tech/portal#portal-props
    */
  trait PortalProps extends StObject {
    
    /**
      * Regular React children.
      *
      * @see Docs https://reach.tech/portal#portal-children
      */
    var children: ReactNode
    
    /**
      * The container ref to which the portal will be appended. If not set the
      * portal will be appended to the body of the component's owner document
      * (typically this is the `document.body`).
      *
      * @see Docs https://reach.tech/portal#portal-containerRef
      */
    var containerRef: js.UndefOr[RefObject[Node]] = js.undefined
    
    /**
      * The DOM element type to render.
      *
      * @see Docs https://reach.tech/portal#portal-type
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    var unstable_skipInitialRender: js.UndefOr[Boolean] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainerRef(value: RefObject[Node]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnstable_skipInitialRender(value: Boolean): Self = StObject.set(x, "unstable_skipInitialRender", value.asInstanceOf[js.Any])
      
      inline def setUnstable_skipInitialRenderUndefined: Self = StObject.set(x, "unstable_skipInitialRender", js.undefined)
    }
  }
}
