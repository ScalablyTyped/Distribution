package typings.reactImageMagnify

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactImageMagnify.mod.LargeImageType
import typings.reactImageMagnify.mod.SmallImageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Height extends StObject {
    
    var height: Double | String = js.native
    
    var width: Double | String = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double | String, width: Double | String): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-image-magnify.react-image-magnify.ReactImageMagnifyProps & std.Readonly<{  children :react.react.ReactNode | undefined}> */
  @js.native
  trait ReactImageMagnifyPropsRea extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.native
    
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
  object ReactImageMagnifyPropsRea {
    
    @scala.inline
    def apply(largeImage: LargeImageType, smallImage: SmallImageType): ReactImageMagnifyPropsRea = {
      val __obj = js.Dynamic.literal(largeImage = largeImage.asInstanceOf[js.Any], smallImage = smallImage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactImageMagnifyPropsRea]
    }
    
    @scala.inline
    implicit class ReactImageMagnifyPropsReaMutableBuilder[Self <: ReactImageMagnifyPropsRea] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEnlargedImageClassName(value: String): Self = StObject.set(x, "enlargedImageClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnlargedImageClassNameUndefined: Self = StObject.set(x, "enlargedImageClassName", js.undefined)
      
      @scala.inline
      def setEnlargedImageContainerClassName(value: String): Self = StObject.set(x, "enlargedImageContainerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnlargedImageContainerClassNameUndefined: Self = StObject.set(x, "enlargedImageContainerClassName", js.undefined)
      
      @scala.inline
      def setEnlargedImageContainerDimensions(value: Height): Self = StObject.set(x, "enlargedImageContainerDimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnlargedImageContainerDimensionsUndefined: Self = StObject.set(x, "enlargedImageContainerDimensions", js.undefined)
      
      @scala.inline
      def setEnlargedImageContainerStyle(value: CSSProperties): Self = StObject.set(x, "enlargedImageContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnlargedImageContainerStyleUndefined: Self = StObject.set(x, "enlargedImageContainerStyle", js.undefined)
      
      @scala.inline
      def setEnlargedImagePortalId(value: String): Self = StObject.set(x, "enlargedImagePortalId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnlargedImagePortalIdUndefined: Self = StObject.set(x, "enlargedImagePortalId", js.undefined)
      
      @scala.inline
      def setEnlargedImagePosition(value: String): Self = StObject.set(x, "enlargedImagePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnlargedImagePositionUndefined: Self = StObject.set(x, "enlargedImagePosition", js.undefined)
      
      @scala.inline
      def setEnlargedImageStyle(value: CSSProperties): Self = StObject.set(x, "enlargedImageStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnlargedImageStyleUndefined: Self = StObject.set(x, "enlargedImageStyle", js.undefined)
      
      @scala.inline
      def setFadeDurationInMs(value: Double): Self = StObject.set(x, "fadeDurationInMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeDurationInMsUndefined: Self = StObject.set(x, "fadeDurationInMs", js.undefined)
      
      @scala.inline
      def setHintComponent(value: () => Unit): Self = StObject.set(x, "hintComponent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHintComponentUndefined: Self = StObject.set(x, "hintComponent", js.undefined)
      
      @scala.inline
      def setHintTextMouse(value: String): Self = StObject.set(x, "hintTextMouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintTextMouseUndefined: Self = StObject.set(x, "hintTextMouse", js.undefined)
      
      @scala.inline
      def setHintTextTouch(value: String): Self = StObject.set(x, "hintTextTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintTextTouchUndefined: Self = StObject.set(x, "hintTextTouch", js.undefined)
      
      @scala.inline
      def setHoverDelayInMs(value: Double): Self = StObject.set(x, "hoverDelayInMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverDelayInMsUndefined: Self = StObject.set(x, "hoverDelayInMs", js.undefined)
      
      @scala.inline
      def setHoverOffDelayInMs(value: Double): Self = StObject.set(x, "hoverOffDelayInMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverOffDelayInMsUndefined: Self = StObject.set(x, "hoverOffDelayInMs", js.undefined)
      
      @scala.inline
      def setImageClassName(value: String): Self = StObject.set(x, "imageClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageClassNameUndefined: Self = StObject.set(x, "imageClassName", js.undefined)
      
      @scala.inline
      def setImageStyle(value: CSSProperties): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
      
      @scala.inline
      def setIsActivatedOnTouch(value: Boolean): Self = StObject.set(x, "isActivatedOnTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActivatedOnTouchUndefined: Self = StObject.set(x, "isActivatedOnTouch", js.undefined)
      
      @scala.inline
      def setIsEnlargedImagePortalEnabledForTouch(value: Boolean): Self = StObject.set(x, "isEnlargedImagePortalEnabledForTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnlargedImagePortalEnabledForTouchUndefined: Self = StObject.set(x, "isEnlargedImagePortalEnabledForTouch", js.undefined)
      
      @scala.inline
      def setIsHintEnabled(value: Boolean): Self = StObject.set(x, "isHintEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHintEnabledUndefined: Self = StObject.set(x, "isHintEnabled", js.undefined)
      
      @scala.inline
      def setLargeImage(value: LargeImageType): Self = StObject.set(x, "largeImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLensComponent(value: () => Unit): Self = StObject.set(x, "lensComponent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLensComponentUndefined: Self = StObject.set(x, "lensComponent", js.undefined)
      
      @scala.inline
      def setLensStyle(value: CSSProperties): Self = StObject.set(x, "lensStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLensStyleUndefined: Self = StObject.set(x, "lensStyle", js.undefined)
      
      @scala.inline
      def setPressDuration(value: Double): Self = StObject.set(x, "pressDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressDurationUndefined: Self = StObject.set(x, "pressDuration", js.undefined)
      
      @scala.inline
      def setPressMoveThreshold(value: Double): Self = StObject.set(x, "pressMoveThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressMoveThresholdUndefined: Self = StObject.set(x, "pressMoveThreshold", js.undefined)
      
      @scala.inline
      def setShouldHideHintAfterFirstActivation(value: Boolean): Self = StObject.set(x, "shouldHideHintAfterFirstActivation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldHideHintAfterFirstActivationUndefined: Self = StObject.set(x, "shouldHideHintAfterFirstActivation", js.undefined)
      
      @scala.inline
      def setShouldUsePositiveSpaceLens(value: Boolean): Self = StObject.set(x, "shouldUsePositiveSpaceLens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldUsePositiveSpaceLensUndefined: Self = StObject.set(x, "shouldUsePositiveSpaceLens", js.undefined)
      
      @scala.inline
      def setSmallImage(value: SmallImageType): Self = StObject.set(x, "smallImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
