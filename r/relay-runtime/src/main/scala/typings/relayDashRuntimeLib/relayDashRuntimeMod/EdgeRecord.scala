package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeRecord extends Record {
  var cursor: js.Any
  var node: Record
}

object EdgeRecord {
  @scala.inline
  def apply(
    cursor: js.Any,
    node: Record,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): EdgeRecord = {
    val __obj = js.Dynamic.literal(cursor = cursor, node = node)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EdgeRecord]
  }
}

