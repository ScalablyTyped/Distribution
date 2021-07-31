package typings.storybookTheming

import org.scalablytyped.runtime.StringDictionary
import typings.storybookTheming.anon.Background
import typings.storybookTheming.anon.Typography
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  @JSImport("@storybook/theming/dist/global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createGlobal(hasColorBackgroundTypography: Background): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("createGlobal")(hasColorBackgroundTypography.asInstanceOf[js.Any]).asInstanceOf[Return]
  
  @scala.inline
  def createReset(hasTypography: Typography): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("createReset")(hasTypography.asInstanceOf[js.Any]).asInstanceOf[Return]
  
  type Return = StringDictionary[StringDictionary[Value]]
  
  type Value = String | Double
}
