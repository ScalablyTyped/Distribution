package typings.select2

import typings.select2.mod.DataFormat
import typings.select2.mod.GroupedDataFormat
import typings.select2.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: Options[DataFormat | GroupedDataFormat, _]
}

object AnonOptions {
  @scala.inline
  def apply(options: Options[DataFormat | GroupedDataFormat, _]): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptions]
  }
}

