package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeProps
  extends StObject
     with ControlProps[NumberValue | Null]
     with NumberConfig
object RangeProps {
  
  inline def apply(name: String, onChange: NumberValue | Null => (NumberValue | Null) | Unit): RangeProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[RangeProps]
  }
}
