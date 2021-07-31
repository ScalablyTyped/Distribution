package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.NumberConfig
import typings.storybookComponents.controlsTypesMod.NumberValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  @JSImport("@storybook/components/dist/controls/Number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/components/dist/controls/Number", "NumberControl")
  @js.native
  val NumberControl: FC[NumberProps] = js.native
  
  @scala.inline
  def format(value: NumberValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parse(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait NumberProps
    extends StObject
       with ControlProps[NumberValue | Null]
       with NumberConfig
  object NumberProps {
    
    @scala.inline
    def apply(name: String, onChange: NumberValue | Null => (NumberValue | Null) | Unit): NumberProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[NumberProps]
    }
  }
}
