package typings.reactMdLayout

import typings.reactMdLayout.typesMod.LayoutConfiguration
import typings.reactMdLayout.typesMod.SupportedWideLayout
import typings.reactMdUtils.useAppSizeMediaMod.AppSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@react-md/layout/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLayoutType(
    hasAppSizePhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayout: GetLayoutOptions
  ): SupportedWideLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayoutType")(hasAppSizePhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayout.asInstanceOf[js.Any]).asInstanceOf[SupportedWideLayout]
  
  inline def isFullHeightLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullHeightLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPersistentLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPersistentLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTemporaryLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemporaryLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isToggleableLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToggleableLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait GetLayoutOptions
    extends StObject
       with LayoutConfiguration {
    
    /**
      * The current app size which is used to determine which layout type to
      * return.
      */
    var appSize: AppSize
  }
  object GetLayoutOptions {
    
    inline def apply(appSize: AppSize): GetLayoutOptions = {
      val __obj = js.Dynamic.literal(appSize = appSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLayoutOptions]
    }
    
    extension [Self <: GetLayoutOptions](x: Self) {
      
      inline def setAppSize(value: AppSize): Self = StObject.set(x, "appSize", value.asInstanceOf[js.Any])
    }
  }
}
