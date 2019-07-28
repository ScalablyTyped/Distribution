package typings.readDashPackageDashTree.readDashPackageDashTreeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-package-tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(root: String, cb: js.Function2[/* er */ Error | Null, /* data */ Node, Unit]): Unit = js.native
  def apply(
    root: String,
    filterWith: js.Function2[/* node */ Node, /* kidName */ String, js.UndefOr[Unit | Boolean]],
    cb: js.Function2[/* er */ Error | Null, /* data */ Node, Unit]
  ): Unit = js.native
}

