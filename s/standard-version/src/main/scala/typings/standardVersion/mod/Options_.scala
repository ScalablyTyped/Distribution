package typings.standardVersion.mod

import typings.conventionalChangelogConfigSpec.`210SchemaJsonMod`.Config
import typings.conventionalChangelogConfigSpec.`210SchemaJsonMod`.Config.Type
import typings.node.Buffer
import typings.standardVersion.mod.Options.Scripts
import typings.standardVersion.mod.Options.Skip
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options_ extends Config {
  /**
    * @default
    * [
    *   'package-lock.json',
    *   'npm-shrinkwrap.json',
    *   'composer.lock'
    * ]
    */
  var bumpFiles: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Use a custom header when generating and updating changelog.
    *
    * @deprecated
    * This option will be removed in the next major version, please use `header`.
    */
  var changelogHeader: js.UndefOr[String] = js.undefined
  /**
    * Commit all staged changes, not just files affected by standard-version.
    *
    * @default
    * false
    */
  var commitAll: js.UndefOr[Boolean] = js.undefined
  /**
    * See the commands that running standard-version would run.
    *
    * @default
    * false
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Is this the first release?
    *
    * @default
    * false
    */
  var firstRelease: js.UndefOr[Boolean] = js.undefined
  /**
    * Fallback to git tags for version, if no meta-information file is found (e.g.,
    * package.json).
    *
    * @default
    * true
    */
  var gitTagFallback: js.UndefOr[Boolean] = js.undefined
  /**
    * Read the CHANGELOG from this file.
    *
    * @default
    * 'CHANGELOG.md'
    */
  var infile: js.UndefOr[String | Buffer | URL | Double] = js.undefined
  /**
    * Commit message, replaces %s with new version.
    *
    * @deprecated
    * This option will be removed in the next major version, please use
    * `releaseCommitMessageFormat`.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * Bypass pre-commit or commit-msg git hooks during the commit phase.
    *
    * @default
    * false
    */
  var noVerify: js.UndefOr[Boolean] = js.undefined
  /**
    * @default
    * [
    *   'package.json',
    *   'bower.json',
    *   'manifest.json',
    *   'composer.json'
    * ]
    */
  var packageFiles: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Only populate commits made under this path.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Make a pre-release with optional option value to specify a tag id.
    */
  var prerelease: js.UndefOr[String] = js.undefined
  /**
    * Commit message guideline preset.
    *
    * @default
    * require.resolve('conventional-changelog-conventionalcommits')
    */
  var preset: js.UndefOr[String] = js.undefined
  /**
    * Specify the release type manually (like npm version <major|minor|patch>).
    */
  var releaseAs: js.UndefOr[String] = js.undefined
  /**
    * Provide scripts to execute for lifecycle events (prebump, precommit, etc.,).
    *
    * @default
    * {}
    */
  var scripts: js.UndefOr[Scripts] = js.undefined
  /**
    * Should the git commit and tag be signed?
    *
    * @default
    * false
    */
  var sign: js.UndefOr[Boolean] = js.undefined
  /**
    * Don't print logs and errors.
    *
    * @default
    * false
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Map of steps in the release process that should be skipped.
    *
    * @default
    * {}
    */
  var skip: js.UndefOr[Skip] = js.undefined
  /**
    * Set a custom prefix for the git tag to be created.
    *
    * @default
    * 'v'
    */
  var tagPrefix: js.UndefOr[String] = js.undefined
}

object Options_ {
  @scala.inline
  def apply(
    bumpFiles: js.Array[String] = null,
    changelogHeader: String = null,
    commitAll: js.UndefOr[Boolean] = js.undefined,
    commitUrlFormat: String = null,
    compareUrlFormat: String = null,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    firstRelease: js.UndefOr[Boolean] = js.undefined,
    gitTagFallback: js.UndefOr[Boolean] = js.undefined,
    header: String = null,
    infile: String | Buffer | URL | Double = null,
    issuePrefixes: js.Array[String] = null,
    issueUrlFormat: String = null,
    message: String = null,
    noVerify: js.UndefOr[Boolean] = js.undefined,
    packageFiles: js.Array[String] = null,
    path: String = null,
    preMajor: js.UndefOr[Boolean] = js.undefined,
    prerelease: String = null,
    preset: String = null,
    releaseAs: String = null,
    releaseCommitMessageFormat: String = null,
    scripts: Scripts = null,
    sign: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    skip: Skip = null,
    tagPrefix: String = null,
    types: js.Array[Type] = null,
    userUrlFormat: String = null
  ): Options_ = {
    val __obj = js.Dynamic.literal()
    if (bumpFiles != null) __obj.updateDynamic("bumpFiles")(bumpFiles.asInstanceOf[js.Any])
    if (changelogHeader != null) __obj.updateDynamic("changelogHeader")(changelogHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(commitAll)) __obj.updateDynamic("commitAll")(commitAll.asInstanceOf[js.Any])
    if (commitUrlFormat != null) __obj.updateDynamic("commitUrlFormat")(commitUrlFormat.asInstanceOf[js.Any])
    if (compareUrlFormat != null) __obj.updateDynamic("compareUrlFormat")(compareUrlFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(firstRelease)) __obj.updateDynamic("firstRelease")(firstRelease.asInstanceOf[js.Any])
    if (!js.isUndefined(gitTagFallback)) __obj.updateDynamic("gitTagFallback")(gitTagFallback.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (infile != null) __obj.updateDynamic("infile")(infile.asInstanceOf[js.Any])
    if (issuePrefixes != null) __obj.updateDynamic("issuePrefixes")(issuePrefixes.asInstanceOf[js.Any])
    if (issueUrlFormat != null) __obj.updateDynamic("issueUrlFormat")(issueUrlFormat.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(noVerify)) __obj.updateDynamic("noVerify")(noVerify.asInstanceOf[js.Any])
    if (packageFiles != null) __obj.updateDynamic("packageFiles")(packageFiles.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(preMajor)) __obj.updateDynamic("preMajor")(preMajor.asInstanceOf[js.Any])
    if (prerelease != null) __obj.updateDynamic("prerelease")(prerelease.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (releaseAs != null) __obj.updateDynamic("releaseAs")(releaseAs.asInstanceOf[js.Any])
    if (releaseCommitMessageFormat != null) __obj.updateDynamic("releaseCommitMessageFormat")(releaseCommitMessageFormat.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (!js.isUndefined(sign)) __obj.updateDynamic("sign")(sign.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (tagPrefix != null) __obj.updateDynamic("tagPrefix")(tagPrefix.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (userUrlFormat != null) __obj.updateDynamic("userUrlFormat")(userUrlFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options_]
  }
}

