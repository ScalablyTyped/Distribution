package typings.reactDashNativeDashJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashJoiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.reactDashNativeDashJoi.Anon_Context
  import typings.reactDashNativeDashJoi.Anon_Key
  import typings.std.Error
  import typings.std.Partial
  import typings.std.Record

  type ExtensionBoundSchema = Schema with Anon_Context
  type LanguageOptions = String | Boolean | Null | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-joi.react-native-joi.LanguageOptions */ js.Object
  ])
  type LanguageRootOptions = Anon_Key with (Partial[Record[Types, LanguageOptions]])
  type LazySchema = AnySchema
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.AnySchema
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.ArraySchema
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.AlternativesSchema
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.BinarySchema
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.BooleanSchema
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.DateSchema
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.FunctionSchema
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.NumberSchema
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.ObjectSchema
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.StringSchema
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.LazySchema
  */
  type Schema = _Schema | LazySchema
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.Schema
    - typings.reactDashNativeDashJoi.reactDashNativeDashJoiMod.SchemaMap
  */
  type SchemaLike = _SchemaLike | String | Double | Boolean | js.Object | Null | LazySchema
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[ValidationErrorItem], 
    String | ValidationErrorItem | js.Array[ValidationErrorItem] | Error
  ]
}
