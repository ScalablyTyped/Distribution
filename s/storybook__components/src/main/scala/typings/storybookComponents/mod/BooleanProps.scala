package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanProps
  extends StObject
     with ControlProps[BooleanValue]
     with BooleanConfig
object BooleanProps {
  
  inline def apply(name: String, onChange: BooleanValue => BooleanValue | Unit): BooleanProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[BooleanProps]
  }
}
