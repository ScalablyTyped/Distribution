package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.RequestVariable")
@js.native
open class RequestVariable protected ()
  extends StObject
     with typings.sharepoint.SP.RequestVariable {
  def this(context: typings.sharepoint.SP.ClientRuntimeContext) = this()
}
object RequestVariable {
  
  @JSGlobal("SP.RequestVariable")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def newObject(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.RequestVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.RequestVariable]
}
