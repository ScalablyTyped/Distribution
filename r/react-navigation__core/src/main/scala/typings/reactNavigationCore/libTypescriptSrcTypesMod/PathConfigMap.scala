package typings.reactNavigationCore.libTypescriptSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ RouteName in keyof ParamList ]:? std.NonNullable<ParamList[RouteName]> extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigatorScreenParams<infer T, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>>? string | @react-navigation/core.@react-navigation/core/lib/typescript/src/types.PathConfig<T> : string | / * Inlined std.Omit<@react-navigation/core.@react-navigation/core/lib/typescript/src/types.PathConfig<{}>, 'screens' | 'initialRouteName'> * /
{  parse :std.Record<string, (value : string): any> | undefined | undefined,   path :string | undefined | undefined,   stringify :std.Record<string, (value : any): string> | undefined | undefined,   exact :boolean | undefined | undefined}}
  }}}
  */
@js.native
trait PathConfigMap[ParamList /* <: js.Object */] extends StObject
