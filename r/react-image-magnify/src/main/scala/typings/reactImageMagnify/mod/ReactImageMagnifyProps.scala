package typings.reactImageMagnify.mod

import typings.react.mod.CSSProperties
import typings.reactImageMagnify.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactImageMagnifyProps extends js.Object {
  
  /**
    * CSS class applied to root container element.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * CSS class applied to enlarged image element.
    */
  var enlargedImageClassName: js.UndefOr[String] = js.native
  
  /**
    * CSS class applied to enlarged image container element.
    */
  var enlargedImageContainerClassName: js.UndefOr[String] = js.native
  
  /**
    * Specify enlarged image container dimensions as an object with width and height properties.
    * Values may be expressed as a percentage (e.g. '150%') or a number (e.g. 200).
    * Percentage is based on small image dimension. Number is pixels.
    * Not applied when enlargedImagePosition is set to 'over', the default for touch input.
    */
  var enlargedImageContainerDimensions: js.UndefOr[Height] = js.native
  
  /**
    * Style applied to enlarged image container element.
    */
  var enlargedImageContainerStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Render enlarged image into an HTML element of your choosing by specifying the target element id.
    * Requires React v16. Ignored for touch input by default - see isEnlargedImagePortalEnabledForTouch.
    */
  var enlargedImagePortalId: js.UndefOr[String] = js.native
  
  // Behavioral props
  /**
    * Enlarged image placement. Can be 'beside' or 'over'.
    *
    * Default: beside(over for touch)
    */
  var enlargedImagePosition: js.UndefOr[String] = js.native
  
  /**
    * Style applied to enlarged image element.
    */
  var enlargedImageStyle: js.UndefOr[CSSProperties] = js.native
  
  // Interation properties
  /**
    * Milliseconds duration of magnified image fade in/fade out.
    *
    * Default: 300
    */
  var fadeDurationInMs: js.UndefOr[Double] = js.native
  
  /**
    * Reference to a component class or functional component. A Default is provided.
    */
  var hintComponent: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Hint text for mouse.
    *
    * Default: Hover to Zoom
    */
  var hintTextMouse: js.UndefOr[String] = js.native
  
  /**
    * Hint text for touch.
    *
    * Default: Long-Touch to Zoom
    */
  var hintTextTouch: js.UndefOr[String] = js.native
  
  /**
    * Milliseconds to delay hover trigger.
    *
    * Default: 250
    */
  var hoverDelayInMs: js.UndefOr[Double] = js.native
  
  /**
    * Milliseconds to delay hover-off trigger.
    *
    * Default: 150
    */
  var hoverOffDelayInMs: js.UndefOr[Double] = js.native
  
  /**
    * CSS class applied to small image element.
    */
  var imageClassName: js.UndefOr[String] = js.native
  
  /**
    * Style applied to small image element.
    */
  var imageStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Activate magnification immediately on touch. May impact scrolling.
    *
    * Default: false
    */
  var isActivatedOnTouch: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify portal rendering should be honored for touch input.
    *
    * Default: false
    */
  var isEnlargedImagePortalEnabledForTouch: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable hint feature.
    *
    * Default: false
    */
  var isHintEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Large image information
    */
  var largeImage: LargeImageType = js.native
  
  /**
    * Specify a custom lens component.
    */
  var lensComponent: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Style applied to tinted lens.
    */
  var lensStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Milliseconds to delay long-press activation (long touch).
    *
    * Default: 500
    */
  var pressDuration: js.UndefOr[Double] = js.native
  
  /**
    * Pixels of movement allowed during long-press activation.
    *
    * Default: 5
    */
  var pressMoveThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Only show hint until the first interaction begins.
    *
    * Default: true
    */
  var shouldHideHintAfterFirstActivation: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a positive space lens in place of the default negative space lens.
    *
    * Default: false
    */
  var shouldUsePositiveSpaceLens: js.UndefOr[Boolean] = js.native
  
  /**
    * Small image information.
    */
  var smallImage: SmallImageType = js.native
  
  /**
    * Style applied to root container element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
}
object ReactImageMagnifyProps {
  
  @scala.inline
  def apply(largeImage: LargeImageType, smallImage: SmallImageType): ReactImageMagnifyProps = {
    val __obj = js.Dynamic.literal(largeImage = largeImage.asInstanceOf[js.Any], smallImage = smallImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactImageMagnifyProps]
  }
  
  @scala.inline
  implicit class ReactImageMagnifyPropsOps[Self <: ReactImageMagnifyProps] (val x: Self) extends AnyVal {
    
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
    def setLargeImage(value: LargeImageType): Self = this.set("largeImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallImage(value: SmallImageType): Self = this.set("smallImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setEnlargedImageClassName(value: String): Self = this.set("enlargedImageClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnlargedImageClassName: Self = this.set("enlargedImageClassName", js.undefined)
    
    @scala.inline
    def setEnlargedImageContainerClassName(value: String): Self = this.set("enlargedImageContainerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnlargedImageContainerClassName: Self = this.set("enlargedImageContainerClassName", js.undefined)
    
    @scala.inline
    def setEnlargedImageContainerDimensions(value: Height): Self = this.set("enlargedImageContainerDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnlargedImageContainerDimensions: Self = this.set("enlargedImageContainerDimensions", js.undefined)
    
    @scala.inline
    def setEnlargedImageContainerStyle(value: CSSProperties): Self = this.set("enlargedImageContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnlargedImageContainerStyle: Self = this.set("enlargedImageContainerStyle", js.undefined)
    
    @scala.inline
    def setEnlargedImagePortalId(value: String): Self = this.set("enlargedImagePortalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnlargedImagePortalId: Self = this.set("enlargedImagePortalId", js.undefined)
    
    @scala.inline
    def setEnlargedImagePosition(value: String): Self = this.set("enlargedImagePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnlargedImagePosition: Self = this.set("enlargedImagePosition", js.undefined)
    
    @scala.inline
    def setEnlargedImageStyle(value: CSSProperties): Self = this.set("enlargedImageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnlargedImageStyle: Self = this.set("enlargedImageStyle", js.undefined)
    
    @scala.inline
    def setFadeDurationInMs(value: Double): Self = this.set("fadeDurationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeDurationInMs: Self = this.set("fadeDurationInMs", js.undefined)
    
    @scala.inline
    def setHintComponent(value: () => Unit): Self = this.set("hintComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHintComponent: Self = this.set("hintComponent", js.undefined)
    
    @scala.inline
    def setHintTextMouse(value: String): Self = this.set("hintTextMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintTextMouse: Self = this.set("hintTextMouse", js.undefined)
    
    @scala.inline
    def setHintTextTouch(value: String): Self = this.set("hintTextTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintTextTouch: Self = this.set("hintTextTouch", js.undefined)
    
    @scala.inline
    def setHoverDelayInMs(value: Double): Self = this.set("hoverDelayInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverDelayInMs: Self = this.set("hoverDelayInMs", js.undefined)
    
    @scala.inline
    def setHoverOffDelayInMs(value: Double): Self = this.set("hoverOffDelayInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverOffDelayInMs: Self = this.set("hoverOffDelayInMs", js.undefined)
    
    @scala.inline
    def setImageClassName(value: String): Self = this.set("imageClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageClassName: Self = this.set("imageClassName", js.undefined)
    
    @scala.inline
    def setImageStyle(value: CSSProperties): Self = this.set("imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageStyle: Self = this.set("imageStyle", js.undefined)
    
    @scala.inline
    def setIsActivatedOnTouch(value: Boolean): Self = this.set("isActivatedOnTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActivatedOnTouch: Self = this.set("isActivatedOnTouch", js.undefined)
    
    @scala.inline
    def setIsEnlargedImagePortalEnabledForTouch(value: Boolean): Self = this.set("isEnlargedImagePortalEnabledForTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnlargedImagePortalEnabledForTouch: Self = this.set("isEnlargedImagePortalEnabledForTouch", js.undefined)
    
    @scala.inline
    def setIsHintEnabled(value: Boolean): Self = this.set("isHintEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHintEnabled: Self = this.set("isHintEnabled", js.undefined)
    
    @scala.inline
    def setLensComponent(value: () => Unit): Self = this.set("lensComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLensComponent: Self = this.set("lensComponent", js.undefined)
    
    @scala.inline
    def setLensStyle(value: CSSProperties): Self = this.set("lensStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLensStyle: Self = this.set("lensStyle", js.undefined)
    
    @scala.inline
    def setPressDuration(value: Double): Self = this.set("pressDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressDuration: Self = this.set("pressDuration", js.undefined)
    
    @scala.inline
    def setPressMoveThreshold(value: Double): Self = this.set("pressMoveThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressMoveThreshold: Self = this.set("pressMoveThreshold", js.undefined)
    
    @scala.inline
    def setShouldHideHintAfterFirstActivation(value: Boolean): Self = this.set("shouldHideHintAfterFirstActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldHideHintAfterFirstActivation: Self = this.set("shouldHideHintAfterFirstActivation", js.undefined)
    
    @scala.inline
    def setShouldUsePositiveSpaceLens(value: Boolean): Self = this.set("shouldUsePositiveSpaceLens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldUsePositiveSpaceLens: Self = this.set("shouldUsePositiveSpaceLens", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
