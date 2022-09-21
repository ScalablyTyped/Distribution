package typings.reactVirtual

import typings.reactVirtual.mod.ScrollToIndexOptions
import typings.reactVirtual.mod.ScrollToOffsetOptions
import typings.reactVirtual.mod.VirtualItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Measure extends StObject {
    
    def measure(): Unit = js.native
    
    def scrollToIndex(index: Double): Unit = js.native
    def scrollToIndex(index: Double, options: ScrollToIndexOptions): Unit = js.native
    
    def scrollToOffset(index: Double): Unit = js.native
    def scrollToOffset(index: Double, options: ScrollToOffsetOptions): Unit = js.native
    
    var totalSize: Double = js.native
    
    var virtualItems: js.Array[VirtualItem] = js.native
  }
}
