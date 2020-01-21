package typings.reactMailchimpSubscribe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultFormFields = typings.reactMailchimpSubscribe.mod.EmailFormFields
  type FormHooks[FormFields] = typings.reactMailchimpSubscribe.mod.SubscribeArg[FormFields] with (typings.reactMailchimpSubscribe.mod.ResponseArgs | typings.reactMailchimpSubscribe.mod.PendingArgs)
  type MailchimpSubscribe[FormFields] = typings.react.mod.Component[typings.reactMailchimpSubscribe.mod.Props[FormFields], js.Object, js.Any]
}
