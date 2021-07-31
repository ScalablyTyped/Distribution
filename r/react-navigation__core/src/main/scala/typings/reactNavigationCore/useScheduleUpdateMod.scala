package typings.reactNavigationCore

import typings.react.mod.Context
import typings.reactNavigationCore.anon.FlushUpdates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScheduleUpdateMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useScheduleUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@react-navigation/core/lib/typescript/src/useScheduleUpdate", "ScheduleUpdateContext")
  @js.native
  val ScheduleUpdateContext: Context[FlushUpdates] = js.native
}
