package typings.randomDashSeed

import typings.randomDashSeed.randomDashSeedMod.RandomSeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-seed", JSImport.Namespace)
@js.native
object randomDashSeedMod extends js.Object {
  @js.native
  trait RandomSeed extends js.Object {
    def apply(range: Double): Double = js.native
    def addEntropy(args: js.Any*): Unit = js.native
    def cleanString(inStr: String): String = js.native
    def done(): Unit = js.native
    def floatBetween(min: Double, max: Double): Double = js.native
    def hashString(inStr: String): String = js.native
    def initState(): Unit = js.native
    def intBetween(min: Double, max: Double): Double = js.native
    def random(): Double = js.native
    def range(range: Double): Double = js.native
    def seed(seed: String): Unit = js.native
    def string(count: Double): String = js.native
  }
  
  def create(): RandomSeed = js.native
  def create(seed: String): RandomSeed = js.native
}

