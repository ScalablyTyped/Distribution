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
    val __obj = js.Dynamic.literal(appendOnLoaded = appendOnLoaded, content = content, contentAdded = contentAdded, holder = holder, id = id, images = images, isAdded = isAdded, isAppended = isAppended, isBig = isBig, isLoaded = isLoaded, isLoading = isLoading, isRendered = isRendered, loadedTriggered = loadedTriggered, positionSet = positionSet, sizeReady = sizeReady, thumbnail = thumbnail)
  
    __obj.asInstanceOf[RoyalSliderSlide]
  }
}

