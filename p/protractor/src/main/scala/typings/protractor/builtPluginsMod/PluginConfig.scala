package typings.protractor.builtPluginsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConfig
  extends /* key */ StringDictionary[js.Any] {
  var `inline`: js.UndefOr[ProtractorPlugin] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `package`: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object PluginConfig {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    `inline`: ProtractorPlugin = null,
    name: String = null,
    `package`: String = null,
    path: String = null
  ): PluginConfig = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[PluginConfig]
  }
}

