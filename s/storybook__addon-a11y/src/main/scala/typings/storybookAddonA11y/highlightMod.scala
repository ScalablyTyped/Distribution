package typings.storybookAddonA11y

import typings.storybookAddonA11y.anon.BoxShadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightMod {
  
  @JSImport("@storybook/addon-a11y/dist/highlight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def highlightObject(color: String): BoxShadow = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightObject")(color.asInstanceOf[js.Any]).asInstanceOf[BoxShadow]
  
  @scala.inline
  def highlightStyle(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightStyle")(color.asInstanceOf[js.Any]).asInstanceOf[String]
}
