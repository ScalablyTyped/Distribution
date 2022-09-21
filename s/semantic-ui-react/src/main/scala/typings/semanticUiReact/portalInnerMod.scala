package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalInnerMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Portal/PortalInner", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PortalInnerProps, js.Object, Any]
  
  type PortalInner = Component[PortalInnerProps, js.Object, Any]
  
  trait PortalInnerProps
    extends StObject
       with StrictPortalInnerProps
       with /* key */ StringDictionary[Any]
  object PortalInnerProps {
    
    inline def apply(): PortalInnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalInnerProps]
    }
  }
  
  trait StrictPortalInnerProps extends StObject {
    
    /** Primary content. */
    var children: ReactNode
    
    /** Called with a ref to the inner node. */
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    /** The node where the portal should mount. */
    var mountNode: js.UndefOr[Any] = js.undefined
    
    /**
      * Called when the PortalInner is mounted on the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onMount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalInnerProps, Unit]] = js.undefined
    
    /**
      * Called when the PortalInner is unmounted from the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onUnmount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalInnerProps, Unit]] = js.undefined
  }
  object StrictPortalInnerProps {
    
    inline def apply(): StrictPortalInnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPortalInnerProps]
    }
    
    extension [Self <: StrictPortalInnerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setMountNode(value: Any): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      inline def setOnMount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit): Self = StObject.set(x, "onMount", js.Any.fromFunction2(value))
      
      inline def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      inline def setOnUnmount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit): Self = StObject.set(x, "onUnmount", js.Any.fromFunction2(value))
      
      inline def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
    }
  }
}
