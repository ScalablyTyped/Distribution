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
trait SBType extends js.Object
object SBType {
  
  @scala.inline
  def SBEnumType(name: enum, value: js.Array[String | Double]): SBType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBType]
  }
  
  @scala.inline
  def SBIntersectionType(name: intersection, value: js.Array[SBType]): SBType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBType]
  }
  
  @scala.inline
  def SBObjectType(name: `object`, value: Record[String, SBType]): SBType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBType]
  }
  
  @scala.inline
  def SBArrayType(name: array, value: SBType): SBType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBType]
  }
  
  @scala.inline
  def SBUnionType(name: union, value: js.Array[SBType]): SBType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBType]
  }
  
  @scala.inline
  def SBOtherType(name: other, value: String): SBType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBType]
  }
  
  @scala.inline
  def SBScalarType(name: boolean | string | number | function): SBType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBType]
  }
}
