package typings.reactDashMailchimpDashSubscribe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMailchimpDashSubscribeMod {
  import typings.react.reactMod.Component

  type DefaultFormFields = EmailFormFields
  type FormHooks[FormFields] = SubscribeArg[FormFields] with (ResponseArgs | PendingArgs)
  type MailchimpSubscribe[FormFields] = Component[Props[FormFields], js.Object, js.Any]
}
