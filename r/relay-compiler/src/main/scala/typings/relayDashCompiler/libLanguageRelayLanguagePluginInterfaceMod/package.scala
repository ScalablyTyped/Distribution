package typings.relayDashCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLanguageRelayLanguagePluginInterfaceMod {
  import typings.relayDashCompiler.Anon_ConcreteText

  type FormatModule = js.Function1[/* options */ Anon_ConcreteText, String]
  type GraphQLTagFinder = js.Function2[/* text */ String, /* filePath */ String, js.Array[GraphQLTag]]
  type PluginInitializer = js.Function0[PluginInterface]
}
