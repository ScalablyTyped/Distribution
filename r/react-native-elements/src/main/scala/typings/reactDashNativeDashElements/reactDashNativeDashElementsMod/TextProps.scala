package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties * / any */ trait TextProps extends _HeaderSubComponent {
  /**
    * font size 40
    */
  var h1: js.UndefOr[Boolean] = js.undefined
  /**
    * Styling for when `h1` is set
    */
  var h1Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * font size 34
    */
  var h2: js.UndefOr[Boolean] = js.undefined
  /**
    * Styling for when `h2` is set
    */
  var h2Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * font size 28
    */
  var h3: js.UndefOr[Boolean] = js.undefined
  /**
    * Styling for when `h3` is set
    */
  var h3Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * font size 22
    */
  var h4: js.UndefOr[Boolean] = js.undefined
  /**
    * Styling for when `h4` is set
    */
  var h4Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Additional styling for Text
    */
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    h1: js.UndefOr[Boolean] = js.undefined,
    h1Style: StyleProp[TextStyle] = null,
    h2: js.UndefOr[Boolean] = js.undefined,
    h2Style: StyleProp[TextStyle] = null,
    h3: js.UndefOr[Boolean] = js.undefined,
    h3Style: StyleProp[TextStyle] = null,
    h4: js.UndefOr[Boolean] = js.undefined,
    h4Style: StyleProp[TextStyle] = null,
    style: StyleProp[TextStyle] = null
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(h1)) __obj.updateDynamic("h1")(h1.asInstanceOf[js.Any])
    if (h1Style != null) __obj.updateDynamic("h1Style")(h1Style.asInstanceOf[js.Any])
    if (!js.isUndefined(h2)) __obj.updateDynamic("h2")(h2.asInstanceOf[js.Any])
    if (h2Style != null) __obj.updateDynamic("h2Style")(h2Style.asInstanceOf[js.Any])
    if (!js.isUndefined(h3)) __obj.updateDynamic("h3")(h3.asInstanceOf[js.Any])
    if (h3Style != null) __obj.updateDynamic("h3Style")(h3Style.asInstanceOf[js.Any])
    if (!js.isUndefined(h4)) __obj.updateDynamic("h4")(h4.asInstanceOf[js.Any])
    if (h4Style != null) __obj.updateDynamic("h4Style")(h4Style.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProps]
  }
}

