package typings
package select2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: select2Lib.select2Mod.Options[select2Lib.select2Mod.DataFormat | select2Lib.select2Mod.GroupedDataFormat, _]
}

object Anon_Options {
  @scala.inline
  def apply(
    options: select2Lib.select2Mod.Options[select2Lib.select2Mod.DataFormat | select2Lib.select2Mod.GroupedDataFormat, _]
  ): Anon_Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Options]
  }
}

