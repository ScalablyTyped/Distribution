package typings.reactNavigationDrawer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerActionsMod {
  
  @JSImport("react-navigation-drawer/lib/typescript/src/routers/DrawerActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-navigation-drawer/lib/typescript/src/routers/DrawerActions", "CLOSE_DRAWER")
  @js.native
  val CLOSE_DRAWER: /* "Navigation/CLOSE_DRAWER" */ String = js.native
  
  @JSImport("react-navigation-drawer/lib/typescript/src/routers/DrawerActions", "DRAWER_CLOSED")
  @js.native
  val DRAWER_CLOSED: /* "Navigation/DRAWER_CLOSED" */ String = js.native
  
  @JSImport("react-navigation-drawer/lib/typescript/src/routers/DrawerActions", "DRAWER_OPENED")
  @js.native
  val DRAWER_OPENED: /* "Navigation/DRAWER_OPENED" */ String = js.native
  
  @JSImport("react-navigation-drawer/lib/typescript/src/routers/DrawerActions", "MARK_DRAWER_ACTIVE")
  @js.native
  val MARK_DRAWER_ACTIVE: /* "Navigation/MARK_DRAWER_ACTIVE" */ String = js.native
  
  @JSImport("react-navigation-drawer/lib/typescript/src/routers/DrawerActions", "MARK_DRAWER_IDLE")
  @js.native
  val MARK_DRAWER_IDLE: /* "Navigation/MARK_DRAWER_IDLE" */ String = js.native
  
  @JSImport("react-navigation-drawer/lib/typescript/src/routers/DrawerActions", "MARK_DRAWER_SETTLING")
  @js.native
  val MARK_DRAWER_SETTLING: /* "Navigation/MARK_DRAWER_SETTLING" */ String = js.native
  
  @JSImport("react-navigation-drawer/lib/typescript/src/routers/DrawerActions", "OPEN_DRAWER")
  @js.native
  val OPEN_DRAWER: /* "Navigation/OPEN_DRAWER" */ String = js.native
  
  @JSImport("react-navigation-drawer/lib/typescript/src/routers/DrawerActions", "TOGGLE_DRAWER")
  @js.native
  val TOGGLE_DRAWER: /* "Navigation/TOGGLE_DRAWER" */ String = js.native
  
  @scala.inline
  def closeDrawer(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")().asInstanceOf[js.Any]
  @scala.inline
  def closeDrawer(payload: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def openDrawer(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")().asInstanceOf[js.Any]
  @scala.inline
  def openDrawer(payload: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def toggleDrawer(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")().asInstanceOf[js.Any]
  @scala.inline
  def toggleDrawer(payload: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  type DrawerActionType = /* "Navigation/OPEN_DRAWER" */ String
}
