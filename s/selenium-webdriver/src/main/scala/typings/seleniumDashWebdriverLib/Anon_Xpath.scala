package typings
package seleniumDashWebdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Xpath
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.ByHash {
  var xpath: java.lang.String
}

object Anon_Xpath {
  @scala.inline
  def apply(xpath: java.lang.String): Anon_Xpath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xpath")(xpath)
    __obj.asInstanceOf[Anon_Xpath]
  }
}

