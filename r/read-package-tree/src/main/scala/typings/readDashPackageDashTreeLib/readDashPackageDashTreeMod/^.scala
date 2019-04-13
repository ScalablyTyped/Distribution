package typings
package readDashPackageDashTreeLib.readDashPackageDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-package-tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    root: java.lang.String,
    cb: js.Function2[/* er */ stdLib.Error | scala.Null, /* data */ Node, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    root: java.lang.String,
    filterWith: js.Function2[
      /* node */ Node, 
      /* kidName */ java.lang.String, 
      js.UndefOr[scala.Unit | scala.Boolean]
    ],
    cb: js.Function2[/* er */ stdLib.Error | scala.Null, /* data */ Node, scala.Unit]
  ): scala.Unit = js.native
}

