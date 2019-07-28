package typings.reactDashIntl

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactIntlNs {
  type DateSource = Date | String | Double
  type LocaleData = js.Array[Locale]
  type MessageValue = js.UndefOr[String | Double | Boolean | Date | Null]
  type Messages[Names /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in Names ]: react-intl.ReactIntl.FormattedMessage.MessageDescriptor}
    */ typings.reactDashIntl.reactDashIntlStrings.Messages with js.Any
}
