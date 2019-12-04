package typings.reduxDashAuthDashWrapper.history3LocationHelperMod

import typings.history.historyMod.LocationDescriptorObject
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationHelper[Props] extends js.Object {
  def createRedirectLoc(props: Props, redirectPath: String): LocationDescriptorObject[LocationState]
  def getRedirectQueryParam(props: Props): String
}

object LocationHelper {
  @scala.inline
  def apply[Props](
    createRedirectLoc: (Props, String) => LocationDescriptorObject[LocationState],
    getRedirectQueryParam: Props => String
  ): LocationHelper[Props] = {
    val __obj = js.Dynamic.literal(createRedirectLoc = js.Any.fromFunction2(createRedirectLoc), getRedirectQueryParam = js.Any.fromFunction1(getRedirectQueryParam))
  
    __obj.asInstanceOf[LocationHelper[Props]]
  }
}

