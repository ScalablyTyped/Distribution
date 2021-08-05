package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def check(source: java.lang.String): scala.Boolean = typings.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("check")(source.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def check(source: java.lang.String, options: typings.prettier.mod.Options): scala.Boolean = (typings.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("check")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def clearConfigCache(): scala.Unit = typings.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearConfigCache")().asInstanceOf[scala.Unit]

inline def format(source: java.lang.String): java.lang.String = typings.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(source.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def format(source: java.lang.String, options: typings.prettier.mod.Options): java.lang.String = (typings.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def formatWithCursor(source: java.lang.String, options: typings.prettier.mod.CursorOptions): typings.prettier.mod.CursorResult = (typings.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatWithCursor")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.prettier.mod.CursorResult]

inline def getSupportInfo(): typings.prettier.mod.SupportInfo = typings.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSupportInfo")().asInstanceOf[typings.prettier.mod.SupportInfo]

inline def version: java.lang.String = typings.prettier.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]

type AST = js.Any

type BuiltInParser = js.Function2[
/* text */ java.lang.String, 
/* options */ js.UndefOr[js.Any], 
typings.prettier.mod.AST]

type CustomParser = js.Function3[
/* text */ java.lang.String, 
/* parsers */ typings.prettier.mod.BuiltInParsers, 
/* options */ typings.prettier.mod.Options, 
typings.prettier.mod.AST]

type Doc_ = typings.prettier.mod.doc.builders.Doc

type LiteralUnion[T /* <: U */, U] = T | ((typings.std.Pick[U, scala.Nothing]) & typings.prettier.anon._empty)

/* Rewritten from type alias, can be one of: 
  - typings.prettier.mod.IntSupportOption
  - typings.prettier.mod.IntArraySupportOption
  - typings.prettier.mod.BooleanSupportOption
  - typings.prettier.mod.BooleanArraySupportOption
  - typings.prettier.mod.ChoiceSupportOption[js.Any]
  - typings.prettier.mod.PathSupportOption
  - typings.prettier.mod.PathArraySupportOption
*/
type SupportOption = typings.prettier.mod._SupportOption | typings.prettier.mod.ChoiceSupportOption[js.Any]

type SupportOptions = typings.std.Record[java.lang.String, typings.prettier.mod.SupportOption]
