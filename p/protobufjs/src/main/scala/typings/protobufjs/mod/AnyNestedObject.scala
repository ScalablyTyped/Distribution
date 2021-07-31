package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any nested object descriptor. */
/* Rewritten from type alias, can be one of: 
  - typings.protobufjs.mod.IEnum
  - typings.protobufjs.mod.IType
  - typings.protobufjs.mod.IService
  - typings.protobufjs.mod.AnyExtensionField
  - typings.protobufjs.mod.INamespace
*/
trait AnyNestedObject extends StObject
object AnyNestedObject {
  
  @scala.inline
  def IEnum(values: StringDictionary[Double]): typings.protobufjs.mod.IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.protobufjs.mod.IEnum]
  }
  
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
  
  @scala.inline
  def INamespace(): typings.protobufjs.mod.INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.protobufjs.mod.INamespace]
  }
  
  @scala.inline
  def IService(methods: StringDictionary[IMethod]): typings.protobufjs.mod.IService = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.protobufjs.mod.IService]
  }
  
  @scala.inline
  def IType(fields: StringDictionary[IField]): typings.protobufjs.mod.IType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.protobufjs.mod.IType]
  }
}
