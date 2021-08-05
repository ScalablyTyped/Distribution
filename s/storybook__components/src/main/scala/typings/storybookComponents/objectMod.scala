package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.ObjectConfig
import typings.storybookComponents.controlsTypesMod.ObjectValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("@storybook/components/dist/controls/Object", "ObjectControl")
  @js.native
  val ObjectControl: FC[ObjectProps] = js.native
  
  trait ObjectProps
    extends StObject
       with ControlProps[ObjectValue]
       with ObjectConfig
  object ObjectProps {
    
    inline def apply(name: String, onChange: ObjectValue => ObjectValue | Unit): ObjectProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[ObjectProps]
    }
  }
}
