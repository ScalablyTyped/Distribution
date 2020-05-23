package typings.snykPhpPlugin.typesMod

import typings.snykComposerLockfileParser.typesMod.ComposerParserResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhpPluginResult extends js.Object {
  @JSName("package")
  var _package: ComposerParserResponse
  var plugin: PhpPlugin
}

object PhpPluginResult {
  @scala.inline
  def apply(_package: ComposerParserResponse, plugin: PhpPlugin): PhpPluginResult = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhpPluginResult]
  }
}

