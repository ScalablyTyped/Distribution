package typings.storybookAddonKnobs

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.anon.PartialButtonTypeProps
import typings.storybookAddonKnobs.anon.WeakValidationMapButtonTy
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  /* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> & {  serialize :(): undefined,   deserialize :(): undefined} */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[ButtonTypeProps]): ReactElement | Null = js.native
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[ButtonTypeProps], context: js.Any): ReactElement | Null = js.native
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialButtonTypeProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialButtonTypeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.deserialize")
    @js.native
    def deserialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
    @scala.inline
    def deserialize_=(x: js.Function0[js.UndefOr[scala.Nothing]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapButtonTy] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapButtonTy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.serialize")
    @js.native
    def serialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
    @scala.inline
    def serialize_=(x: js.Function0[js.UndefOr[scala.Nothing]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  type ButtonTypeKnob = KnobControlConfig[scala.Nothing]
  
  type ButtonTypeOnClickProp = js.Function1[/* knob */ ButtonTypeKnob, js.Any]
  
  @js.native
  trait ButtonTypeProps
    extends KnobControlProps[scala.Nothing] {
    
    @JSName("knob")
    var knob_ButtonTypeProps: ButtonTypeKnob = js.native
    
    var onClick: ButtonTypeOnClickProp = js.native
  }
  object ButtonTypeProps {
    
    @scala.inline
    def apply(knob: ButtonTypeKnob, onClick: /* knob */ ButtonTypeKnob => js.Any): ButtonTypeProps = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[ButtonTypeProps]
    }
    
    @scala.inline
    implicit class ButtonTypePropsMutableBuilder[Self <: ButtonTypeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKnob(value: ButtonTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: /* knob */ ButtonTypeKnob => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
}
