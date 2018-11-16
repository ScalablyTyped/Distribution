package typings
package reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselStatic[T]
  extends reactLib.reactMod.ReactNs.ComponentClass[CarouselProps[T], reactLib.reactMod.ReactNs.ComponentState] {
  /**
       * Current active item (int, starts at 0)
       */
  var currentIndex: scala.Double = js.native
  /**
       * Underlying ScrollView's current content offset
       * (int, starts at 0 if activeSlideAlignment is set to start, negative value otherwise)
       */
  var currentScrollPosition: scala.Double = js.native
  /**
       * Snap to an item manually
       */
  def snapToItem(index: scala.Double): scala.Unit = js.native
  /**
       * Snap to an item manually
       */
  def snapToItem(index: scala.Double, animated: scala.Boolean): scala.Unit = js.native
  /**
       * Snap to an item manually
       */
  def snapToItem(index: scala.Double, animated: scala.Boolean, fireCallback: scala.Boolean): scala.Unit = js.native
  /**
       * Snap to next item manually
       */
  def snapToNext(): scala.Unit = js.native
  /**
       * Snap to next item manually
       */
  def snapToNext(animated: scala.Boolean): scala.Unit = js.native
  /**
       * Snap to next item manually
       */
  def snapToNext(animated: scala.Boolean, fireCallback: scala.Boolean): scala.Unit = js.native
  /**
       * Snap to previous item manually
       */
  def snapToPrev(): scala.Unit = js.native
  /**
       * Snap to previous item manually
       */
  def snapToPrev(animated: scala.Boolean): scala.Unit = js.native
  /**
       * Snap to previous item manually
       */
  def snapToPrev(animated: scala.Boolean, fireCallback: scala.Boolean): scala.Unit = js.native
  /**
       * Start the autoplay manually
       */
  def startAutoplay(): scala.Unit = js.native
  /**
       * Start the autoplay manually
       */
  def startAutoplay(instantly: scala.Boolean): scala.Unit = js.native
  /**
       * Stop the autoplay manually
       */
  def stopAutoplay(): scala.Unit = js.native
  /**
       * Call this when needed to work around a random FlatList bug that keeps content hidden until the carousel is scrolled
       * (see #238). Note that the offset parameter is not required and will default to either 1 or -1 depending
       * on the current scroll position
       */
  def triggerRenderingHack(offset: scala.Double): scala.Unit = js.native
}

