package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextProps
  extends StObject
     with ControlProps[js.UndefOr[TextValue]]
     with TextConfig
object TextProps {
  
  inline def apply(name: String, onChange: js.UndefOr[TextValue] => js.UndefOr[TextValue] | Unit): TextProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[TextProps]
  }
}
