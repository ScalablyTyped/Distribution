package typings.rollupDashPluginDashDelete.rollupDashPluginDashDeleteMod

import typings.fastDashGlob.outTypesMod.FileSystemAdapter
import typings.fastDashGlob.outTypesMod.Pattern
import typings.globby.globbyMod.ExpandDirectoriesOption
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.del.delMod.Options {
  /**
    * Patterns of files and folders to be deleted.
    * @default []
    */
  val targets: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Outputs removed files and folders to console.
    * @default false
    */
  val verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    baseNameMatch: js.UndefOr[Boolean] = js.undefined,
    braceExpansion: js.UndefOr[Boolean] = js.undefined,
    caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined,
    concurrency: Int | Double = null,
    cwd: String = null,
    deep: Int | Double = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    expandDirectories: ExpandDirectoriesOption = null,
    extglob: js.UndefOr[Boolean] = js.undefined,
    followSymbolicLinks: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    fs: Partial[FileSystemAdapter] = null,
    gitignore: js.UndefOr[Boolean] = js.undefined,
    globstar: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[Pattern] = null,
    markDirectories: js.UndefOr[Boolean] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    onlyDirectories: js.UndefOr[Boolean] = js.undefined,
    onlyFiles: js.UndefOr[Boolean] = js.undefined,
    stats: js.UndefOr[Boolean] = js.undefined,
    suppressErrors: js.UndefOr[Boolean] = js.undefined,
    targets: String | js.Array[String] = null,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
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

