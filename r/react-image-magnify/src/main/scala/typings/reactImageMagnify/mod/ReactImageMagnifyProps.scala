package typings.reactImageMagnify.mod

import typings.react.mod.CSSProperties
import typings.reactImageMagnify.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactImageMagnifyProps extends js.Object {
  /**
    * CSS class applied to root container element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * CSS class applied to enlarged image element.
    */
  var enlargedImageClassName: js.UndefOr[String] = js.undefined
  /**
    * CSS class applied to enlarged image container element.
    */
  var enlargedImageContainerClassName: js.UndefOr[String] = js.undefined
  /**
    * Specify enlarged image container dimensions as an object with width and height properties.
    * Values may be expressed as a percentage (e.g. '150%') or a number (e.g. 200).
    * Percentage is based on small image dimension. Number is pixels.
    * Not applied when enlargedImagePosition is set to 'over', the default for touch input.
    */
  var enlargedImageContainerDimensions: js.UndefOr[Height] = js.undefined
  /**
    * Style applied to enlarged image container element.
    */
  var enlargedImageContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Render enlarged image into an HTML element of your choosing by specifying the target element id.
    * Requires React v16. Ignored for touch input by default - see isEnlargedImagePortalEnabledForTouch.
    */
  var enlargedImagePortalId: js.UndefOr[String] = js.undefined
  // Behavioral props
  /**
    * Enlarged image placement. Can be 'beside' or 'over'.
    *
    * Default: beside(over for touch)
    */
  var enlargedImagePosition: js.UndefOr[String] = js.undefined
  /**
    * Style applied to enlarged image element.
    */
  var enlargedImageStyle: js.UndefOr[CSSProperties] = js.undefined
  // Interation properties
  /**
    * Milliseconds duration of magnified image fade in/fade out.
    *
    * Default: 300
    */
  var fadeDurationInMs: js.UndefOr[Double] = js.undefined
  /**
    * Reference to a component class or functional component. A Default is provided.
    */
  var hintComponent: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Hint text for mouse.
    *
    * Default: Hover to Zoom
    */
  var hintTextMouse: js.UndefOr[String] = js.undefined
  /**
    * Hint text for touch.
    *
    * Default: Long-Touch to Zoom
    */
  var hintTextTouch: js.UndefOr[String] = js.undefined
  /**
    * Milliseconds to delay hover trigger.
    *
    * Default: 250
    */
  var hoverDelayInMs: js.UndefOr[Double] = js.undefined
  /**
    * Milliseconds to delay hover-off trigger.
    *
    * Default: 150
    */
  var hoverOffDelayInMs: js.UndefOr[Double] = js.undefined
  /**
    * CSS class applied to small image element.
    */
  var imageClassName: js.UndefOr[String] = js.undefined
  /**
    * Style applied to small image element.
    */
  var imageStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Activate magnification immediately on touch. May impact scrolling.
    *
    * Default: false
    */
  var isActivatedOnTouch: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify portal rendering should be honored for touch input.
    *
    * Default: false
    */
  var isEnlargedImagePortalEnabledForTouch: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable hint feature.
    *
    * Default: false
    */
  var isHintEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Large image information
    */
  var largeImage: LargeImageType
  /**
    * Specify a custom lens component.
    */
  var lensComponent: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Style applied to tinted lens.
    */
  var lensStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Milliseconds to delay long-press activation (long touch).
    *
    * Default: 500
    */
  var pressDuration: js.UndefOr[Double] = js.undefined
  /**
    * Pixels of movement allowed during long-press activation.
    *
    * Default: 5
    */
  var pressMoveThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Only show hint until the first interaction begins.
    *
    * Default: true
    */
  var shouldHideHintAfterFirstActivation: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify a positive space lens in place of the default negative space lens.
    *
    * Default: false
    */
  var shouldUsePositiveSpaceLens: js.UndefOr[Boolean] = js.undefined
  /**
    * Small image information.
    */
  var smallImage: SmallImageType
  /**
    * Style applied to root container element.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ReactImageMagnifyProps {
  @scala.inline
  def apply(
    largeImage: LargeImageType,
    smallImage: SmallImageType,
    className: String = null,
    enlargedImageClassName: String = null,
    enlargedImageContainerClassName: String = null,
    enlargedImageContainerDimensions: Height = null,
    enlargedImageContainerStyle: CSSProperties = null,
    enlargedImagePortalId: String = null,
    enlargedImagePosition: String = null,
    enlargedImageStyle: CSSProperties = null,
    fadeDurationInMs: js.UndefOr[Double] = js.undefined,
    hintComponent: () => Unit = null,
    hintTextMouse: String = null,
    hintTextTouch: String = null,
    hoverDelayInMs: js.UndefOr[Double] = js.undefined,
    hoverOffDelayInMs: js.UndefOr[Double] = js.undefined,
    imageClassName: String = null,
    imageStyle: CSSProperties = null,
    isActivatedOnTouch: js.UndefOr[Boolean] = js.undefined,
    isEnlargedImagePortalEnabledForTouch: js.UndefOr[Boolean] = js.undefined,
    isHintEnabled: js.UndefOr[Boolean] = js.undefined,
    lensComponent: () => Unit = null,
    lensStyle: CSSProperties = null,
    pressDuration: js.UndefOr[Double] = js.undefined,
    pressMoveThreshold: js.UndefOr[Double] = js.undefined,
    shouldHideHintAfterFirstActivation: js.UndefOr[Boolean] = js.undefined,
    shouldUsePositiveSpaceLens: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): ReactImageMagnifyProps = {
    val __obj = js.Dynamic.literal(largeImage = largeImage.asInstanceOf[js.Any], smallImage = smallImage.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (enlargedImageClassName != null) __obj.updateDynamic("enlargedImageClassName")(enlargedImageClassName.asInstanceOf[js.Any])
    if (enlargedImageContainerClassName != null) __obj.updateDynamic("enlargedImageContainerClassName")(enlargedImageContainerClassName.asInstanceOf[js.Any])
    if (enlargedImageContainerDimensions != null) __obj.updateDynamic("enlargedImageContainerDimensions")(enlargedImageContainerDimensions.asInstanceOf[js.Any])
    if (enlargedImageContainerStyle != null) __obj.updateDynamic("enlargedImageContainerStyle")(enlargedImageContainerStyle.asInstanceOf[js.Any])
    if (enlargedImagePortalId != null) __obj.updateDynamic("enlargedImagePortalId")(enlargedImagePortalId.asInstanceOf[js.Any])
    if (enlargedImagePosition != null) __obj.updateDynamic("enlargedImagePosition")(enlargedImagePosition.asInstanceOf[js.Any])
    if (enlargedImageStyle != null) __obj.updateDynamic("enlargedImageStyle")(enlargedImageStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeDurationInMs)) __obj.updateDynamic("fadeDurationInMs")(fadeDurationInMs.get.asInstanceOf[js.Any])
    if (hintComponent != null) __obj.updateDynamic("hintComponent")(js.Any.fromFunction0(hintComponent))
    if (hintTextMouse != null) __obj.updateDynamic("hintTextMouse")(hintTextMouse.asInstanceOf[js.Any])
    if (hintTextTouch != null) __obj.updateDynamic("hintTextTouch")(hintTextTouch.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverDelayInMs)) __obj.updateDynamic("hoverDelayInMs")(hoverDelayInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverOffDelayInMs)) __obj.updateDynamic("hoverOffDelayInMs")(hoverOffDelayInMs.get.asInstanceOf[js.Any])
    if (imageClassName != null) __obj.updateDynamic("imageClassName")(imageClassName.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(isActivatedOnTouch)) __obj.updateDynamic("isActivatedOnTouch")(isActivatedOnTouch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnlargedImagePortalEnabledForTouch)) __obj.updateDynamic("isEnlargedImagePortalEnabledForTouch")(isEnlargedImagePortalEnabledForTouch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHintEnabled)) __obj.updateDynamic("isHintEnabled")(isHintEnabled.get.asInstanceOf[js.Any])
    if (lensComponent != null) __obj.updateDynamic("lensComponent")(js.Any.fromFunction0(lensComponent))
    if (lensStyle != null) __obj.updateDynamic("lensStyle")(lensStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(pressDuration)) __obj.updateDynamic("pressDuration")(pressDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pressMoveThreshold)) __obj.updateDynamic("pressMoveThreshold")(pressMoveThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldHideHintAfterFirstActivation)) __obj.updateDynamic("shouldHideHintAfterFirstActivation")(shouldHideHintAfterFirstActivation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldUsePositiveSpaceLens)) __obj.updateDynamic("shouldUsePositiveSpaceLens")(shouldUsePositiveSpaceLens.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactImageMagnifyProps]
  }
}

