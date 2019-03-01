package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LikeViewProps extends js.Object {
  /**
    * The position for the auxiliary view for the receiver.
    */
  var auxiliaryViewPosition: js.UndefOr[AuxiliaryViewPosition] = js.undefined
  /**
    * The foreground color to use for the content of the receiver.
    */
  var foregroundColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * The text alignment of the social sentence.
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment] = js.undefined
  /**
    * The style to use for the receiver.  Distinct from React styling.
    */
  var likeViewStyle: js.UndefOr[LikeViewStyle] = js.undefined
  /**
    * The objectId and type for the object to like.
    */
  var objectIdAndType: ObjectIdAndType
  /**
    * If true, a sound is played when the receiver is toggled.
    */
  var soundEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * View style, if any.
    */
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
}

object LikeViewProps {
  @scala.inline
  def apply(
    objectIdAndType: ObjectIdAndType,
    auxiliaryViewPosition: AuxiliaryViewPosition = null,
    foregroundColor: scala.Int | scala.Double = null,
    horizontalAlignment: HorizontalAlignment = null,
    likeViewStyle: LikeViewStyle = null,
    soundEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.ViewStyle = null
  ): LikeViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objectIdAndType")(objectIdAndType)
    if (auxiliaryViewPosition != null) __obj.updateDynamic("auxiliaryViewPosition")(auxiliaryViewPosition)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (likeViewStyle != null) __obj.updateDynamic("likeViewStyle")(likeViewStyle)
    if (!js.isUndefined(soundEnabled)) __obj.updateDynamic("soundEnabled")(soundEnabled)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LikeViewProps]
  }
}

