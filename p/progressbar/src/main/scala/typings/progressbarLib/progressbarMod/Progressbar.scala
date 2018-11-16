package typings
package progressbarLib.progressbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("progressbar", "Progressbar")
@js.native
class Progressbar () extends js.Object {
  def addTick(): this.type = js.native
  def addTick(steps: scala.Double): this.type = js.native
  def addTotal(): this.type = js.native
  def addTotal(total: scala.Double): this.type = js.native
  def finish(): this.type = js.native
  def finish(next: js.Function0[scala.Unit]): this.type = js.native
  def getStep(): java.lang.String = js.native
  def getTick(): scala.Double = js.native
  def getTotal(): scala.Double = js.native
  def setStep(steps: java.lang.String): this.type = js.native
  def setTick(ticks: scala.Double): this.type = js.native
  def setTotal(total: scala.Double): this.type = js.native
  def step(step: java.lang.String): this.type = js.native
  def tick(): this.type = js.native
  def tick(steps: scala.Double): this.type = js.native
  def total(total: scala.Double): this.type = js.native
}

