package typings.readDashPackageDashTree.readDashPackageDashTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.readDashPackageDashTree.readDashPackageDashTreeNumbers.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-package-tree", "Link")
@js.native
class Link protected () extends Node {
  def this(
    pkg: js.Any,
    logical: String,
    physical: String,
    realpath: String,
    er: Null,
    cache: StringDictionary[Node]
  ) = this()
  def this(
    pkg: js.Any,
    logical: String,
    physical: String,
    realpath: String,
    er: Error,
    cache: StringDictionary[Node]
  ) = this()
  @JSName("isLink")
  var isLink_Link: `true` = js.native
  var target: Node = js.native
}

