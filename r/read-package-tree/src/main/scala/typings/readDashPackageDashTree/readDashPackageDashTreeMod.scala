package typings.readDashPackageDashTree

import org.scalablytyped.runtime.StringDictionary
import typings.readDashPackageDashTree.readDashPackageDashTreeBooleans.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-package-tree", JSImport.Namespace)
@js.native
object readDashPackageDashTreeMod extends js.Object {
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
    @JSName("package")
    var _package: js.Any = js.native
    var children: js.Array[Node] = js.native
    var error: Error | Null = js.native
    var id: Double = js.native
    var isLink: Boolean = js.native
    var name: String = js.native
    var parent: Node | Null = js.native
    var path: String = js.native
    var realpath: String = js.native
  }
  
  def apply(root: String, cb: js.Function2[/* er */ Error | Null, /* data */ Node, Unit]): Unit = js.native
  def apply(
    root: String,
    filterWith: js.Function2[/* node */ Node, /* kidName */ String, js.UndefOr[Unit | Boolean]],
    cb: js.Function2[/* er */ Error | Null, /* data */ Node, Unit]
  ): Unit = js.native
}

