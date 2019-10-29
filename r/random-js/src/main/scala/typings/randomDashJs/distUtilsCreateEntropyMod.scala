package typings.randomDashJs

import typings.randomDashJs.distTypesMod.Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/utils/createEntropy", JSImport.Namespace)
@js.native
object distUtilsCreateEntropyMod extends js.Object {
  def createEntropy(): js.Array[Double] = js.native
  def createEntropy(engine: Engine): js.Array[Double] = js.native
  def createEntropy(engine: Engine, length: Double): js.Array[Double] = js.native
}

