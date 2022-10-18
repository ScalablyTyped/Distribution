package typings.reactNativeWindowsFs.anon

import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsAborEncoding
import typings.node.anon.ObjectEncodingOptionsmode
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.anon.WatchOptionsencodingbuffe
import typings.node.anon.WithFileTypes
import typings.node.anon.encodingBufferEncodingfla
import typings.node.anon.encodingnullundefinedflag
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.CopyOptions
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.ObjectEncodingOptions
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.RmOptions
import typings.node.fsMod.StatOptions
import typings.node.fsMod.TimeLike
import typings.node.fsMod.WatchOptions
import typings.node.fsPromisesMod.FileChangeInfo
import typings.node.fsPromisesMod.FileHandle
import typings.node.fsPromisesMod.FlagAndOpenMode
import typings.node.nodeColonfsMod.Dir
import typings.node.nodeColonfsMod.Dirent
import typings.node.nodeColonfsMod.Stats
import typings.node.nodeColonstreamMod.Stream
import typings.reactNativeWindowsFs.reactNativeWindowsFsStrings.buffer
import typings.std.AsyncIterable
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpromises extends StObject {
  
  /**
    * Tests a user's permissions for the file or directory specified by `path`.
    * The `mode` argument is an optional integer that specifies the accessibility
    * checks to be performed. `mode` should be either the value `fs.constants.F_OK`or a mask consisting of the bitwise OR of any of `fs.constants.R_OK`,`fs.constants.W_OK`, and `fs.constants.X_OK`
    * (e.g.`fs.constants.W_OK | fs.constants.R_OK`). Check `File access constants` for
    * possible values of `mode`.
    *
    * If the accessibility check is successful, the promise is resolved with no
    * value. If any of the accessibility checks fail, the promise is rejected
    * with an [Error](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error) object. The following example checks if the file`/etc/passwd` can be read and
    * written by the current process.
    *
    * ```js
    * import { access } from 'fs/promises';
    * import { constants } from 'fs';
    *
    * try {
    *   await access('/etc/passwd', constants.R_OK | constants.W_OK);
    *   console.log('can access');
    * } catch {
    *   console.error('cannot access');
    * }
    * ```
    *
    * Using `fsPromises.access()` to check for the accessibility of a file before
    * calling `fsPromises.open()` is not recommended. Doing so introduces a race
    * condition, since other processes may change the file's state between the two
    * calls. Instead, user code should open/read/write the file directly and handle
    * the error raised if the file is not accessible.
    * @since v10.0.0
    * @param [mode=fs.constants.F_OK]
    * @return Fulfills with `undefined` upon success.
    */
  def access(path: PathLike): js.Promise[Unit] = js.native
  def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronously append data to a file, creating the file if it does not yet
    * exist. `data` can be a string or a `Buffer`.
    *
    * If `options` is a string, then it specifies the `encoding`.
    *
    * The `mode` option only affects the newly created file. See `fs.open()` for more details.
    *
    * The `path` may be specified as a `FileHandle` that has been opened
    * for appending (using `fsPromises.open()`).
    * @since v10.0.0
    * @param path filename or {FileHandle}
    * @return Fulfills with `undefined` upon success.
    */
  def appendFile(path: PathLike, data: String): js.Promise[Unit] = js.native
  def appendFile(path: PathLike, data: String, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = js.native
  def appendFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
  def appendFile(path: PathLike, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = js.native
  def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
  def appendFile(path: FileHandle, data: String): js.Promise[Unit] = js.native
  def appendFile(path: FileHandle, data: String, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = js.native
  def appendFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
  def appendFile(path: FileHandle, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = js.native
  def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
  
  /**
    * Changes the permissions of a file.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
  
  /**
    * Changes the ownership of a file.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  /* was `typeof fsConstants` */
  val constants: Typeofconstants = js.native
  
  /**
    * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it
    * already exists.
    *
    * No guarantees are made about the atomicity of the copy operation. If an
    * error occurs after the destination file has been opened for writing, an attempt
    * will be made to remove the destination.
    *
    * ```js
    * import { constants } from 'fs';
    * import { copyFile } from 'fs/promises';
    *
    * try {
    *   await copyFile('source.txt', 'destination.txt');
    *   console.log('source.txt was copied to destination.txt');
    * } catch {
    *   console.log('The file could not be copied');
    * }
    *
    * // By using COPYFILE_EXCL, the operation will fail if destination.txt exists.
    * try {
    *   await copyFile('source.txt', 'destination.txt', constants.COPYFILE_EXCL);
    *   console.log('source.txt was copied to destination.txt');
    * } catch {
    *   console.log('The file could not be copied');
    * }
    * ```
    * @since v10.0.0
    * @param src source filename to copy
    * @param dest destination filename of the copy operation
    * @param [mode=0] Optional modifiers that specify the behavior of the copy operation. It is possible to create a mask consisting of the bitwise OR of two or more values (e.g.
    * `fs.constants.COPYFILE_EXCL | fs.constants.COPYFILE_FICLONE`)
    * @return Fulfills with `undefined` upon success.
    */
  def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = js.native
  def copyFile(src: PathLike, dest: PathLike, mode: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronously copies the entire directory structure from `src` to `dest`,
    * including subdirectories and files.
    *
    * When copying a directory to another directory, globs are not supported and
    * behavior is similar to `cp dir1/ dir2/`.
    * @since v16.7.0
    * @experimental
    * @param src source path to copy.
    * @param dest destination path to copy to.
    * @return Fulfills with `undefined` upon success.
    */
  def cp(source: String, destination: String): js.Promise[Unit] = js.native
  def cp(source: String, destination: String, opts: CopyOptions): js.Promise[Unit] = js.native
  def cp(source: String, destination: URL): js.Promise[Unit] = js.native
  def cp(source: String, destination: URL, opts: CopyOptions): js.Promise[Unit] = js.native
  def cp(source: URL, destination: String): js.Promise[Unit] = js.native
  def cp(source: URL, destination: String, opts: CopyOptions): js.Promise[Unit] = js.native
  def cp(source: URL, destination: URL): js.Promise[Unit] = js.native
  def cp(source: URL, destination: URL, opts: CopyOptions): js.Promise[Unit] = js.native
  
  /**
    * Changes the permissions on a symbolic link.
    *
    * This method is only implemented on macOS.
    * @deprecated Since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  def lchmod(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
  
  /**
    * Changes the ownership on a symbolic link.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  /**
    * Creates a new link from the `existingPath` to the `newPath`. See the POSIX [`link(2)`](http://man7.org/linux/man-pages/man2/link.2.html) documentation for more detail.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  
  /**
    * Equivalent to `fsPromises.stat()` unless `path` refers to a symbolic link,
    * in which case the link itself is stat-ed, not the file that it refers to.
    * Refer to the POSIX [`lstat(2)`](http://man7.org/linux/man-pages/man2/lstat.2.html) document for more detail.
    * @since v10.0.0
    * @return Fulfills with the {fs.Stats} object for the given symbolic link `path`.
    */
  def lstat(path: PathLike): js.Promise[Stats] = js.native
  def lstat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[Stats] = js.native
  def lstat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = js.native
  def lstat(path: PathLike, opts: StatOptions): js.Promise[Stats | BigIntStats] = js.native
  
  /**
    * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`, with the difference that if the path refers to a
    * symbolic link, then the link is not dereferenced: instead, the timestamps of
    * the symbolic link itself are changed.
    * @since v14.5.0, v12.19.0
    * @return Fulfills with `undefined` upon success.
    */
  def lutimes(path: PathLike, atime: TimeLike, mtime: TimeLike): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def mkdir(path: PathLike): js.Promise[Unit] = js.native
  /**
    * Asynchronously creates a directory.
    *
    * The optional `options` argument can be an integer specifying `mode` (permission
    * and sticky bits), or an object with a `mode` property and a `recursive`property indicating whether parent directories should be created. Calling`fsPromises.mkdir()` when `path` is a directory
    * that exists results in a
    * rejection only when `recursive` is false.
    * @since v10.0.0
    * @return Upon success, fulfills with `undefined` if `recursive` is `false`, or the first directory path created if `recursive` is `true`.
    */
  def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[js.UndefOr[String]] = js.native
  def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
  def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
  def mkdir(path: PathLike, options: Mode): js.Promise[Unit] = js.native
  
  /**
    * Creates a unique temporary directory. A unique directory name is generated by
    * appending six random characters to the end of the provided `prefix`. Due to
    * platform inconsistencies, avoid trailing `X` characters in `prefix`. Some
    * platforms, notably the BSDs, can return more than six random characters, and
    * replace trailing `X` characters in `prefix` with random characters.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use.
    *
    * ```js
    * import { mkdtemp } from 'fs/promises';
    *
    * try {
    *   await mkdtemp(path.join(os.tmpdir(), 'foo-'));
    * } catch (err) {
    *   console.error(err);
    * }
    * ```
    *
    * The `fsPromises.mkdtemp()` method will append the six randomly selected
    * characters directly to the `prefix` string. For instance, given a directory`/tmp`, if the intention is to create a temporary directory _within_`/tmp`, the`prefix` must end with a trailing
    * platform-specific path separator
    * (`require('path').sep`).
    * @since v10.0.0
    * @return Fulfills with a string containing the filesystem path of the newly created temporary directory.
    */
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def mkdtemp(prefix: String): js.Promise[String] = js.native
  def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def mkdtemp(prefix: String, options: BufferEncodingOption): js.Promise[Buffer] = js.native
  def mkdtemp(prefix: String, options: ObjectEncodingOptions): js.Promise[String] = js.native
  
  /**
    * Opens a `FileHandle`.
    *
    * Refer to the POSIX [`open(2)`](http://man7.org/linux/man-pages/man2/open.2.html) documentation for more detail.
    *
    * Some characters (`< > : " / \ | ? *`) are reserved under Windows as documented
    * by [Naming Files, Paths, and Namespaces](https://docs.microsoft.com/en-us/windows/desktop/FileIO/naming-a-file). Under NTFS, if the filename contains
    * a colon, Node.js will open a file system stream, as described by [this MSDN page](https://docs.microsoft.com/en-us/windows/desktop/FileIO/using-streams).
    * @since v10.0.0
    * @param [flags='r'] See `support of file system `flags``.
    * @param [mode=0o666] Sets the file mode (permission and sticky bits) if the file is created.
    * @return Fulfills with a {FileHandle} object.
    */
  def open(path: PathLike): js.Promise[FileHandle] = js.native
  def open(path: PathLike, flags: String): js.Promise[FileHandle] = js.native
  def open(path: PathLike, flags: String, mode: Mode): js.Promise[FileHandle] = js.native
  def open(path: PathLike, flags: Double): js.Promise[FileHandle] = js.native
  def open(path: PathLike, flags: Double, mode: Mode): js.Promise[FileHandle] = js.native
  def open(path: PathLike, flags: Unit, mode: Mode): js.Promise[FileHandle] = js.native
  
  /**
    * Asynchronously open a directory for iterative scanning. See the POSIX [`opendir(3)`](http://man7.org/linux/man-pages/man3/opendir.3.html) documentation for more detail.
    *
    * Creates an `fs.Dir`, which contains all further functions for reading from
    * and cleaning up the directory.
    *
    * The `encoding` option sets the encoding for the `path` while opening the
    * directory and subsequent read operations.
    *
    * Example using async iteration:
    *
    * ```js
    * import { opendir } from 'fs/promises';
    *
    * try {
    *   const dir = await opendir('./');
    *   for await (const dirent of dir)
    *     console.log(dirent.name);
    * } catch (err) {
    *   console.error(err);
    * }
    * ```
    *
    * When using the async iterator, the `fs.Dir` object will be automatically
    * closed after the iterator exits.
    * @since v12.12.0
    * @return Fulfills with an {fs.Dir}.
    */
  def opendir(path: PathLike): js.Promise[Dir] = js.native
  def opendir(path: PathLike, options: OpenDirOptions): js.Promise[Dir] = js.native
  
  /**
    * Asynchronously reads the entire contents of a file.
    *
    * If no encoding is specified (using `options.encoding`), the data is returned
    * as a `Buffer` object. Otherwise, the data will be a string.
    *
    * If `options` is a string, then it specifies the encoding.
    *
    * When the `path` is a directory, the behavior of `fsPromises.readFile()` is
    * platform-specific. On macOS, Linux, and Windows, the promise will be rejected
    * with an error. On FreeBSD, a representation of the directory's contents will be
    * returned.
    *
    * It is possible to abort an ongoing `readFile` using an `AbortSignal`. If a
    * request is aborted the promise returned is rejected with an `AbortError`:
    *
    * ```js
    * import { readFile } from 'fs/promises';
    *
    * try {
    *   const controller = new AbortController();
    *   const { signal } = controller;
    *   const promise = readFile(fileName, { signal });
    *
    *   // Abort the request before the promise settles.
    *   controller.abort();
    *
    *   await promise;
    * } catch (err) {
    *   // When a request is aborted - err is an AbortError
    *   console.error(err);
    * }
    * ```
    *
    * Aborting an ongoing request does not abort individual operating
    * system requests but rather the internal buffering `fs.readFile` performs.
    *
    * Any specified `FileHandle` has to support reading.
    * @since v10.0.0
    * @param path filename or `FileHandle`
    * @return Fulfills with the contents of the file.
    */
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def readFile(path: PathLike): js.Promise[Buffer] = js.native
  def readFile(path: PathLike, options: ObjectEncodingOptionsAborEncoding): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def readFile(path: PathLike, options: encodingBufferEncodingfla): js.Promise[String] = js.native
  def readFile(path: PathLike, options: encodingnullundefinedflag): js.Promise[Buffer] = js.native
  def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  def readFile(path: FileHandle): js.Promise[Buffer] = js.native
  def readFile(path: FileHandle, options: ObjectEncodingOptionsAborEncoding): js.Promise[String | Buffer] = js.native
  def readFile(path: FileHandle, options: encodingBufferEncodingfla): js.Promise[String] = js.native
  def readFile(path: FileHandle, options: encodingnullundefinedflag): js.Promise[Buffer] = js.native
  def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = js.native
  
  /**
    * Reads the contents of a directory.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use for
    * the filenames. If the `encoding` is set to `'buffer'`, the filenames returned
    * will be passed as `Buffer` objects.
    *
    * If `options.withFileTypes` is set to `true`, the resolved array will contain `fs.Dirent` objects.
    *
    * ```js
    * import { readdir } from 'fs/promises';
    *
    * try {
    *   const files = await readdir(path);
    *   for (const file of files)
    *     console.log(file);
    * } catch (err) {
    *   console.error(err);
    * }
    * ```
    * @since v10.0.0
    * @return Fulfills with an array of the names of the files in the directory excluding `'.'` and `'..'`.
    */
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdir(path: PathLike): js.Promise[js.Array[String]] = js.native
  def readdir(path: PathLike, options: ObjectEncodingOptionswith): js.Promise[js.Array[String]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def readdir(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Promise[js.Array[Dirent]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdir(path: PathLike, options: WithFileTypes): js.Promise[js.Array[Buffer]] = js.native
  def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
  @JSName("readdir")
  def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
  
  /**
    * Reads the contents of the symbolic link referred to by `path`. See the POSIX [`readlink(2)`](http://man7.org/linux/man-pages/man2/readlink.2.html) documentation for more detail. The promise is
    * resolved with the`linkString` upon success.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use for
    * the link path returned. If the `encoding` is set to `'buffer'`, the link path
    * returned will be passed as a `Buffer` object.
    * @since v10.0.0
    * @return Fulfills with the `linkString` upon success.
    */
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlink(path: PathLike): js.Promise[String] = js.native
  def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
  def readlink(path: PathLike, options: ObjectEncodingOptions): js.Promise[String] = js.native
  
  /**
    * Determines the actual location of `path` using the same semantics as the`fs.realpath.native()` function.
    *
    * Only paths that can be converted to UTF8 strings are supported.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use for
    * the path. If the `encoding` is set to `'buffer'`, the path returned will be
    * passed as a `Buffer` object.
    *
    * On Linux, when Node.js is linked against musl libc, the procfs file system must
    * be mounted on `/proc` in order for this function to work. Glibc does not have
    * this restriction.
    * @since v10.0.0
    * @return Fulfills with the resolved path upon success.
    */
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpath(path: PathLike): js.Promise[String] = js.native
  def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
  def realpath(path: PathLike, options: ObjectEncodingOptions): js.Promise[String] = js.native
  
  /**
    * Renames `oldPath` to `newPath`.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  
  /**
    * Removes files and directories (modeled on the standard POSIX `rm` utility).
    * @since v14.14.0
    * @return Fulfills with `undefined` upon success.
    */
  def rm(path: PathLike): js.Promise[Unit] = js.native
  def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = js.native
  
  /**
    * Removes the directory identified by `path`.
    *
    * Using `fsPromises.rmdir()` on a file (not a directory) results in the
    * promise being rejected with an `ENOENT` error on Windows and an `ENOTDIR`error on POSIX.
    *
    * To get a behavior similar to the `rm -rf` Unix command, use `fsPromises.rm()` with options `{ recursive: true, force: true }`.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  def rmdir(path: PathLike): js.Promise[Unit] = js.native
  def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = js.native
  
  /**
    * @since v10.0.0
    * @return Fulfills with the {fs.Stats} object for the given `path`.
    */
  def stat(path: PathLike): js.Promise[Stats] = js.native
  def stat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[Stats] = js.native
  def stat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = js.native
  def stat(path: PathLike, opts: StatOptions): js.Promise[Stats | BigIntStats] = js.native
  
  /**
    * Creates a symbolic link.
    *
    * The `type` argument is only used on Windows platforms and can be one of `'dir'`,`'file'`, or `'junction'`. Windows junction points require the destination path
    * to be absolute. When using `'junction'`, the `target` argument will
    * automatically be normalized to absolute path.
    * @since v10.0.0
    * @param [type='file']
    * @return Fulfills with `undefined` upon success.
    */
  def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
  def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = js.native
  
  /**
    * Truncates (shortens or extends the length) of the content at `path` to `len`bytes.
    * @since v10.0.0
    * @param [len=0]
    * @return Fulfills with `undefined` upon success.
    */
  def truncate(path: PathLike): js.Promise[Unit] = js.native
  def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
  
  /**
    * If `path` refers to a symbolic link, then the link is removed without affecting
    * the file or directory to which that link refers. If the `path` refers to a file
    * path that is not a symbolic link, the file is deleted. See the POSIX [`unlink(2)`](http://man7.org/linux/man-pages/man2/unlink.2.html) documentation for more detail.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  def unlink(path: PathLike): js.Promise[Unit] = js.native
  
  /**
    * Change the file system timestamps of the object referenced by `path`.
    *
    * The `atime` and `mtime` arguments follow these rules:
    *
    * * Values can be either numbers representing Unix epoch time, `Date`s, or a
    * numeric string like `'123456789.0'`.
    * * If the value can not be converted to a number, or is `NaN`, `Infinity` or`-Infinity`, an `Error` will be thrown.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  def utimes(path: PathLike, atime: TimeLike, mtime: TimeLike): js.Promise[Unit] = js.native
  
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  def watch(filename: PathLike): AsyncIterable[FileChangeInfo[String]] = js.native
  def watch(filename: PathLike, options: String): AsyncIterable[FileChangeInfo[Buffer | String]] = js.native
  /**
    * Returns an async iterator that watches for changes on `filename`, where `filename`is either a file or a directory.
    *
    * ```js
    * const { watch } = require('fs/promises');
    *
    * const ac = new AbortController();
    * const { signal } = ac;
    * setTimeout(() => ac.abort(), 10000);
    *
    * (async () => {
    *   try {
    *     const watcher = watch(__filename, { signal });
    *     for await (const event of watcher)
    *       console.log(event);
    *   } catch (err) {
    *     if (err.name === 'AbortError')
    *       return;
    *     throw err;
    *   }
    * })();
    * ```
    *
    * On most platforms, `'rename'` is emitted whenever a filename appears or
    * disappears in the directory.
    *
    * All the `caveats` for `fs.watch()` also apply to `fsPromises.watch()`.
    * @since v15.9.0, v14.18.0
    * @return of objects with the properties:
    */
  def watch(filename: PathLike, options: WatchOptionsencodingbuffe): AsyncIterable[FileChangeInfo[Buffer]] = js.native
  def watch(filename: PathLike, options: BufferEncoding): AsyncIterable[FileChangeInfo[String]] = js.native
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  def watch(filename: PathLike, options: WatchOptions): AsyncIterable[FileChangeInfo[String]] = js.native
  @JSName("watch")
  def watch_buffer(filename: PathLike, options: buffer): AsyncIterable[FileChangeInfo[Buffer]] = js.native
  
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.`data` can be a string, a buffer, an
    * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface) or
    * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
    *
    * The `encoding` option is ignored if `data` is a buffer.
    *
    * If `options` is a string, then it specifies the encoding.
    *
    * The `mode` option only affects the newly created file. See `fs.open()` for more details.
    *
    * Any specified `FileHandle` has to support writing.
    *
    * It is unsafe to use `fsPromises.writeFile()` multiple times on the same file
    * without waiting for the promise to be settled.
    *
    * Similarly to `fsPromises.readFile` \- `fsPromises.writeFile` is a convenience
    * method that performs multiple `write` calls internally to write the buffer
    * passed to it. For performance sensitive code consider using `fs.createWriteStream()` or `filehandle.createWriteStream()`.
    *
    * It is possible to use an `AbortSignal` to cancel an `fsPromises.writeFile()`.
    * Cancelation is "best effort", and some amount of data is likely still
    * to be written.
    *
    * ```js
    * import { writeFile } from 'fs/promises';
    * import { Buffer } from 'buffer';
    *
    * try {
    *   const controller = new AbortController();
    *   const { signal } = controller;
    *   const data = new Uint8Array(Buffer.from('Hello Node.js'));
    *   const promise = writeFile('message.txt', data, { signal });
    *
    *   // Abort the request before the promise settles.
    *   controller.abort();
    *
    *   await promise;
    * } catch (err) {
    *   // When a request is aborted - err is an AbortError
    *   console.error(err);
    * }
    * ```
    *
    * Aborting an ongoing request does not abort individual operating
    * system requests but rather the internal buffering `fs.writeFile` performs.
    * @since v10.0.0
    * @param file filename or `FileHandle`
    * @return Fulfills with `undefined` upon success.
    */
  def writeFile(file: PathLike, data: String): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView]): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: ArrayBufferView): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: Stream): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: Stream, options: BufferEncoding): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView]): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = js.native
  def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: String): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView]): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: ArrayBufferView): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: Stream): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: Stream, options: BufferEncoding): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: AsyncIterable[String | ArrayBufferView]): js.Promise[Unit] = js.native
  def writeFile(
    file: FileHandle,
    data: AsyncIterable[String | ArrayBufferView],
    options: ObjectEncodingOptionsmode
  ): js.Promise[Unit] = js.native
  def writeFile(file: FileHandle, data: AsyncIterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = js.native
}
