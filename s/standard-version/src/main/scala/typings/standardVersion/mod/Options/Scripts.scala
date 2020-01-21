package typings.standardVersion.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scripts extends js.Object {
  /**
    * Executed after the version is bumped.
    */
  var postbump: js.UndefOr[String] = js.undefined
  /**
    * Executes after the CHANGELOG is generated.
    */
  var postchangelog: js.UndefOr[String] = js.undefined
  /**
    * Called after the commit step.
    */
  var postcommit: js.UndefOr[String] = js.undefined
  /**
    * Called after the tagging step.
    */
  var posttag: js.UndefOr[String] = js.undefined
  /**
    * Executed before the version is bumped. If the `prebump` script returns a
    * version #, it will be used rather than the version calculated by
    * `standard-version`.
    */
  var prebump: js.UndefOr[String] = js.undefined
  /**
    * Executes before the CHANGELOG is generated.
    */
  var prechangelog: js.UndefOr[String] = js.undefined
  /**
    * Called before the commit step.
    */
  var precommit: js.UndefOr[String] = js.undefined
  /**
    * Executed before anything happens. If the `prerelease` script returns a
    * non-zero exit code, versioning will be aborted, but it has no other effect on
    * the process.
    */
  var prerelease: js.UndefOr[String] = js.undefined
  /**
    * Called before the tagging step.
    */
  var pretag: js.UndefOr[String] = js.undefined
}

object Scripts {
  @scala.inline
  def apply(
    postbump: String = null,
    postchangelog: String = null,
    postcommit: String = null,
    posttag: String = null,
    prebump: String = null,
    prechangelog: String = null,
    precommit: String = null,
    prerelease: String = null,
    pretag: String = null
  ): Scripts = {
    val __obj = js.Dynamic.literal()
    if (postbump != null) __obj.updateDynamic("postbump")(postbump.asInstanceOf[js.Any])
    if (postchangelog != null) __obj.updateDynamic("postchangelog")(postchangelog.asInstanceOf[js.Any])
    if (postcommit != null) __obj.updateDynamic("postcommit")(postcommit.asInstanceOf[js.Any])
    if (posttag != null) __obj.updateDynamic("posttag")(posttag.asInstanceOf[js.Any])
    if (prebump != null) __obj.updateDynamic("prebump")(prebump.asInstanceOf[js.Any])
    if (prechangelog != null) __obj.updateDynamic("prechangelog")(prechangelog.asInstanceOf[js.Any])
    if (precommit != null) __obj.updateDynamic("precommit")(precommit.asInstanceOf[js.Any])
    if (prerelease != null) __obj.updateDynamic("prerelease")(prerelease.asInstanceOf[js.Any])
    if (pretag != null) __obj.updateDynamic("pretag")(pretag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scripts]
  }
}

