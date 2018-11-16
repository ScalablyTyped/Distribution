package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "TouchSequence")
@js.native
class TouchSequence protected () extends js.Object {
  /*
      * @param {!WebDriver} driver The driver instance to use.
      * @constructor
      */
  def this(driver: WebDriver) = this()
  /**
     * Double taps an element.
     *
     * @param {!WebElement} elem The element to double tap.
     * @return {!TouchSequence} A self reference.
     */
  def doubleTap(elem: WebElement): TouchSequence = js.native
  /**
     * Flick, starting anywhere on the screen, at speed xspeed and yspeed.
     *
     * @param {{xspeed: number, yspeed: number}} speed The speed to flick in each
     direction, in pixels per second.
     * @return {!TouchSequence} A self reference.
     */
  def flick(speed: ISpeed): TouchSequence = js.native
  /**
     * Flick starting at elem and moving by x and y at specified speed.
     *
     * @param {!WebElement} elem The element where flick starts.
     * @param {{x: number, y: number}} offset The offset to flick to.
     * @param {number} speed The speed to flick at in pixels per second.
     * @return {!TouchSequence} A self reference.
     */
  def flickElement(elem: WebElement, offset: IOffset, speed: scala.Double): TouchSequence = js.native
  /**
     * Long press on an element.
     *
     * @param {!WebElement} elem The element to long press.
     * @return {!TouchSequence} A self reference.
     */
  def longPress(elem: WebElement): TouchSequence = js.native
  /**
     * Move a held {@linkplain #tapAndHold touch} to the specified location.
     *
     * @param {{x: number, y: number}} location The location to move to.
     * @return {!TouchSequence} A self reference.
     */
  def move(location: ILocation): TouchSequence = js.native
  /**
     * Executes this action sequence.
     * @return {!promise.Promise} A promise that will be resolved once
     *     this sequence has completed.
     */
  def perform(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Release a held {@linkplain #tapAndHold touch} at the specified location.
     *
     * @param {{x: number, y: number}} location The location to release at.
     * @return {!TouchSequence} A self reference.
     */
  def release(location: ILocation): TouchSequence = js.native
  /**
     * Scrolls the touch screen by the given offset.
     *
     * @param {{x: number, y: number}} offset The offset to scroll to.
     * @return {!TouchSequence} A self reference.
     */
  def scroll(offset: IOffset): TouchSequence = js.native
  /**
     * Scrolls the touch screen, starting on `elem` and moving by the specified
     * offset.
     *
     * @param {!WebElement} elem The element where scroll starts.
     * @param {{x: number, y: number}} offset The offset to scroll to.
     * @return {!TouchSequence} A self reference.
     */
  def scrollFromElement(elem: WebElement, offset: IOffset): TouchSequence = js.native
  /**
     * Taps an element.
     *
     * @param {!WebElement} elem The element to tap.
     * @return {!TouchSequence} A self reference.
     */
  def tap(elem: WebElement): TouchSequence = js.native
  /**
     * Touch down at the given location.
     *
     * @param {{ x: number, y: number }} location The location to touch down at.
     * @return {!TouchSequence} A self reference.
     */
  def tapAndHold(location: ILocation): TouchSequence = js.native
}

