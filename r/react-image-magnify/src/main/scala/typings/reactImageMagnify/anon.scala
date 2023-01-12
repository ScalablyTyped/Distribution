package typings.reactImageMagnify

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactImageMagnify.mod.LargeImageType
import typings.reactImageMagnify.mod.SmallImageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double | String
    
    var width: Double | String
  }
  object Height {
    
    inline def apply(height: Double | String, width: Double | String): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-image-magnify.react-image-magnify.ReactImageMagnifyProps & std.Readonly<{  children :react.react.ReactNode | undefined}> */
  trait ReactImageMagnifyPropsRea extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
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
  object ReactImageMagnifyPropsRea {
    
    inline def apply(largeImage: LargeImageType, smallImage: SmallImageType): ReactImageMagnifyPropsRea = {
      val __obj = js.Dynamic.literal(largeImage = largeImage.asInstanceOf[js.Any], smallImage = smallImage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactImageMagnifyPropsRea]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactImageMagnifyPropsRea] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnlargedImageClassName(value: String): Self = StObject.set(x, "enlargedImageClassName", value.asInstanceOf[js.Any])
      
      inline def setEnlargedImageClassNameUndefined: Self = StObject.set(x, "enlargedImageClassName", js.undefined)
      
      inline def setEnlargedImageContainerClassName(value: String): Self = StObject.set(x, "enlargedImageContainerClassName", value.asInstanceOf[js.Any])
      
      inline def setEnlargedImageContainerClassNameUndefined: Self = StObject.set(x, "enlargedImageContainerClassName", js.undefined)
      
      inline def setEnlargedImageContainerDimensions(value: Height): Self = StObject.set(x, "enlargedImageContainerDimensions", value.asInstanceOf[js.Any])
      
      inline def setEnlargedImageContainerDimensionsUndefined: Self = StObject.set(x, "enlargedImageContainerDimensions", js.undefined)
      
      inline def setEnlargedImageContainerStyle(value: CSSProperties): Self = StObject.set(x, "enlargedImageContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setEnlargedImageContainerStyleUndefined: Self = StObject.set(x, "enlargedImageContainerStyle", js.undefined)
      
      inline def setEnlargedImagePortalId(value: String): Self = StObject.set(x, "enlargedImagePortalId", value.asInstanceOf[js.Any])
      
      inline def setEnlargedImagePortalIdUndefined: Self = StObject.set(x, "enlargedImagePortalId", js.undefined)
      
      inline def setEnlargedImagePosition(value: String): Self = StObject.set(x, "enlargedImagePosition", value.asInstanceOf[js.Any])
      
      inline def setEnlargedImagePositionUndefined: Self = StObject.set(x, "enlargedImagePosition", js.undefined)
      
      inline def setEnlargedImageStyle(value: CSSProperties): Self = StObject.set(x, "enlargedImageStyle", value.asInstanceOf[js.Any])
      
      inline def setEnlargedImageStyleUndefined: Self = StObject.set(x, "enlargedImageStyle", js.undefined)
      
      inline def setFadeDurationInMs(value: Double): Self = StObject.set(x, "fadeDurationInMs", value.asInstanceOf[js.Any])
      
      inline def setFadeDurationInMsUndefined: Self = StObject.set(x, "fadeDurationInMs", js.undefined)
      
      inline def setHintComponent(value: () => Unit): Self = StObject.set(x, "hintComponent", js.Any.fromFunction0(value))
      
      inline def setHintComponentUndefined: Self = StObject.set(x, "hintComponent", js.undefined)
      
      inline def setHintTextMouse(value: String): Self = StObject.set(x, "hintTextMouse", value.asInstanceOf[js.Any])
      
      inline def setHintTextMouseUndefined: Self = StObject.set(x, "hintTextMouse", js.undefined)
      
      inline def setHintTextTouch(value: String): Self = StObject.set(x, "hintTextTouch", value.asInstanceOf[js.Any])
      
      inline def setHintTextTouchUndefined: Self = StObject.set(x, "hintTextTouch", js.undefined)
      
      inline def setHoverDelayInMs(value: Double): Self = StObject.set(x, "hoverDelayInMs", value.asInstanceOf[js.Any])
      
      inline def setHoverDelayInMsUndefined: Self = StObject.set(x, "hoverDelayInMs", js.undefined)
      
      inline def setHoverOffDelayInMs(value: Double): Self = StObject.set(x, "hoverOffDelayInMs", value.asInstanceOf[js.Any])
      
      inline def setHoverOffDelayInMsUndefined: Self = StObject.set(x, "hoverOffDelayInMs", js.undefined)
      
      inline def setImageClassName(value: String): Self = StObject.set(x, "imageClassName", value.asInstanceOf[js.Any])
      
      inline def setImageClassNameUndefined: Self = StObject.set(x, "imageClassName", js.undefined)
      
      inline def setImageStyle(value: CSSProperties): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
      
      inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
      
      inline def setIsActivatedOnTouch(value: Boolean): Self = StObject.set(x, "isActivatedOnTouch", value.asInstanceOf[js.Any])
      
      inline def setIsActivatedOnTouchUndefined: Self = StObject.set(x, "isActivatedOnTouch", js.undefined)
      
      inline def setIsEnlargedImagePortalEnabledForTouch(value: Boolean): Self = StObject.set(x, "isEnlargedImagePortalEnabledForTouch", value.asInstanceOf[js.Any])
      
      inline def setIsEnlargedImagePortalEnabledForTouchUndefined: Self = StObject.set(x, "isEnlargedImagePortalEnabledForTouch", js.undefined)
      
      inline def setIsHintEnabled(value: Boolean): Self = StObject.set(x, "isHintEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsHintEnabledUndefined: Self = StObject.set(x, "isHintEnabled", js.undefined)
      
      inline def setLargeImage(value: LargeImageType): Self = StObject.set(x, "largeImage", value.asInstanceOf[js.Any])
      
      inline def setLensComponent(value: () => Unit): Self = StObject.set(x, "lensComponent", js.Any.fromFunction0(value))
      
      inline def setLensComponentUndefined: Self = StObject.set(x, "lensComponent", js.undefined)
      
      inline def setLensStyle(value: CSSProperties): Self = StObject.set(x, "lensStyle", value.asInstanceOf[js.Any])
      
      inline def setLensStyleUndefined: Self = StObject.set(x, "lensStyle", js.undefined)
      
      inline def setPressDuration(value: Double): Self = StObject.set(x, "pressDuration", value.asInstanceOf[js.Any])
      
      inline def setPressDurationUndefined: Self = StObject.set(x, "pressDuration", js.undefined)
      
      inline def setPressMoveThreshold(value: Double): Self = StObject.set(x, "pressMoveThreshold", value.asInstanceOf[js.Any])
      
      inline def setPressMoveThresholdUndefined: Self = StObject.set(x, "pressMoveThreshold", js.undefined)
      
      inline def setShouldHideHintAfterFirstActivation(value: Boolean): Self = StObject.set(x, "shouldHideHintAfterFirstActivation", value.asInstanceOf[js.Any])
      
      inline def setShouldHideHintAfterFirstActivationUndefined: Self = StObject.set(x, "shouldHideHintAfterFirstActivation", js.undefined)
      
      inline def setShouldUsePositiveSpaceLens(value: Boolean): Self = StObject.set(x, "shouldUsePositiveSpaceLens", value.asInstanceOf[js.Any])
      
      inline def setShouldUsePositiveSpaceLensUndefined: Self = StObject.set(x, "shouldUsePositiveSpaceLens", js.undefined)
      
      inline def setSmallImage(value: SmallImageType): Self = StObject.set(x, "smallImage", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
