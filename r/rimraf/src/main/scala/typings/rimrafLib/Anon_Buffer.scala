package typings
package rimrafLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Buffer extends js.Object {
  def apply(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      (/* files */ js.Array[java.lang.String]) | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String] | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_BufferEncodingFalse,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingFalseWithFileTypes,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String] | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingFalse,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_True,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[nodeLib.fsMod.Dirent], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: rimrafLib.rimrafLibStrings.buffer,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      (/* files */ js.Array[java.lang.String]) | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): js.Promise[js.Array[java.lang.String]] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Promise[js.Array[java.lang.String] | js.Array[nodeLib.Buffer]] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_BufferEncodingFalse): js.Promise[js.Array[nodeLib.Buffer]] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFalse): js.Promise[js.Array[java.lang.String]] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFalseWithFileTypes): js.Promise[js.Array[java.lang.String] | js.Array[nodeLib.Buffer]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_True): js.Promise[js.Array[nodeLib.fsMod.Dirent]] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("__promisify__")
  def __promisify___buffer(path: nodeLib.fsMod.PathLike, options: rimrafLib.rimrafLibStrings.buffer): js.Promise[js.Array[nodeLib.Buffer]] = js.native
}

