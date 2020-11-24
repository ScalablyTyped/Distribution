package typings.randomJs

import typings.randomJs.typesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("random-js/dist/distribution/integer", JSImport.Namespace)
@js.native
object integerMod extends js.Object {
  
  def integer(min: Double, max: Double): Distribution[Double] = js.native
}
