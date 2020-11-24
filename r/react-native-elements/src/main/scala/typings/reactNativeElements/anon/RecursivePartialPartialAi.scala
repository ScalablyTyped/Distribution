package typings.reactNativeElements.anon

import typings.reactNative.mod.ImageStyle
import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-ratings.react-native-ratings.AirbnbRatingProps>> */
@js.native
trait RecursivePartialPartialAi extends js.Object {
  
  var count: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var defaultRating: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var isDisabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var onFinishRating: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.native
  
  var reviews: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[String]]]] = js.native
  
  var selectedColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var showRating: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var size: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var starStyle: js.UndefOr[RecursivePartial[js.UndefOr[ImageStyle]]] = js.native
}
object RecursivePartialPartialAi {
  
  @scala.inline
  def apply(): RecursivePartialPartialAi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialAi]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialAiOps[Self <: RecursivePartialPartialAi] (val x: Self) extends AnyVal {
    
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
    def setCount(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setDefaultRating(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("defaultRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRating: Self = this.set("defaultRating", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setOnFinishRating(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = this.set("onFinishRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFinishRating: Self = this.set("onFinishRating", js.undefined)
    
    @scala.inline
    def setReviews(value: RecursivePartial[js.UndefOr[js.Array[String]]]): Self = this.set("reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviews: Self = this.set("reviews", js.undefined)
    
    @scala.inline
    def setSelectedColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedColor: Self = this.set("selectedColor", js.undefined)
    
    @scala.inline
    def setShowRating(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("showRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRating: Self = this.set("showRating", js.undefined)
    
    @scala.inline
    def setSize(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStarStyle(value: RecursivePartial[js.UndefOr[ImageStyle]]): Self = this.set("starStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarStyle: Self = this.set("starStyle", js.undefined)
  }
}
