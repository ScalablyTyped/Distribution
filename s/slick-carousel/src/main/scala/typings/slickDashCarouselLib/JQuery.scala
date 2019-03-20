package typings
package slickDashCarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Create slick component
    */
  def slick(): JQuery = js.native
  /**
    * Trigger non-specialized signature method
    * @param methodName
    * @param arg
    */
  def slick(methodName: java.lang.String, arg: js.Any*): js.Any = js.native
  def slick(options: JQuerySlickOptions): JQuery = js.native
  /**
    * Get Slick Object
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_getSlick(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.getSlick): JQuerySlick = js.native
  /**
    * Add a slide. If an index is provided, will add at that index, or before if addBefore is set. If no index is provided,
    * add to the end or to the beginning if addBefore is set. Accepts HTML String || Object
    * @param methodName The name of the method
    * @param html
    * @param index/div>
    * @param addBefore
    */
  @JSName("slick")
  def slick_slickAdd(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickAdd, html: java.lang.String): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(
    methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickAdd,
    html: java.lang.String,
    index: scala.Double
  ): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(
    methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickAdd,
    html: java.lang.String,
    index: scala.Double,
    addBefore: scala.Double
  ): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickAdd, html: js.Object): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(
    methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickAdd,
    html: js.Object,
    index: scala.Double
  ): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(
    methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickAdd,
    html: js.Object,
    index: scala.Double,
    addBefore: scala.Double
  ): JQuery = js.native
  /**
    * Returns the current slide index
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_slickCurrentSlide(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickCurrentSlide): scala.Double = js.native
  /**
    * Filters slides using jQuery .filter()
    * @param methodName The name of the method
    * @param func
    */
  @JSName("slick")
  def slick_slickFilter(
    methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickFilter,
    func: js.Function2[/* index */ scala.Double, /* element */ stdLib.Element, _]
  ): JQuery = js.native
  /**
    * Filters slides using jQuery .filter()
    * @param methodName The name of the method
    * @param selector
    */
  @JSName("slick")
  def slick_slickFilter(
    methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickFilter,
    selector: java.lang.String
  ): JQuery = js.native
  /**
    * Sets an individual value live. Set refresh to true if it's a UI update.
    * @param methodName The name of the method
    * @param option The option name
    */
  @JSName("slick")
  def slick_slickGetOption(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickGetOption, option: js.Any): JQuerySlickOptions = js.native
  /**
    * Navigates to a slide by index
    * @param methodName The name of the method
    * @param slide
    * @param animate
    */
  @JSName("slick")
  def slick_slickGoTo(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickGoTo, slide: scala.Double): JQuery = js.native
  @JSName("slick")
  def slick_slickGoTo(
    methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickGoTo,
    slide: scala.Double,
    animate: scala.Boolean
  ): JQuery = js.native
  /**
    * Navigates to the next slide
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_slickNext(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickNext): JQuery = js.native
  /**
    * Pauses autoplay
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_slickPause(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickPause): JQuery = js.native
  /**
    * Starts autoplay
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_slickPlay(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickPlay): JQuery = js.native
  /**
    * Navigates to the previous slide
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_slickPrev(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickPrev): JQuery = js.native
  /**
    * Remove slide by index. If removeBefore is set true, remove slide preceding index, or the first slide if no index is specified.
    * If removeBefore is set to false, remove the slide following index, or the last slide if no index is set.
    * @param methodName The name of the method
    * @param index
    * @param removeBefore
    */
  @JSName("slick")
  def slick_slickRemove(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickRemove, index: scala.Double): JQuery = js.native
  @JSName("slick")
  def slick_slickRemove(
    methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickRemove,
    index: scala.Double,
    removeBefore: scala.Double
  ): JQuery = js.native
  /**
    * Sets an individual value live. Set refresh to true if it's a UI update.
    * @param methodName The name of the method
    * @param option The option name
    * @param value depends on option
    * @param refresh
    */
  @JSName("slick")
  def slick_slickSetOption(
    methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickSetOption,
    option: java.lang.String,
    value: JQuerySlickOptions
  ): JQuery = js.native
  @JSName("slick")
  def slick_slickSetOption(
    methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickSetOption,
    option: java.lang.String,
    value: JQuerySlickOptions,
    refresh: scala.Boolean
  ): JQuery = js.native
  /**
    * Removes applied filtering
    * @param methodName The name of the method
    * @param index
    */
  @JSName("slick")
  def slick_slickUnfilter(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.slickUnfilter, index: scala.Double): JQuery = js.native
  /**
    * Deconstructs slick
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_unslick(methodName: slickDashCarouselLib.slickDashCarouselLibStrings.unslick): JQuery = js.native
}

