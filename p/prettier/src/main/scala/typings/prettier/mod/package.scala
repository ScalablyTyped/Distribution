package typings.prettier.mod

import typings.prettier.anon.Length
import typings.prettier.anon._empty
import typings.prettier.mod.^
import typings.prettier.mod.doc.builders.Doc
import typings.prettier.prettierBooleans.`true`
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def check(source: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def check(source: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def clearConfigCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearConfigCache")().asInstanceOf[Unit]

inline def format(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(source.asInstanceOf[js.Any]).asInstanceOf[String]
inline def format(source: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def formatWithCursor(source: String, options: CursorOptions): CursorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWithCursor")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CursorResult]

inline def getSupportInfo(): SupportInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportInfo")().asInstanceOf[SupportInfo]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type AST = Any

// A union of the properties of the given object that are arrays.
type ArrayProperties[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: std.NonNullable<T[K]> extends std.Array<any>? K : never}[keyof T] */ js.Any

type BuiltInParser = js.Function2[/* text */ String, /* options */ js.UndefOr[Any], AST]

type CallCallback[T, U] = js.Function3[/* path */ AstPath[T], /* index */ Double, /* value */ Any, U]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.Array<any> ? prettier.prettier.IndexProperties<T> : keyof T
  }}}
  */
type CallProperties[T] = Double

type CustomParser = js.Function3[/* text */ String, /* parsers */ BuiltInParsers, /* options */ Options, AST]

type Doc_ = Doc

type EachCallback[T] = js.Function3[/* path */ AstPath[ArrayElement[T]], /* index */ Double, /* value */ Any, Unit]

type FastPath[T] = AstPath[T]

// A union of the properties of the given array T that can be used to index it.
// If the array is a tuple, then that's going to be the explicit indices of the
// array, otherwise it's going to just be number.
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  prettier.prettier.IsTuple<T> extends true ? std.Exclude<std.Partial<T>['length'], T['length']> : number
  }}}
  */
type IndexProperties[T /* <: Length */] = Double

// Determines if an object T is an array like string[] (in which case this
// evaluates to false) or a tuple like [string] (in which case this evaluates to
// true).
// eslint-disable-next-line @typescript-eslint/no-unused-vars
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends [] ? true : T extends [infer First, ...infer Remain] ? prettier.prettier.IsTuple<Remain> : false
  }}}
  */
type IsTuple[T] = `true`

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.Array<any> ? prettier.prettier.IndexProperties<T> : prettier.prettier.ArrayProperties<T>
  }}}
  */
type IterProperties[T] = Double

type LiteralUnion[T /* <: U */, U] = T | ((Pick[U, scala.Nothing]) & _empty)

type MapCallback[T, U] = js.Function3[/* path */ AstPath[ArrayElement[T]], /* index */ Double, /* value */ Any, U]

/* Rewritten from type alias, can be one of: 
  - typings.prettier.mod.IntSupportOption
  - typings.prettier.mod.IntArraySupportOption
  - typings.prettier.mod.StringSupportOption
  - typings.prettier.mod.StringArraySupportOption
  - typings.prettier.mod.BooleanSupportOption
  - typings.prettier.mod.BooleanArraySupportOption
  - typings.prettier.mod.ChoiceSupportOption[scala.Any]
  - typings.prettier.mod.PathSupportOption
  - typings.prettier.mod.PathArraySupportOption
*/
type SupportOption = _SupportOption | ChoiceSupportOption[Any]

type SupportOptions = Record[String, SupportOption]
