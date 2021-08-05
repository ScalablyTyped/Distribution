package typings.storybookAddonA11y

import typings.storybookAddonA11y.anon.BoxShadow
import typings.storybookAddons.typesMod.DecoratorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addon-a11y", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/addon-a11y", "PARAM_KEY")
  @js.native
  val PARAM_KEY: /* "a11y" */ String = js.native
  
  inline def highlightObject(color: String): BoxShadow = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightObject")(color.asInstanceOf[js.Any]).asInstanceOf[BoxShadow]
  
  inline def highlightStyle(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightStyle")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@storybook/addon-a11y", "withA11y")
  @js.native
  val withA11y: DecoratorFunction[js.Any] = js.native
}
