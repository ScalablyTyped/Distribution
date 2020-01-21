package typings.rename

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FilePath = java.lang.String | typings.rename.mod.Specification
  type Transformer = (js.Function1[/* spec */ typings.rename.mod.FileObject, typings.rename.mod.FilePath]) | typings.rename.mod.FilePath
}
