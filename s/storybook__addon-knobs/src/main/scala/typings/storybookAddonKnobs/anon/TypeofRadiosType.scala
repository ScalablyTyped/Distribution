package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.Instantiable0
import typings.storybookAddonKnobs.radioMod.RadiosTypeKnobValue
import typings.storybookAddonKnobs.radioMod.RadiosTypeProps
import typings.storybookAddonKnobs.radioMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRadiosType extends Instantiable0[default] {
  
  var defaultProps: RadiosTypeProps = js.native
  
  def deserialize(value: RadiosTypeKnobValue): js.UndefOr[String | Double | Null] = js.native
  
  var propTypes: IsInlineKnob = js.native
  
  def serialize(value: RadiosTypeKnobValue): js.UndefOr[String | Double | Null] = js.native
}
