package typings.reactNavigationCore

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNavigationCore.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseComponentMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(render: Render): js.Function1[/* param0 */ Children, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(render.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ Children, Element]]
  
  type Render = js.Function1[/* children */ ReactNode, Element]
}
