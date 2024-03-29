package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import typings.std.Pick
import typings.std.Record
import typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.^
import typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.doc.builders.Doc
import typings.storybookComponents.anon._empty
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

type BuiltInParser = js.Function2[/* text */ String, /* options */ js.UndefOr[Any], AST]

type CustomParser = js.Function3[/* text */ String, /* parsers */ BuiltInParsers, /* options */ Options, AST]

type Doc_ = Doc

type FastPath[T] = AstPath[T]

type LiteralUnion[T /* <: U */, U] = T | ((Pick[U, scala.Nothing]) & _empty)

/* Rewritten from type alias, can be one of: 
  - typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.IntSupportOption
  - typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.IntArraySupportOption
  - typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.BooleanSupportOption
  - typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.BooleanArraySupportOption
  - typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.ChoiceSupportOption[scala.Any]
  - typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.PathSupportOption
  - typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.PathArraySupportOption
*/
type SupportOption = _SupportOption | ChoiceSupportOption[Any]

type SupportOptions = Record[String, SupportOption]
