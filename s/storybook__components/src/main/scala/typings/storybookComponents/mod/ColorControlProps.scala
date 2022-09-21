package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorControlProps
  extends StObject
     with ControlProps[ColorValue]
     with ColorConfig
object ColorControlProps {
  
  inline def apply(name: String, onChange: ColorValue => ColorValue | Unit): ColorControlProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[ColorControlProps]
  }
}
