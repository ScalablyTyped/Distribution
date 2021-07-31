package typings.storybookAddonKnobs

import typings.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  @JSImport("@storybook/addon-knobs/dist/title", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createTitleListener(api: API): js.Function0[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTitleListener")(api.asInstanceOf[js.Any]).asInstanceOf[js.Function0[String]]
}
