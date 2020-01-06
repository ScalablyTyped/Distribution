package typings.rollupDashPluginDashTypescript2.distIoptionsMod

import typings.rollupDashPluginDashTypescript2.TypeoftsTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var abortOnError: Boolean
  var cacheRoot: String
  var check: Boolean
  var clean: Boolean
  var exclude: String | js.Array[String]
  var include: String | js.Array[String]
  var objectHashIgnoreUnknownHack: Boolean
  var rollupCommonJSResolveHack: Boolean
  var transformers: js.Array[TransformerFactoryCreator]
  var tsconfig: js.UndefOr[String] = js.undefined
  var tsconfigDefaults: js.Any
  var tsconfigOverride: js.Any
  var typescript: TypeoftsTypes
  var useTsconfigDeclarationDir: Boolean
  var verbosity: Double
  def sourceMapCallback(id: String, map: String): Unit
}

object IOptions {
  @scala.inline
  def apply(
    abortOnError: Boolean,
    cacheRoot: String,
    check: Boolean,
    clean: Boolean,
    exclude: String | js.Array[String],
    include: String | js.Array[String],
    objectHashIgnoreUnknownHack: Boolean,
    rollupCommonJSResolveHack: Boolean,
    sourceMapCallback: (String, String) => Unit,
    transformers: js.Array[TransformerFactoryCreator],
    tsconfigDefaults: js.Any,
    tsconfigOverride: js.Any,
    typescript: TypeoftsTypes,
    useTsconfigDeclarationDir: Boolean,
    verbosity: Double,
    tsconfig: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(abortOnError = abortOnError.asInstanceOf[js.Any], cacheRoot = cacheRoot.asInstanceOf[js.Any], check = check.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], objectHashIgnoreUnknownHack = objectHashIgnoreUnknownHack.asInstanceOf[js.Any], rollupCommonJSResolveHack = rollupCommonJSResolveHack.asInstanceOf[js.Any], sourceMapCallback = js.Any.fromFunction2(sourceMapCallback), transformers = transformers.asInstanceOf[js.Any], tsconfigDefaults = tsconfigDefaults.asInstanceOf[js.Any], tsconfigOverride = tsconfigOverride.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], useTsconfigDeclarationDir = useTsconfigDeclarationDir.asInstanceOf[js.Any], verbosity = verbosity.asInstanceOf[js.Any])
    if (tsconfig != null) __obj.updateDynamic("tsconfig")(tsconfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

