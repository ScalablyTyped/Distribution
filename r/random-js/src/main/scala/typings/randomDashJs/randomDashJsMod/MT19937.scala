package typings.randomDashJs.randomDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MT19937 extends Engine {
  def autoSeed(): MT19937 = js.native
  def discard(count: Double): MT19937 = js.native
  def getUseCount(): Double = js.native
  def seed(value: Double): MT19937 = js.native
  def seedWithArray(array: js.Array[Double]): MT19937 = js.native
}

