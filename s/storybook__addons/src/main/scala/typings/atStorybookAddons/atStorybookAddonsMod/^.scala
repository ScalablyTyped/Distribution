package typings.atStorybookAddons.atStorybookAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: AddonStore = js.native
  val mockChannel: typings.atStorybookChannels.atStorybookChannelsMod.^ = js.native
  def makeDecorator[ParameterName /* <: String */, Options, Parameters](options: MakeDecoratorOptions[ParameterName, Options, Parameters]): Decorator[ParameterName, Options, Parameters] = js.native
}

