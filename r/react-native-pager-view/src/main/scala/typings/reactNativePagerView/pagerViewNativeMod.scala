package typings.reactNativePagerView

import typings.react.mod.ReactElement
import typings.reactNative.mod.HostComponent
import typings.reactNativePagerView.anon.Commands
import typings.reactNativePagerView.typesMod.PagerViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerViewNativeMod {
  
  @JSImport("react-native-pager-view/lib/typescript/PagerViewNative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-pager-view/lib/typescript/PagerViewNative", "PagerViewViewManager")
  @js.native
  val PagerViewViewManager: PagerViewViewManagerType = js.native
  
  inline def getViewManagerConfig(): Commands = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewManagerConfig")().asInstanceOf[Commands]
  inline def getViewManagerConfig(viewManagerName: String): Commands = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewManagerConfig")(viewManagerName.asInstanceOf[js.Any]).asInstanceOf[Commands]
  
  @js.native
  trait PagerViewViewManagerType
    extends StObject
       with HostComponent[PagerViewProps] {
    
    def getInnerViewNode(): ReactElement = js.native
  }
}
