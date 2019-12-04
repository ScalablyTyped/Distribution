package typings.atStorybookAddonDashKnobs.distKnobManagerMod

import typings.atStorybookAddonDashKnobs.distComponentsTypesMod.KnobType
import typings.atStorybookAddonDashKnobs.distTypeDashDefsMod.Knob
import typings.atStorybookAddonDashKnobs.distTypeDashDefsMod.Mutable
import typings.atStorybookChannels.atStorybookChannelsMod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobManager extends js.Object {
  var calling: Boolean
  var channel: js.UndefOr[Channel] = js.undefined
  var knobStore: typings.atStorybookAddonDashKnobs.distKnobStoreMod.default
  var options: KnobManagerOptions
  def _mayCallChannel(): Unit
  def getKnobValue(hasValue: Knob[_]): js.Any
  def knob[T /* <: KnobType */](name: String, options: Knob[T]): Mutable[
    /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
  ]
  def setChannel(channel: Channel): Unit
  def setOptions(options: KnobManagerOptions): Unit
}

object KnobManager {
  @scala.inline
  def apply(
    _mayCallChannel: () => Unit,
    calling: Boolean,
    getKnobValue: Knob[_] => js.Any,
    knob: (String, Knob[js.Any]) => Mutable[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
    ],
    knobStore: typings.atStorybookAddonDashKnobs.distKnobStoreMod.default,
    options: KnobManagerOptions,
    setChannel: Channel => Unit,
    setOptions: KnobManagerOptions => Unit,
    channel: Channel = null
  ): KnobManager = {
    val __obj = js.Dynamic.literal(_mayCallChannel = js.Any.fromFunction0(_mayCallChannel), calling = calling.asInstanceOf[js.Any], getKnobValue = js.Any.fromFunction1(getKnobValue), knob = js.Any.fromFunction2(knob), knobStore = knobStore.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setChannel = js.Any.fromFunction1(setChannel), setOptions = js.Any.fromFunction1(setOptions))
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobManager]
  }
}

