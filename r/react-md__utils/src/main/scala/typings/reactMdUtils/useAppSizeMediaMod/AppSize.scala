package typings.reactMdUtils.useAppSizeMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSize extends js.Object {
  /**
    * Boolean if currently matching a desktop screen by comparing the max width
    * of the device.
    */
  var isDesktop: Boolean = js.native
  /**
    * Boolean if the app is considered to be in landscape mode. This will just
    * verify that the window width is greater than the window height.
    *
    * NOTE: This might not be super accurate on Android devices since the soft
    * keyboard will change the dimensions of the viewport when it appears. It is
    * recommended to use the `useOrientation` hook as well if you'd like to get
    * the current orientation type.
    */
  var isLandscape: Boolean = js.native
  /**
    * Boolean if currently matching a large desktop screen by comparing the max
    * width of the device.
    */
  var isLargeDesktop: Boolean = js.native
  /**
    * Boolean if currently matching a phone by comparing the max width of the
    * device.
    */
  var isPhone: Boolean = js.native
  /**
    * Boolean if currently matching a tablet by comparing the max width of the
    * device.
    */
  var isTablet: Boolean = js.native
}

object AppSize {
  @scala.inline
  def apply(
    isDesktop: Boolean,
    isLandscape: Boolean,
    isLargeDesktop: Boolean,
    isPhone: Boolean,
    isTablet: Boolean
  ): AppSize = {
    val __obj = js.Dynamic.literal(isDesktop = isDesktop.asInstanceOf[js.Any], isLandscape = isLandscape.asInstanceOf[js.Any], isLargeDesktop = isLargeDesktop.asInstanceOf[js.Any], isPhone = isPhone.asInstanceOf[js.Any], isTablet = isTablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSize]
  }
  @scala.inline
  implicit class AppSizeOps[Self <: AppSize] (val x: Self) extends AnyVal {
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
    def setIsDesktop(value: Boolean): Self = this.set("isDesktop", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLandscape(value: Boolean): Self = this.set("isLandscape", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLargeDesktop(value: Boolean): Self = this.set("isLargeDesktop", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPhone(value: Boolean): Self = this.set("isPhone", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTablet(value: Boolean): Self = this.set("isTablet", value.asInstanceOf[js.Any])
  }
  
}

