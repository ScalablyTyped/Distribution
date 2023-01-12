package typings.reactMdMedia

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMediaContainerMod {
  
  @JSImport("@react-md/media/types/MediaContainer", "MediaContainer")
  @js.native
  val MediaContainer: ForwardRefExoticComponent[
    (MediaContainerProps & RefAttributes[HTMLDivElement]) | (MediaContainerWithAspectRatioProps & RefAttributes[HTMLDivElement])
  ] = js.native
  
  trait MediaContainerProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if any media element children should be updated to be responsive.
      */
    var auto: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the media container should have a `width: 100%;` applied.
      */
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional aspect ratio height to enforce. This **must** be used alongside
      * the `width` prop.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional aspect ratio width to enforce. This **must** be used alongside
      * the `height` prop.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object MediaContainerProps {
    
    inline def apply(): MediaContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaContainerProps] (val x: Self) extends AnyVal {
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MediaContainerWithAspectRatioProps
    extends StObject
       with MediaContainerProps {
    
    @JSName("height")
    var height_MediaContainerWithAspectRatioProps: Double
    
    @JSName("width")
    var width_MediaContainerWithAspectRatioProps: Double
  }
  object MediaContainerWithAspectRatioProps {
    
    inline def apply(height: Double, width: Double): MediaContainerWithAspectRatioProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaContainerWithAspectRatioProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaContainerWithAspectRatioProps] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
