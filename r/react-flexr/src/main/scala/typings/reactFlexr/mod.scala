package typings.reactFlexr

import typings.react.mod.Component
import typings.reactFlexr.ReactFlexr.CellProps
import typings.reactFlexr.ReactFlexr.ErgonomicType
import typings.reactFlexr.ReactFlexr.GridProps
import typings.reactFlexr.ReactFlexr.OptimizedResize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-flexr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val desk: String = js.native
  
  def findBreakpoints(): js.Array[ErgonomicType] | Boolean = js.native
  
  def findMatch(arguments: ErgonomicType*): Boolean = js.native
  
  def getCurrentBreakpoints(): js.Array[ErgonomicType] = js.native
  
  val lap: String = js.native
  
  val optimizedResize: OptimizedResize = js.native
  
  val palm: String = js.native
  
  val portable: String = js.native
  
  def setBreakpoints(breakpoints: js.Array[ErgonomicType]): Unit = js.native
  
  @js.native
  class Cell ()
    extends Component[CellProps, js.Object, js.Any]
  
  @js.native
  class Grid ()
    extends Component[GridProps, js.Object, js.Any]
}
