package typings
package atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions[Rendered] extends js.Object {
  var configPath: js.UndefOr[java.lang.String] = js.undefined
  var framework: js.UndefOr[java.lang.String] = js.undefined
  var integrityOptions: js.UndefOr[js.Object] = js.undefined
  var renderer: js.UndefOr[js.Function1[/* node */ reactLib.reactMod.ReactNs.ReactElement, Rendered]] = js.undefined
  var serializer: js.UndefOr[js.Function1[/* rendered */ Rendered, _]] = js.undefined
  var storyKindRegex: js.UndefOr[stdLib.RegExp] = js.undefined
  var storyNameRegex: js.UndefOr[stdLib.RegExp] = js.undefined
  var suite: js.UndefOr[java.lang.String] = js.undefined
  var test: js.UndefOr[Test] = js.undefined
}

