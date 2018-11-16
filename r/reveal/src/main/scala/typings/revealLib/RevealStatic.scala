package typings
package revealLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevealStatic extends js.Object {
  // States
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): scala.Unit = js.native
  // States
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* event */ js.Any, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListeners(): scala.Unit = js.native
  def configure(diff: RevealOptions): scala.Unit = js.native
  def down(): scala.Unit = js.native
  def getConfig(): RevealOptions = js.native
  def getCurrentSlide(): stdLib.Element = js.native
  def getIndices(): Anon_H = js.native
  def getIndices(slide: stdLib.Element): Anon_H = js.native
  // Retrieves the previous and current slide elements
  def getPreviousSlide(): stdLib.Element = js.native
  def getProgress(): scala.Double = js.native
  def getQueryHash(): js.Any = js.native
  def getScale(): scala.Double = js.native
  def getSlide(x: scala.Double): stdLib.Element = js.native
  def getSlide(x: scala.Double, y: scala.Double): stdLib.Element = js.native
  // Returns the speaker notes for the current slide
  def getSlideNotes(): java.lang.String = js.native
  // Returns the speaker notes for the current slide
  def getSlideNotes(slide: stdLib.Element): java.lang.String = js.native
  def getState(): js.Any = js.native
  def getTotalSlides(): scala.Double = js.native
  def initialize(config: RevealOptions): scala.Unit = js.native
  def isAutoSliding(): scala.Boolean = js.native
  // State Checks
  def isFirstSlide(): scala.Boolean = js.native
  def isLastSlide(): scala.Boolean = js.native
  def isOverview(): scala.Boolean = js.native
  def isPaused(): scala.Boolean = js.native
  // undocumented method
  def layout(): scala.Unit = js.native
  def left(): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def nextFragment(): scala.Boolean = js.native
  def prev(): scala.Unit = js.native
  def prevFragment(): scala.Boolean = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* event */ js.Any, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def removeEventListeners(): scala.Unit = js.native
  def right(): scala.Unit = js.native
  def setState(state: js.Any): scala.Unit = js.native
  // Randomize the order of slides
  def shuffle(): scala.Unit = js.native
  // Navigation
  def slide(indexh: scala.Double): scala.Unit = js.native
  // Navigation
  def slide(indexh: scala.Double, indexv: scala.Double): scala.Unit = js.native
  // Navigation
  def slide(indexh: scala.Double, indexv: scala.Double, f: scala.Double): scala.Unit = js.native
  // Navigation
  def slide(indexh: scala.Double, indexv: scala.Double, f: scala.Double, o: scala.Double): scala.Unit = js.native
  // update slides after dynamic changes
  def sync(): scala.Unit = js.native
  def toggleAutoSlide(): scala.Unit = js.native
  def toggleAutoSlide(`override`: scala.Boolean): scala.Unit = js.native
  // Toogle presentation states
  def toggleOverview(): scala.Unit = js.native
  // Toogle presentation states
  def toggleOverview(`override`: scala.Boolean): scala.Unit = js.native
  def togglePause(): scala.Unit = js.native
  def togglePause(`override`: scala.Boolean): scala.Unit = js.native
  def up(): scala.Unit = js.native
}

