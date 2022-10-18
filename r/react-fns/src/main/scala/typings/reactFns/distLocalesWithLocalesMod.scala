package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.distLocalesLocalesMod.LocalesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLocalesWithLocalesMod {
  
  @JSImport("react-fns/dist/Locales/withLocales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withLocales[Props](Component: ComponentType[Props & LocalesProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLocales")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
