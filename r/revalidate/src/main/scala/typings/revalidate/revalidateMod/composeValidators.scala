package typings.revalidate.revalidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("revalidate", "composeValidators")
@js.native
object composeValidators extends js.Object {
  def apply(firstValidator: js.Any, validators: Validator*): ComposedCurryableValidator = js.native
  def apply(firstValidator: Validator, validators: Validator*): ComposedCurryableValidator = js.native
}

