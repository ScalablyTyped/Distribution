package typings.reactMdIcon

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdIcon.reactMdIconStrings.back
import typings.reactMdIcon.reactMdIconStrings.checkbox
import typings.reactMdIcon.reactMdIconStrings.dropdown
import typings.reactMdIcon.reactMdIconStrings.error
import typings.reactMdIcon.reactMdIconStrings.expander
import typings.reactMdIcon.reactMdIconStrings.forward
import typings.reactMdIcon.reactMdIconStrings.menu
import typings.reactMdIcon.reactMdIconStrings.notification
import typings.reactMdIcon.reactMdIconStrings.password
import typings.reactMdIcon.reactMdIconStrings.radio
import typings.reactMdIcon.reactMdIconStrings.selected
import typings.reactMdIcon.reactMdIconStrings.sort
import typings.reactMdIcon.reactMdIconStrings.upload
import typings.reactMdIcon.typesFontIconMod.FontIconProps
import typings.reactMdIcon.typesIconProviderMod.IconProviderProps
import typings.reactMdIcon.typesIconRotatorMod.IconRotatorProps
import typings.reactMdIcon.typesSvgiconMod.SVGIconProps
import typings.reactMdIcon.typesTextIconSpacingMod.TextIconSpacingProps
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/icon", "FontIcon")
  @js.native
  val FontIcon: ForwardRefExoticComponent[FontIconProps & RefAttributes[HTMLElement]] = js.native
  
  inline def IconProvider(
    hasChildrenBackCheckboxDropdownExpanderErrorForwardMenuNotificationPasswordRadioSelectedSortUpload: IconProviderProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("IconProvider")(hasChildrenBackCheckboxDropdownExpanderErrorForwardMenuNotificationPasswordRadioSelectedSortUpload.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/icon", "IconRotator")
  @js.native
  val IconRotator: ForwardRefExoticComponent[IconRotatorProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/icon", "SVGIcon")
  @js.native
  val SVGIcon: ForwardRefExoticComponent[SVGIconProps & RefAttributes[SVGSVGElement]] = js.native
  
  inline def TextIconSpacing(
    hasClassNamePropIconChildrenStackedIconAfterFlexReverseForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName: TextIconSpacingProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("TextIconSpacing")(hasClassNamePropIconChildrenStackedIconAfterFlexReverseForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useIcon(
    name: back | checkbox | dropdown | error | expander | forward | menu | notification | password | radio | selected | sort | upload
  ): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon(
    name: back | checkbox | dropdown | error | expander | forward | menu | notification | password | radio | selected | sort | upload,
    `override`: ReactNode
  ): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
}
