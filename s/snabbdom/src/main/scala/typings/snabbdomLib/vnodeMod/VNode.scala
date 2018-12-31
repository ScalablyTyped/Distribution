package typings
package snabbdomLib.vnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends js.Object {
  var children: js.UndefOr[js.Array[VNode | java.lang.String]]
  var data: js.UndefOr[VNodeData]
  var elm: js.UndefOr[stdLib.Node]
  var key: js.UndefOr[Key]
  var sel: js.UndefOr[java.lang.String]
  var text: js.UndefOr[java.lang.String]
}

