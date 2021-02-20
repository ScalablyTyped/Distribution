package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.anon.Unsupported
import typings.reactAdaptiveHooks.anon.unsupportedfalseMemorySta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryMod {
  
  @JSImport("react-adaptive-hooks/memory", "useMemoryStatus")
  @js.native
  def useMemoryStatus[T](): (Unsupported with T) | unsupportedfalseMemorySta = js.native
  @JSImport("react-adaptive-hooks/memory", "useMemoryStatus")
  @js.native
  def useMemoryStatus[T](initialMemoryStatus: T): (Unsupported with T) | unsupportedfalseMemorySta = js.native
  
  @js.native
  trait MemoryStatus extends StObject {
    
    var deviceMemory: Double = js.native
    
    var jsHeapSizeLimit: Double | Null = js.native
    
    var totalJSHeapSize: Double | Null = js.native
    
    var usedJSHeapSize: Double | Null = js.native
  }
  object MemoryStatus {
    
    @scala.inline
    def apply(deviceMemory: Double): MemoryStatus = {
      val __obj = js.Dynamic.literal(deviceMemory = deviceMemory.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryStatus]
    }
    
    @scala.inline
    implicit class MemoryStatusMutableBuilder[Self <: MemoryStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceMemory(value: Double): Self = StObject.set(x, "deviceMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsHeapSizeLimit(value: Double): Self = StObject.set(x, "jsHeapSizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsHeapSizeLimitNull: Self = StObject.set(x, "jsHeapSizeLimit", null)
      
      @scala.inline
      def setTotalJSHeapSize(value: Double): Self = StObject.set(x, "totalJSHeapSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalJSHeapSizeNull: Self = StObject.set(x, "totalJSHeapSize", null)
      
      @scala.inline
      def setUsedJSHeapSize(value: Double): Self = StObject.set(x, "usedJSHeapSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedJSHeapSizeNull: Self = StObject.set(x, "usedJSHeapSize", null)
    }
  }
}
