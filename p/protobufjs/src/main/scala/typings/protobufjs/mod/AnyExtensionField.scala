package typings.protobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any extension field descriptor. */
/* Rewritten from type alias, can be one of: 
  - typings.protobufjs.mod.IExtensionField
  - typings.protobufjs.mod.IExtensionMapField
*/
trait AnyExtensionField
  extends StObject
     with AnyNestedObject
object AnyExtensionField {
  
  @scala.inline
  def IExtensionField(extend: String, id: Double, `type`: String): typings.protobufjs.mod.IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.protobufjs.mod.IExtensionField]
  }
  
  @scala.inline
  def IExtensionMapField(extend: String, id: Double, keyType: String, `type`: String): typings.protobufjs.mod.IExtensionMapField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.protobufjs.mod.IExtensionMapField]
  }
}
