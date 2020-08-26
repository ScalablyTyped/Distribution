package typings.reduxAuthWrapper.locationHelperMod

import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationHelper[Props] extends js.Object {
  def createRedirectLoc(props: Props, redirectPath: String): LocationDescriptorObject[LocationState] = js.native
  def getRedirectQueryParam(props: Props): String = js.native
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
  @scala.inline
  implicit class LocationHelperOps[Self <: LocationHelper[_], Props] (val x: Self with LocationHelper[Props]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateRedirectLoc(value: (Props, String) => LocationDescriptorObject[LocationState]): Self = this.set("createRedirectLoc", js.Any.fromFunction2(value))
    @scala.inline
    def setGetRedirectQueryParam(value: Props => String): Self = this.set("getRedirectQueryParam", js.Any.fromFunction1(value))
  }
  
}

