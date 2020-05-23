package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait False extends js.Object {
  var `false`: String
  var `true`: String
}

object False {
  @scala.inline
  def apply(`false`: String, `true`: String): False = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[False]
  }
}

