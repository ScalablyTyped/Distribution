package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.typeDefsMod.Knob
import typings.storybookAddonKnobs.typeDefsMod.Mutable
import typings.storybookAddonKnobs.typesMod.KnobType
import typings.storybookChannels.mod.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object knobManagerMod {
  
  @JSImport("@storybook/addon-knobs/dist/KnobManager", JSImport.Default)
  @js.native
  class default () extends KnobManager
  
  @js.native
  trait KnobManager extends StObject {
    
    def _mayCallChannel(): Unit = js.native
    
    var calling: Boolean = js.native
    
    var channel: js.UndefOr[Channel] = js.native
    
    def getKnobValue(hasValue: Knob[_]): js.Any = js.native
    
    def knob[T /* <: KnobType */](name: String, options: Knob[T]): Mutable[
        /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
      ] = js.native
    
    var knobStore: typings.storybookAddonKnobs.knobStoreMod.default = js.native
    
    var options: KnobManagerOptions = js.native
    
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
    implicit class KnobManagerMutableBuilder[Self <: KnobManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalling(value: Boolean): Self = StObject.set(x, "calling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setGetKnobValue(value: Knob[_] => js.Any): Self = StObject.set(x, "getKnobValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKnob(
        value: (String, Knob[js.Any]) => Mutable[
              /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
            ]
      ): Self = StObject.set(x, "knob", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKnobStore(value: typings.storybookAddonKnobs.knobStoreMod.default): Self = StObject.set(x, "knobStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: KnobManagerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetChannel(value: Channel => Unit): Self = StObject.set(x, "setChannel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetOptions(value: KnobManagerOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_mayCallChannel(value: () => Unit): Self = StObject.set(x, "_mayCallChannel", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait KnobManagerOptions extends StObject {
    
    var disableDebounce: js.UndefOr[Boolean] = js.native
    
    var disableForceUpdate: js.UndefOr[Boolean] = js.native
    
    var escapeHTML: js.UndefOr[Boolean] = js.native
  }
  object KnobManagerOptions {
    
    @scala.inline
    def apply(): KnobManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KnobManagerOptions]
    }
    
    @scala.inline
    implicit class KnobManagerOptionsMutableBuilder[Self <: KnobManagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableDebounce(value: Boolean): Self = StObject.set(x, "disableDebounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDebounceUndefined: Self = StObject.set(x, "disableDebounce", js.undefined)
      
      @scala.inline
      def setDisableForceUpdate(value: Boolean): Self = StObject.set(x, "disableForceUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableForceUpdateUndefined: Self = StObject.set(x, "disableForceUpdate", js.undefined)
      
      @scala.inline
      def setEscapeHTML(value: Boolean): Self = StObject.set(x, "escapeHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeHTMLUndefined: Self = StObject.set(x, "escapeHTML", js.undefined)
    }
  }
}
