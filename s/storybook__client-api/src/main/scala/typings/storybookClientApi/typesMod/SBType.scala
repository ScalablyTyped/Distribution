package typings.storybookClientApi.typesMod

import typings.std.Record
import typings.storybookClientApi.storybookClientApiStrings.boolean
import typings.storybookClientApi.storybookClientApiStrings.function
import typings.storybookClientApi.storybookClientApiStrings.number
import typings.storybookClientApi.storybookClientApiStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.storybookClientApi.typesMod.SBScalarType
  - typings.storybookClientApi.typesMod.SBEnumType
  - typings.storybookClientApi.typesMod.SBArrayType
  - typings.storybookClientApi.typesMod.SBObjectType
  - typings.storybookClientApi.typesMod.SBIntersectionType
  - typings.storybookClientApi.typesMod.SBUnionType
  - typings.storybookClientApi.typesMod.SBOtherType
*/
trait SBType extends StObject
object SBType {
  
  @scala.inline
  def SBArrayType(value: SBType): typings.storybookClientApi.typesMod.SBArrayType = {
    val __obj = js.Dynamic.literal(name = "array", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBArrayType]
  }
  
  @scala.inline
  def SBEnumType(value: js.Array[String | Double]): typings.storybookClientApi.typesMod.SBEnumType = {
    val __obj = js.Dynamic.literal(name = "enum", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBEnumType]
  }
  
  @scala.inline
  def SBIntersectionType(value: js.Array[SBType]): typings.storybookClientApi.typesMod.SBIntersectionType = {
    val __obj = js.Dynamic.literal(name = "intersection", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBIntersectionType]
  }
  
  @scala.inline
  def SBObjectType(value: Record[String, SBType]): typings.storybookClientApi.typesMod.SBObjectType = {
    val __obj = js.Dynamic.literal(name = "object", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBObjectType]
  }
  
  @scala.inline
  def SBOtherType(value: String): typings.storybookClientApi.typesMod.SBOtherType = {
    val __obj = js.Dynamic.literal(name = "other", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBOtherType]
  }
  
  @scala.inline
  def SBScalarType(name: boolean | string | number | function): typings.storybookClientApi.typesMod.SBScalarType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBScalarType]
  }
  
  @scala.inline
  def SBUnionType(value: js.Array[SBType]): typings.storybookClientApi.typesMod.SBUnionType = {
    val __obj = js.Dynamic.literal(name = "union", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBUnionType]
  }
}
