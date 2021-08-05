package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object TypeUtil {
  
  @JSGlobal("TypeUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def IsArray(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def IsNullOrUndefined(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNullOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
