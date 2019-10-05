package typings.reactDashIntl

import typings.reactDashIntl.distDefineDashMessagesMod.Messages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/dist/define-messages", JSImport.Namespace)
@js.native
object distDefineDashMessagesMod extends js.Object {
  def default[Names /* <: String */](messageDescriptors: Messages[Names]): Messages[Names] = js.native
  type Messages[Names /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in Names ]: react-intl.react-intl/dist/types.MessageDescriptor}
    */ typings.reactDashIntl.reactDashIntlStrings.Messages with js.Any
}

