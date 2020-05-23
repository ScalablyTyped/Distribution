package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Canvas 2D API interface is used to declare a path that can then be used on a CanvasRenderingContext2D object. The path methods of the CanvasRenderingContext2D interface are also present on this interface, which gives you the convenience of being able to retain and replay your path whenever desired. */
@js.native
trait Path2D extends CanvasPath {
  /**
    * Adds to the path the path given by the argument.
    */
  def addPath(path: Path2D): Unit = js.native
  def addPath(path: Path2D, transform: DOMMatrix2DInit): Unit = js.native
}

