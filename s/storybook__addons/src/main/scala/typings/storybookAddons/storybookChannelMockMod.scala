package typings.storybookAddons

import typings.storybookChannels.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storybookChannelMockMod {
  
  @JSImport("@storybook/addons/dist/storybook-channel-mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mockChannel(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("mockChannel")().asInstanceOf[default]
}
