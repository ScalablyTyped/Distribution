package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Color")
@js.native
class Color () extends js.Object {
  def this(r: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  var a: Double = js.native
  var b: Double = js.native
  var g: Double = js.native
  var r: Double = js.native
  def addChannels(c: Color): this.type = js.native
  def clamp(): this.type = js.native
  def clamp(min: Double): this.type = js.native
  def clamp(min: Double, max: Double): this.type = js.native
  def copy(): this.type = js.native
  def hex(): String = js.native
  def minChannels(c: Color): this.type = js.native
  def multiplyChannels(c: Color): this.type = js.native
  def offset(n: Double): this.type = js.native
  def scale(n: Double): this.type = js.native
  def style(): String = js.native
}

