package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refForwardMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Ref/RefForward", JSImport.Default)
  @js.native
  class default ()
    extends Component[RefForwardProps, js.Object, js.Any]
  
  type RefForward = Component[RefForwardProps, js.Object, js.Any]
  
  @js.native
  trait RefForwardProps
    extends StrictRefForwardProps
       with /* key */ StringDictionary[js.Any]
  object RefForwardProps {
    
    @scala.inline
    def apply(): RefForwardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefForwardProps]
    }
  }
  
  @js.native
  trait StrictRefForwardProps extends StObject {
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /**
      * Called when a child component will be mounted or updated.
      *
      * @param {HTMLElement} node - Referred node.
      */
    var innerRef: js.UndefOr[Ref[_]] = js.native
  }
  object StrictRefForwardProps {
    
    @scala.inline
    def apply(): StrictRefForwardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRefForwardProps]
    }
    
    @scala.inline
    implicit class StrictRefForwardPropsMutableBuilder[Self <: StrictRefForwardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
}
