package typings
package readDashPackageDashTreeLib.readDashPackageDashTreeMod.rptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var children: js.Array[Node]
  var error: stdLib.Error | scala.Null
  var id: scala.Double
  var isLink: scala.Boolean
  var name: java.lang.String
  var `package`: js.Any
  var parent: Node | scala.Null
  var path: java.lang.String
  var realpath: java.lang.String
}

object Node {
  @scala.inline
  def apply(
    children: js.Array[Node],
    id: scala.Double,
    isLink: scala.Boolean,
    name: java.lang.String,
    `package`: js.Any,
    path: java.lang.String,
    realpath: java.lang.String,
    error: stdLib.Error = null,
    parent: Node = null
  ): Node = {
    val __obj = js.Dynamic.literal(`package` = `package`)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isLink")(isLink)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("realpath")(realpath)
    if (error != null) __obj.updateDynamic("error")(error)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Node]
  }
}

