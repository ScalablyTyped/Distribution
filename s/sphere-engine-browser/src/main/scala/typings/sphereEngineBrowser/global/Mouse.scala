package typings.sphereEngineBrowser.global

import typings.sphereEngineBrowser.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a mouse-like pointing device.
  */
@JSGlobal("Mouse")
@js.native
open class Mouse ()
  extends StObject
     with typings.sphereEngineBrowser.Mouse {
  
  /** Clear any events from the mouse queue that haven't yet been retrieved with `getEvent`. */
  /* CompleteClass */
  override def clearQueue(): Unit = js.native
  
  /**
    * Get the next event in the mouse queue. The event is removed from the queue.
    * @returns A `MouseEvent` object describing the event retrieved, if any.
    */
  /* CompleteClass */
  override def getEvent(): MouseEvent = js.native
  
  /**
    * Get a Boolean value indicating whether a given mouse button is currently pressed down.
    * @param key A member of `MouseKey` naming the mouse button to check.
    * @returns `true` if the button is currently pressed down, otherwise `false`.
    */
  /* CompleteClass */
  override def isPressed(key: typings.sphereEngineBrowser.MouseKey): Boolean = js.native
  
  /**
    * 2D position of the mouse cursor in pixels, relative to the top-left corner of the game,
    * represented as a two-element array (2-tuple).
    */
  /* CompleteClass */
  override val position: js.Tuple2[Double, Double] = js.native
  
  /** X coordinate of the mouse cursor in pixels, relative to the top-left corner of the game. */
  /* CompleteClass */
  override val x: Double = js.native
  
  /** Y coordinate of the mouse cursor in pixels, relative to the top-left corner of the game. */
  /* CompleteClass */
  override val y: Double = js.native
}
object Mouse {
  
  /** The default mouse device provided by the engine. */
  /* static member */
  @JSGlobal("Mouse.Default")
  @js.native
  val Default: typings.sphereEngineBrowser.Mouse = js.native
}
