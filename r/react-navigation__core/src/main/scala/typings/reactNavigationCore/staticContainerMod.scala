package typings.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.MemoExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticContainerMod extends Shortcut {
  
  @JSImport("@react-navigation/core/lib/typescript/src/StaticContainer", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ Any, Any]] = js.native
  
  type _To = MemoExoticComponent[js.Function1[/* props */ Any, Any]]
  
  /* This means you don't have to write `default`, but can instead just say `staticContainerMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* props */ Any, Any]] = default
}
