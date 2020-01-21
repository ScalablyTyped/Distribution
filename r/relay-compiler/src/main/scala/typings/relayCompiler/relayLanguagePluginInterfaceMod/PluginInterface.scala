package typings.relayCompiler.relayLanguagePluginInterfaceMod

import typings.relayCompiler.AnonConcreteText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginInterface extends js.Object {
  @JSName("findGraphQLTags")
  var findGraphQLTags_Original: GraphQLTagFinder = js.native
  @JSName("formatModule")
  var formatModule_Original: FormatModule = js.native
  var inputExtensions: js.Array[String] = js.native
  var outputExtension: String = js.native
  var typeGenerator: TypeGenerator = js.native
  def findGraphQLTags(text: String, filePath: String): js.Array[GraphQLTag] = js.native
  def formatModule(options: AnonConcreteText): String = js.native
}

