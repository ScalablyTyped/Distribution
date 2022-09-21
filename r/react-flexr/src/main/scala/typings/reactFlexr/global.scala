package typings.reactFlexr

import typings.react.mod.Component
import typings.reactFlexr.ReactFlexr.CellProps
import typings.reactFlexr.ReactFlexr.ErgonomicType
import typings.reactFlexr.ReactFlexr.GridProps
import typings.reactFlexr.ReactFlexr.OptimizedResize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReactFlexr {
    
    @JSGlobal("__ReactFlexr")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("__ReactFlexr.Cell")
    @js.native
    open class Cell ()
      extends Component[CellProps, js.Object, Any]
    
    @JSGlobal("__ReactFlexr.Grid")
    @js.native
    open class Grid ()
      extends Component[GridProps, js.Object, Any]
    
    @JSGlobal("__ReactFlexr.desk")
    @js.native
    val desk: String = js.native
    
    inline def findBreakpoints(): js.Array[ErgonomicType] | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("findBreakpoints")().asInstanceOf[js.Array[ErgonomicType] | Boolean]
    
    inline def findMatch(arguments: ErgonomicType*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("findMatch")(arguments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Boolean]
    
    inline def getCurrentBreakpoints(): js.Array[ErgonomicType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentBreakpoints")().asInstanceOf[js.Array[ErgonomicType]]
    
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
    
    inline def setBreakpoints(breakpoints: js.Array[ErgonomicType]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBreakpoints")(breakpoints.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
