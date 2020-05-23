package typings.relayRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentName extends js.Object {
  val fragmentName: String
  val fragmentPropName: String
}

object FragmentName {
  @scala.inline
  def apply(fragmentName: String, fragmentPropName: String): FragmentName = {
    val __obj = js.Dynamic.literal(fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentName]
  }
}

