package typings.rollupDashPluginDashTypescript2

import typings.typescript.typescriptMod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileName extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var parsedTsConfig: ParsedCommandLine
}

object Anon_FileName {
  @scala.inline
  def apply(parsedTsConfig: ParsedCommandLine, fileName: String = null): Anon_FileName = {
    val __obj = js.Dynamic.literal(parsedTsConfig = parsedTsConfig.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FileName]
  }
}

