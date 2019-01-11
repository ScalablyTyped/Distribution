package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchProps[TParams] extends js.Object {
  @JSName("children")
  var children_Original: MatchRenderFn[TParams] = js.native
  var path: java.lang.String = js.native
  def children(props: MatchRenderProps[TParams]): reactLib.reactMod.ReactNs.ReactNode = js.native
}

