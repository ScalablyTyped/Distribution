package typings
package registryDashAuthDashTokenLib.registryDashAuthDashTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("registry-auth-token", JSImport.Namespace)
@js.native
object registryDashAuthDashTokenModMembers extends js.Object {
  /**
   *
   * @param registryUrl - Either the registry url used
   * for matching or a configuration object describing the contents of the .npmrc file
   * @param [options] - a configuration object describing the
   * contents of the .npmrc file.  If an `npmrc` config object was passed in as the
   * first parameter, this parameter is ignored.
   * @returns The `NpmCredentials` object or undefined if no match found.
   */
  def apply(
    registryUrl: java.lang.String | registryDashAuthDashTokenLib.registryDashAuthDashTokenMod.authNs.AuthOptions
  ): registryDashAuthDashTokenLib.registryDashAuthDashTokenMod.authNs.NpmCredentials = js.native
  /**
   *
   * @param registryUrl - Either the registry url used
   * for matching or a configuration object describing the contents of the .npmrc file
   * @param [options] - a configuration object describing the
   * contents of the .npmrc file.  If an `npmrc` config object was passed in as the
   * first parameter, this parameter is ignored.
   * @returns The `NpmCredentials` object or undefined if no match found.
   */
  def apply(
    registryUrl: java.lang.String | registryDashAuthDashTokenLib.registryDashAuthDashTokenMod.authNs.AuthOptions,
    options: registryDashAuthDashTokenLib.registryDashAuthDashTokenMod.authNs.AuthOptions
  ): registryDashAuthDashTokenLib.registryDashAuthDashTokenMod.authNs.NpmCredentials = js.native
}

