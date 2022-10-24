package typings.reactMdUtils

import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.reactMdUtils.typesHoverHoverModeProviderMod.HoverModeProviderProps
import typings.reactMdUtils.typesHoverUseHoverModeContextMod.HoverModeContext
import typings.reactMdUtils.typesHoverUseHoverModeMod.HoverModeHookReturnValue
import typings.reactMdUtils.typesHoverUseHoverModeMod.HoverModeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHoverMod {
  
  @JSImport("@react-md/utils/types/hover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/hover", "DEFAULT_HOVER_MODE_DEACTIVATION_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_DEACTIVATION_TIME: /* 1000 */ Double = js.native
  
  @JSImport("@react-md/utils/types/hover", "DEFAULT_HOVER_MODE_EXIT_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_EXIT_TIME: /* 300 */ Double = js.native
  
  @JSImport("@react-md/utils/types/hover", "DEFAULT_HOVER_MODE_VISIBLE_IN_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_VISIBLE_IN_TIME: /* 1000 */ Double = js.native
  
  @JSImport("@react-md/utils/types/hover", "HoverModeContextProvider")
  @js.native
  val HoverModeContextProvider: Provider[HoverModeContext] = js.native
  
  inline def HoverModeProvider(param0: HoverModeProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("HoverModeProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useHoverMode(): HoverModeHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverMode")().asInstanceOf[HoverModeHookReturnValue]
  inline def useHoverMode(param0: HoverModeOptions): HoverModeHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverMode")(param0.asInstanceOf[js.Any]).asInstanceOf[HoverModeHookReturnValue]
  
  inline def useHoverModeContext(): HoverModeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverModeContext")().asInstanceOf[HoverModeContext]
}
