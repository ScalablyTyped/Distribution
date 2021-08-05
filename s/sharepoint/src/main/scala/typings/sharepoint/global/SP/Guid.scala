package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Guid")
@js.native
class Guid protected ()
  extends StObject
     with typings.sharepoint.SP.Guid {
  def this(guidText: String) = this()
}
object Guid {
  
  @JSGlobal("SP.Guid")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getEmpty(): typings.sharepoint.SP.Guid = ^.asInstanceOf[js.Dynamic].applyDynamic("get_empty")().asInstanceOf[typings.sharepoint.SP.Guid]
  
  /* static member */
  inline def isValid(uuid: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(uuid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def newGuid(): typings.sharepoint.SP.Guid = ^.asInstanceOf[js.Dynamic].applyDynamic("newGuid")().asInstanceOf[typings.sharepoint.SP.Guid]
}
