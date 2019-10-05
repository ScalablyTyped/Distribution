package typings.stellarDashBase.stellarDashBaseMod.OperationOptions

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageData extends BaseOptions {
  var name: String
  var value: String | Buffer
}

object ManageData {
  @scala.inline
  def apply(name: String, value: String | Buffer, source: String = null): ManageData = {
    val __obj = js.Dynamic.literal(name = name, value = value.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ManageData]
  }
}

