package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("slonik", "createPool")
@js.native
object createPool extends js.Object {
  
  def apply(connectionUri: String): DatabasePoolType = js.native
  def apply(connectionUri: String, clientUserConfiguration: ClientConfigurationInputType): DatabasePoolType = js.native
}
