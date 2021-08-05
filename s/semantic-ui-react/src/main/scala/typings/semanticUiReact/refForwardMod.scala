package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refForwardMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Ref/RefForward", JSImport.Default)
  @js.native
  class default ()
    extends Component[RefForwardProps, js.Object, js.Any]
  
  type RefForward = Component[RefForwardProps, js.Object, js.Any]
  
  trait RefForwardProps
    extends StObject
       with StrictRefForwardProps
       with /* key */ StringDictionary[js.Any]
  object RefForwardProps {
    
    inline def apply(): RefForwardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefForwardProps]
    }
  }
  
  trait StrictRefForwardProps extends StObject {
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Called when a child component will be mounted or updated.
      *
      * @param {HTMLElement} node - Referred node.
      */
    var innerRef: js.UndefOr[Ref[js.Any]] = js.undefined
  }
  object StrictRefForwardProps {
    
    inline def apply(): StrictRefForwardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRefForwardProps]
    }
    
    extension [Self <: StrictRefForwardProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInnerRef(value: Ref[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
}
