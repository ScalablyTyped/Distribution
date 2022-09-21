package typings.storybookComponents

import org.scalablytyped.runtime.Shortcut
import typings.storybookComponents.popperjsCoreLibTypesMod.Modifier
import typings.storybookComponents.storybookComponentsStrings.popperOffsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperjsCoreLibModifiersPopperOffsetsMod extends Shortcut {
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-modifiers-popperOffsets", JSImport.Default)
  @js.native
  val default: PopperOffsetsModifier = js.native
  
  type PopperOffsetsModifier = Modifier[popperOffsets, js.Object]
  
  type _To = PopperOffsetsModifier
  
  /* This means you don't have to write `default`, but can instead just say `popperjsCoreLibModifiersPopperOffsetsMod.foo` */
  override def _to: PopperOffsetsModifier = default
}
