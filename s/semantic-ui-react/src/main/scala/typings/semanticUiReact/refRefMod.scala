package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refRefMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Ref/Ref", JSImport.Default)
  @js.native
  class default ()
    extends Component[RefProps, js.Object, js.Any]
  object default {
    
    /* was `typeof RefFindNode` */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Ref/Ref", "default.FindNode")
    @js.native
    class FindNode ()
      extends typings.semanticUiReact.refFindNodeMod.default
    
    /* was `typeof RefForward` */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Ref/Ref", "default.Forward")
    @js.native
    class Forward ()
      extends typings.semanticUiReact.refForwardMod.default
  }
  
  object Ref {
    
    /* was `typeof RefFindNode` */
    type FindNode = typings.semanticUiReact.refFindNodeMod.default
    
    /* was `typeof RefForward` */
    type Forward = typings.semanticUiReact.refForwardMod.default
  }
  type Ref = Component[RefProps, js.Object, js.Any]
  
  trait RefProps
    extends StObject
       with StrictRefProps
       with /* key */ StringDictionary[js.Any]
  object RefProps {
    
    @scala.inline
    def apply(): RefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefProps]
    }
  }
  
  trait StrictRefProps extends StObject {
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Called when componentDidMount.
      *
      * @param {HTMLElement} node - Referred node.
      */
    var innerRef: js.UndefOr[typings.react.mod.Ref[js.Any]] = js.undefined
  }
  object StrictRefProps {
    
    @scala.inline
    def apply(): StrictRefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRefProps]
    }
    
    @scala.inline
    implicit class StrictRefPropsMutableBuilder[Self <: StrictRefProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInnerRef(value: typings.react.mod.Ref[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
}
