package typings.reactStarRatings

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-star-ratings", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[StarRatingProps, js.Object, Any]
  
  trait StarRatingProps extends StObject {
    
    var changeRating: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.undefined
    
    var gradientPathName: js.UndefOr[String] = js.undefined
    
    var ignoreInlineStyles: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var numberOfStars: js.UndefOr[Double] = js.undefined
    
    var rating: js.UndefOr[Double] = js.undefined
    
    var starDimension: js.UndefOr[String] = js.undefined
    
    var starEmptyColor: js.UndefOr[String] = js.undefined
    
    var starHoverColor: js.UndefOr[String] = js.undefined
    
    var starRatedColor: js.UndefOr[String] = js.undefined
    
    var starSpacing: js.UndefOr[String] = js.undefined
    
    var svgIconPath: js.UndefOr[String] = js.undefined
    
    var svgIconViewBox: js.UndefOr[String] = js.undefined
  }
  object StarRatingProps {
    
    inline def apply(): StarRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarRatingProps]
    }
    
    extension [Self <: StarRatingProps](x: Self) {
      
      inline def setChangeRating(value: /* rating */ Double => Unit): Self = StObject.set(x, "changeRating", js.Any.fromFunction1(value))
      
      inline def setChangeRatingUndefined: Self = StObject.set(x, "changeRating", js.undefined)
      
      inline def setGradientPathName(value: String): Self = StObject.set(x, "gradientPathName", value.asInstanceOf[js.Any])
      
      inline def setGradientPathNameUndefined: Self = StObject.set(x, "gradientPathName", js.undefined)
      
      inline def setIgnoreInlineStyles(value: Boolean): Self = StObject.set(x, "ignoreInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInlineStylesUndefined: Self = StObject.set(x, "ignoreInlineStyles", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNumberOfStars(value: Double): Self = StObject.set(x, "numberOfStars", value.asInstanceOf[js.Any])
      
      inline def setNumberOfStarsUndefined: Self = StObject.set(x, "numberOfStars", js.undefined)
      
      inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      inline def setStarDimension(value: String): Self = StObject.set(x, "starDimension", value.asInstanceOf[js.Any])
      
      inline def setStarDimensionUndefined: Self = StObject.set(x, "starDimension", js.undefined)
      
      inline def setStarEmptyColor(value: String): Self = StObject.set(x, "starEmptyColor", value.asInstanceOf[js.Any])
      
      inline def setStarEmptyColorUndefined: Self = StObject.set(x, "starEmptyColor", js.undefined)
      
      inline def setStarHoverColor(value: String): Self = StObject.set(x, "starHoverColor", value.asInstanceOf[js.Any])
      
      inline def setStarHoverColorUndefined: Self = StObject.set(x, "starHoverColor", js.undefined)
      
      inline def setStarRatedColor(value: String): Self = StObject.set(x, "starRatedColor", value.asInstanceOf[js.Any])
      
      inline def setStarRatedColorUndefined: Self = StObject.set(x, "starRatedColor", js.undefined)
      
      inline def setStarSpacing(value: String): Self = StObject.set(x, "starSpacing", value.asInstanceOf[js.Any])
      
      inline def setStarSpacingUndefined: Self = StObject.set(x, "starSpacing", js.undefined)
      
      inline def setSvgIconPath(value: String): Self = StObject.set(x, "svgIconPath", value.asInstanceOf[js.Any])
      
      inline def setSvgIconPathUndefined: Self = StObject.set(x, "svgIconPath", js.undefined)
      
      inline def setSvgIconViewBox(value: String): Self = StObject.set(x, "svgIconViewBox", value.asInstanceOf[js.Any])
      
      inline def setSvgIconViewBoxUndefined: Self = StObject.set(x, "svgIconViewBox", js.undefined)
    }
  }
  
  type StarRatings = Component[StarRatingProps, js.Object, Any]
}
