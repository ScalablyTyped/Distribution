package typings.revalidate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("revalidate", "createValidator")
@js.native
object createValidator extends js.Object {
  
  def apply(curriedDefinition: ValidatorImpl): ConfigurableValidator = js.native
  def apply(curriedDefinition: ValidatorImpl, defaultMessageCreator: MessageCreator): ConfigurableValidator = js.native
}
