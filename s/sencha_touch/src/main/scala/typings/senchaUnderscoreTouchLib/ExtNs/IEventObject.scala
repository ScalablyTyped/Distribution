package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventObject
  extends IBase
     with senchaUnderscoreTouchLib.ExtNs.eventNs.IDom {
  /** [Property] (Number) */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var direction: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Stop the event preventDefault and stopPropagation
  		* @returns Ext.event.Event this
  		*/
  var stopEvent: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.eventNs.IEvent]] = js.undefined
  /** [Method] Cancels bubbling of the event
  		* @returns Ext.event.Event this
  		*/
  var stopPropagation: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.eventNs.IEvent]] = js.undefined
}

