package typings.reactFloater

import typings.reactFloater.typesMod.Styles
import typings.typeFest.partialDeepMod.PartialDeep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("react-floater/lib/modules/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Styles]
  inline def default(styles: PartialDeep[Styles, js.Object]): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
