package typings
package randomDashJsLib.randomDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MT19937 extends Engine {
  def autoSeed(): MT19937 = js.native
  def discard(count: scala.Double): MT19937 = js.native
  def getUseCount(): scala.Double = js.native
  def seed(value: scala.Double): MT19937 = js.native
  def seedWithArray(array: js.Array[scala.Double]): MT19937 = js.native
}

