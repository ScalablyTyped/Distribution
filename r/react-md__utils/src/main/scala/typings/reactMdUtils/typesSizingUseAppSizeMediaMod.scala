package typings.reactMdUtils

import typings.reactMdUtils.typesSizingConstantsMod.QuerySize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSizingUseAppSizeMediaMod {
  
  @JSImport("@react-md/utils/types/sizing/useAppSizeMedia", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/sizing/useAppSizeMedia", "DEFAULT_APP_SIZE")
  @js.native
  val DEFAULT_APP_SIZE: AppSize = js.native
  
  inline def useAppSizeMedia(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")().asInstanceOf[AppSize]
  inline def useAppSizeMedia(param0: AppSizeOptions): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")(param0.asInstanceOf[js.Any]).asInstanceOf[AppSize]
  
  trait AppSize extends StObject {
    
    /**
      * Boolean if currently matching a desktop screen by comparing the max width
      * of the device.
      */
    var isDesktop: Boolean
    
    /**
      * Boolean if the app is considered to be in landscape mode. This will just
      * verify that the window width is greater than the window height.
      *
      * NOTE: This might not be super accurate on Android devices since the soft
      * keyboard will change the dimensions of the viewport when it appears. It is
      * recommended to use the `useOrientation` hook as well if you'd like to get
      * the current orientation type.
      */
    var isLandscape: Boolean
    
    /**
      * Boolean if currently matching a large desktop screen by comparing the max
      * width of the device.
      */
    var isLargeDesktop: Boolean
    
    /**
      * Boolean if currently matching a phone by comparing the max width of the
      * device.
      */
    var isPhone: Boolean
    
    /**
      * Boolean if currently matching a tablet by comparing the max width of the
      * device.
      */
    var isTablet: Boolean
  }
  object AppSize {
    
    inline def apply(
      isDesktop: Boolean,
      isLandscape: Boolean,
      isLargeDesktop: Boolean,
      isPhone: Boolean,
      isTablet: Boolean
    ): AppSize = {
      val __obj = js.Dynamic.literal(isDesktop = isDesktop.asInstanceOf[js.Any], isLandscape = isLandscape.asInstanceOf[js.Any], isLargeDesktop = isLargeDesktop.asInstanceOf[js.Any], isPhone = isPhone.asInstanceOf[js.Any], isTablet = isTablet.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppSize] (val x: Self) extends AnyVal {
      
      inline def setIsDesktop(value: Boolean): Self = StObject.set(x, "isDesktop", value.asInstanceOf[js.Any])
      
      inline def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
      
      inline def setIsLargeDesktop(value: Boolean): Self = StObject.set(x, "isLargeDesktop", value.asInstanceOf[js.Any])
      
      inline def setIsPhone(value: Boolean): Self = StObject.set(x, "isPhone", value.asInstanceOf[js.Any])
      
      inline def setIsTablet(value: Boolean): Self = StObject.set(x, "isTablet", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppSizeOptions extends StObject {
    
    /**
      * An optional default size to use for your app. This is really only helpful
      * when trying to do server side rendering or initial page render since the
      * default behavior is to check and update the size once mounted in the DOM.
      */
    var defaultSize: js.UndefOr[AppSize] = js.undefined
    
    /**
      * The min width for a large desktop screen.
      */
    var desktopLargeMinWidth: js.UndefOr[QuerySize] = js.undefined
    
    /**
      * The min width for a desktop screen.
      */
    var desktopMinWidth: js.UndefOr[QuerySize] = js.undefined
    
    /**
      * The max width to use for phones. This one is a max width unlike the others
      * since everything from 0 to this value will be considered a phone.
      */
    var phoneMaxWidth: js.UndefOr[QuerySize] = js.undefined
    
    /**
      * The max width for a tablet device. This should normally be `1px` less than
      * the `desktopMinWidth`, but it can be any value if needed. The tablet has a
      * range of min to max so that you can have a bit more control.
      */
    var tabletMaxWidth: js.UndefOr[QuerySize] = js.undefined
    
    /**
      * The min width for a tablet device.
      */
    var tabletMinWidth: js.UndefOr[QuerySize] = js.undefined
  }
  object AppSizeOptions {
    
    inline def apply(): AppSizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppSizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppSizeOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultSize(value: AppSize): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      inline def setDesktopLargeMinWidth(value: QuerySize): Self = StObject.set(x, "desktopLargeMinWidth", value.asInstanceOf[js.Any])
      
      inline def setDesktopLargeMinWidthUndefined: Self = StObject.set(x, "desktopLargeMinWidth", js.undefined)
      
      inline def setDesktopMinWidth(value: QuerySize): Self = StObject.set(x, "desktopMinWidth", value.asInstanceOf[js.Any])
      
      inline def setDesktopMinWidthUndefined: Self = StObject.set(x, "desktopMinWidth", js.undefined)
      
      inline def setPhoneMaxWidth(value: QuerySize): Self = StObject.set(x, "phoneMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setPhoneMaxWidthUndefined: Self = StObject.set(x, "phoneMaxWidth", js.undefined)
      
      inline def setTabletMaxWidth(value: QuerySize): Self = StObject.set(x, "tabletMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setTabletMaxWidthUndefined: Self = StObject.set(x, "tabletMaxWidth", js.undefined)
      
      inline def setTabletMinWidth(value: QuerySize): Self = StObject.set(x, "tabletMinWidth", value.asInstanceOf[js.Any])
      
      inline def setTabletMinWidthUndefined: Self = StObject.set(x, "tabletMinWidth", js.undefined)
    }
  }
}
