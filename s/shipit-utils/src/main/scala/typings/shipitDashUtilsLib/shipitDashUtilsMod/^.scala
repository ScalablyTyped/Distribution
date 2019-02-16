package typings
package shipitDashUtilsLib.shipitDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shipit-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def equalValues(value: js.Array[_]): scala.Unit = js.native
  def getShipit(gruntOrShipit: shipitDashUtilsLib.shipitDashUtilsMod.GruntOrShipit): js.Any = js.native
  def registerTask(
    gruntOrShipit: shipitDashUtilsLib.shipitDashUtilsMod.GruntOrShipit,
    name: java.lang.String,
    dependenciesOrTask: js.Array[java.lang.String]
  ): js.Any = js.native
  def registerTask(
    gruntOrShipit: shipitDashUtilsLib.shipitDashUtilsMod.GruntOrShipit,
    name: java.lang.String,
    dependenciesOrTask: shipitDashUtilsLib.shipitDashUtilsMod.EmptyCallback
  ): js.Any = js.native
  def runTask(gruntOrShipit: js.Object): scala.Unit = js.native
}

