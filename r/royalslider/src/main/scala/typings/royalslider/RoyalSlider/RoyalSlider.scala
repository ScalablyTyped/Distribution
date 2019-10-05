package typings.royalslider.RoyalSlider

import typings.royalslider.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSlider extends js.Object {
  /**
    * current slide object
    */
  var currSlide: RoyalSliderSlide = js.native
  /**
    * current slide index
    */
  var currSlideId: Double = js.native
  /**
    * Boolean, changes on mouseup, indicates if slide was dragged. Used to check if event is drag or click.
    */
  var dragSuccess: Boolean = js.native
  /**
    * jQuery object with slider events
    */
  var ev: JQuery = js.native
  /**
    * height of slider
    */
  var height: Double = js.native
  /**
    * indicates if slider is in fullscreen mode
    */
  var isFullscreen: Boolean = js.native
  /**
    * indicates if browser supports native fullscreen
    */
  var nativeFS: Boolean = js.native
  /**
    * total number of slides
    */
  var numSlides: Double = js.native
  /**
    * contains all data about each slide
    */
  var slides: js.Array[RoyalSliderSlide] = js.native
  /**
    * Contains list of HTML slides that are added to slider
    */
  var slidesJQ: js.Array[JQuery] = js.native
   //TODO: what type?
  /**
    * Object with slider settings
    */
  var st: RoyalSliderOptions = js.native
  /**
    * width of slider
    */
  var width: Double = js.native
  /**
    * Dynamic slides adding/removing
    */
  def appendSlide(element: JQuery): Unit = js.native
  def appendSlide(element: JQuery, index: Double): Unit = js.native
  /**
    * removes all events and clears all slider data (use on ajax sites to avoid memory leaks)
    */
  def destroy(): Unit = js.native
  /**
    * Enter Fullscreen mode
    */
  def enterFullscreen(): Unit = js.native
  /**
    * Exit Fullscreen mode
    */
  def exitFullscreen(): Unit = js.native
  //TODO: extends/implements JQuery? (giving problems due to next(), prev(), width and height and 'selector'.
  /**
    * go to slide with id
    */
  def goTo(id: Double): Unit = js.native
  /**
    * next slide
    */
  def next(): Unit = js.native
  /**
    * Play video
    */
  def playVideo(): Unit = js.native
  /**
    * prev slide
    */
  def prev(): Unit = js.native
  /**
    * Remove slide
    */
  def removeSlide(): Unit = js.native
  def removeSlide(index: Double): Unit = js.native
  /**
    * changes orientation of thumbnails
    */
  def setThumbsOrientation(orientation: String): Unit = js.native
  /**
    * Start autoplay
    */
  def startAutoPlay(): Unit = js.native
  /**
    * Stop autoplay
    */
  def stopAutoPlay(): Unit = js.native
  /**
    * Stop video
    */
  def stopVideo(): Unit = js.native
  /**
    * Toggle autoplay between start and stop
    */
  def toggleAutoPlay(): Unit = js.native
  /**
    * Toggle video between start and stop
    */
  def toggleVideo(): Unit = js.native
  /**
    * updates size of slider.  Use after you resize slider with js.
    */
  def updateSliderSize(): Unit = js.native
  def updateSliderSize(forceResize: Boolean): Unit = js.native
  /**
    * updates size of thumbnails
    */
  def updateThumbsSize(): Unit = js.native
}

