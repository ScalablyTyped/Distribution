package typings.reactRelay.relayHooksEntryPointTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  TPreloadedQueries extends std.Record<string, relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.OperationType> ? {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadedQuery<TPreloadedQueries[T], react-relay.react-relay/relay-hooks/EntryPointTypes.EnvironmentProviderOptions<std.Record<string, unknown>>>} : never
  }}}
  */
@js.native
trait PreloadedQueries[TPreloadedQueries] extends StObject
