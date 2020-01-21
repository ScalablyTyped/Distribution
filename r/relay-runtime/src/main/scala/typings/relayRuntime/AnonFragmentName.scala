package typings.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFragmentName extends js.Object {
  val fragmentName: String
  val fragmentPropName: String
}

object AnonFragmentName {
  @scala.inline
  def apply(fragmentName: String, fragmentPropName: String): AnonFragmentName = {
    val __obj = js.Dynamic.literal(fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFragmentName]
  }
}

