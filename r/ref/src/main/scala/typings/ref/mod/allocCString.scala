package typings.ref.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ref", "allocCString")
@js.native
object allocCString extends js.Object {
  
  def apply(string: String): Buffer = js.native
  def apply(string: String, encoding: String): Buffer = js.native
}
