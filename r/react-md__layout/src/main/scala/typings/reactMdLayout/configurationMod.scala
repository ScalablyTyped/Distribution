package typings.reactMdLayout

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdForm.formThemeProviderMod.FormThemeOptions
import typings.reactMdIcon.iconProviderMod.ConfigurableIcons
import typings.reactMdLayout.anon.ReadonlyMenuConfiguration
import typings.reactMdStates.statesConfigMod.StatesConfigProps
import typings.reactMdUtils.dirMod.WritingDirection
import typings.reactMdUtils.hoverModeProviderMod.HoverModeConfiguration
import typings.reactMdUtils.useAppSizeMediaMod.AppSize
import typings.reactMdUtils.useAppSizeMediaMod.AppSizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  @JSImport("@react-md/layout/types/Configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Configuration(
    hasOnAppResizeChildrenIconsFormThemeDefaultDirPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSizeRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleHoverModeMenuConfiguration: ConfigurationProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Configuration")(hasOnAppResizeChildrenIconsFormThemeDefaultDirPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSizeRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleHoverModeMenuConfiguration.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait ConfigurationProps
    extends StObject
       with AppSizeOptions
       with StatesConfigProps {
    
    /**
      * The children that should gain this configuration. This is required since
      * there's really no reason to use this component if you don't have children
      * that consume the React context.
      */
    @JSName("children")
    var children_ConfigurationProps: ReactNode
    
    /**
      * The current writing direction for your app. This defaults to `"ltr"` but
      * should be changed to `"rtl"` if using a language that is read from right to
      * left.
      *
      * @remarks \@since 2.3.0
      */
    var defaultDir: js.UndefOr[WritingDirection | js.Function0[WritingDirection]] = js.undefined
    
    /**
      * An object of any overrides for the `FormThemeProvider`.
      */
    var formTheme: js.UndefOr[FormThemeOptions] = js.undefined
    
    /**
      * @see {@link HoverModeConfiguration}
      * @remarks \@since 2.8.0
      */
    var hoverMode: js.UndefOr[HoverModeConfiguration] = js.undefined
    
    /**
      * An object of all the configurable icons that you want to override
      * throughout react-md.
      */
    var icons: js.UndefOr[ConfigurableIcons] = js.undefined
    
    /**
      * @see {@link MenuConfiguration}
      * @remarks \@since 5.0.0
      */
    var menuConfiguration: js.UndefOr[ReadonlyMenuConfiguration] = js.undefined
    
    /**
      * An optional function to call when the app gets resized based on media
      * queries. This is useful if you want to store the current app state in redux
      * if you can't always access this state with the `useAppSize` hook.
      */
    var onAppResize: js.UndefOr[js.Function2[/* nextSize */ AppSize, /* lastSize */ AppSize, Unit]] = js.undefined
  }
  object ConfigurationProps {
    
    inline def apply(): ConfigurationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationProps]
    }
    
    extension [Self <: ConfigurationProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultDir(value: WritingDirection | js.Function0[WritingDirection]): Self = StObject.set(x, "defaultDir", value.asInstanceOf[js.Any])
      
      inline def setDefaultDirFunction0(value: () => WritingDirection): Self = StObject.set(x, "defaultDir", js.Any.fromFunction0(value))
      
      inline def setDefaultDirUndefined: Self = StObject.set(x, "defaultDir", js.undefined)
      
      inline def setFormTheme(value: FormThemeOptions): Self = StObject.set(x, "formTheme", value.asInstanceOf[js.Any])
      
      inline def setFormThemeUndefined: Self = StObject.set(x, "formTheme", js.undefined)
      
      inline def setHoverMode(value: HoverModeConfiguration): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
      
      inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
      
      inline def setIcons(value: ConfigurableIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setMenuConfiguration(value: ReadonlyMenuConfiguration): Self = StObject.set(x, "menuConfiguration", value.asInstanceOf[js.Any])
      
      inline def setMenuConfigurationUndefined: Self = StObject.set(x, "menuConfiguration", js.undefined)
      
      inline def setOnAppResize(value: (/* nextSize */ AppSize, /* lastSize */ AppSize) => Unit): Self = StObject.set(x, "onAppResize", js.Any.fromFunction2(value))
      
      inline def setOnAppResizeUndefined: Self = StObject.set(x, "onAppResize", js.undefined)
    }
  }
}
