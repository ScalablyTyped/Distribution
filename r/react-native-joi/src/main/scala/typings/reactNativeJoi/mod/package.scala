package typings.reactNativeJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtensionBoundSchema = typings.reactNativeJoi.mod.Schema with typings.reactNativeJoi.AnonCreateError
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-joi.react-native-joi.LanguageOptions */ js.Object
  ])
  type LazySchema = typings.reactNativeJoi.mod.AnySchema
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeJoi.mod.AnySchema
    - typings.reactNativeJoi.mod.ArraySchema
    - typings.reactNativeJoi.mod.AlternativesSchema
    - typings.reactNativeJoi.mod.BinarySchema
    - typings.reactNativeJoi.mod.BooleanSchema
    - typings.reactNativeJoi.mod.DateSchema
    - typings.reactNativeJoi.mod.FunctionSchema
    - typings.reactNativeJoi.mod.NumberSchema
    - typings.reactNativeJoi.mod.ObjectSchema
    - typings.reactNativeJoi.mod.StringSchema
    - typings.reactNativeJoi.mod.LazySchema
  */
  type Schema = typings.reactNativeJoi.mod._Schema | typings.reactNativeJoi.mod.LazySchema
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typings.reactNativeJoi.mod.Schema
    - typings.reactNativeJoi.mod.SchemaMap
  */
  type SchemaLike = typings.reactNativeJoi.mod._SchemaLike | java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | typings.reactNativeJoi.mod.LazySchema
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typings.reactNativeJoi.mod.ValidationErrorItem], 
    java.lang.String | typings.reactNativeJoi.mod.ValidationErrorItem | js.Array[typings.reactNativeJoi.mod.ValidationErrorItem] | typings.std.Error
  ]
}
