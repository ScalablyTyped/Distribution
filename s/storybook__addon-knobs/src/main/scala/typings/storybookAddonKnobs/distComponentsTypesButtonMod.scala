package typings.storybookAddonKnobs

import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.anon.PartialButtonTypeProps
import typings.storybookAddonKnobs.anon.WeakValidationMapButtonTy
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTypesButtonMod {
  
  /* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> & {  serialize :(): undefined,   deserialize :(): undefined} */
  object default {
    
    inline def apply(props: ButtonTypeProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: ButtonTypeProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialButtonTypeProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialButtonTypeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.deserialize")
    @js.native
    def deserialize: js.Function0[Unit] = js.native
    inline def deserialize_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapButtonTy] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapButtonTy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Button", "default.serialize")
    @js.native
    def serialize: js.Function0[Unit] = js.native
    inline def serialize_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  type ButtonTypeKnob = KnobControlConfig[scala.Nothing]
  
  type ButtonTypeOnClickProp = js.Function1[/* knob */ ButtonTypeKnob, Any]
  
  trait ButtonTypeProps
    extends StObject
       with KnobControlProps[scala.Nothing] {
    
    @JSName("knob")
    var knob_ButtonTypeProps: ButtonTypeKnob
    
    var onClick: ButtonTypeOnClickProp
  }
  object ButtonTypeProps {
    
    inline def apply(knob: ButtonTypeKnob, onClick: /* knob */ ButtonTypeKnob => Any): ButtonTypeProps = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[ButtonTypeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonTypeProps] (val x: Self) extends AnyVal {
      
      inline def setKnob(value: ButtonTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* knob */ ButtonTypeKnob => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
}
