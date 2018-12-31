package typings
package reduxDashAuthDashWrapperLib.history3LocationHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationHelper[Props] extends js.Object {
  def createRedirectLoc(props: Props, redirectPath: java.lang.String): historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState]
  def getRedirectQueryParam(props: Props): java.lang.String
}

