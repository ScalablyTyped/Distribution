package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.Instantiable0
import typings.storybookAddonKnobs.dateMod.DateTypeKnobValue
import typings.storybookAddonKnobs.dateMod.DateTypeProps
import typings.storybookAddonKnobs.dateMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDateType extends Instantiable0[default] {
  
  var defaultProps: DateTypeProps = js.native
  
  def deserialize(value: DateTypeKnobValue): Double = js.native
  
  def getDerivedStateFromProps(): Valid = js.native
  
  var propTypes: KnobOnChange = js.native
  
  def serialize(value: DateTypeKnobValue): Double = js.native
}
