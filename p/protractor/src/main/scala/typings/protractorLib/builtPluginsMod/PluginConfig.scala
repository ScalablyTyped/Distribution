package typings
package protractorLib.builtPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConfig
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `inline`: js.UndefOr[ProtractorPlugin] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `package`: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object PluginConfig {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `inline`: ProtractorPlugin = null,
    name: java.lang.String = null,
    `package`: java.lang.String = null,
    path: java.lang.String = null
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

