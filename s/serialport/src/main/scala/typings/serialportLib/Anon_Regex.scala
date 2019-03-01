package typings
package serialportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Regex extends js.Object {
  var regex: stdLib.RegExp
}

object Anon_Regex {
  @scala.inline
  def apply(regex: stdLib.RegExp): Anon_Regex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_Regex]
  }
}

