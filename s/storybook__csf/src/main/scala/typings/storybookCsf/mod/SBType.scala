package typings.storybookCsf.mod

import typings.std.Record
import typings.storybookCsf.storybookCsfStrings.boolean
import typings.storybookCsf.storybookCsfStrings.function
import typings.storybookCsf.storybookCsfStrings.number
import typings.storybookCsf.storybookCsfStrings.string
import typings.storybookCsf.storybookCsfStrings.symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.storybookCsf.mod.SBScalarType
  - typings.storybookCsf.mod.SBEnumType
  - typings.storybookCsf.mod.SBArrayType
  - typings.storybookCsf.mod.SBObjectType
  - typings.storybookCsf.mod.SBIntersectionType
  - typings.storybookCsf.mod.SBUnionType
  - typings.storybookCsf.mod.SBOtherType
*/
trait SBType extends StObject
object SBType {
  
  inline def SBArrayType(value: SBType): typings.storybookCsf.mod.SBArrayType = {
    val __obj = js.Dynamic.literal(name = "array", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookCsf.mod.SBArrayType]
  }
  
  inline def SBEnumType(value: js.Array[String | Double]): typings.storybookCsf.mod.SBEnumType = {
    val __obj = js.Dynamic.literal(name = "enum", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookCsf.mod.SBEnumType]
  }
  
  inline def SBIntersectionType(value: js.Array[SBType]): typings.storybookCsf.mod.SBIntersectionType = {
    val __obj = js.Dynamic.literal(name = "intersection", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookCsf.mod.SBIntersectionType]
  }
  
  inline def SBObjectType(value: Record[String, SBType]): typings.storybookCsf.mod.SBObjectType = {
    val __obj = js.Dynamic.literal(name = "object", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookCsf.mod.SBObjectType]
  }
  
  inline def SBOtherType(value: String): typings.storybookCsf.mod.SBOtherType = {
    val __obj = js.Dynamic.literal(name = "other", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookCsf.mod.SBOtherType]
  }
  
  inline def SBScalarType(name: boolean | string | number | function | symbol): typings.storybookCsf.mod.SBScalarType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookCsf.mod.SBScalarType]
  }
  
  inline def SBUnionType(value: js.Array[SBType]): typings.storybookCsf.mod.SBUnionType = {
    val __obj = js.Dynamic.literal(name = "union", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookCsf.mod.SBUnionType]
  }
}
