package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.Array[_]
  var name: java.lang.String
  var script: java.lang.String | js.Function
}

object Anon_Args {
  @scala.inline
  def apply(args: js.Array[_], name: java.lang.String, script: java.lang.String | js.Function): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Args]
  }
}

