package typings
package renameLib.renameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rename", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    filepath: java.lang.String | renameLib.renameMod.RenameNs.FileObject,
    transformer: renameLib.renameMod.RenameNs.Transformer
  ): renameLib.renameMod.RenameNs.FilePath = js.native
  def parse(filename: java.lang.String): renameLib.renameMod.RenameNs.FileObject = js.native
  def stringify(obj: renameLib.renameMod.RenameNs.FileObject): java.lang.String = js.native
}

