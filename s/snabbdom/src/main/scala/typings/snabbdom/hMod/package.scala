package typings.snabbdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hMod {
  import typings.snabbdom.vnodeMod.VNode

  type ArrayOrElement[T] = T | js.Array[T]
  type VNodeChildElement = js.UndefOr[VNode | String | Double | Null]
  type VNodeChildren = ArrayOrElement[VNodeChildElement]
  type VNodes = js.Array[VNode]
}
