package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Color")
@js.native
class Color () extends StObject {
  def this(r: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: Unit, g: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: Double, g: Unit, b: Double) = this()
  def this(r: Unit, g: Double, b: Double) = this()
  def this(r: Unit, g: Unit, b: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  def this(r: Double, g: Double, b: Unit, a: Double) = this()
  def this(r: Double, g: Unit, b: Double, a: Double) = this()
  def this(r: Double, g: Unit, b: Unit, a: Double) = this()
  def this(r: Unit, g: Double, b: Double, a: Double) = this()
  def this(r: Unit, g: Double, b: Unit, a: Double) = this()
  def this(r: Unit, g: Unit, b: Double, a: Double) = this()
  def this(r: Unit, g: Unit, b: Unit, a: Double) = this()
  
  var a: Double = js.native
  
  def addChannels(c: Color): this.type = js.native
  
  var b: Double = js.native
  
  def clamp(): this.type = js.native
  def clamp(min: Double): this.type = js.native
  def clamp(min: Double, max: Double): this.type = js.native
  def clamp(min: Unit, max: Double): this.type = js.native
  
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
