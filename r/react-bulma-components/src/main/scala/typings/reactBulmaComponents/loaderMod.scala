package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/loader", JSImport.Default)
  @js.native
  val default: BulmaComponent[js.Object, div] = js.native
  
  type _To = BulmaComponent[js.Object, div]
  
  /* This means you don't have to write `default`, but can instead just say `loaderMod.foo` */
  override def _to: BulmaComponent[js.Object, div] = default
}
