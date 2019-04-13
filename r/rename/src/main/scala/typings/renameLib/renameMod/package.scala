package typings
package renameLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object renameMod {
  type FilePath = java.lang.String | Specification
  type Transformer = (js.Function1[/* spec */ FileObject, FilePath]) | FilePath
}
