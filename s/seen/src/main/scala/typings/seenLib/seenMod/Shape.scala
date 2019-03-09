package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Shape")
@js.native
class Shape protected () extends Transformable {
  def this(`type`: java.lang.String, surfaces: js.Array[Surface]) = this()
  var surfaces: js.Array[Surface] = js.native
  var `type`: java.lang.String = js.native
  def eachSurface(f: js.Function1[/* s */ Surface, scala.Unit]): this.type = js.native
  def fill(fill: java.lang.String): this.type = js.native
  def fill(fill: Color): this.type = js.native
  def stroke(stroke: java.lang.String): this.type = js.native
  def stroke(stroke: Color): this.type = js.native
}

