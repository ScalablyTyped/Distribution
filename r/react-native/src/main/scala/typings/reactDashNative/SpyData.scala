package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpyData extends js.Object {
  var args: js.Array[_]
  var method: String | Double
  var module: js.UndefOr[String] = js.undefined
  var `type`: Double
}

object SpyData {
  @scala.inline
  def apply(args: js.Array[_], method: String | Double, `type`: Double, module: String = null): SpyData = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpyData]
  }
}

