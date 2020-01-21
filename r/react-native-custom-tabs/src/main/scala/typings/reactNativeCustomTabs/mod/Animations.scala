package typings.reactNativeCustomTabs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animations extends js.Object {
  var endEnter: String
  var endExit: String
  var startEnter: String
  var startExit: String
}

object Animations {
  @scala.inline
  def apply(endEnter: String, endExit: String, startEnter: String, startExit: String): Animations = {
    val __obj = js.Dynamic.literal(endEnter = endEnter.asInstanceOf[js.Any], endExit = endExit.asInstanceOf[js.Any], startEnter = startEnter.asInstanceOf[js.Any], startExit = startExit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Animations]
  }
}

