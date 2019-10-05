package typings.reactDashHotDashLoader.reactDashHotDashLoaderMod

import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-hot-loader", "hot")
@js.native
object hot extends js.Object {
  def apply(sourceModule: NodeModule): js.Function1[/* component */ js.Any, ReactComponent[ExtractProps[_]]] = js.native
}

