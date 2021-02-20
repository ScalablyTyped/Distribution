package typings.storybookAddonKnobs

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.Validator
import typings.std.HTMLTextAreaElement
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Object", JSImport.Default)
  @js.native
  class default[T] () extends ObjectType[T]
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Object", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.defaultProps")
    @js.native
    def defaultProps: ObjectTypeProps[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: ObjectTypeProps[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.deserialize")
    @js.native
    def deserialize: js.Function1[/* value */ String, js.Any] = js.native
    @scala.inline
    def deserialize_=(x: js.Function1[/* value */ String, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps[T](props: ObjectTypeProps[T], state: ObjectTypeState[T]): ObjectTypeState[T] | Null = js.native
    
    /* static member */
    object propTypes {
      
      @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.propTypes.knob")
      @js.native
      def knob: Validator[KnobControlConfig[js.Any]] = js.native
      @scala.inline
      def knob_=(x: Validator[KnobControlConfig[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("knob")(x.asInstanceOf[js.Any])
      
      @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.propTypes.onChange")
      @js.native
      def onChange: Validator[js.Function1[/* value */ js.Any, js.Any]] = js.native
      @scala.inline
      def onChange_=(x: Validator[js.Function1[/* value */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("@storybook/addon-knobs/dist/components/types/Object", "default.serialize")
    @js.native
    def serialize: js.Function1[/* object */ js.Any, String] = js.native
    @scala.inline
    def serialize_=(x: js.Function1[/* object */ js.Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ObjectType[T]
    extends Component[ObjectTypeProps[T], js.Object, js.Any] {
    
    def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
    
    @JSName("state")
    var state_ObjectType: ObjectTypeState[T] = js.native
  }
  
  type ObjectTypeKnob[T] = KnobControlConfig[T]
  
  type ObjectTypeProps[T] = KnobControlProps[T]
  
  @js.native
  trait ObjectTypeState[T] extends StObject {
    
    var failed: Boolean = js.native
    
    var json: js.UndefOr[T] = js.native
    
    var value: String = js.native
  }
  object ObjectTypeState {
    
    @scala.inline
    def apply[T](failed: Boolean, value: String): ObjectTypeState[T] = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectTypeState[T]]
    }
    
    @scala.inline
    implicit class ObjectTypeStateMutableBuilder[Self <: ObjectTypeState[_], T] (val x: Self with ObjectTypeState[T]) extends AnyVal {
      
      @scala.inline
      def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: T): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
