package typings.reactNavigationDrawer

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerGestureContextMod extends Shortcut {
  
  @JSImport("react-navigation-drawer/lib/typescript/src/utils/DrawerGestureContext", JSImport.Default)
  @js.native
  val default: Context[RefObject[Any] | Null] = js.native
  
  type _To = Context[RefObject[Any] | Null]
  
  /* This means you don't have to write `default`, but can instead just say `drawerGestureContextMod.foo` */
  override def _to: Context[RefObject[Any] | Null] = default
}
