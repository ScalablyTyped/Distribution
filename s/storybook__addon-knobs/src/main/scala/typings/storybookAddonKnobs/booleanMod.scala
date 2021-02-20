package typings.storybookAddonKnobs

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.anon.PartialBooleanTypeProps
import typings.storybookAddonKnobs.anon.WeakValidationMapBooleanT
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanMod {
  
  /* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> & {  serialize :(value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeKnobValue): string | null,   deserialize :(value : string | null): boolean} */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[BooleanTypeProps]): ReactElement | Null = js.native
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[BooleanTypeProps], context: js.Any): ReactElement | Null = js.native
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialBooleanTypeProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialBooleanTypeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.deserialize")
    @js.native
    def deserialize: js.Function1[/* value */ String | Null, Boolean] = js.native
    @scala.inline
    def deserialize_=(x: js.Function1[/* value */ String | Null, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapBooleanT] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapBooleanT]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.serialize")
    @js.native
    def serialize: js.Function1[/* value */ BooleanTypeKnobValue, String | Null] = js.native
    @scala.inline
    def serialize_=(x: js.Function1[/* value */ BooleanTypeKnobValue, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  type BooleanTypeKnob = KnobControlConfig[BooleanTypeKnobValue]
  
  type BooleanTypeKnobValue = Boolean
  
  @js.native
  trait BooleanTypeProps extends KnobControlProps[BooleanTypeKnobValue] {
    
    @JSName("knob")
    var knob_BooleanTypeProps: BooleanTypeKnob = js.native
  }
  object BooleanTypeProps {
    
    @scala.inline
    def apply(knob: BooleanTypeKnob, onChange: BooleanTypeKnobValue => BooleanTypeKnobValue): BooleanTypeProps = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[BooleanTypeProps]
    }
    
    @scala.inline
    implicit class BooleanTypePropsMutableBuilder[Self <: BooleanTypeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKnob(value: BooleanTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}
