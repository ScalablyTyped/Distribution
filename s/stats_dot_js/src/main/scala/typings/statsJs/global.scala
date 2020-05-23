package typings.statsJs

import typings.statsJs.Stats.Panel
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Stats ()
    extends typings.statsJs.Stats {
    /* CompleteClass */
    override var REVISION: Double = js.native
    /* CompleteClass */
    override var dom: HTMLDivElement = js.native
    /* CompleteClass */
    override def addPanel(panel: Panel): Panel = js.native
    /* CompleteClass */
    override def begin(): Unit = js.native
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
  
  @js.native
  object Stats extends js.Object {
    @js.native
    class Panel protected ()
      extends typings.statsJs.Stats.Panel {
      def this(name: String, foregroundColor: String, backgroundColor: String) = this()
      /* CompleteClass */
      override var dom: HTMLCanvasElement = js.native
      /* CompleteClass */
      override def update(value: Double, maxValue: Double): Unit = js.native
    }
    
  }
  
}

