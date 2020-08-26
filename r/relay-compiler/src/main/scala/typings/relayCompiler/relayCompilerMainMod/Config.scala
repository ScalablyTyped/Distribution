package typings.relayCompiler.relayCompilerMainMod

import typings.relayCompiler.relayFlowTypeTransformersMod.ScalarTypeMapping
import typings.relayCompiler.relayLanguagePluginInterfaceMod.PluginInitializer
import typings.relayCompiler.relayLanguagePluginInterfaceMod.PluginInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var artifactDirectory: js.UndefOr[String | Null] = js.native
  var customScalars: js.UndefOr[ScalarTypeMapping] = js.native
  var exclude: js.Array[String] = js.native
  var extensions: js.Array[String] = js.native
  var include: js.Array[String] = js.native
  var language: String | PluginInitializer = js.native
  var noFutureProofEnums: Boolean = js.native
  var persistFunction: js.UndefOr[String | (js.Function1[/* text */ String, js.Promise[String]]) | Null] = js.native
  var persistOutput: js.UndefOr[String | Null] = js.native
  var quiet: Boolean = js.native
  var schema: String = js.native
  var src: String = js.native
  var validate: Boolean = js.native
  var verbose: Boolean = js.native
  var watch: js.UndefOr[Boolean | Null] = js.native
  var watchman: Boolean = js.native
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
    watchman: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], noFutureProofEnums = noFutureProofEnums.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageFunction0(value: () => PluginInterface): Self = this.set("language", js.Any.fromFunction0(value))
    @scala.inline
    def setLanguage(value: String | PluginInitializer): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoFutureProofEnums(value: Boolean): Self = this.set("noFutureProofEnums", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchman(value: Boolean): Self = this.set("watchman", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactDirectory(value: String): Self = this.set("artifactDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifactDirectory: Self = this.set("artifactDirectory", js.undefined)
    @scala.inline
    def setArtifactDirectoryNull: Self = this.set("artifactDirectory", null)
    @scala.inline
    def setCustomScalars(value: ScalarTypeMapping): Self = this.set("customScalars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomScalars: Self = this.set("customScalars", js.undefined)
    @scala.inline
    def setPersistFunctionFunction1(value: /* text */ String => js.Promise[String]): Self = this.set("persistFunction", js.Any.fromFunction1(value))
    @scala.inline
    def setPersistFunction(value: String | (js.Function1[/* text */ String, js.Promise[String]])): Self = this.set("persistFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistFunction: Self = this.set("persistFunction", js.undefined)
    @scala.inline
    def setPersistFunctionNull: Self = this.set("persistFunction", null)
    @scala.inline
    def setPersistOutput(value: String): Self = this.set("persistOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistOutput: Self = this.set("persistOutput", js.undefined)
    @scala.inline
    def setPersistOutputNull: Self = this.set("persistOutput", null)
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
    @scala.inline
    def setWatchNull: Self = this.set("watch", null)
  }
  
}

