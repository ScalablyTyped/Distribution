package typings.sentryReplay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilIsExpiredMod {
  
  @JSImport("@sentry/replay/types/util/isExpired", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isExpired(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpired")().asInstanceOf[Boolean]
  inline def isExpired(initialTime: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpired")(initialTime.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isExpired(initialTime: Double, expiry: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpired")(initialTime.asInstanceOf[js.Any], expiry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isExpired(initialTime: Double, expiry: Double, targetTime: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpired")(initialTime.asInstanceOf[js.Any], expiry.asInstanceOf[js.Any], targetTime.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isExpired(initialTime: Double, expiry: Unit, targetTime: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpired")(initialTime.asInstanceOf[js.Any], expiry.asInstanceOf[js.Any], targetTime.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isExpired(initialTime: Null, expiry: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpired")(initialTime.asInstanceOf[js.Any], expiry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isExpired(initialTime: Null, expiry: Double, targetTime: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpired")(initialTime.asInstanceOf[js.Any], expiry.asInstanceOf[js.Any], targetTime.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isExpired(initialTime: Null, expiry: Unit, targetTime: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpired")(initialTime.asInstanceOf[js.Any], expiry.asInstanceOf[js.Any], targetTime.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
