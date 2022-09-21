package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.Content
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/card", JSImport.Default)
  @js.native
  val default: (BulmaComponent[js.Object, div]) & Content = js.native
  
  type _To = (BulmaComponent[js.Object, div]) & Content
  
  /* This means you don't have to write `default`, but can instead just say `cardMod.foo` */
  override def _to: (BulmaComponent[js.Object, div]) & Content = default
}
