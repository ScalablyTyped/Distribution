package typings.snazzyInfoWindow.mod

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.OverlayView
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnazzyInfoWindow extends OverlayView {
  
  /**
    * Will attempt to close the info window.
    */
  def close(): Unit = js.native
  
  /**
    * Will destroy the info window.
    * If the info window is open it will be forced closed bypassing the regular beforeClose callback.
    * All Google Map event listeners associated to this info window will be removed.
    */
  def destroy(): Unit = js.native
  
  /**
    * Will return the DOM Element for the wrapper container of the info window.
    */
  def getWrapper(): HTMLElement = js.native
  
  /**
    * Determines if the info window is open.
    */
  def isOpen(): Boolean = js.native
  
  /**
    * Will attempt to open the info window.
    */
  def open(): Unit = js.native
  
  /**
    * Set the content in the info window.
    * This can be called at any time.
    * @param content string od DOM element
    */
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  
  /**
    * Set the position of the info window.
    * A valid Google Map instance must be associated to the info window.
    * This could be either through the marker or map option.
    */
  def setPosition(latLng: LatLng): Unit = js.native
  def setPosition(latLng: LatLngLiteral): Unit = js.native
}
