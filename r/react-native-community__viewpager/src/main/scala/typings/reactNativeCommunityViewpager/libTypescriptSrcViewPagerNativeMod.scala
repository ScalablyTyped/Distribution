package typings.reactNativeCommunityViewpager

import typings.react.mod.ReactElement
import typings.reactNative.mod.HostComponent
import typings.reactNativeCommunityViewpager.anon.Commands
import typings.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.ViewPagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcViewPagerNativeMod {
  
  @JSImport("@react-native-community/viewpager/lib/typescript/src/ViewPagerNative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-native-community/viewpager/lib/typescript/src/ViewPagerNative", "ViewpagerViewManager")
  @js.native
  val ViewpagerViewManager: ViewpagerViewManagerType = js.native
  
  inline def getViewManagerConfig(): Commands = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewManagerConfig")().asInstanceOf[Commands]
  inline def getViewManagerConfig(viewManagerName: String): Commands = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewManagerConfig")(viewManagerName.asInstanceOf[js.Any]).asInstanceOf[Commands]
  
  @js.native
  trait ViewpagerViewManagerType
    extends StObject
       with HostComponent[ViewPagerProps] {
    
    def getInnerViewNode(): ReactElement = js.native
  }
}
