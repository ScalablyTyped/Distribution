package typings.storybookAddonKnobs

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.Validator
import typings.std.HTMLTextAreaElement
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTypesObjectMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Object", JSImport.Default)
  @js.native
  open class default[T] () extends ObjectType[T]
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Object", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.defaultProps")
    @js.native
    def defaultProps: ObjectTypeProps[Any] = js.native
    inline def defaultProps_=(x: ObjectTypeProps[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.deserialize")
    @js.native
    def deserialize: js.Function1[/* value */ String, Any] = js.native
    inline def deserialize_=(x: js.Function1[/* value */ String, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def getDerivedStateFromProps[T](props: ObjectTypeProps[T], state: ObjectTypeState[T]): ObjectTypeState[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ObjectTypeState[T] | Null]
    
    /* static member */
    object propTypes {
      
      @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.propTypes.knob")
      @js.native
      def knob: Validator[KnobControlConfig[Any]] = js.native
      inline def knob_=(x: Validator[KnobControlConfig[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("knob")(x.asInstanceOf[js.Any])
      
      @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.propTypes.onChange")
      @js.native
      def onChange: Validator[js.Function1[/* value */ Any, Any]] = js.native
      inline def onChange_=(x: Validator[js.Function1[/* value */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.serialize")
    @js.native
    def serialize: js.Function1[/* object */ Any, String] = js.native
    inline def serialize_=(x: js.Function1[/* object */ Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ObjectType[T]
    extends Component[ObjectTypeProps[T], js.Object, Any] {
    
    def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
    
    @JSName("state")
    var state_ObjectType: ObjectTypeState[T] = js.native
  }
  
  type ObjectTypeKnob[T] = KnobControlConfig[T]
  
  type ObjectTypeProps[T] = KnobControlProps[T]
  
  trait ObjectTypeState[T] extends StObject {
    
    var failed: Boolean
    
    var json: js.UndefOr[T] = js.undefined
    
    var value: String
  }
  object ObjectTypeState {
    
    inline def apply[T](failed: Boolean, value: String): ObjectTypeState[T] = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectTypeState[T]]
    }
    
    extension [Self <: ObjectTypeState[?], T](x: Self & ObjectTypeState[T]) {
      
      inline def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setJson(value: T): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
