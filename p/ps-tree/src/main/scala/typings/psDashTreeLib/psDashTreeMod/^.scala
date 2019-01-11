package typings
package psDashTreeLib.psDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ps-tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    pid: scala.Double,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* children */ js.Array[psDashTreeLib.psDashTreeMod.psUnderscoreTreeNs.PS], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

