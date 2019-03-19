package typings
package atSindresorhusDfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_File extends js.Object {
  /**
  	 * Get free disk space info from [`df -kP`](https://en.wikipedia.org/wiki/Df_\(Unix\)).
  	 *
  	 * @returns A list of space info objects for each filesystem.
  	 */
  def apply(): js.Promise[js.Array[atSindresorhusDfLib.atSindresorhusDfMod.SpaceInfo]] = js.native
  /**
  	 * @param path - Path to a file on the filesystem to get the space info for.
  	 * @returns Space info for the filesystem the given file is part of.
  	 */
  def file(path: java.lang.String): js.Promise[atSindresorhusDfLib.atSindresorhusDfMod.SpaceInfo] = js.native
  /**
  	 * @param path - Path to a filesystem device file. Example: `'/dev/disk1'`.
  	 * @returns Space info for the given filesystem.
  	 */
  def fs(path: java.lang.String): js.Promise[atSindresorhusDfLib.atSindresorhusDfMod.SpaceInfo] = js.native
}

