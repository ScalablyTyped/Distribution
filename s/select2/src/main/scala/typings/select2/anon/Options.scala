package typings.select2.anon

import typings.select2.mod.DataFormat
import typings.select2.mod.GroupedDataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: typings.select2.mod.Options[DataFormat | GroupedDataFormat, _]
}

object Options {
  @scala.inline
  def apply(options: typings.select2.mod.Options[DataFormat | GroupedDataFormat, _]): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

