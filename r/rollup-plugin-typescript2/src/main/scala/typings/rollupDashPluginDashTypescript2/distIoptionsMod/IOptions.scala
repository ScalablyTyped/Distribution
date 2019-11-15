package typings.rollupDashPluginDashTypescript2.distIoptionsMod

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
  var typescript: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof tsTypes */ js.Any
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
    typescript: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof tsTypes */ js.Any,
    useTsconfigDeclarationDir: Boolean,
    verbosity: Double,
    tsconfig: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(abortOnError = abortOnError, cacheRoot = cacheRoot, check = check, clean = clean, exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], objectHashIgnoreUnknownHack = objectHashIgnoreUnknownHack, rollupCommonJSResolveHack = rollupCommonJSResolveHack, sourceMapCallback = js.Any.fromFunction2(sourceMapCallback), transformers = transformers, tsconfigDefaults = tsconfigDefaults, tsconfigOverride = tsconfigOverride, typescript = typescript, useTsconfigDeclarationDir = useTsconfigDeclarationDir, verbosity = verbosity)
    if (tsconfig != null) __obj.updateDynamic("tsconfig")(tsconfig)
    __obj.asInstanceOf[IOptions]
  }
}

