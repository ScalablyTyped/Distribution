package typings.raygun4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  var Browser: String = js.native
  var `Browser-Height`: Double = js.native
  var `Browser-Name`: String = js.native
  var `Browser-Version`: String = js.native
  var `Browser-Width`: Double = js.native
  var `Color-Depth`: Double = js.native
  var `Document-Mode`: Double = js.native
  var Platform: String = js.native
  var `Screen-Height`: Double = js.native
  var `Screen-Width`: Double = js.native
  var `User-Language`: String = js.native
  var UtcOffset: Double = js.native
}

object Browser {
  @scala.inline
  def apply(
    Browser: String,
    `Browser-Height`: Double,
    `Browser-Name`: String,
    `Browser-Version`: String,
    `Browser-Width`: Double,
    `Color-Depth`: Double,
    `Document-Mode`: Double,
    Platform: String,
    `Screen-Height`: Double,
    `Screen-Width`: Double,
    `User-Language`: String,
    UtcOffset: Double
  ): Browser = {
    val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], UtcOffset = UtcOffset.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser-Height")(`Browser-Height`.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser-Name")(`Browser-Name`.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser-Version")(`Browser-Version`.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser-Width")(`Browser-Width`.asInstanceOf[js.Any])
    __obj.updateDynamic("Color-Depth")(`Color-Depth`.asInstanceOf[js.Any])
    __obj.updateDynamic("Document-Mode")(`Document-Mode`.asInstanceOf[js.Any])
    __obj.updateDynamic("Screen-Height")(`Screen-Height`.asInstanceOf[js.Any])
    __obj.updateDynamic("Screen-Width")(`Screen-Width`.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Language")(`User-Language`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
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
    def setBrowser(value: String): Self = this.set("Browser", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBrowser-Height`(value: Double): Self = this.set("Browser-Height", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBrowser-Name`(value: String): Self = this.set("Browser-Name", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBrowser-Version`(value: String): Self = this.set("Browser-Version", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBrowser-Width`(value: Double): Self = this.set("Browser-Width", value.asInstanceOf[js.Any])
    @scala.inline
    def `setColor-Depth`(value: Double): Self = this.set("Color-Depth", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDocument-Mode`(value: Double): Self = this.set("Document-Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def `setScreen-Height`(value: Double): Self = this.set("Screen-Height", value.asInstanceOf[js.Any])
    @scala.inline
    def `setScreen-Width`(value: Double): Self = this.set("Screen-Width", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUser-Language`(value: String): Self = this.set("User-Language", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtcOffset(value: Double): Self = this.set("UtcOffset", value.asInstanceOf[js.Any])
  }
  
}

