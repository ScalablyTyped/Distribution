package typings.reachPortal

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod extends Shortcut {
  
  @JSImport("@reach/portal/dist/declarations/src", JSImport.Default)
  @js.native
  val default: FC[PortalProps] = js.native
  
  @JSImport("@reach/portal/dist/declarations/src", "Portal")
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
    
    extension [Self <: PortalProps](x: Self) {
      
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
  
  type _To = FC[PortalProps]
  
  /* This means you don't have to write `default`, but can instead just say `srcMod.foo` */
  override def _to: FC[PortalProps] = default
}
