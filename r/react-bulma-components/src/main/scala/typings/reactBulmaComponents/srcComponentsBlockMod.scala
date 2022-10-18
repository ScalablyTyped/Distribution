package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsBlockMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/block", JSImport.Default)
  @js.native
  val default: BulmaComponent[ContentProps, div] = js.native
  
  trait ContentProps extends StObject
  
  type _To = BulmaComponent[ContentProps, div]
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsBlockMod.foo` */
  override def _to: BulmaComponent[ContentProps, div] = default
}
