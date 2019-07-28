package typings.readDashPackageDashTree.readDashPackageDashTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-package-tree", "Node")
@js.native
class Node protected () extends js.Object {
  def this(pkg: js.Any, logical: String, physical: String, er: Null, cache: StringDictionary[Node]) = this()
  def this(pkg: js.Any, logical: String, physical: String, er: Error, cache: StringDictionary[Node]) = this()
  def this(
    pkg: js.Any,
    logical: String,
    physical: String,
    er: Null,
    cache: StringDictionary[Node],
    fromLink: Boolean
  ) = this()
  def this(
    pkg: js.Any,
    logical: String,
    physical: String,
    er: Error,
    cache: StringDictionary[Node],
    fromLink: Boolean
  ) = this()
  var children: js.Array[Node] = js.native
  var error: Error | Null = js.native
  var id: Double = js.native
  var isLink: Boolean = js.native
  var name: String = js.native
  var `package`: js.Any = js.native
  var parent: Node | Null = js.native
  var path: String = js.native
  var realpath: String = js.native
}

