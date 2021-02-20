package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mountNodeMountNodeMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/MountNode/MountNode", JSImport.Default)
  @js.native
  class default ()
    extends Component[MountNodeProps, js.Object, js.Any]
  
  type MountNode = Component[MountNodeProps, js.Object, js.Any]
  
  @js.native
  trait MountNodeProps
    extends StrictMountNodeProps
       with /* key */ StringDictionary[js.Any]
  object MountNodeProps {
    
    @scala.inline
    def apply(): MountNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MountNodeProps]
    }
  }
  
  @js.native
  trait StrictMountNodeProps extends StObject {
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** The DOM node where we will apply class names. Defaults to document.body. */
    var node: js.UndefOr[HTMLElement | Ref[_]] = js.native
  }
  object StrictMountNodeProps {
    
    @scala.inline
    def apply(): StrictMountNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMountNodeProps]
    }
    
    @scala.inline
    implicit class StrictMountNodePropsMutableBuilder[Self <: StrictMountNodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setNode(value: HTMLElement | Ref[_]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "node", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeNull: Self = StObject.set(x, "node", null)
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
}
