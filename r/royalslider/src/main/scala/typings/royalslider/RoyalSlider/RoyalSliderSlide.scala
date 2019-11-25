package typings.royalslider.RoyalSlider

import typings.royalslider.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoyalSliderSlide extends js.Object {
  /**
    * TODO
    */
  var appendOnLoaded: Boolean
  /**
    * slide element
    */
  var content: JQuery
  /**
    * TODO
    */
  var contentAdded: Boolean
  /**
    * slide element wrapper
    */
  var holder: JQuery
  /**
    * slide index
    */
  var id: Double
  /**
    * TODO
    */
  var images: Null
  /**
    * TODO
    */
  var isAdded: Boolean
  /**
    * TODO
    */
  var isAppended: Boolean
  /**
    * TODO
    */
  var isBig: Boolean
  /**
    * TODO
    */
  var isLoaded: Boolean
  /**
    * TODO
    */
  var isLoading: Boolean
  /**
    * TODO
    */
  var isRendered: Boolean
  /**
    * TODO
    */
  var loadedTriggered: Boolean
  /**
    * TODO
    */
  var positionSet: Boolean
  /**
    * TODO
    */
  var sizeReady: Boolean
  /**
    * TODO
    */
  var thumbnail: String
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
}

