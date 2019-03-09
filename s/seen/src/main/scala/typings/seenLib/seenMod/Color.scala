package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Color")
@js.native
class Color () extends js.Object {
  def this(r: scala.Double) = this()
  def this(r: scala.Double, g: scala.Double) = this()
  def this(r: scala.Double, g: scala.Double, b: scala.Double) = this()
  def this(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double) = this()
  var a: scala.Double = js.native
  var b: scala.Double = js.native
  var g: scala.Double = js.native
  var r: scala.Double = js.native
  def addChannels(c: Color): this.type = js.native
  def clamp(): this.type = js.native
  def clamp(min: scala.Double): this.type = js.native
  def clamp(min: scala.Double, max: scala.Double): this.type = js.native
  def copy(): this.type = js.native
  def hex(): java.lang.String = js.native
  def minChannels(c: Color): this.type = js.native
  def multiplyChannels(c: Color): this.type = js.native
  def offset(n: scala.Double): this.type = js.native
  def scale(n: scala.Double): this.type = js.native
  def style(): java.lang.String = js.native
}

