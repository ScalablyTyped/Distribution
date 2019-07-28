package typings.snabbdom

import typings.snabbdom.vnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hMod {
  type ArrayOrElement[T] = T | js.Array[T]
  type VNodeChildElement = js.UndefOr[VNode | String | Double | Null]
  type VNodeChildren = ArrayOrElement[VNodeChildElement]
  type VNodes = js.Array[VNode]
}
