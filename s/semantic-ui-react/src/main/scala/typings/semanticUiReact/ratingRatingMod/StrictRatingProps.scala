package typings.semanticUiReact.ratingRatingMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.semanticUiReact.semanticUiReactStrings.auto
import typings.semanticUiReact.semanticUiReactStrings.heart
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.star
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictRatingProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /**
    * You can clear the rating by clicking on the current start rating.
    * By default a rating will be only clearable if there is 1 icon.
    * Setting to `true`/`false` will allow or disallow a user to clear their rating.
    */
  var clearable: js.UndefOr[Boolean | auto] = js.native
  
  /** The initial rating value. */
  var defaultRating: js.UndefOr[Double | String] = js.native
  
  /** You can disable or enable interactive rating.  Makes a read-only rating. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** A rating can use a set of star or heart icons. */
  var icon: js.UndefOr[star | heart] = js.native
  
  /** The total number of icons. */
  var maxRating: js.UndefOr[Double | String] = js.native
  
  /**
    * Called after user selects a new rating.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed rating.
    */
  var onRate: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      /* data */ RatingProps, 
      Unit
    ]
  ] = js.native
  
  /** The current number of active icons. */
  var rating: js.UndefOr[Double | String] = js.native
  
  /** A progress bar can vary in size. */
  var size: js.UndefOr[mini | tiny | small | large | huge | massive] = js.native
}
object StrictRatingProps {
  
  @scala.inline
  def apply(): StrictRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictRatingProps]
  }
  
  @scala.inline
  implicit class StrictRatingPropsOps[Self <: StrictRatingProps] (val x: Self) extends AnyVal {
    
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClearable(value: Boolean | auto): Self = this.set("clearable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearable: Self = this.set("clearable", js.undefined)
    
    @scala.inline
    def setDefaultRating(value: Double | String): Self = this.set("defaultRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRating: Self = this.set("defaultRating", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: star | heart): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setMaxRating(value: Double | String): Self = this.set("maxRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRating: Self = this.set("maxRating", js.undefined)
    
    @scala.inline
    def setOnRate(value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ RatingProps) => Unit): Self = this.set("onRate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRate: Self = this.set("onRate", js.undefined)
    
    @scala.inline
    def setRating(value: Double | String): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    
    @scala.inline
    def setSize(value: mini | tiny | small | large | huge | massive): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
