package typings.steamcommunity

import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.packageid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHelpMod {
  
  trait Help extends StObject {
    
    /**
      * Removes a license from your account. The help site claims this is "permanent", but it can be undone via a call to restorePackage.
      * @param packageID
      * @param callback
      */
    def removePackage(packageID: packageid, callback: Callback): Unit
    
    /**
      * Restore a previously removed steam package from your steam account.
      * @param packageID
      * @param callback
      */
    def restorePackage(packageID: packageid, callback: Callback): Unit
  }
  object Help {
    
    inline def apply(removePackage: (packageid, Callback) => Unit, restorePackage: (packageid, Callback) => Unit): Help = {
      val __obj = js.Dynamic.literal(removePackage = js.Any.fromFunction2(removePackage), restorePackage = js.Any.fromFunction2(restorePackage))
      __obj.asInstanceOf[Help]
    }
    
    extension [Self <: Help](x: Self) {
      
      inline def setRemovePackage(value: (packageid, Callback) => Unit): Self = StObject.set(x, "removePackage", js.Any.fromFunction2(value))
      
      inline def setRestorePackage(value: (packageid, Callback) => Unit): Self = StObject.set(x, "restorePackage", js.Any.fromFunction2(value))
    }
  }
}
