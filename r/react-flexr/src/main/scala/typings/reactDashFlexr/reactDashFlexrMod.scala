package typings.reactDashFlexr

import typings.reactDashFlexr.__ReactFlexr.ErgonomicType
import typings.reactDashFlexr.__ReactFlexr.OptimizedResize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-flexr", JSImport.Namespace)
@js.native
object reactDashFlexrMod extends js.Object {
  @js.native
  class Cell ()
    extends typings.reactDashFlexr.__ReactFlexr.Cell
  
  @js.native
  class Grid ()
    extends typings.reactDashFlexr.__ReactFlexr.Grid
  
  val desk: String = js.native
  val lap: String = js.native
  val optimizedResize: OptimizedResize = js.native
  val palm: String = js.native
  val portable: String = js.native
  def findBreakpoints(): js.Array[ErgonomicType] | Boolean = js.native
  def findMatch(arguments: ErgonomicType*): Boolean = js.native
  def getCurrentBreakpoints(): js.Array[ErgonomicType] = js.native
  def setBreakpoints(breakpoints: js.Array[ErgonomicType]): Unit = js.native
}

