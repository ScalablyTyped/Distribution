package typings.shipitUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shipit-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def equalValues(value: js.Array[_]): Unit = js.native
  def getShipit(gruntOrShipit: GruntOrShipit): Typeofshipit = js.native
  def registerTask(gruntOrShipit: GruntOrShipit, name: String, dependenciesOrTask: js.Array[String]): Typeofshipit = js.native
  def registerTask(gruntOrShipit: GruntOrShipit, name: String, dependenciesOrTask: EmptyCallback): Typeofshipit = js.native
  def runTask(gruntOrShipit: js.Object): Unit = js.native
  type EmptyCallback = js.Function0[Unit]
  type GruntOrShipit = Typeofshipit | js.Object
}

