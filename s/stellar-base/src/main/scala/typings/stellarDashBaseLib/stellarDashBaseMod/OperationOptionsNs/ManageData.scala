package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageData
  extends BaseOptions
     with stellarDashBaseLib.stellarDashBaseMod._OperationOptions {
  var name: java.lang.String
  var value: java.lang.String | nodeLib.Buffer
}

object ManageData {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String | nodeLib.Buffer, source: java.lang.String = null): ManageData = {
    val __obj = js.Dynamic.literal(name = name, value = value.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ManageData]
  }
}

