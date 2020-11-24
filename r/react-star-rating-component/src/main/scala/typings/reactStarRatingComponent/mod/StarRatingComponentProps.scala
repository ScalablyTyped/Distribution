package typings.reactStarRatingComponent.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StarRatingComponentProps extends js.Object {
  
  /** is component available for editing, default `true` */
  var editing: js.UndefOr[Boolean] = js.native
  
  /** color of non-selected icons */
  var emptyStarColor: js.UndefOr[String] = js.native
  
  /** name of the radio input */
  var name: String = js.native
  
  var onStarClick: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
  ] = js.native
  
  var onStarHover: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
  ] = js.native
  
  var onStarHoverOut: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
  ] = js.native
  
  /** render method for the full-star icon */
  var renderStarIcon: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, ReactNode | String]
  ] = js.native
  
  /** render method for the half-star icon */
  var renderStarIconHalf: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, ReactNode | String]
  ] = js.native
  
  /** color of selected icons */
  var starColor: js.UndefOr[String] = js.native
  
  /** number of icons in rating, default `5` */
  var starCount: js.UndefOr[Double] = js.native
  
  /** the value of the star rating to display. i.e. the number of filled stars */
  var value: Double = js.native
}
object StarRatingComponentProps {
  
  @scala.inline
  def apply(name: String, value: Double): StarRatingComponentProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingComponentProps]
  }
  
  @scala.inline
  implicit class StarRatingComponentPropsOps[Self <: StarRatingComponentProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditing(value: Boolean): Self = this.set("editing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditing: Self = this.set("editing", js.undefined)
    
    @scala.inline
    def setEmptyStarColor(value: String): Self = this.set("emptyStarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyStarColor: Self = this.set("emptyStarColor", js.undefined)
    
    @scala.inline
    def setOnStarClick(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): Self = this.set("onStarClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnStarClick: Self = this.set("onStarClick", js.undefined)
    
    @scala.inline
    def setOnStarHover(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): Self = this.set("onStarHover", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnStarHover: Self = this.set("onStarHover", js.undefined)
    
    @scala.inline
    def setOnStarHoverOut(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): Self = this.set("onStarHoverOut", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnStarHoverOut: Self = this.set("onStarHoverOut", js.undefined)
    
    @scala.inline
    def setRenderStarIcon(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => ReactNode | String): Self = this.set("renderStarIcon", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRenderStarIcon: Self = this.set("renderStarIcon", js.undefined)
    
    @scala.inline
    def setRenderStarIconHalf(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => ReactNode | String): Self = this.set("renderStarIconHalf", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRenderStarIconHalf: Self = this.set("renderStarIconHalf", js.undefined)
    
    @scala.inline
    def setStarColor(value: String): Self = this.set("starColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarColor: Self = this.set("starColor", js.undefined)
    
    @scala.inline
    def setStarCount(value: Double): Self = this.set("starCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarCount: Self = this.set("starCount", js.undefined)
  }
}
