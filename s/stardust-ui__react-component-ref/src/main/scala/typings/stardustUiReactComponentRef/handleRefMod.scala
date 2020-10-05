package typings.stardustUiReactComponentRef

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stardust-ui/react-component-ref/dist/es/handleRef", JSImport.Namespace)
@js.native
object handleRefMod extends js.Object {
  /**
    * The function that correctly handles passing refs.
    *
    * @param ref An ref object or function
    * @param node A node that should be passed by ref
    */
  def default[N](ref: Ref[N], node: N): Unit = js.native
}

