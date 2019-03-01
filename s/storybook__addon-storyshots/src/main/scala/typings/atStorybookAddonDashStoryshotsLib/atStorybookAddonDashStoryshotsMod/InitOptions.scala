package typings
package atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions[Rendered] extends js.Object {
  var configPath: js.UndefOr[java.lang.String] = js.undefined
  var framework: js.UndefOr[java.lang.String] = js.undefined
  var integrityOptions: js.UndefOr[js.Object] = js.undefined
  var renderer: js.UndefOr[js.Function1[/* node */ reactLib.reactMod.ReactNs.ReactElement[_], Rendered]] = js.undefined
  var serializer: js.UndefOr[js.Function1[/* rendered */ Rendered, _]] = js.undefined
  var storyKindRegex: js.UndefOr[stdLib.RegExp] = js.undefined
  var storyNameRegex: js.UndefOr[stdLib.RegExp] = js.undefined
  var suite: js.UndefOr[java.lang.String] = js.undefined
  var test: js.UndefOr[Test] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply[Rendered](
    configPath: java.lang.String = null,
    framework: java.lang.String = null,
    integrityOptions: js.Object = null,
    renderer: js.Function1[/* node */ reactLib.reactMod.ReactNs.ReactElement[_], Rendered] = null,
    serializer: js.Function1[/* rendered */ Rendered, _] = null,
    storyKindRegex: stdLib.RegExp = null,
    storyNameRegex: stdLib.RegExp = null,
    suite: java.lang.String = null,
    test: Test = null
  ): InitOptions[Rendered] = {
    val __obj = js.Dynamic.literal()
    if (configPath != null) __obj.updateDynamic("configPath")(configPath)
    if (framework != null) __obj.updateDynamic("framework")(framework)
    if (integrityOptions != null) __obj.updateDynamic("integrityOptions")(integrityOptions)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (serializer != null) __obj.updateDynamic("serializer")(serializer)
    if (storyKindRegex != null) __obj.updateDynamic("storyKindRegex")(storyKindRegex)
    if (storyNameRegex != null) __obj.updateDynamic("storyNameRegex")(storyNameRegex)
    if (suite != null) __obj.updateDynamic("suite")(suite)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[InitOptions[Rendered]]
  }
}

