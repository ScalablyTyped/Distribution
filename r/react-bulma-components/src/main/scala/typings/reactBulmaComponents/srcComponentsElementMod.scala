package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsElementMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/element", JSImport.Default)
  @js.native
  val default: BulmaComponent[js.Object, div] = js.native
  
  type _To = BulmaComponent[js.Object, div]
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsElementMod.foo` */
  override def _to: BulmaComponent[js.Object, div] = default
}
