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

object global {
  
  object ReactFlexr {
    
    @JSGlobal("__ReactFlexr.Cell")
    @js.native
    class Cell ()
      extends Component[CellProps, js.Object, js.Any]
    
    @JSGlobal("__ReactFlexr.Grid")
    @js.native
    class Grid ()
      extends Component[GridProps, js.Object, js.Any]
    
    @JSGlobal("__ReactFlexr.desk")
    @js.native
    val desk: String = js.native
    
    @JSGlobal("__ReactFlexr.findBreakpoints")
    @js.native
    def findBreakpoints(): js.Array[ErgonomicType] | Boolean = js.native
    
    @JSGlobal("__ReactFlexr.findMatch")
    @js.native
    def findMatch(arguments: ErgonomicType*): Boolean = js.native
    
    @JSGlobal("__ReactFlexr.getCurrentBreakpoints")
    @js.native
    def getCurrentBreakpoints(): js.Array[ErgonomicType] = js.native
    
    @JSGlobal("__ReactFlexr.lap")
    @js.native
    val lap: String = js.native
    
    @JSGlobal("__ReactFlexr.optimizedResize")
    @js.native
    val optimizedResize: OptimizedResize = js.native
    
    @JSGlobal("__ReactFlexr.palm")
    @js.native
    val palm: String = js.native
    
    @JSGlobal("__ReactFlexr.portable")
    @js.native
    val portable: String = js.native
    
    @JSGlobal("__ReactFlexr.setBreakpoints")
    @js.native
    def setBreakpoints(breakpoints: js.Array[ErgonomicType]): Unit = js.native
  }
}
