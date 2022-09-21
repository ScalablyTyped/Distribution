package typings.storybookComponents

import org.scalablytyped.runtime.Shortcut
import typings.storybookComponents.popperjsCoreLibTypesMod.Modifier
import typings.storybookComponents.storybookComponentsStrings.applyStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperjsCoreLibModifiersApplyStylesMod extends Shortcut {
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-modifiers-applyStyles", JSImport.Default)
  @js.native
  val default: ApplyStylesModifier = js.native
  
  type ApplyStylesModifier = Modifier[applyStyles, js.Object]
  
  type _To = ApplyStylesModifier
  
  /* This means you don't have to write `default`, but can instead just say `popperjsCoreLibModifiersApplyStylesMod.foo` */
  override def _to: ApplyStylesModifier = default
}
