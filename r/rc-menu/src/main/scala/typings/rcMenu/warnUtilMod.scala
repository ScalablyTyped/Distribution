package typings.rcMenu

import typings.rcMenu.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warnUtilMod {
  
  @JSImport("rc-menu/es/utils/warnUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def warnItemProp[T /* <: Item */](hasItemRestInfo: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("warnItemProp")(hasItemRestInfo.asInstanceOf[js.Any]).asInstanceOf[T]
}
