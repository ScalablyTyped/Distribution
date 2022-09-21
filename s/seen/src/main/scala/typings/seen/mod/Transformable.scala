package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Transformable")
@js.native
open class Transformable () extends StObject {
  
  def bake(): this.type = js.native
  def bake(m: js.Array[Double]): this.type = js.native
  
  var baked: js.Array[Double] = js.native
  
  var m: Matrix = js.native
  
  def matrix(m: js.Array[Double]): this.type = js.native
  
  def reset(): this.type = js.native
  
  def rotx(theta: Double): this.type = js.native
  
  def roty(theta: Double): this.type = js.native
  
  def rotz(theta: Double): this.type = js.native
  
  def scale(): this.type = js.native
  def scale(x: Double): this.type = js.native
  def scale(x: Double, y: Double): this.type = js.native
  def scale(x: Double, y: Double, z: Double): this.type = js.native
  def scale(x: Double, y: Unit, z: Double): this.type = js.native
  def scale(x: Unit, y: Double): this.type = js.native
  def scale(x: Unit, y: Double, z: Double): this.type = js.native
  def scale(x: Unit, y: Unit, z: Double): this.type = js.native
  
  def transform(m: Matrix): this.type = js.native
  
  def translate(): this.type = js.native
  def translate(x: Double): this.type = js.native
  def translate(x: Double, y: Double): this.type = js.native
  def translate(x: Double, y: Double, z: Double): this.type = js.native
  def translate(x: Double, y: Unit, z: Double): this.type = js.native
  def translate(x: Unit, y: Double): this.type = js.native
  def translate(x: Unit, y: Double, z: Double): this.type = js.native
  def translate(x: Unit, y: Unit, z: Double): this.type = js.native
}
