package typings
package rimrafLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Buffer extends js.Object {
  def apply(path: nodeLib.fsMod.PathLike): js.Array[nodeLib.Buffer | java.lang.String] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Array[nodeLib.Buffer | java.lang.String] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_BufferEncodingFalse): js.Array[nodeLib.Buffer] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFalse): js.Array[java.lang.String] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFalseWithFileTypes): js.Array[nodeLib.Buffer | java.lang.String] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_True): js.Array[nodeLib.fsMod.Dirent] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): js.Array[java.lang.String] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: rimrafLib.rimrafLibStrings.buffer): js.Array[nodeLib.Buffer] = js.native
}

