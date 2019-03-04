package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var safari: Anon_Application
}

object Window {
  @scala.inline
  def apply(safari: Anon_Application): Window = {
    val __obj = js.Dynamic.literal(safari = safari)
  
    __obj.asInstanceOf[Window]
  }
}

