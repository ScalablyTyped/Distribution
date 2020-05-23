package typings.relayCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayLanguagePluginInterfaceMod {
  type FormatModule = js.Function1[/* options */ typings.relayCompiler.anon.ConcreteText, java.lang.String]
  type GraphQLTagFinder = js.Function2[
    /* text */ java.lang.String, 
    /* filePath */ java.lang.String, 
    js.Array[typings.relayCompiler.relayLanguagePluginInterfaceMod.GraphQLTag]
  ]
  type PluginInitializer = js.Function0[typings.relayCompiler.relayLanguagePluginInterfaceMod.PluginInterface]
}
