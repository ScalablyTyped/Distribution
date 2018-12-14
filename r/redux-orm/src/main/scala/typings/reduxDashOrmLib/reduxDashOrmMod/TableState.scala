package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TableState[Item, Meta] extends js.Object {
  var items: js.Array[java.lang.String]
  var itemsById: org.scalablytyped.runtime.StringDictionary[Item]
  var meta: Meta
}

