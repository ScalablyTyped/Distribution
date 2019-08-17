package typings.reactstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libColMod {
  import typings.react.reactMod.Component
  import typings.reactstrap.Anon_Offset

  type Col[T] = Component[ColProps, js.Object, js.Any]
  type ColumnProps = String | Boolean | Double | Anon_Offset
}
