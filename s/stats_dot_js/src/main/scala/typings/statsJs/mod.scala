package typings.statsJs

import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stats.js", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Stats {
    
    /* CompleteClass */
    var REVISION: Double = js.native
    
    /* CompleteClass */
    override def addPanel(panel: typings.statsJs.Stats.Panel): typings.statsJs.Stats.Panel = js.native
    
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
  
  @JSImport("stats.js", "Panel")
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
