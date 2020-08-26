package typings.storybookAddonKnobs.knobManagerMod

import typings.storybookAddonKnobs.typeDefsMod.Knob
import typings.storybookAddonKnobs.typeDefsMod.Mutable
import typings.storybookAddonKnobs.typesMod.KnobType
import typings.storybookChannels.mod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobManager extends js.Object {
  var calling: Boolean = js.native
  var channel: js.UndefOr[Channel] = js.native
  var knobStore: typings.storybookAddonKnobs.knobStoreMod.default = js.native
  var options: KnobManagerOptions = js.native
  def _mayCallChannel(): Unit = js.native
  def getKnobValue(hasValue: Knob[_]): js.Any = js.native
  def knob[T /* <: KnobType */](name: String, options: Knob[T]): Mutable[
    /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
  ] = js.native
  def setChannel(channel: Channel): Unit = js.native
  def setOptions(options: KnobManagerOptions): Unit = js.native
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
    knobStore: typings.storybookAddonKnobs.knobStoreMod.default,
    options: KnobManagerOptions,
    setChannel: Channel => Unit,
    setOptions: KnobManagerOptions => Unit
  ): KnobManager = {
    val __obj = js.Dynamic.literal(_mayCallChannel = js.Any.fromFunction0(_mayCallChannel), calling = calling.asInstanceOf[js.Any], getKnobValue = js.Any.fromFunction1(getKnobValue), knob = js.Any.fromFunction2(knob), knobStore = knobStore.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setChannel = js.Any.fromFunction1(setChannel), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[KnobManager]
  }
  @scala.inline
  implicit class KnobManagerOps[Self <: KnobManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_mayCallChannel(value: () => Unit): Self = this.set("_mayCallChannel", js.Any.fromFunction0(value))
    @scala.inline
    def setCalling(value: Boolean): Self = this.set("calling", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetKnobValue(value: Knob[_] => js.Any): Self = this.set("getKnobValue", js.Any.fromFunction1(value))
    @scala.inline
    def setKnob(
      value: (String, Knob[js.Any]) => Mutable[
          /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
        ]
    ): Self = this.set("knob", js.Any.fromFunction2(value))
    @scala.inline
    def setKnobStore(value: typings.storybookAddonKnobs.knobStoreMod.default): Self = this.set("knobStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: KnobManagerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetChannel(value: Channel => Unit): Self = this.set("setChannel", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOptions(value: KnobManagerOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
  }
  
}

