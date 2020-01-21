package typings.rollupPluginTypescript2

import typings.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileName extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var parsedTsConfig: ParsedCommandLine
}

object AnonFileName {
  @scala.inline
  def apply(parsedTsConfig: ParsedCommandLine, fileName: String = null): AnonFileName = {
    val __obj = js.Dynamic.literal(parsedTsConfig = parsedTsConfig.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileName]
  }
}

