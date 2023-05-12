package typings.storybookReactDomShim

import typings.react.mod.ReactElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReact18Mod {
  
  @JSImport("@storybook/react-dom-shim/dist/react-18", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderElement(node: ReactElement, el: Element): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")(node.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def unmountElement(el: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountElement")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unmountElement(el: Element, shouldUseNewRootApi: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmountElement")(el.asInstanceOf[js.Any], shouldUseNewRootApi.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
