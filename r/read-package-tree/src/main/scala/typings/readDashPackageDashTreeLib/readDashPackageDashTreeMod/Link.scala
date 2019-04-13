package typings
package readDashPackageDashTreeLib.readDashPackageDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-package-tree", "Link")
@js.native
class Link protected () extends Node {
  def this(pkg: js.Any, logical: java.lang.String, physical: java.lang.String, realpath: java.lang.String, er: scala.Null, cache: org.scalablytyped.runtime.StringDictionary[Node]) = this()
  def this(pkg: js.Any, logical: java.lang.String, physical: java.lang.String, realpath: java.lang.String, er: stdLib.Error, cache: org.scalablytyped.runtime.StringDictionary[Node]) = this()
  @JSName("isLink")
  var isLink_Link: readDashPackageDashTreeLib.readDashPackageDashTreeLibNumbers.`true` = js.native
  var target: Node = js.native
}

