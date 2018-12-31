package typings
package pusherDashJsLib.pusherDashJsMod.pusherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Members[T] extends js.Object {
  var count: scala.Double
  var me: Member[T]
  var members: org.scalablytyped.runtime.StringDictionary[Member[T]]
  var myID: java.lang.String
  /**
    * Calls back for each member in unspecified order.
    */
  def each(callback: js.Function1[/* member */ Member[T], scala.Unit]): scala.Unit
  /**
    * Returns member's info for given id.
    *
    * Resulting object containts two fields - id and info.
    */
  def get(id: java.lang.String): scala.Null | T
}

