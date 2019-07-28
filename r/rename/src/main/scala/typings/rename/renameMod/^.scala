package typings.rename.renameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rename", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(filepath: String | FileObject, transformer: Transformer): FilePath = js.native
  def parse(filename: String): FileObject = js.native
  def stringify(obj: FileObject): String = js.native
}

