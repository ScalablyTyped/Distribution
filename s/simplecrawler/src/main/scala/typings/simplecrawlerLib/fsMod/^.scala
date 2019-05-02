package typings
package simplecrawlerLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def access(
    path: java.lang.String,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def access(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def access(
    path: simplecrawlerLib.Buffer,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def access(
    path: simplecrawlerLib.Buffer,
    mode: scala.Double,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def accessSync(path: java.lang.String): scala.Unit = js.native
  def accessSync(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def accessSync(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def accessSync(path: simplecrawlerLib.Buffer, mode: scala.Double): scala.Unit = js.native
  def appendFile(filename: java.lang.String, data: js.Any): scala.Unit = js.native
  def appendFile(
    filename: java.lang.String,
    data: js.Any,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(
    filename: java.lang.String,
    data: js.Any,
    encoding: java.lang.String,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(filename: java.lang.String, data: js.Any, options: simplecrawlerLib.Anon_EncodingFlagMode): scala.Unit = js.native
  def appendFile(filename: java.lang.String, data: js.Any, options: simplecrawlerLib.Anon_EncodingFlagModeString): scala.Unit = js.native
  def appendFile(
    filename: java.lang.String,
    data: js.Any,
    options: simplecrawlerLib.Anon_EncodingFlagModeString,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(
    filename: java.lang.String,
    data: js.Any,
    options: simplecrawlerLib.Anon_EncodingFlagMode,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFileSync(filename: java.lang.String, data: js.Any): scala.Unit = js.native
  def appendFileSync(filename: java.lang.String, data: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def appendFileSync(filename: java.lang.String, data: js.Any, options: simplecrawlerLib.Anon_EncodingFlagMode): scala.Unit = js.native
  def appendFileSync(filename: java.lang.String, data: js.Any, options: simplecrawlerLib.Anon_EncodingFlagModeString): scala.Unit = js.native
  def chmod(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def chmod(
    path: java.lang.String,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def chmod(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def chmod(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def chmod(path: simplecrawlerLib.Buffer, mode: java.lang.String): scala.Unit = js.native
  def chmod(
    path: simplecrawlerLib.Buffer,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def chmod(path: simplecrawlerLib.Buffer, mode: scala.Double): scala.Unit = js.native
  def chmod(
    path: simplecrawlerLib.Buffer,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def chmodSync(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def chmodSync(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def chmodSync(path: simplecrawlerLib.Buffer, mode: java.lang.String): scala.Unit = js.native
  def chmodSync(path: simplecrawlerLib.Buffer, mode: scala.Double): scala.Unit = js.native
  def chown(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def chown(
    path: java.lang.String,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def chown(path: simplecrawlerLib.Buffer, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def chown(
    path: simplecrawlerLib.Buffer,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def chownSync(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def chownSync(path: simplecrawlerLib.Buffer, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def close(fd: scala.Double): scala.Unit = js.native
  def close(
    fd: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def closeSync(fd: scala.Double): scala.Unit = js.native
  def createReadStream(path: java.lang.String): ReadStream = js.native
  def createReadStream(path: java.lang.String, options: simplecrawlerLib.Anon_AutoClose): ReadStream = js.native
  def createReadStream(path: simplecrawlerLib.Buffer): ReadStream = js.native
  def createReadStream(path: simplecrawlerLib.Buffer, options: simplecrawlerLib.Anon_AutoClose): ReadStream = js.native
  def createWriteStream(path: java.lang.String): WriteStream = js.native
  def createWriteStream(path: java.lang.String, options: simplecrawlerLib.Anon_AutoCloseEncoding): WriteStream = js.native
  def createWriteStream(path: simplecrawlerLib.Buffer): WriteStream = js.native
  def createWriteStream(path: simplecrawlerLib.Buffer, options: simplecrawlerLib.Anon_AutoCloseEncoding): WriteStream = js.native
  def exists(path: java.lang.String): scala.Unit = js.native
  def exists(path: java.lang.String, callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def exists(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def exists(path: simplecrawlerLib.Buffer, callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def existsSync(path: java.lang.String): scala.Boolean = js.native
  def existsSync(path: simplecrawlerLib.Buffer): scala.Boolean = js.native
  def fchmod(fd: scala.Double, mode: java.lang.String): scala.Unit = js.native
  def fchmod(
    fd: scala.Double,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def fchmod(fd: scala.Double, mode: scala.Double): scala.Unit = js.native
  def fchmod(
    fd: scala.Double,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def fchmodSync(fd: scala.Double, mode: java.lang.String): scala.Unit = js.native
  def fchmodSync(fd: scala.Double, mode: scala.Double): scala.Unit = js.native
  def fchown(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def fchown(
    fd: scala.Double,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def fchownSync(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def fdatasync(fd: scala.Double, callback: js.Function): scala.Unit = js.native
  def fdatasyncSync(fd: scala.Double): scala.Unit = js.native
  def fstat(fd: scala.Double): scala.Unit = js.native
  def fstat(
    fd: scala.Double,
    callback: js.Function2[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, /* stats */ Stats, _]
  ): scala.Unit = js.native
  def fstatSync(fd: scala.Double): Stats = js.native
  def fsync(fd: scala.Double): scala.Unit = js.native
  def fsync(
    fd: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def fsyncSync(fd: scala.Double): scala.Unit = js.native
  def ftruncate(fd: scala.Double): scala.Unit = js.native
  def ftruncate(
    fd: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def ftruncate(fd: scala.Double, len: scala.Double): scala.Unit = js.native
  def ftruncate(
    fd: scala.Double,
    len: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def ftruncateSync(fd: scala.Double): scala.Unit = js.native
  def ftruncateSync(fd: scala.Double, len: scala.Double): scala.Unit = js.native
  def futimes(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def futimes(fd: scala.Double, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  def futimes(
    fd: scala.Double,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def futimesSync(fd: scala.Double, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  def lchmod(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def lchmod(
    path: java.lang.String,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def lchmod(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def lchmod(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def lchmod(path: simplecrawlerLib.Buffer, mode: java.lang.String): scala.Unit = js.native
  def lchmod(
    path: simplecrawlerLib.Buffer,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def lchmod(path: simplecrawlerLib.Buffer, mode: scala.Double): scala.Unit = js.native
  def lchmod(
    path: simplecrawlerLib.Buffer,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def lchmodSync(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def lchmodSync(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def lchmodSync(path: simplecrawlerLib.Buffer, mode: java.lang.String): scala.Unit = js.native
  def lchmodSync(path: simplecrawlerLib.Buffer, mode: scala.Double): scala.Unit = js.native
  def lchown(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def lchown(
    path: java.lang.String,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def lchown(path: simplecrawlerLib.Buffer, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def lchown(
    path: simplecrawlerLib.Buffer,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def lchownSync(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def lchownSync(path: simplecrawlerLib.Buffer, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def link(srcpath: java.lang.String, dstpath: java.lang.String): scala.Unit = js.native
  def link(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def link(srcpath: java.lang.String, dstpath: simplecrawlerLib.Buffer): scala.Unit = js.native
  def link(
    srcpath: java.lang.String,
    dstpath: simplecrawlerLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def link(srcpath: simplecrawlerLib.Buffer, dstpath: java.lang.String): scala.Unit = js.native
  def link(
    srcpath: simplecrawlerLib.Buffer,
    dstpath: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def link(srcpath: simplecrawlerLib.Buffer, dstpath: simplecrawlerLib.Buffer): scala.Unit = js.native
  def link(
    srcpath: simplecrawlerLib.Buffer,
    dstpath: simplecrawlerLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def linkSync(srcpath: java.lang.String, dstpath: java.lang.String): scala.Unit = js.native
  def linkSync(srcpath: java.lang.String, dstpath: simplecrawlerLib.Buffer): scala.Unit = js.native
  def linkSync(srcpath: simplecrawlerLib.Buffer, dstpath: java.lang.String): scala.Unit = js.native
  def linkSync(srcpath: simplecrawlerLib.Buffer, dstpath: simplecrawlerLib.Buffer): scala.Unit = js.native
  def lstat(path: java.lang.String): scala.Unit = js.native
  def lstat(
    path: java.lang.String,
    callback: js.Function2[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, /* stats */ Stats, _]
  ): scala.Unit = js.native
  def lstat(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def lstat(
    path: simplecrawlerLib.Buffer,
    callback: js.Function2[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, /* stats */ Stats, _]
  ): scala.Unit = js.native
  def lstatSync(path: java.lang.String): Stats = js.native
  def lstatSync(path: simplecrawlerLib.Buffer): Stats = js.native
  def mkdir(path: java.lang.String): scala.Unit = js.native
  def mkdir(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def mkdir(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def mkdir(
    path: java.lang.String,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def mkdir(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def mkdir(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def mkdir(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def mkdir(
    path: simplecrawlerLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def mkdir(path: simplecrawlerLib.Buffer, mode: java.lang.String): scala.Unit = js.native
  def mkdir(
    path: simplecrawlerLib.Buffer,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def mkdir(path: simplecrawlerLib.Buffer, mode: scala.Double): scala.Unit = js.native
  def mkdir(
    path: simplecrawlerLib.Buffer,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def mkdirSync(path: java.lang.String): scala.Unit = js.native
  def mkdirSync(path: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def mkdirSync(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def mkdirSync(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def mkdirSync(path: simplecrawlerLib.Buffer, mode: java.lang.String): scala.Unit = js.native
  def mkdirSync(path: simplecrawlerLib.Buffer, mode: scala.Double): scala.Unit = js.native
  def mkdtemp(prefix: java.lang.String): scala.Unit = js.native
  def mkdtemp(
    prefix: java.lang.String,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* folder */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def mkdtempSync(prefix: java.lang.String): java.lang.String = js.native
  def open(
    path: java.lang.String,
    flags: java.lang.String,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(
    path: java.lang.String,
    flags: java.lang.String,
    mode: scala.Double,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(
    path: java.lang.String,
    flags: scala.Double,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(
    path: java.lang.String,
    flags: scala.Double,
    mode: scala.Double,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(
    path: simplecrawlerLib.Buffer,
    flags: java.lang.String,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(
    path: simplecrawlerLib.Buffer,
    flags: java.lang.String,
    mode: scala.Double,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(
    path: simplecrawlerLib.Buffer,
    flags: scala.Double,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(
    path: simplecrawlerLib.Buffer,
    flags: scala.Double,
    mode: scala.Double,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def openSync(path: java.lang.String, flags: java.lang.String): scala.Double = js.native
  def openSync(path: java.lang.String, flags: java.lang.String, mode: scala.Double): scala.Double = js.native
  def openSync(path: java.lang.String, flags: scala.Double): scala.Double = js.native
  def openSync(path: java.lang.String, flags: scala.Double, mode: scala.Double): scala.Double = js.native
  def openSync(path: simplecrawlerLib.Buffer, flags: java.lang.String): scala.Double = js.native
  def openSync(path: simplecrawlerLib.Buffer, flags: java.lang.String, mode: scala.Double): scala.Double = js.native
  def openSync(path: simplecrawlerLib.Buffer, flags: scala.Double): scala.Double = js.native
  def openSync(path: simplecrawlerLib.Buffer, flags: scala.Double, mode: scala.Double): scala.Double = js.native
  def read(fd: scala.Double, buffer: simplecrawlerLib.Buffer, offset: scala.Double, length: scala.Double): scala.Unit = js.native
  def read(
    fd: scala.Double,
    buffer: simplecrawlerLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Unit = js.native
  def read(
    fd: scala.Double,
    buffer: simplecrawlerLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def read(
    fd: scala.Double,
    buffer: simplecrawlerLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* data */ simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    encoding: java.lang.String,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      simplecrawlerLib.Buffer | (/* data */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    encoding: scala.Null,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      simplecrawlerLib.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    options: simplecrawlerLib.Anon_EncodingFlagNull,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* data */ java.lang.String | simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    options: simplecrawlerLib.Anon_EncodingFlagString,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* data */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    options: simplecrawlerLib.Anon_EncodingFlag,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* data */ simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    filename: java.lang.String,
    options: simplecrawlerLib.Anon_Flag,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* data */ simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFileSync(filename: java.lang.String): java.lang.String | simplecrawlerLib.Buffer = js.native
  def readFileSync(filename: java.lang.String, encoding: java.lang.String): java.lang.String | simplecrawlerLib.Buffer = js.native
  def readFileSync(filename: java.lang.String, options: simplecrawlerLib.Anon_EncodingFlag): simplecrawlerLib.Buffer = js.native
  def readFileSync(filename: java.lang.String, options: simplecrawlerLib.Anon_EncodingFlagNull): java.lang.String | simplecrawlerLib.Buffer = js.native
  def readFileSync(filename: java.lang.String, options: simplecrawlerLib.Anon_EncodingFlagString): java.lang.String = js.native
  def readFileSync(filename: java.lang.String, options: simplecrawlerLib.Anon_Flag): simplecrawlerLib.Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(filename: java.lang.String): simplecrawlerLib.Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_String(filename: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def readSync(fd: scala.Double, buffer: simplecrawlerLib.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def readSync(
    fd: scala.Double,
    buffer: simplecrawlerLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  def readdir(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: java.lang.String,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: java.lang.String,
    options: js.Object,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: simplecrawlerLib.Buffer,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: simplecrawlerLib.Buffer,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: simplecrawlerLib.Buffer,
    options: js.Object,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdirSync(path: java.lang.String): js.Array[java.lang.String] = js.native
  def readdirSync(path: java.lang.String, options: java.lang.String): js.Array[java.lang.String] = js.native
  def readdirSync(path: java.lang.String, options: js.Object): js.Array[java.lang.String] = js.native
  def readdirSync(path: simplecrawlerLib.Buffer): js.Array[java.lang.String] = js.native
  def readdirSync(path: simplecrawlerLib.Buffer, options: java.lang.String): js.Array[java.lang.String] = js.native
  def readdirSync(path: simplecrawlerLib.Buffer, options: js.Object): js.Array[java.lang.String] = js.native
  def readlink(path: java.lang.String): scala.Unit = js.native
  def readlink(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* linkString */ java.lang.String, 
      _
    ]
  ): scala.Unit = js.native
  def readlink(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def readlink(
    path: simplecrawlerLib.Buffer,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* linkString */ java.lang.String, 
      _
    ]
  ): scala.Unit = js.native
  def readlinkSync(path: java.lang.String): java.lang.String = js.native
  def readlinkSync(path: simplecrawlerLib.Buffer): java.lang.String = js.native
  def realpath(path: java.lang.String): scala.Unit = js.native
  def realpath(
    path: java.lang.String,
    cache: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      _
    ]
  ): scala.Unit = js.native
  def realpath(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      _
    ]
  ): scala.Unit = js.native
  def realpath(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def realpath(
    path: simplecrawlerLib.Buffer,
    cache: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      _
    ]
  ): scala.Unit = js.native
  def realpath(
    path: simplecrawlerLib.Buffer,
    callback: js.Function2[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      _
    ]
  ): scala.Unit = js.native
  def realpathSync(path: java.lang.String): java.lang.String = js.native
  def realpathSync(path: java.lang.String, cache: org.scalablytyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def realpathSync(path: simplecrawlerLib.Buffer): java.lang.String = js.native
  def realpathSync(path: simplecrawlerLib.Buffer, cache: org.scalablytyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def rename(oldPath: java.lang.String, newPath: java.lang.String): scala.Unit = js.native
  def rename(
    oldPath: java.lang.String,
    newPath: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def renameSync(oldPath: java.lang.String, newPath: java.lang.String): scala.Unit = js.native
  def rmdir(path: java.lang.String): scala.Unit = js.native
  def rmdir(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def rmdir(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def rmdir(
    path: simplecrawlerLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def rmdirSync(path: java.lang.String): scala.Unit = js.native
  def rmdirSync(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def stat(path: java.lang.String): scala.Unit = js.native
  def stat(
    path: java.lang.String,
    callback: js.Function2[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, /* stats */ Stats, _]
  ): scala.Unit = js.native
  def stat(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def stat(
    path: simplecrawlerLib.Buffer,
    callback: js.Function2[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, /* stats */ Stats, _]
  ): scala.Unit = js.native
  def statSync(path: java.lang.String): Stats = js.native
  def statSync(path: simplecrawlerLib.Buffer): Stats = js.native
  def symlink(srcpath: java.lang.String, dstpath: java.lang.String): scala.Unit = js.native
  def symlink(srcpath: java.lang.String, dstpath: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def symlink(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    `type`: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def symlink(srcpath: java.lang.String, dstpath: simplecrawlerLib.Buffer): scala.Unit = js.native
  def symlink(srcpath: java.lang.String, dstpath: simplecrawlerLib.Buffer, `type`: java.lang.String): scala.Unit = js.native
  def symlink(
    srcpath: java.lang.String,
    dstpath: simplecrawlerLib.Buffer,
    `type`: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def symlink(srcpath: simplecrawlerLib.Buffer, dstpath: java.lang.String): scala.Unit = js.native
  def symlink(srcpath: simplecrawlerLib.Buffer, dstpath: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def symlink(
    srcpath: simplecrawlerLib.Buffer,
    dstpath: java.lang.String,
    `type`: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def symlink(srcpath: simplecrawlerLib.Buffer, dstpath: simplecrawlerLib.Buffer): scala.Unit = js.native
  def symlink(srcpath: simplecrawlerLib.Buffer, dstpath: simplecrawlerLib.Buffer, `type`: java.lang.String): scala.Unit = js.native
  def symlink(
    srcpath: simplecrawlerLib.Buffer,
    dstpath: simplecrawlerLib.Buffer,
    `type`: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def symlinkSync(srcpath: java.lang.String, dstpath: java.lang.String): scala.Unit = js.native
  def symlinkSync(srcpath: java.lang.String, dstpath: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def symlinkSync(srcpath: java.lang.String, dstpath: simplecrawlerLib.Buffer): scala.Unit = js.native
  def symlinkSync(srcpath: java.lang.String, dstpath: simplecrawlerLib.Buffer, `type`: java.lang.String): scala.Unit = js.native
  def symlinkSync(srcpath: simplecrawlerLib.Buffer, dstpath: java.lang.String): scala.Unit = js.native
  def symlinkSync(srcpath: simplecrawlerLib.Buffer, dstpath: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def symlinkSync(srcpath: simplecrawlerLib.Buffer, dstpath: simplecrawlerLib.Buffer): scala.Unit = js.native
  def symlinkSync(srcpath: simplecrawlerLib.Buffer, dstpath: simplecrawlerLib.Buffer, `type`: java.lang.String): scala.Unit = js.native
  def truncate(path: java.lang.String): scala.Unit = js.native
  def truncate(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def truncate(path: java.lang.String, len: scala.Double): scala.Unit = js.native
  def truncate(
    path: java.lang.String,
    len: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def truncate(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def truncate(
    path: simplecrawlerLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def truncate(path: simplecrawlerLib.Buffer, len: scala.Double): scala.Unit = js.native
  def truncate(
    path: simplecrawlerLib.Buffer,
    len: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def truncateSync(path: java.lang.String): scala.Unit = js.native
  def truncateSync(path: java.lang.String, len: scala.Double): scala.Unit = js.native
  def truncateSync(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def truncateSync(path: simplecrawlerLib.Buffer, len: scala.Double): scala.Unit = js.native
  def unlink(path: java.lang.String): scala.Unit = js.native
  def unlink(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def unlink(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def unlink(
    path: simplecrawlerLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def unlinkSync(path: java.lang.String): scala.Unit = js.native
  def unlinkSync(path: simplecrawlerLib.Buffer): scala.Unit = js.native
  def unwatchFile(filename: java.lang.String): scala.Unit = js.native
  def unwatchFile(filename: java.lang.String, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, scala.Unit]): scala.Unit = js.native
  def utimes(path: java.lang.String, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def utimes(
    path: java.lang.String,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: java.lang.String, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  def utimes(
    path: java.lang.String,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: simplecrawlerLib.Buffer, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def utimes(
    path: simplecrawlerLib.Buffer,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: simplecrawlerLib.Buffer, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  def utimes(
    path: simplecrawlerLib.Buffer,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.UndefOr[simplecrawlerLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def utimesSync(path: java.lang.String, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def utimesSync(path: java.lang.String, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  def utimesSync(path: simplecrawlerLib.Buffer, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  def utimesSync(path: simplecrawlerLib.Buffer, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  def watch(filename: java.lang.String): FSWatcher = js.native
  def watch(filename: java.lang.String, encoding: java.lang.String): FSWatcher = js.native
  def watch(
    filename: java.lang.String,
    encoding: java.lang.String,
    listener: js.Function2[
      /* event */ java.lang.String, 
      /* filename */ java.lang.String | simplecrawlerLib.Buffer, 
      _
    ]
  ): FSWatcher = js.native
  def watch(
    filename: java.lang.String,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, _]
  ): FSWatcher = js.native
  def watch(filename: java.lang.String, options: simplecrawlerLib.Anon_EncodingPersistent): FSWatcher = js.native
  def watch(
    filename: java.lang.String,
    options: simplecrawlerLib.Anon_EncodingPersistent,
    listener: js.Function2[
      /* event */ java.lang.String, 
      /* filename */ java.lang.String | simplecrawlerLib.Buffer, 
      _
    ]
  ): FSWatcher = js.native
  def watchFile(filename: java.lang.String, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, scala.Unit]): scala.Unit = js.native
  def watchFile(
    filename: java.lang.String,
    options: simplecrawlerLib.Anon_Interval,
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, scala.Unit]
  ): scala.Unit = js.native
  def write(fd: scala.Double, buffer: simplecrawlerLib.Buffer, offset: scala.Double, length: scala.Double): scala.Unit = js.native
  def write(
    fd: scala.Double,
    buffer: simplecrawlerLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def write(
    fd: scala.Double,
    buffer: simplecrawlerLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Unit = js.native
  def write(
    fd: scala.Double,
    buffer: simplecrawlerLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def write(
    fd: scala.Double,
    buffer: simplecrawlerLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def write(fd: scala.Double, data: js.Any): scala.Unit = js.native
  def write(
    fd: scala.Double,
    data: js.Any,
    callback: js.Function3[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def write(fd: scala.Double, data: js.Any, offset: scala.Double): scala.Unit = js.native
  def write(
    fd: scala.Double,
    data: js.Any,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def write(fd: scala.Double, data: js.Any, offset: scala.Double, encoding: java.lang.String): scala.Unit = js.native
  def write(
    fd: scala.Double,
    data: js.Any,
    offset: scala.Double,
    encoding: java.lang.String,
    callback: js.Function3[
      /* err */ simplecrawlerLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def writeFile(filename: java.lang.String, data: js.Any): scala.Unit = js.native
  def writeFile(
    filename: java.lang.String,
    data: js.Any,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    filename: java.lang.String,
    data: js.Any,
    encoding: java.lang.String,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(filename: java.lang.String, data: js.Any, options: simplecrawlerLib.Anon_EncodingFlagMode): scala.Unit = js.native
  def writeFile(filename: java.lang.String, data: js.Any, options: simplecrawlerLib.Anon_EncodingFlagModeString): scala.Unit = js.native
  def writeFile(
    filename: java.lang.String,
    data: js.Any,
    options: simplecrawlerLib.Anon_EncodingFlagModeString,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    filename: java.lang.String,
    data: js.Any,
    options: simplecrawlerLib.Anon_EncodingFlagMode,
    callback: js.Function1[/* err */ simplecrawlerLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFileSync(filename: java.lang.String, data: js.Any): scala.Unit = js.native
  def writeFileSync(filename: java.lang.String, data: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def writeFileSync(filename: java.lang.String, data: js.Any, options: simplecrawlerLib.Anon_EncodingFlagMode): scala.Unit = js.native
  def writeFileSync(filename: java.lang.String, data: js.Any, options: simplecrawlerLib.Anon_EncodingFlagModeString): scala.Unit = js.native
  def writeSync(fd: scala.Double, buffer: simplecrawlerLib.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def writeSync(
    fd: scala.Double,
    buffer: simplecrawlerLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  def writeSync(fd: scala.Double, data: js.Any): scala.Double = js.native
  def writeSync(fd: scala.Double, data: js.Any, position: scala.Double): scala.Double = js.native
  def writeSync(fd: scala.Double, data: js.Any, position: scala.Double, enconding: java.lang.String): scala.Double = js.native
  def writeSync(fd: scala.Double, data: js.Any, position: scala.Null, enconding: java.lang.String): scala.Double = js.native
}

