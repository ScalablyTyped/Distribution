package typings
package snabbdomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hMod {
  type ArrayOrElement[T] = T | js.Array[T]
  type VNodeChildElement = js.UndefOr[snabbdomLib.vnodeMod.VNode | java.lang.String | scala.Double | scala.Null]
  type VNodeChildren = ArrayOrElement[VNodeChildElement]
  type VNodes = js.Array[snabbdomLib.vnodeMod.VNode]
}
