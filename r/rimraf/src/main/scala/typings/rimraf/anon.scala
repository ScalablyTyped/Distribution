package typings.rimraf

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.anon.Encoding
import typings.node.anon.WithFileTypes
import typings.node.fsMod.Dirent
import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.node.fsMod.RmDirAsyncOptions
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.Stats
import typings.rimraf.rimrafStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply(path: PathLike): Unit = js.native
    def apply(path: PathLike, options: RmDirOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends js.Object {
    def apply(path: PathLike): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
    def apply(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
    def apply(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
    def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  }
  
  @js.native
  trait Typeofchmod extends js.Object {
    def apply(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = js.native
    /**
      * Asynchronous chmod(2) - Change permissions of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def __promisify__(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Typeoflstat extends js.Object {
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
    /**
      * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[Stats] = js.native
  }
  
  @js.native
  trait Typeofreaddir extends js.Object {
    def apply(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BufferEncoding,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptionswithFiEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptionswithFi,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Encoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: WithFileTypes,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: buffer,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def __promisify__(path: PathLike): js.Promise[js.Array[String]] = js.native
    def __promisify__(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
    def __promisify__(path: PathLike, options: BaseEncodingOptionswithFi): js.Promise[js.Array[Buffer | String]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options If called with `withFileTypes: true` the result data will be an array of Dirent
      */
    def __promisify__(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Promise[js.Array[Dirent]] = js.native
    def __promisify__(path: PathLike, options: Encoding): js.Promise[js.Array[Buffer]] = js.native
    def __promisify__(path: PathLike, options: WithFileTypes): js.Promise[js.Array[String]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSName("__promisify__")
    def __promisify___buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
  }
  
  @js.native
  trait Typeofrmdir extends js.Object {
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, options: RmDirAsyncOptions, callback: NoParamCallback): Unit = js.native
    /**
      * Asynchronous rmdir(2) - delete a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, options: RmDirAsyncOptions): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Typeofstat extends js.Object {
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
    /**
      * Asynchronous stat(2) - Get file status.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[Stats] = js.native
  }
  
  @js.native
  trait Typeofunlink extends js.Object {
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    /**
      * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[Unit] = js.native
  }
  
}

