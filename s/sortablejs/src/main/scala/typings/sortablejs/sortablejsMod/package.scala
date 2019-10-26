package typings.sortablejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sortablejsMod {
  import typings.sortablejs.sortablejsStrings.clone

  type PullResult = js.Array[String] | Boolean | clone
  type PutResult = js.Array[String] | Boolean
}
