package typings.atSindresorhusDf.atSindresorhusDfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sindresorhus/df", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: remove this in the next major version
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof df */ js.Any = js.native
  /**
  	 * Get free disk space info from [`df -kP`](https://en.wikipedia.org/wiki/Df_\(Unix\)).
  	 *
  	 * @returns A list of space info objects for each filesystem.
  	 */
  def apply(): js.Promise[js.Array[SpaceInfo]] = js.native
  /**
  	 * @param path - Path to a file on the filesystem to get the space info for.
  	 * @returns Space info for the filesystem the given file is part of.
  	 */
  def file(path: String): js.Promise[SpaceInfo] = js.native
  /**
  	 * @param path - Path to a filesystem device file. Example: `'/dev/disk1'`.
  	 * @returns Space info for the given filesystem.
  	 */
  def fs(path: String): js.Promise[SpaceInfo] = js.native
}

