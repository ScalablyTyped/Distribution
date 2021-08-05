package typings.reactBodyClassname

import typings.react.mod.Component
import typings.reactBodyClassname.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-body-classname", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ClassName, js.Object, js.Any]
  @JSImport("react-body-classname", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("react-body-classname", "canUseDOM")
  @js.native
  def canUseDOM: Boolean = js.native
  inline def canUseDOM_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canUseDOM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("react-body-classname", "displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def peek(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("peek")().asInstanceOf[js.Any]
  
  /* static member */
  inline def rewind(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rewind")().asInstanceOf[js.Any]
  
  type BodyClassName = Component[ClassName, js.Object, js.Any]
}
