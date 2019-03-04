package typings
package reduxDashAuthDashWrapperLib.history3LocationHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationHelper[Props] extends js.Object {
  def createRedirectLoc(props: Props, redirectPath: java.lang.String): historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState]
  def getRedirectQueryParam(props: Props): java.lang.String
}

object LocationHelper {
  @scala.inline
  def apply[Props](
    createRedirectLoc: js.Function2[
      Props, 
      java.lang.String, 
      historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState]
    ],
    getRedirectQueryParam: js.Function1[Props, java.lang.String]
  ): LocationHelper[Props] = {
    val __obj = js.Dynamic.literal(createRedirectLoc = createRedirectLoc, getRedirectQueryParam = getRedirectQueryParam)
  
    __obj.asInstanceOf[LocationHelper[Props]]
  }
}

