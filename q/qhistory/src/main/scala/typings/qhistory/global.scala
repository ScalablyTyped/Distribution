package typings.qhistory

import typings.history.mod.History
import typings.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def qhistory(
    history: History[LocationState],
    stringify: js.Function1[/* query */ js.Object, String],
    parse: js.Function1[/* search */ String, js.Object]
  ): History[LocationState] = (js.Dynamic.global.applyDynamic("qhistory")(history.asInstanceOf[js.Any], stringify.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[History[LocationState]]
}
