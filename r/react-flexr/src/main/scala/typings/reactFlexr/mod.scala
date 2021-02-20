package typings.reactFlexr

import typings.react.mod.Component
import typings.reactFlexr.ReactFlexr.CellProps
import typings.reactFlexr.ReactFlexr.ErgonomicType
import typings.reactFlexr.ReactFlexr.GridProps
import typings.reactFlexr.ReactFlexr.OptimizedResize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-flexr", "Cell")
  @js.native
  class Cell ()
    extends Component[CellProps, js.Object, js.Any]
  
  @JSImport("react-flexr", "Grid")
  @js.native
  class Grid ()
    extends Component[GridProps, js.Object, js.Any]
  
  @JSImport("react-flexr", "desk")
  @js.native
  val desk: String = js.native
  
  @JSImport("react-flexr", "findBreakpoints")
  @js.native
  def findBreakpoints(): js.Array[ErgonomicType] | Boolean = js.native
  
  @JSImport("react-flexr", "findMatch")
  @js.native
  def findMatch(arguments: ErgonomicType*): Boolean = js.native
  
  @JSImport("react-flexr", "getCurrentBreakpoints")
  @js.native
  def getCurrentBreakpoints(): js.Array[ErgonomicType] = js.native
  
  @JSImport("react-flexr", "lap")
  @js.native
  val lap: String = js.native
  
  @JSImport("react-flexr", "optimizedResize")
  @js.native
  val optimizedResize: OptimizedResize = js.native
  
  @JSImport("react-flexr", "palm")
  @js.native
  val palm: String = js.native
  
  @JSImport("react-flexr", "portable")
  @js.native
  val portable: String = js.native
  
  @JSImport("react-flexr", "setBreakpoints")
  @js.native
  def setBreakpoints(breakpoints: js.Array[ErgonomicType]): Unit = js.native
}
