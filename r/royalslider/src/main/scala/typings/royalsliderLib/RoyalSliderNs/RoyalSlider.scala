package typings
package royalsliderLib.RoyalSliderNs

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
  var currSlideId: scala.Double = js.native
  /**
    * Boolean, changes on mouseup, indicates if slide was dragged. Used to check if event is drag or click.
    */
  var dragSuccess: scala.Boolean = js.native
  /**
    * jQuery object with slider events
    */
  var ev: royalsliderLib.JQuery = js.native
  /**
    * height of slider
    */
  var height: scala.Double = js.native
  /**
    * indicates if slider is in fullscreen mode
    */
  var isFullscreen: scala.Boolean = js.native
  /**
    * indicates if browser supports native fullscreen
    */
  var nativeFS: scala.Boolean = js.native
  /**
    * total number of slides
    */
  var numSlides: scala.Double = js.native
  /**
    * contains all data about each slide
    */
  var slides: js.Array[RoyalSliderSlide] = js.native
  /**
    * Contains list of HTML slides that are added to slider
    */
  var slidesJQ: js.Array[royalsliderLib.JQuery] = js.native
   //TODO: what type?
  /**
    * Object with slider settings
    */
  var st: RoyalSliderOptions = js.native
  /**
    * width of slider
    */
  var width: scala.Double = js.native
  /**
    * Dynamic slides adding/removing
    */
  def appendSlide(element: royalsliderLib.JQuery): scala.Unit = js.native
  def appendSlide(element: royalsliderLib.JQuery, index: scala.Double): scala.Unit = js.native
  /**
    * removes all events and clears all slider data (use on ajax sites to avoid memory leaks)
    */
  def destroy(): scala.Unit = js.native
  /**
    * Enter Fullscreen mode
    */
  def enterFullscreen(): scala.Unit = js.native
  /**
    * Exit Fullscreen mode
    */
  def exitFullscreen(): scala.Unit = js.native
  //TODO: extends/implements JQuery? (giving problems due to next(), prev(), width and height and 'selector'.
  /**
    * go to slide with id
    */
  def goTo(id: scala.Double): scala.Unit = js.native
  /**
    * next slide
    */
  def next(): scala.Unit = js.native
  /**
    * Play video
    */
  def playVideo(): scala.Unit = js.native
  /**
    * prev slide
    */
  def prev(): scala.Unit = js.native
  /**
    * Remove slide
    */
  def removeSlide(): scala.Unit = js.native
  def removeSlide(index: scala.Double): scala.Unit = js.native
  /**
    * changes orientation of thumbnails
    */
  def setThumbsOrientation(orientation: java.lang.String): scala.Unit = js.native
  /**
    * Start autoplay
    */
  def startAutoPlay(): scala.Unit = js.native
  /**
    * Stop autoplay
    */
  def stopAutoPlay(): scala.Unit = js.native
  /**
    * Stop video
    */
  def stopVideo(): scala.Unit = js.native
  /**
    * Toggle autoplay between start and stop
    */
  def toggleAutoPlay(): scala.Unit = js.native
  /**
    * Toggle video between start and stop
    */
  def toggleVideo(): scala.Unit = js.native
  /**
    * updates size of slider.  Use after you resize slider with js.
    */
  def updateSliderSize(): scala.Unit = js.native
  def updateSliderSize(forceResize: scala.Boolean): scala.Unit = js.native
  /**
    * updates size of thumbnails
    */
  def updateThumbsSize(): scala.Unit = js.native
}

