package typings.rcUtil

import typings.rcUtil.anon.DocumentFragmentMARKRootu
import typings.rcUtil.anon.ElementMARKRootundefined
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReactRenderMod {
  
  @JSImport("rc-util/lib/React/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def r(node: ReactElement, container: ContainerType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_r")(node.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def render(node: ReactElement, container: ContainerType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def u(container: ContainerType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_u")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unmount(container: ContainerType): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(container.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  type ContainerType = ElementMARKRootundefined | DocumentFragmentMARKRootu
}
