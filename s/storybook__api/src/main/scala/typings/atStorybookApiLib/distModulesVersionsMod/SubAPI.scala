package typings
package atStorybookApiLib.distModulesVersionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def getCurrentVersion(): Version
  def getLatestVersion(): Version
  def versionUpdateAvailable(): scala.Boolean
}

object SubAPI {
  @scala.inline
  def apply(
    getCurrentVersion: () => Version,
    getLatestVersion: () => Version,
    versionUpdateAvailable: () => scala.Boolean
  ): SubAPI = {
    val __obj = js.Dynamic.literal(getCurrentVersion = js.Any.fromFunction0(getCurrentVersion), getLatestVersion = js.Any.fromFunction0(getLatestVersion), versionUpdateAvailable = js.Any.fromFunction0(versionUpdateAvailable))
  
    __obj.asInstanceOf[SubAPI]
  }
}

