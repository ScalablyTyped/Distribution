package typings.reactAddonsShallowCompare

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-addons-shallow-compare", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[P, S](component: Component[P, S, _], nextProps: P, nextState: S): Boolean = js.native
}

