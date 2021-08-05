package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refFindNodeMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Ref/RefFindNode", JSImport.Default)
  @js.native
  class default ()
    extends Component[RefFindNode, js.Object, js.Any]
  
  @js.native
  trait RefFindNode
    extends Component[RefFindNode, js.Object, js.Any]
  
  trait RefFindNodeProps
    extends StObject
       with StrictRefFindNodeProps
       with /* key */ StringDictionary[js.Any]
  object RefFindNodeProps {
    
    inline def apply(): RefFindNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefFindNodeProps]
    }
  }
  
  trait StrictRefFindNodeProps extends StObject {
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Called when a child component will be mounted or updated.
      *
      * @param {HTMLElement} node - Referred node.
      */
    var innerRef: js.UndefOr[Ref[js.Any]] = js.undefined
  }
  object StrictRefFindNodeProps {
    
    inline def apply(): StrictRefFindNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRefFindNodeProps]
    }
    
    extension [Self <: StrictRefFindNodeProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInnerRef(value: Ref[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
}
