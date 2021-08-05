package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mountNodeMountNodeMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/MountNode/MountNode", JSImport.Default)
  @js.native
  class default ()
    extends Component[MountNodeProps, js.Object, js.Any]
  
  type MountNode = Component[MountNodeProps, js.Object, js.Any]
  
  trait MountNodeProps
    extends StObject
       with StrictMountNodeProps
       with /* key */ StringDictionary[js.Any]
  object MountNodeProps {
    
    inline def apply(): MountNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MountNodeProps]
    }
  }
  
  trait StrictMountNodeProps extends StObject {
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** The DOM node where we will apply class names. Defaults to document.body. */
    var node: js.UndefOr[HTMLElement | Ref[js.Any]] = js.undefined
  }
  object StrictMountNodeProps {
    
    inline def apply(): StrictMountNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMountNodeProps]
    }
    
    extension [Self <: StrictMountNodeProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setNode(value: HTMLElement | Ref[js.Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "node", js.Any.fromFunction1(value))
      
      inline def setNodeNull: Self = StObject.set(x, "node", null)
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
}
