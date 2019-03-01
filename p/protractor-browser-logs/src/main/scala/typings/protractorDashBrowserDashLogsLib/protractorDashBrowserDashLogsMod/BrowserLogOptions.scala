package typings
package protractorDashBrowserDashLogsLib.protractorDashBrowserDashLogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserLogOptions extends js.Object {
  var reporters: js.UndefOr[
    js.Array[
      js.Function1[
        /* entries */ js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Entry], 
        scala.Unit
      ]
    ]
  ] = js.undefined
}

object BrowserLogOptions {
  @scala.inline
  def apply(
    reporters: js.Array[
      js.Function1[
        /* entries */ js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Entry], 
        scala.Unit
      ]
    ] = null
  ): BrowserLogOptions = {
    val __obj = js.Dynamic.literal()
    if (reporters != null) __obj.updateDynamic("reporters")(reporters)
    __obj.asInstanceOf[BrowserLogOptions]
  }
}

