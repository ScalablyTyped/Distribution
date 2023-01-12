package typings.storybookAddonKnobs

import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.std.Extract
import typings.std.PropertyKey
import typings.std.Record
import typings.storybookAddonKnobs.anon.PartialSelectTypePropsSel
import typings.storybookAddonKnobs.anon.WeakValidationMapSelectTy
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTypesSelectMod {
  
  /* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> & {  serialize :(value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue): @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue,   deserialize :(value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue): @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue} */
  object default {
    
    inline def apply(props: SelectTypeProps[SelectTypeKnobValue]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: SelectTypeProps[SelectTypeKnobValue], context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialSelectTypePropsSel] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialSelectTypePropsSel]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.deserialize")
    @js.native
    def deserialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue] = js.native
    inline def deserialize_=(x: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapSelectTy] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapSelectTy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.serialize")
    @js.native
    def serialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue] = js.native
    inline def serialize_=(x: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  trait SelectTypeKnob[T /* <: SelectTypeKnobValue */]
    extends StObject
       with KnobControlConfig[T] {
    
    var options: SelectTypeOptionsProp[T]
  }
  object SelectTypeKnob {
    
    inline def apply[T /* <: SelectTypeKnobValue */](name: String, options: SelectTypeOptionsProp[T], value: T): SelectTypeKnob[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectTypeKnob[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectTypeKnob[?], T /* <: SelectTypeKnobValue */] (val x: Self & SelectTypeKnob[T]) extends AnyVal {
      
      inline def setOptions(value: SelectTypeOptionsProp[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  type SelectTypeKnobValue = js.UndefOr[String | Double | Boolean | Null | js.Array[PropertyKey] | (Record[String, Any])]
  
  type SelectTypeOptionsProp[T /* <: SelectTypeKnobValue */] = (Record[
    (Extract[T, PropertyKey]) | PropertyKey, 
    (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
  ]) | js.Array[T]
  
  trait SelectTypeProps[T /* <: SelectTypeKnobValue */]
    extends StObject
       with KnobControlProps[T] {
    
    @JSName("knob")
    var knob_SelectTypeProps: SelectTypeKnob[T]
  }
  object SelectTypeProps {
    
    inline def apply[T /* <: SelectTypeKnobValue */](knob: SelectTypeKnob[T], onChange: T => T): SelectTypeProps[T] = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[SelectTypeProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectTypeProps[?], T /* <: SelectTypeKnobValue */] (val x: Self & SelectTypeProps[T]) extends AnyVal {
      
      inline def setKnob(value: SelectTypeKnob[T]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}
