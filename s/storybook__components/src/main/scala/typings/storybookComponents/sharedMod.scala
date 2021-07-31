package typings.storybookComponents

import typings.emotionSerialize.mod.CSSObject
import typings.storybookComponents.anon.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("@storybook/components/dist/typography/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def codeCommon(hasTheme: Theme): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("codeCommon")(hasTheme.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  
  @scala.inline
  def headerCommon(hasTheme: Theme): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("headerCommon")(hasTheme.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  
  @JSImport("@storybook/components/dist/typography/shared", "withMargin")
  @js.native
  val withMargin: CSSObject = js.native
  
  @scala.inline
  def withReset(hasTheme: Theme): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("withReset")(hasTheme.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
}
