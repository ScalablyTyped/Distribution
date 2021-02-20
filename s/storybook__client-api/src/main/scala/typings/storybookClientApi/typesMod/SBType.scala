package typings.storybookClientApi.typesMod

import typings.std.Record
import typings.storybookClientApi.storybookClientApiStrings.`object`
import typings.storybookClientApi.storybookClientApiStrings.array
import typings.storybookClientApi.storybookClientApiStrings.boolean
import typings.storybookClientApi.storybookClientApiStrings.enum
import typings.storybookClientApi.storybookClientApiStrings.function
import typings.storybookClientApi.storybookClientApiStrings.intersection
import typings.storybookClientApi.storybookClientApiStrings.number
import typings.storybookClientApi.storybookClientApiStrings.other
import typings.storybookClientApi.storybookClientApiStrings.string
import typings.storybookClientApi.storybookClientApiStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def SBArrayType(name: array, value: SBType): typings.storybookClientApi.typesMod.SBArrayType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBArrayType]
  }
  
  @scala.inline
  def SBEnumType(name: enum, value: js.Array[String | Double]): typings.storybookClientApi.typesMod.SBEnumType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBEnumType]
  }
  
  @scala.inline
  def SBIntersectionType(name: intersection, value: js.Array[SBType]): typings.storybookClientApi.typesMod.SBIntersectionType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBIntersectionType]
  }
  
  @scala.inline
  def SBObjectType(name: `object`, value: Record[String, SBType]): typings.storybookClientApi.typesMod.SBObjectType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBObjectType]
  }
  
  @scala.inline
  def SBOtherType(name: other, value: String): typings.storybookClientApi.typesMod.SBOtherType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBOtherType]
  }
  
  @scala.inline
  def SBScalarType(name: boolean | string | number | function): typings.storybookClientApi.typesMod.SBScalarType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBScalarType]
  }
  
  @scala.inline
  def SBUnionType(name: union, value: js.Array[SBType]): typings.storybookClientApi.typesMod.SBUnionType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookClientApi.typesMod.SBUnionType]
  }
}
