package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TVViewPropsIOS extends js.Object {
  /**
    * *(Apple TV only)* May be set to true to force the Apple TV focus engine to move focus to this view.
    *
    * @platform ios
    */
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  /**
    * *(Apple TV only)* When set to true, this view will be focusable
    * and navigable using the Apple TV remote.
    *
    * @platform ios
    */
  var isTVSelectable: js.UndefOr[Boolean] = js.native
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 1.0.
    *
    * @platform ios
    */
  var tvParallaxMagnification: js.UndefOr[Double] = js.native
  /**
    * *(Apple TV only)* Object with properties to control Apple TV parallax effects.
    *
    * @platform ios
    */
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 2.0.
    *
    * @platform ios
    */
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.native
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 2.0.
    *
    * @platform ios
    */
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.native
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 0.05.
    *
    * @platform ios
    */
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.native
}

object TVViewPropsIOS {
  @scala.inline
  def apply(): TVViewPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TVViewPropsIOS]
  }
  @scala.inline
  implicit class TVViewPropsIOSOps[Self <: TVViewPropsIOS] (val x: Self) extends AnyVal {
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
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    @scala.inline
    def setIsTVSelectable(value: Boolean): Self = this.set("isTVSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTVSelectable: Self = this.set("isTVSelectable", js.undefined)
    @scala.inline
    def setTvParallaxMagnification(value: Double): Self = this.set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxMagnification: Self = this.set("tvParallaxMagnification", js.undefined)
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    @scala.inline
    def setTvParallaxShiftDistanceX(value: Double): Self = this.set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxShiftDistanceX: Self = this.set("tvParallaxShiftDistanceX", js.undefined)
    @scala.inline
    def setTvParallaxShiftDistanceY(value: Double): Self = this.set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxShiftDistanceY: Self = this.set("tvParallaxShiftDistanceY", js.undefined)
    @scala.inline
    def setTvParallaxTiltAngle(value: Double): Self = this.set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxTiltAngle: Self = this.set("tvParallaxTiltAngle", js.undefined)
  }
  
}

