package typings.storybookAddonKnobs

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLTextAreaElement
import typings.std.Record
import typings.storybookAddonKnobs.anon.Knob
import typings.storybookAddonKnobs.anon.PartialArrayTypeProps
import typings.storybookAddonKnobs.anon.ReadonlyArrayTypeProps
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Array", JSImport.Default)
  @js.native
  class default () extends ArrayType
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Array", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Array", "default.defaultProps")
    @js.native
    def defaultProps: PartialArrayTypeProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialArrayTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def deserialize(value: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def deserialize(value: Record[String, String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Array", "default.propTypes")
    @js.native
    def propTypes: Knob = js.native
    @scala.inline
    def propTypes_=(x: Knob): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def serialize(value: ArrayTypeKnobValue): ArrayTypeKnobValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[ArrayTypeKnobValue]
  }
  
  @js.native
  trait ArrayType
    extends Component[ArrayTypeProps, js.Object, js.Any] {
    
    def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MArrayType(nextProps: ReadonlyArrayTypeProps): Boolean = js.native
  }
  
  trait ArrayTypeKnob
    extends StObject
       with KnobControlConfig[ArrayTypeKnobValue] {
    
    var separator: String
  }
  object ArrayTypeKnob {
    
    @scala.inline
    def apply(name: String, separator: String, value: ArrayTypeKnobValue): ArrayTypeKnob = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayTypeKnob]
    }
    
    @scala.inline
    implicit class ArrayTypeKnobMutableBuilder[Self <: ArrayTypeKnob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    }
  }
  
  type ArrayTypeKnobValue = js.Array[String]
  
  trait ArrayTypeProps
    extends StObject
       with KnobControlProps[ArrayTypeKnobValue] {
    
    @JSName("knob")
    var knob_ArrayTypeProps: ArrayTypeKnob
  }
  object ArrayTypeProps {
    
    @scala.inline
    def apply(knob: ArrayTypeKnob, onChange: ArrayTypeKnobValue => ArrayTypeKnobValue): ArrayTypeProps = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[ArrayTypeProps]
    }
    
    @scala.inline
    implicit class ArrayTypePropsMutableBuilder[Self <: ArrayTypeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKnob(value: ArrayTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}
