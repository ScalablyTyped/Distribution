package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Color")
@js.native
class Color () extends js.Object {
  def this(r: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: js.UndefOr[scala.Nothing], b: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double, b: Double) = this()
  def this(r: Double, g: js.UndefOr[scala.Nothing], b: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(
    r: js.UndefOr[scala.Nothing],
    g: js.UndefOr[scala.Nothing],
    b: js.UndefOr[scala.Nothing],
    a: Double
  ) = this()
  def this(r: js.UndefOr[scala.Nothing], g: js.UndefOr[scala.Nothing], b: Double, a: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double, b: js.UndefOr[scala.Nothing], a: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double, b: Double, a: Double) = this()
  def this(r: Double, g: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], a: Double) = this()
  def this(r: Double, g: js.UndefOr[scala.Nothing], b: Double, a: Double) = this()
  def this(r: Double, g: Double, b: js.UndefOr[scala.Nothing], a: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  
  var a: Double = js.native
  
  def addChannels(c: Color): this.type = js.native
  
  var b: Double = js.native
  
  def clamp(): this.type = js.native
  def clamp(min: js.UndefOr[scala.Nothing], max: Double): this.type = js.native
  def clamp(min: Double): this.type = js.native
  def clamp(min: Double, max: Double): this.type = js.native
  
  def copy(): this.type = js.native
  
  var g: Double = js.native
  
  def hex(): String = js.native
  
  def minChannels(c: Color): this.type = js.native
  
  def multiplyChannels(c: Color): this.type = js.native
  
  def offset(n: Double): this.type = js.native
  
  var r: Double = js.native
  
  def scale(n: Double): this.type = js.native
  
  def style(): String = js.native
}
