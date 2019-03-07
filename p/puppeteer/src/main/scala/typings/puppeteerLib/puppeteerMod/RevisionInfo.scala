package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionInfo extends js.Object {
  /** Path to the revision executable */
  var executablePath: java.lang.String
  /** Path to the extracted revision folder */
  var folderPath: java.lang.String
  /** whether the revision is locally available on disk */
  var local: scala.Boolean
  /** The revision the info was created from */
  var revision: java.lang.String
  /** URL this revision can be downloaded from */
  var url: java.lang.String
}

object RevisionInfo {
  @scala.inline
  def apply(
    executablePath: java.lang.String,
    folderPath: java.lang.String,
    local: scala.Boolean,
    revision: java.lang.String,
    url: java.lang.String
  ): RevisionInfo = {
    val __obj = js.Dynamic.literal(executablePath = executablePath, folderPath = folderPath, local = local, revision = revision, url = url)
  
    __obj.asInstanceOf[RevisionInfo]
  }
}

