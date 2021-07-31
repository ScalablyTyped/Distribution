package typings.rcProgress

import typings.rcProgress.interfaceMod.ProgressProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("rc-progress", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-progress", "default.Circle")
    @js.native
    def Circle: FC[ProgressProps] = js.native
    @scala.inline
    def Circle_=(x: FC[ProgressProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-progress", "default.Line")
    @js.native
    def Line: FC[ProgressProps] = js.native
    @scala.inline
    def Line_=(x: FC[ProgressProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-progress", "Circle")
  @js.native
  val Circle: FC[ProgressProps] = js.native
  
  @JSImport("rc-progress", "Line")
  @js.native
  val Line: FC[ProgressProps] = js.native
}
