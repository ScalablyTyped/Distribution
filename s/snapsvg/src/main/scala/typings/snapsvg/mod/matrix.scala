package typings.snapsvg.mod

import typings.std.SVGMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("snapsvg", "matrix")
@js.native
object matrix extends js.Object {
  
  def apply(): Matrix_ = js.native
  def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix_ = js.native
  def apply(svgMatrix: SVGMatrix): Matrix_ = js.native
}
