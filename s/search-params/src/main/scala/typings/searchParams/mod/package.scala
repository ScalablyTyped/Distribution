package typings.searchParams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SearchParams = typings.std.Record[
    java.lang.String, 
    js.UndefOr[
      java.lang.String | scala.Boolean | scala.Null | (js.Array[java.lang.String | scala.Boolean | scala.Null])
    ]
  ]
}
