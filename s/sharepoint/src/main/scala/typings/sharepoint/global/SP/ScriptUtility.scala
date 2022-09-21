package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ScriptUtility")
@js.native
open class ScriptUtility ()
  extends StObject
     with typings.sharepoint.SP.ScriptUtility
object ScriptUtility {
  
  @JSGlobal("SP.ScriptUtility")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def isNullOrEmptyString(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrEmptyString")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isNullOrUndefined(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isUndefined(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def truncateToInt(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("truncateToInt")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
}
