package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.Instantiable0
import typings.std.Record
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import typings.storybookAddonKnobs.arrayMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofArrayType
  extends StObject
     with Instantiable0[default] {
  
  var defaultProps: PartialArrayTypeProps = js.native
  
  def deserialize(value: js.Array[String]): js.Array[String] = js.native
  def deserialize(value: Record[String, String]): js.Array[String] = js.native
  
  var propTypes: Knob = js.native
  
  def serialize(value: ArrayTypeKnobValue): ArrayTypeKnobValue = js.native
}
