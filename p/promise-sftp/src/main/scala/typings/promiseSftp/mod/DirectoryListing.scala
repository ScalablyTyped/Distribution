package typings.promiseSftp.mod

import typings.promiseSftp.AnonGroup
import typings.promiseSftp.promiseSftpStrings.`-_`
import typings.promiseSftp.promiseSftpStrings.d
import typings.promiseSftp.promiseSftpStrings.l
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Output of `PromiseSftp#list()` */
trait DirectoryListing extends js.Object {
  /** The last modified date of the entry. */
  var date: Date
  /** The group name or ID that this entry belongs to. *NIX only */
  var group: js.UndefOr[String] = js.undefined
  /** The name of the entry. */
  var name: String
  /** The user name or ID that this entry belongs to. *NIX only */
  var owner: js.UndefOr[String] = js.undefined
  /** The various permissions for this entry. *NIX only */
  var rights: js.UndefOr[AnonGroup] = js.undefined
  /** True if the sticky bit is set for this entry */
  var sticky: js.UndefOr[Boolean] = js.undefined
  /** For symlink entries, this is the symlink's target. *NIX only */
  var target: js.UndefOr[String] = js.undefined
  /** `d` for directory, `-` for file, and `l` for symlink only on *NIX. */
  var `type`: d | `-_` | l
}

object DirectoryListing {
  @scala.inline
  def apply(
    date: Date,
    name: String,
    `type`: d | `-_` | l,
    group: String = null,
    owner: String = null,
    rights: AnonGroup = null,
    sticky: js.UndefOr[Boolean] = js.undefined,
    target: String = null
  ): DirectoryListing = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (rights != null) __obj.updateDynamic("rights")(rights.asInstanceOf[js.Any])
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryListing]
  }
}

