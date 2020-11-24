package typings.revalidate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("revalidate", "composeValidators")
@js.native
object composeValidators extends js.Object {
  
  def apply(firstValidator: js.Any, validators: Validator*): ComposedCurryableValidator = js.native
  def apply(firstValidator: Validator, validators: Validator*): ComposedCurryableValidator = js.native
}
