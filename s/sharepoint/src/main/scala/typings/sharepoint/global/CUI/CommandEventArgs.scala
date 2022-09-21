package typings.sharepoint.global.CUI

import typings.microsoftAjax.Sys.EventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CUI.CommandEventArgs")
@js.native
open class CommandEventArgs protected ()
  extends StObject
     with EventArgs {
  def this(id: Any, `type`: typings.sharepoint.CUI.CommandType, source: Any, pars: Any) = this()
  
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  var Empty: EventArgs = js.native
}
