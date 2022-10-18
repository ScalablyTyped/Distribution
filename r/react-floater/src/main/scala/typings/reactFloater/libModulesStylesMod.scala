package typings.reactFloater

import typings.reactFloater.libTypesMod.Styles
import typings.typeFest.sourcePartialDeepMod.PartialDeep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModulesStylesMod {
  
  @JSImport("react-floater/lib/modules/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Styles]
  inline def default(styles: PartialDeep[Styles, js.Object]): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
