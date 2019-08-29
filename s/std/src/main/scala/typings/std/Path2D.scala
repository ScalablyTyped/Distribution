package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
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

@JSGlobal("Path2D")
@js.native
class Path2DCls () extends Path2D {
  def this(path: java.lang.String) = this()
  def this(path: Path2D) = this()
}

@JSGlobal("Path2D")
@js.native
object Path2D
  extends Instantiable0[Path2D]
     with Instantiable1[(/* path */ Path2D) | (/* path */ java.lang.String), Path2D]

