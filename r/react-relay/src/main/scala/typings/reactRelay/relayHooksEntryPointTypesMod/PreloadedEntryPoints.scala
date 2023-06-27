package typings.reactRelay.relayHooksEntryPointTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  TEntryPoints extends std.Record<string, react-relay.react-relay/relay-hooks/EntryPointTypes.InternalEntryPointRepresentation<any, any, any, any, any> | undefined> ? {[ T in keyof TEntryPoints ]: react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadedEntryPoint<react-relay.react-relay/relay-hooks/helpers.GetEntryPointComponentFromEntryPoint<TEntryPoints[T]>>} : never
  }}}
  */
@js.native
trait PreloadedEntryPoints[TEntryPoints] extends StObject
