package typings.statsJs

import typings.statsJs.Stats.Panel
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Stats")
  @js.native
  open class Stats ()
    extends StObject
       with typings.statsJs.Stats {
    
    /* CompleteClass */
    var REVISION: Double = js.native
    
    /* CompleteClass */
    override def addPanel(panel: Panel): Panel = js.native
    
    /* CompleteClass */
    override def begin(): Unit = js.native
    
    /* CompleteClass */
    var dom: HTMLDivElement = js.native
    
    /* CompleteClass */
    override def end(): Double = js.native
    
    /**
      * @param value 0:fps, 1: ms, 2: mb, 3+: custom
      */
    /* CompleteClass */
    override def showPanel(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
  }
  object Stats {
    
    @JSGlobal("Stats.Panel")
    @js.native
    open class Panel protected ()
      extends StObject
         with typings.statsJs.Stats.Panel {
      def this(name: String, foregroundColor: String, backgroundColor: String) = this()
      
      /* CompleteClass */
      var dom: HTMLCanvasElement = js.native
      
      /* CompleteClass */
      override def update(value: Double, maxValue: Double): Unit = js.native
    }
  }
}
