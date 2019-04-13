package typings
package readDashPackageDashTreeLib.readDashPackageDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-package-tree", "Node")
@js.native
class Node protected () extends js.Object {
  def this(pkg: js.Any, logical: java.lang.String, physical: java.lang.String, er: scala.Null, cache: org.scalablytyped.runtime.StringDictionary[Node]) = this()
  def this(pkg: js.Any, logical: java.lang.String, physical: java.lang.String, er: stdLib.Error, cache: org.scalablytyped.runtime.StringDictionary[Node]) = this()
  def this(pkg: js.Any, logical: java.lang.String, physical: java.lang.String, er: scala.Null, cache: org.scalablytyped.runtime.StringDictionary[Node], fromLink: scala.Boolean) = this()
  def this(pkg: js.Any, logical: java.lang.String, physical: java.lang.String, er: stdLib.Error, cache: org.scalablytyped.runtime.StringDictionary[Node], fromLink: scala.Boolean) = this()
  var children: js.Array[Node] = js.native
  var error: stdLib.Error | scala.Null = js.native
  var id: scala.Double = js.native
  var isLink: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var `package`: js.Any = js.native
  var parent: Node | scala.Null = js.native
  var path: java.lang.String = js.native
  var realpath: java.lang.String = js.native
}

