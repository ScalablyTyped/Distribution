package typings.relayDashCompiler.libBinRelayCompilerMainMod

import typings.relayDashCompiler.libLanguageJavascriptRelayFlowTypeTransformersMod.ScalarTypeMapping
import typings.relayDashCompiler.libLanguageRelayLanguagePluginInterfaceMod.PluginInitializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var artifactDirectory: js.UndefOr[String | Null] = js.undefined
  var customScalars: js.UndefOr[ScalarTypeMapping] = js.undefined
  var exclude: js.Array[String]
  var extensions: js.Array[String]
  var include: js.Array[String]
  var language: String | PluginInitializer
  var noFutureProofEnums: Boolean
  var persistFunction: js.UndefOr[String | (js.Function1[/* text */ String, js.Promise[String]]) | Null] = js.undefined
  var persistOutput: js.UndefOr[String | Null] = js.undefined
  var quiet: Boolean
  var schema: String
  var src: String
  var validate: Boolean
  var verbose: Boolean
  var watch: js.UndefOr[Boolean | Null] = js.undefined
  var watchman: Boolean
}

object Config {
  @scala.inline
  def apply(
    exclude: js.Array[String],
    extensions: js.Array[String],
    include: js.Array[String],
    language: String | PluginInitializer,
    noFutureProofEnums: Boolean,
    quiet: Boolean,
    schema: String,
    src: String,
    validate: Boolean,
    verbose: Boolean,
    watchman: Boolean,
    artifactDirectory: String = null,
    customScalars: ScalarTypeMapping = null,
    persistFunction: String | (js.Function1[/* text */ String, js.Promise[String]]) = null,
    persistOutput: String = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal(exclude = exclude, extensions = extensions, include = include, language = language.asInstanceOf[js.Any], noFutureProofEnums = noFutureProofEnums, quiet = quiet, schema = schema, src = src, validate = validate, verbose = verbose, watchman = watchman)
    if (artifactDirectory != null) __obj.updateDynamic("artifactDirectory")(artifactDirectory)
    if (customScalars != null) __obj.updateDynamic("customScalars")(customScalars)
    if (persistFunction != null) __obj.updateDynamic("persistFunction")(persistFunction.asInstanceOf[js.Any])
    if (persistOutput != null) __obj.updateDynamic("persistOutput")(persistOutput)
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[Config]
  }
}

