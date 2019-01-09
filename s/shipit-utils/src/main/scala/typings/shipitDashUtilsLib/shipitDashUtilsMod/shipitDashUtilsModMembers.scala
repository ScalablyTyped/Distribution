package typings
package shipitDashUtilsLib.shipitDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shipit-utils", JSImport.Namespace)
@js.native
object shipitDashUtilsModMembers extends js.Object {
  def equalValues(value: js.Array[_]): scala.Unit = js.native
  def getShipit(gruntOrShipit: GruntOrShipit): shipitDashUtilsLib.Anon_BlTask = js.native
  def registerTask(
    gruntOrShipit: GruntOrShipit,
    name: java.lang.String,
    dependenciesOrTask: js.Array[java.lang.String]
  ): shipitDashUtilsLib.Anon_BlTask = js.native
  def registerTask(gruntOrShipit: GruntOrShipit, name: java.lang.String, dependenciesOrTask: EmptyCallback): shipitDashUtilsLib.Anon_BlTask = js.native
  def runTask(gruntOrShipit: js.Object): scala.Unit = js.native
}

