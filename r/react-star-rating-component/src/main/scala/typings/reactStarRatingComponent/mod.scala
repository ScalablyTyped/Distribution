package typings.reactStarRatingComponent

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-star-rating-component", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[StarRatingComponentProps, js.Object, js.Any]
  
  type StarRatingComponent = Component[StarRatingComponentProps, js.Object, js.Any]
  
  trait StarRatingComponentProps extends StObject {
    
    /** is component available for editing, default `true` */
    var editing: js.UndefOr[Boolean] = js.undefined
    
    /** color of non-selected icons */
    var emptyStarColor: js.UndefOr[String] = js.undefined
    
    /** name of the radio input */
    var name: String
    
    var onStarClick: js.UndefOr[
        js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
      ] = js.undefined
    
    var onStarHover: js.UndefOr[
        js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
      ] = js.undefined
    
    var onStarHoverOut: js.UndefOr[
        js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
      ] = js.undefined
    
    /** render method for the full-star icon */
    var renderStarIcon: js.UndefOr[
        js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, ReactNode | String]
      ] = js.undefined
    
    /** render method for the half-star icon */
    var renderStarIconHalf: js.UndefOr[
        js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, ReactNode | String]
      ] = js.undefined
    
    /** color of selected icons */
    var starColor: js.UndefOr[String] = js.undefined
    
    /** number of icons in rating, default `5` */
    var starCount: js.UndefOr[Double] = js.undefined
    
    /** the value of the star rating to display. i.e. the number of filled stars */
    var value: Double
  }
  object StarRatingComponentProps {
    
    inline def apply(name: String, value: Double): StarRatingComponentProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StarRatingComponentProps]
    }
    
    extension [Self <: StarRatingComponentProps](x: Self) {
      
      inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
      
      inline def setEmptyStarColor(value: String): Self = StObject.set(x, "emptyStarColor", value.asInstanceOf[js.Any])
      
      inline def setEmptyStarColorUndefined: Self = StObject.set(x, "emptyStarColor", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnStarClick(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): Self = StObject.set(x, "onStarClick", js.Any.fromFunction3(value))
      
      inline def setOnStarClickUndefined: Self = StObject.set(x, "onStarClick", js.undefined)
      
      inline def setOnStarHover(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): Self = StObject.set(x, "onStarHover", js.Any.fromFunction3(value))
      
      inline def setOnStarHoverOut(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): Self = StObject.set(x, "onStarHoverOut", js.Any.fromFunction3(value))
      
      inline def setOnStarHoverOutUndefined: Self = StObject.set(x, "onStarHoverOut", js.undefined)
      
      inline def setOnStarHoverUndefined: Self = StObject.set(x, "onStarHover", js.undefined)
      
      inline def setRenderStarIcon(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => ReactNode | String): Self = StObject.set(x, "renderStarIcon", js.Any.fromFunction3(value))
      
      inline def setRenderStarIconHalf(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => ReactNode | String): Self = StObject.set(x, "renderStarIconHalf", js.Any.fromFunction3(value))
      
      inline def setRenderStarIconHalfUndefined: Self = StObject.set(x, "renderStarIconHalf", js.undefined)
      
      inline def setRenderStarIconUndefined: Self = StObject.set(x, "renderStarIcon", js.undefined)
      
      inline def setStarColor(value: String): Self = StObject.set(x, "starColor", value.asInstanceOf[js.Any])
      
      inline def setStarColorUndefined: Self = StObject.set(x, "starColor", js.undefined)
      
      inline def setStarCount(value: Double): Self = StObject.set(x, "starCount", value.asInstanceOf[js.Any])
      
      inline def setStarCountUndefined: Self = StObject.set(x, "starCount", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
