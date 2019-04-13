package typings
package promiseDashSftpLib.promiseDashSftpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Output of `PromiseSftp#list()` */
trait DirectoryListing extends js.Object {
  /** The last modified date of the entry. */
  var date: stdLib.Date
  /** The group name or ID that this entry belongs to. *NIX only */
  var group: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the entry. */
  var name: java.lang.String
  /** The user name or ID that this entry belongs to. *NIX only */
  var owner: js.UndefOr[java.lang.String] = js.undefined
  /** The various permissions for this entry. *NIX only */
  var rights: js.UndefOr[promiseDashSftpLib.Anon_Group] = js.undefined
  /** True if the sticky bit is set for this entry */
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
  /** For symlink entries, this is the symlink's target. *NIX only */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** `d` for directory, `-` for file, and `l` for symlink only on *NIX. */
  var `type`: promiseDashSftpLib.promiseDashSftpLibStrings.d | promiseDashSftpLib.promiseDashSftpLibStrings.`-` | promiseDashSftpLib.promiseDashSftpLibStrings.l
}

object DirectoryListing {
  @scala.inline
  def apply(
    date: stdLib.Date,
    name: java.lang.String,
    `type`: promiseDashSftpLib.promiseDashSftpLibStrings.d | promiseDashSftpLib.promiseDashSftpLibStrings.`-` | promiseDashSftpLib.promiseDashSftpLibStrings.l,
    group: java.lang.String = null,
    owner: java.lang.String = null,
    rights: promiseDashSftpLib.Anon_Group = null,
    sticky: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String = null
  ): DirectoryListing = {
    val __obj = js.Dynamic.literal(date = date, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (rights != null) __obj.updateDynamic("rights")(rights)
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DirectoryListing]
  }
}

