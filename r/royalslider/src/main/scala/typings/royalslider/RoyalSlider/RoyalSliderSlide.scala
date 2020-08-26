package typings.royalslider.RoyalSlider

import typings.royalslider.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderSlide extends js.Object {
  /**
    * TODO
    */
  var appendOnLoaded: Boolean = js.native
  /**
    * slide element
    */
  var content: JQuery = js.native
  /**
    * TODO
    */
  var contentAdded: Boolean = js.native
  /**
    * slide element wrapper
    */
  var holder: JQuery = js.native
  /**
    * slide index
    */
  var id: Double = js.native
  /**
    * TODO
    */
  var images: Null = js.native
  /**
    * TODO
    */
  var isAdded: Boolean = js.native
  /**
    * TODO
    */
  var isAppended: Boolean = js.native
  /**
    * TODO
    */
  var isBig: Boolean = js.native
  /**
    * TODO
    */
  var isLoaded: Boolean = js.native
  /**
    * TODO
    */
  var isLoading: Boolean = js.native
  /**
    * TODO
    */
  var isRendered: Boolean = js.native
  /**
    * TODO
    */
  var loadedTriggered: Boolean = js.native
  /**
    * TODO
    */
  var positionSet: Boolean = js.native
  /**
    * TODO
    */
  var sizeReady: Boolean = js.native
  /**
    * TODO
    */
  var thumbnail: String = js.native
}

object RoyalSliderSlide {
  @scala.inline
  def apply(
    appendOnLoaded: Boolean,
    content: JQuery,
    contentAdded: Boolean,
    holder: JQuery,
    id: Double,
    images: Null,
    isAdded: Boolean,
    isAppended: Boolean,
    isBig: Boolean,
    isLoaded: Boolean,
    isLoading: Boolean,
    isRendered: Boolean,
    loadedTriggered: Boolean,
    positionSet: Boolean,
    sizeReady: Boolean,
    thumbnail: String
  ): RoyalSliderSlide = {
    val __obj = js.Dynamic.literal(appendOnLoaded = appendOnLoaded.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentAdded = contentAdded.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], isAdded = isAdded.asInstanceOf[js.Any], isAppended = isAppended.asInstanceOf[js.Any], isBig = isBig.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], loadedTriggered = loadedTriggered.asInstanceOf[js.Any], positionSet = positionSet.asInstanceOf[js.Any], sizeReady = sizeReady.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoyalSliderSlide]
  }
  @scala.inline
  implicit class RoyalSliderSlideOps[Self <: RoyalSliderSlide] (val x: Self) extends AnyVal {
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
    def setAppendOnLoaded(value: Boolean): Self = this.set("appendOnLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: JQuery): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentAdded(value: Boolean): Self = this.set("contentAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setHolder(value: JQuery): Self = this.set("holder", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImages(value: Null): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAdded(value: Boolean): Self = this.set("isAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAppended(value: Boolean): Self = this.set("isAppended", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBig(value: Boolean): Self = this.set("isBig", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoaded(value: Boolean): Self = this.set("isLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRendered(value: Boolean): Self = this.set("isRendered", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadedTriggered(value: Boolean): Self = this.set("loadedTriggered", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionSet(value: Boolean): Self = this.set("positionSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeReady(value: Boolean): Self = this.set("sizeReady", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
  
}

