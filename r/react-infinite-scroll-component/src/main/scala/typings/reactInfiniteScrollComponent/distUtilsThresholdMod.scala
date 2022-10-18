package typings.reactInfiniteScrollComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsThresholdMod {
  
  @JSImport("react-infinite-scroll-component/dist/utils/threshold", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ThresholdUnits {
    
    @JSImport("react-infinite-scroll-component/dist/utils/threshold", "ThresholdUnits")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-infinite-scroll-component/dist/utils/threshold", "ThresholdUnits.Percent")
    @js.native
    def Percent: String = js.native
    inline def Percent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Percent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-infinite-scroll-component/dist/utils/threshold", "ThresholdUnits.Pixel")
    @js.native
    def Pixel: String = js.native
    inline def Pixel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pixel")(x.asInstanceOf[js.Any])
  }
  
  inline def parseThreshold(scrollThreshold: String): typings.reactInfiniteScrollComponent.anon.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseThreshold")(scrollThreshold.asInstanceOf[js.Any]).asInstanceOf[typings.reactInfiniteScrollComponent.anon.Unit]
  inline def parseThreshold(scrollThreshold: Double): typings.reactInfiniteScrollComponent.anon.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseThreshold")(scrollThreshold.asInstanceOf[js.Any]).asInstanceOf[typings.reactInfiniteScrollComponent.anon.Unit]
}
