package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.anon.SaveData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saveDataMod {
  
  @JSImport("react-adaptive-hooks/save-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSaveData(): SaveData = ^.asInstanceOf[js.Dynamic].applyDynamic("useSaveData")().asInstanceOf[SaveData]
  inline def useSaveData(initialSaveDataStatus: Boolean): SaveData = ^.asInstanceOf[js.Dynamic].applyDynamic("useSaveData")(initialSaveDataStatus.asInstanceOf[js.Any]).asInstanceOf[SaveData]
}
