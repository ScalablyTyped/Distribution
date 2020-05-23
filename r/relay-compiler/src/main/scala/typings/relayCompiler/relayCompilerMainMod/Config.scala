package typings.relayCompiler.relayCompilerMainMod

import typings.relayCompiler.relayFlowTypeTransformersMod.ScalarTypeMapping
import typings.relayCompiler.relayLanguagePluginInterfaceMod.PluginInitializer
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
    artifactDirectory: js.UndefOr[Null | String] = js.undefined,
    customScalars: ScalarTypeMapping = null,
    persistFunction: js.UndefOr[Null | String | (js.Function1[/* text */ String, js.Promise[String]])] = js.undefined,
    persistOutput: js.UndefOr[Null | String] = js.undefined,
    watch: js.UndefOr[Null | Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], noFutureProofEnums = noFutureProofEnums.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    if (!js.isUndefined(artifactDirectory)) __obj.updateDynamic("artifactDirectory")(artifactDirectory.asInstanceOf[js.Any])
    if (customScalars != null) __obj.updateDynamic("customScalars")(customScalars.asInstanceOf[js.Any])
    if (!js.isUndefined(persistFunction)) __obj.updateDynamic("persistFunction")(persistFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(persistOutput)) __obj.updateDynamic("persistOutput")(persistOutput.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

