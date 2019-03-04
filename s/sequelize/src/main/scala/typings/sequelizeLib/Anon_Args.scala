package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: java.lang.String | (js.Array[java.lang.String | stdLib.RegExp]) | stdLib.RegExp
  var msg: java.lang.String
}

object Anon_Args {
  @scala.inline
  def apply(
    args: java.lang.String | (js.Array[java.lang.String | stdLib.RegExp]) | stdLib.RegExp,
    msg: java.lang.String
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

