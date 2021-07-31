package typings.storybookAddonViewport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presetMod {
  
  @JSImport("@storybook/addon-viewport/dist/preset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def managerEntries(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("managerEntries")().asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def managerEntries(entry: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("managerEntries")(entry.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
}
