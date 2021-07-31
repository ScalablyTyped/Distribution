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
  class default ()
    extends Component[PortalInnerProps, js.Object, js.Any]
  
  type PortalInner = Component[PortalInnerProps, js.Object, js.Any]
  
  trait PortalInnerProps
    extends StObject
       with StrictPortalInnerProps
       with /* key */ StringDictionary[js.Any]
  object PortalInnerProps {
    
    @scala.inline
    def apply(): PortalInnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalInnerProps]
    }
  }
  
  trait StrictPortalInnerProps extends StObject {
    
    /** Primary content. */
    var children: ReactNode
    
    /** Called with a ref to the inner node. */
    var innerRef: js.UndefOr[Ref[js.Any]] = js.undefined
    
    /** The node where the portal should mount. */
    var mountNode: js.UndefOr[js.Any] = js.undefined
    
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
    
    @scala.inline
    def apply(): StrictPortalInnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPortalInnerProps]
    }
    
    @scala.inline
    implicit class StrictPortalInnerPropsMutableBuilder[Self <: StrictPortalInnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setMountNode(value: js.Any): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      @scala.inline
      def setOnMount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit): Self = StObject.set(x, "onMount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      @scala.inline
      def setOnUnmount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit): Self = StObject.set(x, "onUnmount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
    }
  }
}
