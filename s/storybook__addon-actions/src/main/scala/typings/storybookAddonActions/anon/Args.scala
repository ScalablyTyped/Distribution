package typings.storybookAddonActions.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.Array[_]
  var name: String
}

object Args {
  @scala.inline
  def apply(args: js.Array[_], name: String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

