package typings.rcTabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSyncStateMod {
  
  @JSImport("rc-tabs/es/hooks/useSyncState", JSImport.Default)
  @js.native
  def default[T](defaultState: T, onChange: js.Function2[/* newValue */ T, /* prevValue */ T, Unit]): js.Tuple2[T, js.Function1[/* updater */ T | Updater[T], Unit]] = js.native
  
  type Updater[T] = js.Function1[/* prev */ T, T]
}
