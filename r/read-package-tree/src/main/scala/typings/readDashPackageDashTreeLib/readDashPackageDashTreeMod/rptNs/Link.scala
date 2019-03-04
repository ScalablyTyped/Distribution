package typings
package readDashPackageDashTreeLib.readDashPackageDashTreeMod.rptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends Node {
  @JSName("isLink")
  var isLink_Link: readDashPackageDashTreeLib.readDashPackageDashTreeLibNumbers.`true`
  var target: Node
}

object Link {
  @scala.inline
  def apply(
    children: js.Array[Node],
    id: scala.Double,
    isLink: readDashPackageDashTreeLib.readDashPackageDashTreeLibNumbers.`true`,
    name: java.lang.String,
    `package`: js.Any,
    path: java.lang.String,
    realpath: java.lang.String,
    target: Node,
    error: stdLib.Error = null,
    parent: Node = null
  ): Link = {
    val __obj = js.Dynamic.literal(children = children, id = id, isLink = isLink, name = name, path = path, realpath = realpath, target = target)
    __obj.updateDynamic("package")(`package`)
    if (error != null) __obj.updateDynamic("error")(error)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Link]
  }
}

