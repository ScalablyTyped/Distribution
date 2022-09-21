package typings.storybookComponents.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsProps
  extends StObject
     with ControlProps[OptionsSelection]
     with OptionsConfig
object OptionsProps {
  
  inline def apply(
    labels: Record[Any, String],
    name: String,
    onChange: OptionsSelection => OptionsSelection | Unit,
    options: Options,
    `type`: OptionsControlType
  ): OptionsProps = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsProps]
  }
}
