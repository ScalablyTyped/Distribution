package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.knobManagerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerKnobsMod {
  
  @JSImport("@storybook/addon-knobs/dist/registerKnobs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/addon-knobs/dist/registerKnobs", "manager")
  @js.native
  val manager: default = js.native
  
  @scala.inline
  def registerKnobs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerKnobs")().asInstanceOf[Unit]
}
