package typings.senchaUnderscoreTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISupports extends js.Object {
  /** [Property] (Object) */
  var AudioTag: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var GeoLocation: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var SVG: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var Transitions: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var VML: js.UndefOr[js.Any] = js.undefined
}

object ISupports {
  @scala.inline
  def apply(
    AudioTag: js.Any = null,
    GeoLocation: js.Any = null,
    SVG: js.Any = null,
    Transitions: js.Any = null,
    VML: js.Any = null
  ): ISupports = {
    val __obj = js.Dynamic.literal()
    if (AudioTag != null) __obj.updateDynamic("AudioTag")(AudioTag.asInstanceOf[js.Any])
    if (GeoLocation != null) __obj.updateDynamic("GeoLocation")(GeoLocation.asInstanceOf[js.Any])
    if (SVG != null) __obj.updateDynamic("SVG")(SVG.asInstanceOf[js.Any])
    if (Transitions != null) __obj.updateDynamic("Transitions")(Transitions.asInstanceOf[js.Any])
    if (VML != null) __obj.updateDynamic("VML")(VML.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISupports]
  }
}

