package typings.reactDashIntl.distTypesMod

import typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.IntlRelativeTimeFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof intl-messageformat.intl-messageformat.Formats ]:? intl-messageformat.intl-messageformat.Formats[P]} */ trait CustomFormats extends js.Object {
  var relative: js.UndefOr[Record[String, IntlRelativeTimeFormatOptions]] = js.undefined
}

object CustomFormats {
  @scala.inline
  def apply(relative: Record[String, IntlRelativeTimeFormatOptions] = null): CustomFormats = {
    val __obj = js.Dynamic.literal()
    if (relative != null) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFormats]
  }
}

