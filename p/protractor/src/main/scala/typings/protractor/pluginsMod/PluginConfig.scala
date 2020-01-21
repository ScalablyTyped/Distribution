package typings.protractor.pluginsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConfig
  extends /* key */ StringDictionary[js.Any] {
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[ProtractorPlugin] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object PluginConfig {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _package: String = null,
    `inline`: ProtractorPlugin = null,
    name: String = null,
    path: String = null
  ): PluginConfig = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConfig]
  }
}

