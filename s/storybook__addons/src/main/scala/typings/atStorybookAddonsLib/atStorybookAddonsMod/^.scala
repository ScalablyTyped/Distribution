package typings
package atStorybookAddonsLib.atStorybookAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: atStorybookAddonsLib.atStorybookAddonsMod.AddonStore = js.native
  val mockChannel: atStorybookChannelsLib.atStorybookChannelsMod.namespaced = js.native
  def makeDecorator[ParameterName /* <: java.lang.String */, Options, Parameters](
    options: atStorybookAddonsLib.atStorybookAddonsMod.MakeDecoratorOptions[ParameterName, Options, Parameters]
  ): atStorybookAddonsLib.atStorybookAddonsMod.Decorator[ParameterName, Options, Parameters] = js.native
}

