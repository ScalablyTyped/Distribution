package typings.roarr

import typings.roarr.typesMod.LogLevelName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLogLevelNameMod {
  
  @JSImport("roarr/dist/src/getLogLevelName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLogLevelName(numericLogLevel: Double): LogLevelName = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogLevelName")(numericLogLevel.asInstanceOf[js.Any]).asInstanceOf[LogLevelName]
}
