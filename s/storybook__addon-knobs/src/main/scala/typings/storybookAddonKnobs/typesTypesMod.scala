package typings.storybookAddonKnobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypesMod {
  
  trait KnobControlConfig[T] extends StObject {
    
    var defaultValue: js.UndefOr[T] = js.undefined
    
    var name: String
    
    var value: T
  }
  object KnobControlConfig {
    
    @scala.inline
    def apply[T](name: String, value: T): KnobControlConfig[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KnobControlConfig[T]]
    }
    
    @scala.inline
    implicit class KnobControlConfigMutableBuilder[Self <: KnobControlConfig[?], T] (val x: Self & KnobControlConfig[T]) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait KnobControlProps[T] extends StObject {
    
    var knob: KnobControlConfig[T]
    
    def onChange(value: T): T
  }
  object KnobControlProps {
    
    @scala.inline
    def apply[T](knob: KnobControlConfig[T], onChange: T => T): KnobControlProps[T] = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[KnobControlProps[T]]
    }
    
    @scala.inline
    implicit class KnobControlPropsMutableBuilder[Self <: KnobControlProps[?], T] (val x: Self & KnobControlProps[T]) extends AnyVal {
      
      @scala.inline
      def setKnob(value: KnobControlConfig[T]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: T => T): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    }
  }
}
