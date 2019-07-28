package typings.sequelize

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: String | (js.Array[String | RegExp]) | RegExp
  var msg: String
}

object Anon_Args {
  @scala.inline
  def apply(args: String | (js.Array[String | RegExp]) | RegExp, msg: String): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

