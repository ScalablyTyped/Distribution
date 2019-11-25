package typings.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsMod

import typings.atStorybookAddonDashStoryshots.Anon_Context
import typings.react.reactMod._Global_.JSX.Element
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions[Rendered] extends js.Object {
  var configPath: js.UndefOr[String] = js.undefined
  var framework: js.UndefOr[String] = js.undefined
  var integrityOptions: js.UndefOr[js.Object] = js.undefined
  var renderer: js.UndefOr[js.Function1[/* node */ Element, Rendered]] = js.undefined
  var serializer: js.UndefOr[js.Function1[/* rendered */ Rendered, _]] = js.undefined
  var storyKindRegex: js.UndefOr[RegExp] = js.undefined
  var storyNameRegex: js.UndefOr[RegExp] = js.undefined
  var suite: js.UndefOr[String] = js.undefined
  var test: js.UndefOr[Test] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply[Rendered](
    configPath: String = null,
    framework: String = null,
    integrityOptions: js.Object = null,
    renderer: /* node */ Element => Rendered = null,
    serializer: /* rendered */ Rendered => _ = null,
    storyKindRegex: RegExp = null,
    storyNameRegex: RegExp = null,
    suite: String = null,
    test: /* options */ Anon_Context => js.UndefOr[Unit | js.Promise[Unit]] = null
  ): InitOptions[Rendered] = {
    val __obj = js.Dynamic.literal()
    if (configPath != null) __obj.updateDynamic("configPath")(configPath.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (integrityOptions != null) __obj.updateDynamic("integrityOptions")(integrityOptions.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (serializer != null) __obj.updateDynamic("serializer")(js.Any.fromFunction1(serializer))
    if (storyKindRegex != null) __obj.updateDynamic("storyKindRegex")(storyKindRegex.asInstanceOf[js.Any])
    if (storyNameRegex != null) __obj.updateDynamic("storyNameRegex")(storyNameRegex.asInstanceOf[js.Any])
    if (suite != null) __obj.updateDynamic("suite")(suite.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction1(test))
    __obj.asInstanceOf[InitOptions[Rendered]]
  }
}

