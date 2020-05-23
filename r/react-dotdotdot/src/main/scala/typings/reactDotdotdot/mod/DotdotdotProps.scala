package typings.reactDotdotdot.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactDotdotdot.reactDotdotdotStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotdotdotProps
  extends AllHTMLAttributes[Dotdotdot]
     with ClassAttributes[Dotdotdot] {
  /** Animate clamp */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of lines that should be displayed, a css pixel value for height
    * as a string (i.e. "100px"), or "auto" to try and fill the available space
    */
  var clamp: String | Double | auto
  /** Split on sentences (periods), hypens, en-dashes, em-dashes, and words */
  var splitOnChars: js.UndefOr[js.Array[String]] = js.undefined
  /** The type of HTML tag which will wrap the component's content */
  var tagName: js.UndefOr[String] = js.undefined
  /**
    * The character to insert at the end of the HTML element after trunation is
    * performed.
    */
  var truncationChar: js.UndefOr[String] = js.undefined
  /** String of HTML to use instead of truncationChar */
  var truncationHTML: js.UndefOr[String] = js.undefined
  /** Use -webkit-line-clamp available in WebKit (Chrome, Safari) only */
  var useNativeClamp: js.UndefOr[Boolean] = js.undefined
}

object DotdotdotProps {
  @scala.inline
  def apply(
    clamp: String | Double | auto,
    AllHTMLAttributes: AllHTMLAttributes[Dotdotdot] = null,
    ClassAttributes: ClassAttributes[Dotdotdot] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    splitOnChars: js.Array[String] = null,
    tagName: String = null,
    truncationChar: String = null,
    truncationHTML: String = null,
    useNativeClamp: js.UndefOr[Boolean] = js.undefined
  ): DotdotdotProps = {
    val __obj = js.Dynamic.literal(clamp = clamp.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (splitOnChars != null) __obj.updateDynamic("splitOnChars")(splitOnChars.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (truncationChar != null) __obj.updateDynamic("truncationChar")(truncationChar.asInstanceOf[js.Any])
    if (truncationHTML != null) __obj.updateDynamic("truncationHTML")(truncationHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeClamp)) __obj.updateDynamic("useNativeClamp")(useNativeClamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotdotdotProps]
  }
}

