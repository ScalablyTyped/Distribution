package typings.standardVersion.mod

import typings.conventionalChangelogConfigSpec.`210SchemaJsonMod`.Config
import typings.node.Buffer
import typings.standardVersion.mod.Options.Scripts
import typings.standardVersion.mod.Options.Skip
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options_ extends Config {
  /**
    * @default
    * [
    *   'package-lock.json',
    *   'npm-shrinkwrap.json',
    *   'composer.lock'
    * ]
    */
  var bumpFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * Use a custom header when generating and updating changelog.
    *
    * @deprecated
    * This option will be removed in the next major version, please use `header`.
    */
  var changelogHeader: js.UndefOr[String] = js.native
  /**
    * Commit all staged changes, not just files affected by standard-version.
    *
    * @default
    * false
    */
  var commitAll: js.UndefOr[Boolean] = js.native
  /**
    * See the commands that running standard-version would run.
    *
    * @default
    * false
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * Is this the first release?
    *
    * @default
    * false
    */
  var firstRelease: js.UndefOr[Boolean] = js.native
  /**
    * Fallback to git tags for version, if no meta-information file is found (e.g.,
    * package.json).
    *
    * @default
    * true
    */
  var gitTagFallback: js.UndefOr[Boolean] = js.native
  /**
    * Read the CHANGELOG from this file.
    *
    * @default
    * 'CHANGELOG.md'
    */
  var infile: js.UndefOr[String | Buffer | URL | Double] = js.native
  /**
    * Commit message, replaces %s with new version.
    *
    * @deprecated
    * This option will be removed in the next major version, please use
    * `releaseCommitMessageFormat`.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Bypass pre-commit or commit-msg git hooks during the commit phase.
    *
    * @default
    * false
    */
  var noVerify: js.UndefOr[Boolean] = js.native
  /**
    * @default
    * [
    *   'package.json',
    *   'bower.json',
    *   'manifest.json',
    *   'composer.json'
    * ]
    */
  var packageFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only populate commits made under this path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Make a pre-release with optional option value to specify a tag id.
    */
  var prerelease: js.UndefOr[String] = js.native
  /**
    * Commit message guideline preset.
    *
    * @default
    * require.resolve('conventional-changelog-conventionalcommits')
    */
  var preset: js.UndefOr[String] = js.native
  /**
    * Specify the release type manually (like npm version <major|minor|patch>).
    */
  var releaseAs: js.UndefOr[String] = js.native
  /**
    * Provide scripts to execute for lifecycle events (prebump, precommit, etc.,).
    *
    * @default
    * {}
    */
  var scripts: js.UndefOr[Scripts] = js.native
  /**
    * Should the git commit and tag be signed?
    *
    * @default
    * false
    */
  var sign: js.UndefOr[Boolean] = js.native
  /**
    * Don't print logs and errors.
    *
    * @default
    * false
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Map of steps in the release process that should be skipped.
    *
    * @default
    * {}
    */
  var skip: js.UndefOr[Skip] = js.native
  /**
    * Set a custom prefix for the git tag to be created.
    *
    * @default
    * 'v'
    */
  var tagPrefix: js.UndefOr[String] = js.native
}

object Options_ {
  @scala.inline
  def apply(): Options_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_]
  }
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
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
    def setBumpFilesVarargs(value: String*): Self = this.set("bumpFiles", js.Array(value :_*))
    @scala.inline
    def setBumpFiles(value: js.Array[String]): Self = this.set("bumpFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBumpFiles: Self = this.set("bumpFiles", js.undefined)
    @scala.inline
    def setChangelogHeader(value: String): Self = this.set("changelogHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangelogHeader: Self = this.set("changelogHeader", js.undefined)
    @scala.inline
    def setCommitAll(value: Boolean): Self = this.set("commitAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitAll: Self = this.set("commitAll", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    @scala.inline
    def setFirstRelease(value: Boolean): Self = this.set("firstRelease", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstRelease: Self = this.set("firstRelease", js.undefined)
    @scala.inline
    def setGitTagFallback(value: Boolean): Self = this.set("gitTagFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitTagFallback: Self = this.set("gitTagFallback", js.undefined)
    @scala.inline
    def setInfile(value: String | Buffer | URL | Double): Self = this.set("infile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfile: Self = this.set("infile", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setNoVerify(value: Boolean): Self = this.set("noVerify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoVerify: Self = this.set("noVerify", js.undefined)
    @scala.inline
    def setPackageFilesVarargs(value: String*): Self = this.set("packageFiles", js.Array(value :_*))
    @scala.inline
    def setPackageFiles(value: js.Array[String]): Self = this.set("packageFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageFiles: Self = this.set("packageFiles", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPrerelease(value: String): Self = this.set("prerelease", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrerelease: Self = this.set("prerelease", js.undefined)
    @scala.inline
    def setPreset(value: String): Self = this.set("preset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    @scala.inline
    def setReleaseAs(value: String): Self = this.set("releaseAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseAs: Self = this.set("releaseAs", js.undefined)
    @scala.inline
    def setScripts(value: Scripts): Self = this.set("scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    @scala.inline
    def setSign(value: Boolean): Self = this.set("sign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSign: Self = this.set("sign", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSkip(value: Skip): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setTagPrefix(value: String): Self = this.set("tagPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagPrefix: Self = this.set("tagPrefix", js.undefined)
  }
  
}

