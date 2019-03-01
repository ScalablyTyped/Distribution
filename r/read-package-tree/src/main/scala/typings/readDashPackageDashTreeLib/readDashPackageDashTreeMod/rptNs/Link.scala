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
    val __obj = js.Dynamic.literal(`package` = `package`)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isLink")(isLink)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("realpath")(realpath)
    __obj.updateDynamic("target")(target)
    if (error != null) __obj.updateDynamic("error")(error)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Link]
  }
}

