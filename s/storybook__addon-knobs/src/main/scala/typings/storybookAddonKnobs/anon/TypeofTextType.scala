package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.Instantiable0
import typings.storybookAddonKnobs.textMod.TextTypeKnobValue
import typings.storybookAddonKnobs.textMod.TextTypeProps
import typings.storybookAddonKnobs.textMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTextType
  extends StObject
     with Instantiable0[default] {
  
  var defaultProps: TextTypeProps = js.native
  
  def deserialize(value: TextTypeKnobValue): String = js.native
  
  var propTypes: OnChange = js.native
  
  def serialize(value: TextTypeKnobValue): String = js.native
}
