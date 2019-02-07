package typings
package reactDashIntlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactIntlNs {
  type DateSource = stdLib.Date | java.lang.String | scala.Double
  type LocaleData = js.Array[Locale]
  type MessageValue = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | stdLib.Date | scala.Null]
  type Messages[Names /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in Names ]: react-intl.ReactIntl.FormattedMessage.MessageDescriptor}
    */ reactDashIntlLib.reactDashIntlLibStrings.Messages with js.Any
}
