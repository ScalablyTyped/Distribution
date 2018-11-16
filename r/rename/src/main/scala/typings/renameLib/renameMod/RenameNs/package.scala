package typings
package renameLib.renameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RenameNs {
  type FilePath = java.lang.String | Specification
  type Transformer = (js.Function1[/* spec */ FileObject, FilePath]) | FilePath
}
