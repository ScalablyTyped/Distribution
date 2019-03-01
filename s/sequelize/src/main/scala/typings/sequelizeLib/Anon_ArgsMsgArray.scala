package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsMsgArray extends js.Object {
  var args: js.Array[java.lang.String] | java.lang.String
  var msg: java.lang.String
}

object Anon_ArgsMsgArray {
  @scala.inline
  def apply(args: js.Array[java.lang.String] | java.lang.String, msg: java.lang.String): Anon_ArgsMsgArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.updateDynamic("msg")(msg)
    __obj.asInstanceOf[Anon_ArgsMsgArray]
  }
}

