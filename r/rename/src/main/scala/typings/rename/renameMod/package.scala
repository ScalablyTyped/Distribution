package typings.rename

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object renameMod {
  type FilePath = String | Specification
  type Transformer = (js.Function1[/* spec */ FileObject, FilePath]) | FilePath
}
