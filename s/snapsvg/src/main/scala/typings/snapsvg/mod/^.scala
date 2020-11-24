package typings.snapsvg.mod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("snapsvg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(DOM: SVGElement): Paper = js.native
  def apply(query: String): Paper = js.native
  def apply(width: String, height: String): Paper = js.native
  def apply(width: String, height: Double): Paper = js.native
  def apply(width: Double, height: String): Paper = js.native
  def apply(width: Double, height: Double): Paper = js.native
  
  var filter: Filter_ = js.native
  
  var path: Path_ = js.native
}
