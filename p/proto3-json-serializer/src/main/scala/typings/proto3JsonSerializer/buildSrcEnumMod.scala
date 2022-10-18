package typings.proto3JsonSerializer

import typings.proto3JsonSerializer.buildSrcTypesMod.JSONValue
import typings.protobufjs.mod.Enum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcEnumMod {
  
  @JSImport("proto3-json-serializer/build/src/enum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveEnumValueToNumber(enumType: Enum, enumValue: JSONValue): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEnumValueToNumber")(enumType.asInstanceOf[js.Any], enumValue.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def resolveEnumValueToString(enumType: Enum, enumValue: JSONValue): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEnumValueToString")(enumType.asInstanceOf[js.Any], enumValue.asInstanceOf[js.Any])).asInstanceOf[String | Double]
}
