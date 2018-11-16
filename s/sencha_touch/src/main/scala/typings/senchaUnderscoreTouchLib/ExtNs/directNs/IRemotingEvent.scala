package typings
package senchaUnderscoreTouchLib.ExtNs.directNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRemotingEvent extends IEvent {
  /** [Method] Returns the value of tid
  		* @returns Object
  		*/
  var getTid: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Get the transaction associated with this event
  		* @returns Ext.direct.Transaction The transaction
  		*/
  @JSName("getTransaction")
  var getTransaction_IRemotingEvent: js.UndefOr[js.Function0[ITransaction]] = js.undefined
  /** [Method] Sets the value of tid
  		* @param tid Object The new value.
  		*/
  var setTid: js.UndefOr[js.Function1[/* tid */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

