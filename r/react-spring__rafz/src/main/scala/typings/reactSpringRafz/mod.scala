package typings.reactSpringRafz

import typings.reactSpringRafz.typesMod.Rafz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object _Raf {
    
    @JSImport("@react-spring/rafz/dist/declarations/src", "__raf")
    @js.native
    val ^ : js.Any = js.native
    
    /** Clear internal state. Never call from update loop! */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    /** The number of pending tasks */
    inline def count(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Double]
    
    /** Whether there's a raf update loop running */
    inline def isRunning(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRunning")().asInstanceOf[Boolean]
  }
  
  @JSImport("@react-spring/rafz/dist/declarations/src", "raf")
  @js.native
  val raf: Rafz = js.native
}
