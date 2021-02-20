package typings.storybookAddonA11y

import typings.storybookAddonA11y.anon.BoxShadow
import typings.storybookAddons.typesMod.DecoratorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addon-a11y", "PARAM_KEY")
  @js.native
  val PARAM_KEY: /* "a11y" */ String = js.native
  
  @JSImport("@storybook/addon-a11y", "highlightObject")
  @js.native
  def highlightObject(color: String): BoxShadow = js.native
  
  @JSImport("@storybook/addon-a11y", "highlightStyle")
  @js.native
  def highlightStyle(color: String): String = js.native
  
  @JSImport("@storybook/addon-a11y", "withA11y")
  @js.native
  val withA11y: DecoratorFunction[js.Any] = js.native
}
