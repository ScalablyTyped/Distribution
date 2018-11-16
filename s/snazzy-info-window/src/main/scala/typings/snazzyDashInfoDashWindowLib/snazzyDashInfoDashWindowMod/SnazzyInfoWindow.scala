package typings
package snazzyDashInfoDashWindowLib.snazzyDashInfoDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnazzyInfoWindow
  extends googlemapsLib.googleNs.mapsNs.OverlayView {
  /**
       * Will attempt to close the info window.
       */
  def close(): scala.Unit = js.native
  /**
       * Will destroy the info window.
       * If the info window is open it will be forced closed bypassing the regular beforeClose callback.
       * All Google Map event listeners associated to this info window will be removed.
       */
  def destroy(): scala.Unit = js.native
  /**
       * Will return the DOM Element for the wrapper container of the info window.
       */
  def getWrapper(): stdLib.HTMLElement = js.native
  /**
       * Determines if the info window is open.
       */
  def isOpen(): scala.Boolean = js.native
  /**
       * Will attempt to open the info window.
       */
  def open(): scala.Unit = js.native
  /**
       * Set the content in the info window.
       * This can be called at any time.
       * @param content string od DOM element
       */
  def setContent(content: java.lang.String): scala.Unit = js.native
  /**
       * Set the content in the info window.
       * This can be called at any time.
       * @param content string od DOM element
       */
  def setContent(content: stdLib.HTMLElement): scala.Unit = js.native
  /**
       * Set the position of the info window.
       * A valid Google Map instance must be associated to the info window.
       * This could be either through the marker or map option.
       */
  def setPosition(latLng: googlemapsLib.googleNs.mapsNs.LatLng): scala.Unit = js.native
  /**
       * Set the position of the info window.
       * A valid Google Map instance must be associated to the info window.
       * This could be either through the marker or map option.
       */
  def setPosition(latLng: googlemapsLib.googleNs.mapsNs.LatLngLiteral): scala.Unit = js.native
}

