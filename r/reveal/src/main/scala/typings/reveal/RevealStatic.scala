package typings.reveal

import org.scalablytyped.runtime.StringDictionary
import typings.reveal.anon.H
import typings.reveal.anon.Next
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevealStatic extends StObject {
  
  // States
  def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit], useCapture: Boolean): Unit = js.native
  
  def addEventListeners(): Unit = js.native
  
  def availableFragments(): Next = js.native
  
  def configure(): Unit = js.native
  def configure(diff: RevealOptions): Unit = js.native
  
  def down(): Unit = js.native
  
  def getConfig(): RevealOptions = js.native
  
  def getCurrentSlide(): Element = js.native
  
  def getIndices(): H = js.native
  def getIndices(slide: Element): H = js.native
  
  def getPlugin(name: String): Plugin = js.native
  
  def getPlugins(): StringDictionary[Plugin] = js.native
  
  // Retrieves the previous and current slide elements
  def getPreviousSlide(): Element = js.native
  
  def getProgress(): Double = js.native
  
  def getQueryHash(): Any = js.native
  
  def getScale(): Double = js.native
  
  def getSlide(x: Double): Element = js.native
  def getSlide(x: Double, y: Double): Element = js.native
  
  // Returns the speaker notes for the current slide
  def getSlideNotes(): String = js.native
  def getSlideNotes(slide: Element): String = js.native
  
  def getState(): Any = js.native
  
  def getTotalSlides(): Double = js.native
  
  // Plugins
  def hasPlugin(name: String): Boolean = js.native
  
  def initialize(): js.Promise[Any] = js.native
  def initialize(config: RevealOptions): js.Promise[Any] = js.native
  
  def isAutoSliding(): Boolean = js.native
  
  // State Checks
  def isFirstSlide(): Boolean = js.native
  
  def isLastSlide(): Boolean = js.native
  
  def isOverview(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
  
  // undocumented method
  def layout(): Unit = js.native
  
  def left(): Unit = js.native
  
  def next(): Unit = js.native
  
  def nextFragment(): Boolean = js.native
  
  def prev(): Unit = js.native
  
  def prevFragment(): Boolean = js.native
  
  def removeEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit], useCapture: Boolean): Unit = js.native
  
  def removeEventListeners(): Unit = js.native
  
  def right(): Unit = js.native
  
  def setState(state: Any): Unit = js.native
  
  // Randomize the order of slides
  def shuffle(): Unit = js.native
  
  // Navigation
  def slide(indexh: Double): Unit = js.native
  def slide(indexh: Double, indexv: Double): Unit = js.native
  def slide(indexh: Double, indexv: Double, f: Double): Unit = js.native
  def slide(indexh: Double, indexv: Double, f: Double, o: Double): Unit = js.native
  def slide(indexh: Double, indexv: Double, f: Unit, o: Double): Unit = js.native
  def slide(indexh: Double, indexv: Unit, f: Double): Unit = js.native
  def slide(indexh: Double, indexv: Unit, f: Double, o: Double): Unit = js.native
  def slide(indexh: Double, indexv: Unit, f: Unit, o: Double): Unit = js.native
  
  // update slides after dynamic changes
  def sync(): Unit = js.native
  
  def toggleAutoSlide(): Unit = js.native
  def toggleAutoSlide(`override`: Boolean): Unit = js.native
  
  // Toggle presentation states
  def toggleOverview(): Unit = js.native
  def toggleOverview(`override`: Boolean): Unit = js.native
  
  def togglePause(): Unit = js.native
  def togglePause(`override`: Boolean): Unit = js.native
  
  def up(): Unit = js.native
}
