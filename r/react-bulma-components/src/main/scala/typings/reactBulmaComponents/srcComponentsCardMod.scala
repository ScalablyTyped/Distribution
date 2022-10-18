package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.Content
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsCardMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/card", JSImport.Default)
  @js.native
  val default: (BulmaComponent[js.Object, div]) & Content = js.native
  
  type _To = (BulmaComponent[js.Object, div]) & Content
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsCardMod.foo` */
  override def _to: (BulmaComponent[js.Object, div]) & Content = default
}
