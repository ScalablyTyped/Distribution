package typings.reactNativeRatings

import typings.react.mod.FunctionComponent
import typings.reactNativeRatings.anon.ImageSize
import typings.reactNativeRatings.swipeRatingMod.default
import typings.reactNativeRatings.tapRatingMod.TapRatingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-ratings", "AirbnbRating")
  @js.native
  val AirbnbRating: FunctionComponent[TapRatingProps] = js.native
  
  @JSImport("react-native-ratings", "Rating")
  @js.native
  open class Rating protected () extends default {
    def this(props: Any) = this()
  }
  /* static members */
  object Rating {
    
    @JSImport("react-native-ratings", "Rating")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-ratings", "Rating.defaultProps")
    @js.native
    def defaultProps: ImageSize = js.native
    inline def defaultProps_=(x: ImageSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
