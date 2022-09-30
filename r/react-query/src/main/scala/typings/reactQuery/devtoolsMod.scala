package typings.reactQuery

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactQuery.devtoolsDevtoolsMod.DevtoolsOptions
import typings.reactQuery.devtoolsDevtoolsMod.DevtoolsPanelOptions
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtoolsMod {
  
  @JSImport("react-query/types/devtools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ReactQueryDevtools(
    hasInitialIsOpenPanelPropsCloseButtonPropsToggleButtonPropsPositionContainerStyleNonce: DevtoolsOptions
  ): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ReactQueryDevtools")(hasInitialIsOpenPanelPropsCloseButtonPropsToggleButtonPropsPositionContainerStyleNonce.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  @JSImport("react-query/types/devtools", "ReactQueryDevtoolsPanel")
  @js.native
  val ReactQueryDevtoolsPanel: ForwardRefExoticComponent[DevtoolsPanelOptions & RefAttributes[HTMLDivElement]] = js.native
}
