package typings.reactRelay.relayHooksEntryPointTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  TEntryPointComponent extends react-relay.react-relay/relay-hooks/EntryPointTypes.EntryPointComponent<infer TPreloadedQueries, infer TNestedEntryPoints, infer TRuntimeProps, infer TExtraProps> ? std.Readonly<{  dispose :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.DisposeFn,   entryPoints :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadedEntryPoints<TNestedEntryPoints>,   extraProps :TExtraProps, getComponent (): TEntryPointComponent,   isDisposed :boolean,   queries :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadedQueries<TPreloadedQueries>,   rootModuleID :string}> : never
  }}}
  */
@js.native
trait PreloadedEntryPoint[TEntryPointComponent] extends StObject
