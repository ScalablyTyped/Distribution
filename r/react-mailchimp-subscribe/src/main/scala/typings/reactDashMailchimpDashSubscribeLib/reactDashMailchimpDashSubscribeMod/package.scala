package typings
package reactDashMailchimpDashSubscribeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMailchimpDashSubscribeMod {
  type DefaultFormFields = EmailFormFields
  type FormHooks[FormFields] = SubscribeArg[FormFields] with (ResponseArgs | PendingArgs)
  type MailchimpSubscribe[FormFields] = reactLib.reactMod.Component[Props[FormFields], js.Object, js.Any]
}
