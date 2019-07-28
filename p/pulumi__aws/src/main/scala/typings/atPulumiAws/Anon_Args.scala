package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  var path: String
}

object Anon_Args {
  @scala.inline
  def apply(name: String, path: String, args: js.Array[String] = null): Anon_Args = {
    val __obj = js.Dynamic.literal(name = name, path = path)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[Anon_Args]
  }
}

