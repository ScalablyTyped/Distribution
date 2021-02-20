package typings.storybookAddonKnobs

import typings.react.mod.Component
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.storybookAddonKnobs.anon.OnChange
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Color", JSImport.Default)
  @js.native
  class default () extends ColorType
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Color", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Color", "default.defaultProps")
    @js.native
    def defaultProps: ColorTypeProps = js.native
    @scala.inline
    def defaultProps_=(x: ColorTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Color", "default.deserialize")
    @js.native
    def deserialize(value: ColorTypeKnobValue): String = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Color", "default.propTypes")
    @js.native
    def propTypes: OnChange = js.native
    @scala.inline
    def propTypes_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Color", "default.serialize")
    @js.native
    def serialize(value: ColorTypeKnobValue): String = js.native
  }
  
  @js.native
  trait ColorType
    extends Component[ColorTypeProps, ColorTypeState, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MColorType(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MColorType(): Unit = js.native
    
    var handleChange: js.Any = js.native
    
    var handleClick: js.Any = js.native
    
    def handleWindowMouseDown(e: MouseEvent): Unit = js.native
    
    var popover: HTMLDivElement = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MColorType(nextProps: ColorTypeProps, nextState: ColorTypeState): Boolean = js.native
  }
  
  type ColorTypeKnob = KnobControlConfig[ColorTypeKnobValue]
  
  type ColorTypeKnobValue = String
  
  type ColorTypeProps = KnobControlProps[ColorTypeKnobValue]
  
  @js.native
  trait ColorTypeState extends StObject {
    
    var displayColorPicker: Boolean = js.native
  }
  object ColorTypeState {
    
    @scala.inline
    def apply(displayColorPicker: Boolean): ColorTypeState = {
      val __obj = js.Dynamic.literal(displayColorPicker = displayColorPicker.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorTypeState]
    }
    
    @scala.inline
    implicit class ColorTypeStateMutableBuilder[Self <: ColorTypeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayColorPicker(value: Boolean): Self = StObject.set(x, "displayColorPicker", value.asInstanceOf[js.Any])
    }
  }
}
