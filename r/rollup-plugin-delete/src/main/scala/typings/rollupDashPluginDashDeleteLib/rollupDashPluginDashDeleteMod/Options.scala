package typings
package rollupDashPluginDashDeleteLib.rollupDashPluginDashDeleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends delLib.delMod.Options {
  /**
    * Patterns of files and folders to be deleted.
    * @default []
    */
  val targets: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Outputs removed files and folders to console.
    * @default false
    */
  val verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    absolute: js.UndefOr[scala.Boolean] = js.undefined,
    baseNameMatch: js.UndefOr[scala.Boolean] = js.undefined,
    braceExpansion: js.UndefOr[scala.Boolean] = js.undefined,
    caseSensitiveMatch: js.UndefOr[scala.Boolean] = js.undefined,
    concurrency: scala.Int | scala.Double = null,
    cwd: java.lang.String = null,
    deep: scala.Int | scala.Double = null,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    dryRun: js.UndefOr[scala.Boolean] = js.undefined,
    expandDirectories: globbyLib.globbyMod.ExpandDirectoriesOption = null,
    extglob: js.UndefOr[scala.Boolean] = js.undefined,
    followSymbolicLinks: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    fs: stdLib.Partial[fastDashGlobLib.outTypesMod.FileSystemAdapter] = null,
    gitignore: js.UndefOr[scala.Boolean] = js.undefined,
    globstar: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: js.Array[fastDashGlobLib.outTypesMod.Pattern] = null,
    markDirectories: js.UndefOr[scala.Boolean] = js.undefined,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    onlyDirectories: js.UndefOr[scala.Boolean] = js.undefined,
    onlyFiles: js.UndefOr[scala.Boolean] = js.undefined,
    stats: js.UndefOr[scala.Boolean] = js.undefined,
    suppressErrors: js.UndefOr[scala.Boolean] = js.undefined,
    targets: java.lang.String | js.Array[java.lang.String] = null,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[scala.Boolean] = js.undefined,
    unique: js.UndefOr[scala.Boolean] = js.undefined,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (!js.isUndefined(baseNameMatch)) __obj.updateDynamic("baseNameMatch")(baseNameMatch)
    if (!js.isUndefined(braceExpansion)) __obj.updateDynamic("braceExpansion")(braceExpansion)
    if (!js.isUndefined(caseSensitiveMatch)) __obj.updateDynamic("caseSensitiveMatch")(caseSensitiveMatch)
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (expandDirectories != null) __obj.updateDynamic("expandDirectories")(expandDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(extglob)) __obj.updateDynamic("extglob")(extglob)
    if (!js.isUndefined(followSymbolicLinks)) __obj.updateDynamic("followSymbolicLinks")(followSymbolicLinks)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (!js.isUndefined(gitignore)) __obj.updateDynamic("gitignore")(gitignore)
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (!js.isUndefined(markDirectories)) __obj.updateDynamic("markDirectories")(markDirectories)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (!js.isUndefined(onlyDirectories)) __obj.updateDynamic("onlyDirectories")(onlyDirectories)
    if (!js.isUndefined(onlyFiles)) __obj.updateDynamic("onlyFiles")(onlyFiles)
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats)
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors)
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (!js.isUndefined(throwErrorOnBrokenSymbolicLink)) __obj.updateDynamic("throwErrorOnBrokenSymbolicLink")(throwErrorOnBrokenSymbolicLink)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

