package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import typings.std.Record
import typings.stencilCore.stencilCoreStrings.buildFinish
import typings.stencilCore.stencilCoreStrings.buildLog
import typings.stencilCore.stencilCoreStrings.buildNoChange
import typings.stencilCore.stencilCoreStrings.buildStart
import typings.stencilCore.stencilCoreStrings.debug
import typings.stencilCore.stencilCoreStrings.dirAdd
import typings.stencilCore.stencilCoreStrings.dirDelete
import typings.stencilCore.stencilCoreStrings.error
import typings.stencilCore.stencilCoreStrings.fileAdd
import typings.stencilCore.stencilCoreStrings.fileDelete
import typings.stencilCore.stencilCoreStrings.fileUpdate
import typings.stencilCore.stencilCoreStrings.fsChange
import typings.stencilCore.stencilCoreStrings.info
import typings.stencilCore.stencilCoreStrings.warn
import typings.stencilCore.stencilPublicCompilerMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def LOG_LEVELS: js.Tuple4[debug, info, warn, error] = ^.asInstanceOf[js.Dynamic].selectDynamic("LOG_LEVELS").asInstanceOf[js.Tuple4[debug, info, warn, error]]

type AutoprefixerOptions = js.Object

type BuildOnEventRemove = js.Function0[Boolean]

type BuildResultsComponentGraph = StringDictionary[js.Array[String]]

/* Rewritten from type alias, can be one of: 
  - typings.stencilCore.stencilCoreStrings.latest
  - typings.stencilCore.stencilCoreStrings.esnext
  - typings.stencilCore.stencilCoreStrings.es2020
  - typings.stencilCore.stencilCoreStrings.es2019
  - typings.stencilCore.stencilCoreStrings.es2018
  - typings.stencilCore.stencilCoreStrings.es2017
  - typings.stencilCore.stencilCoreStrings.es2015
  - typings.stencilCore.stencilCoreStrings.es5
  - java.lang.String
  - scala.Unit
*/
type CompileTarget = js.UndefOr[_CompileTarget | String]

type CompilerEventBuildFinish = buildFinish

type CompilerEventBuildLog = buildLog

type CompilerEventBuildNoChange = buildNoChange

type CompilerEventBuildStart = buildStart

type CompilerEventDirAdd = dirAdd

type CompilerEventDirDelete = dirDelete

type CompilerEventFileAdd = fileAdd

type CompilerEventFileDelete = fileDelete

type CompilerEventFileUpdate = fileUpdate

type CompilerEventFsChange = fsChange

type CompilerEventName = CompilerEventFsChange | CompilerEventFileUpdate | CompilerEventFileAdd | CompilerEventFileDelete | CompilerEventDirAdd | CompilerEventDirDelete | CompilerEventBuildStart | CompilerEventBuildFinish | CompilerEventBuildNoChange | CompilerEventBuildLog

type CompilerFileWatcherCallback = js.Function2[/* fileName */ String, /* eventKind */ CompilerFileWatcherEvent, Unit]

type CompilerFileWatcherEvent = CompilerEventFileAdd | CompilerEventFileDelete | CompilerEventFileUpdate | CompilerEventDirAdd | CompilerEventDirDelete

/**
  * A 'loose' type useful for wrapping an incomplete / possible malformed
  * object as we work on getting it comply with a particular Interface T.
  *
  * Example:
  *
  * ```ts
  * interface Foo {
  *   bar: string
  * }
  *
  * function validateFoo(foo: Loose<Foo>): Foo {
  *   let validatedFoo = {
  *     ...foo,
  *     bar: foo.bar || DEFAULT_BAR
  *   }
  *
  *   return validatedFoo
  * }
  * ```
  *
  * Use this when you need to take user input or something from some other part
  * of the world that we don't control and transform it into something
  * conforming to a given interface. For best results, pair with a validation
  * function as shown in the example.
  */
type Loose[T /* <: js.Object */] = (Record[String, Any]) & Partial[T]

/* Rewritten from type alias, can be one of: 
  - typings.stencilCore.stencilCoreStrings.hmr
  - typings.stencilCore.stencilCoreStrings.pageReload
  - scala.Null
*/
type PageReloadStrategy = _PageReloadStrategy | Null

/**
  * Helper type to strip optional markers from keys in a type, while preserving other type information for the key.
  * This type takes a union of keys, K, in type T to allow for the type T to be gradually updated.
  *
  * ```typescript
  * type Foo { bar?: number, baz?: string }
  * type ReqFieldFoo = RequireFields<Foo, 'bar'>; // { bar: number, baz?: string }
  * ```
  */
type RequireFields[T, K /* <: /* keyof T */ String */] = T & typings.stencilCore.stencilCoreStrings.RequireFields & TopLevel[T]

type UnvalidatedConfig = Loose[Config]
