package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.storageNs.html5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatabase
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method]
  		* @param sql String/String[]/Object/Object[]/SQLStatement/SQLStatement[] SQL Command to run with optional arguments and callbacks
  		* @param success Function callback for successful transaction
  		* @param failure Function callback for failed transaction
  		*/
  var transaction: js.UndefOr[
    js.Function3[
      /* sql */ js.UndefOr[js.Any], 
      /* success */ js.UndefOr[js.Any], 
      /* failure */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

