package typings.prettier.mod

import typings.prettier.anon.Length
import typings.prettier.anon._empty
import typings.prettier.mod.^
import typings.prettier.mod.doc.builders.Doc
import typings.std.Exclude
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

// The type of elements that make up the given array T.
type ArrayElement[T] = Any

// A union of the properties of the given object that are arrays.
type ArrayProperties[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: std.NonNullable<T[K]> extends std.Array<any>? K : never}[keyof T] */ js.Any

type BuiltInParser = js.Function2[/* text */ String, /* options */ js.UndefOr[Any], AST]

type CallCallback[T, U] = js.Function3[/* path */ AstPath[T], /* index */ Double, /* value */ Any, U]

type CallProperties[T] = (/* keyof T */ String) | IndexProperties[T]

type CustomParser = js.Function3[/* text */ String, /* parsers */ BuiltInParsers, /* options */ Options, AST]

type Doc_ = Doc

type EachCallback[T] = js.Function3[/* path */ AstPath[ArrayElement[T]], /* index */ Double, /* value */ Any, Unit]

type FastPath[T] = AstPath[T]

// A union of the properties of the given array T that can be used to index it.
// If the array is a tuple, then that's going to be the explicit indices of the
// array, otherwise it's going to just be number.
type IndexProperties[T /* <: Length */] = Double | (Exclude[
/* import warning: importer.ImportType#apply Failed type conversion: std.Partial<T>['length'] */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any])

// Effectively performing T[P], except that it's telling TypeScript that it's
// safe to do this for tuples, arrays, or objects.
type IndexValue[T, P] = /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any

type IterProperties[T] = ArrayProperties[T] | IndexProperties[T]

type LiteralUnion[T /* <: U */, U] = T | ((Pick[U, scala.Nothing]) & _empty)

type MapCallback[T, U] = js.Function3[/* path */ AstPath[ArrayElement[T]], /* index */ Double, /* value */ Any, U]

/* Rewritten from type alias, can be one of: 
  - typings.prettier.mod.IntSupportOption
  - typings.prettier.mod.IntArraySupportOption
  - typings.prettier.mod.BooleanSupportOption
  - typings.prettier.mod.BooleanArraySupportOption
  - typings.prettier.mod.ChoiceSupportOption[scala.Any]
  - typings.prettier.mod.PathSupportOption
  - typings.prettier.mod.PathArraySupportOption
*/
type SupportOption = _SupportOption | ChoiceSupportOption[Any]

type SupportOptions = Record[String, SupportOption]
