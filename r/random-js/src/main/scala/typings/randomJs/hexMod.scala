package typings.randomJs

import typings.randomJs.typesMod.StringDistribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("random-js/dist/distribution/hex", JSImport.Namespace)
@js.native
object hexMod extends js.Object {
  
  def hex(): StringDistribution = js.native
  def hex(uppercase: Boolean): StringDistribution = js.native
}
