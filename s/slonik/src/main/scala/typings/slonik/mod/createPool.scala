package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", "createPool")
@js.native
object createPool extends js.Object {
  def apply(connectionConfiguration: DatabaseConfigurationType): DatabasePoolType = js.native
  def apply(
    connectionConfiguration: DatabaseConfigurationType,
    clientUserConfiguration: ClientConfigurationInputType
  ): DatabasePoolType = js.native
}

