package typings.storybookAddonKnobs

import typings.react.mod.PureComponent
import typings.std.Record
import typings.storybookAddonKnobs.anon.Active
import typings.storybookAddonKnobs.anon.Knobs
import typings.storybookAddonKnobs.anon.PickAPIonoffemitgetQueryP
import typings.storybookAddonKnobs.distKnobStoreMod.KnobStoreKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsPanelMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/Panel", JSImport.Default)
  @js.native
  open class default () extends KnobPanel
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/Panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/Panel", "default.defaultProps")
    @js.native
    def defaultProps: KnobPanelProps = js.native
    inline def defaultProps_=(x: KnobPanelProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/Panel", "default.propTypes")
    @js.native
    def propTypes: Active = js.native
    inline def propTypes_=(x: Active): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/Panel", "DEFAULT_GROUP_ID")
  @js.native
  val DEFAULT_GROUP_ID: /* "Other" */ String = js.native
  
  @js.native
  trait KnobPanel
    extends PureComponent[KnobPanelProps, js.Object, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MKnobPanel(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MKnobPanel(): Unit = js.native
    
    def copy(): Unit = js.native
    
    def emitChange(changedKnob: KnobStoreKnob): Unit = js.native
    
    def handleChange(changedKnob: KnobStoreKnob): Unit = js.native
    
    def handleClick(knob: KnobStoreKnob): Unit = js.native
    
    var lastEdit: Double = js.native
    
    var loadedFromUrl: Boolean = js.native
    
    var mounted: Boolean = js.native
    
    var options: KnobPanelOptions = js.native
    
    def reset(): Unit = js.native
    
    def setKnobs(param0: Knobs): Unit = js.native
    
    def setOptions(): Unit = js.native
    def setOptions(options: KnobPanelOptions): Unit = js.native
    
    @JSName("state")
    var state_KnobPanel: KnobPanelState = js.native
    
    var stopListeningOnStory: js.Function = js.native
  }
  
  trait KnobPanelOptions extends StObject {
    
    var timestamps: js.UndefOr[Boolean] = js.undefined
  }
  object KnobPanelOptions {
    
    inline def apply(): KnobPanelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KnobPanelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KnobPanelOptions] (val x: Self) extends AnyVal {
      
      inline def setTimestamps(value: Boolean): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
      
      inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    }
  }
  
  trait KnobPanelProps extends StObject {
    
    var active: Boolean
    
    var api: PickAPIonoffemitgetQueryP
    
    var onReset: js.UndefOr[js.Object] = js.undefined
  }
  object KnobPanelProps {
    
    inline def apply(active: Boolean, api: PickAPIonoffemitgetQueryP): KnobPanelProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
      __obj.asInstanceOf[KnobPanelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KnobPanelProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setApi(value: PickAPIonoffemitgetQueryP): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setOnReset(value: js.Object): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    }
  }
  
  trait KnobPanelState extends StObject {
    
    var knobs: Record[String, KnobStoreKnob]
  }
  object KnobPanelState {
    
    inline def apply(knobs: Record[String, KnobStoreKnob]): KnobPanelState = {
      val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
      __obj.asInstanceOf[KnobPanelState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KnobPanelState] (val x: Self) extends AnyVal {
      
      inline def setKnobs(value: Record[String, KnobStoreKnob]): Self = StObject.set(x, "knobs", value.asInstanceOf[js.Any])
    }
  }
}
