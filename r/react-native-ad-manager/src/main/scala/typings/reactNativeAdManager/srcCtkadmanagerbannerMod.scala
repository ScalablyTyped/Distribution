package typings.reactNativeAdManager

import typings.react.mod.Component
import typings.reactNativeAdManager.helperTypesMod.BannerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCtkadmanagerbannerMod {
  
  /**
    * Display a DFP Publisher banner
    */
  @JSImport("react-native-ad-manager/src/CTKAdManagerBanner", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[BannerProps, js.Object, Any]
  
  @JSImport("react-native-ad-manager/src/CTKAdManagerBanner", "simulatorId")
  @js.native
  val simulatorId: String = js.native
  
  /**
    * Display a DFP Publisher banner
    */
  type Banner = Component[BannerProps, js.Object, Any]
}
