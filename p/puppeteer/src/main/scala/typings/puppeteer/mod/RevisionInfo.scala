package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionInfo extends js.Object {
  /** Path to the revision executable */
  var executablePath: String
  /** Path to the extracted revision folder */
  var folderPath: String
  /** whether the revision is locally available on disk */
  var local: Boolean
  var product: Product
  /** The revision the info was created from */
  var revision: String
  /** URL this revision can be downloaded from */
  var url: String
}

object RevisionInfo {
  @scala.inline
  def apply(
    executablePath: String,
    folderPath: String,
    local: Boolean,
    product: Product,
    revision: String,
    url: String
  ): RevisionInfo = {
    val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionInfo]
  }
}

