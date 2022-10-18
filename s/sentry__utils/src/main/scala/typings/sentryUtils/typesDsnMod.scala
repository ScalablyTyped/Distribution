package typings.sentryUtils

import typings.sentryTypes.typesDsnMod.DsnComponents
import typings.sentryTypes.typesDsnMod.DsnLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDsnMod {
  
  @JSImport("@sentry/utils/types/dsn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dsnFromString(str: String): DsnComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("dsnFromString")(str.asInstanceOf[js.Any]).asInstanceOf[DsnComponents]
  
  inline def dsnToString(dsn: DsnComponents): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dsnToString")(dsn.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def dsnToString(dsn: DsnComponents, withPassword: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dsnToString")(dsn.asInstanceOf[js.Any], withPassword.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def makeDsn(from: DsnLike): DsnComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDsn")(from.asInstanceOf[js.Any]).asInstanceOf[DsnComponents]
}
