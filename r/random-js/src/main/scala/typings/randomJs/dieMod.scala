package typings.randomJs

import typings.randomJs.typesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("random-js/dist/distribution/die", JSImport.Namespace)
@js.native
object dieMod extends js.Object {
  
  def die(sideCount: Double): Distribution[Double] = js.native
}
