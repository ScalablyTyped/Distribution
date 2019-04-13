package typings
package renameLib.renameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rename", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(filepath: java.lang.String | FileObject, transformer: Transformer): FilePath = js.native
  def parse(filename: java.lang.String): FileObject = js.native
  def stringify(obj: FileObject): java.lang.String = js.native
}

