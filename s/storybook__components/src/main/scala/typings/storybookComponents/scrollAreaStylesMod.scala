package typings.storybookComponents

import typings.emotionSerialize.mod.CSSObject
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollAreaStylesMod {
  
  @JSImport("@storybook/components/dist/ScrollArea/ScrollAreaStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getScrollAreaStyles(theme: Theme): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollAreaStyles")(theme.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
}
