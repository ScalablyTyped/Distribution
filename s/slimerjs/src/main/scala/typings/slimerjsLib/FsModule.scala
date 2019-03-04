package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsModule extends js.Object {
  var separator: java.lang.String
  var workingDirectory: java.lang.String
  def absolute(path: java.lang.String): java.lang.String
  def base(path: java.lang.String): java.lang.String
  def basename(path: java.lang.String): java.lang.String
  def changeWorkingDirectory(path: java.lang.String): scala.Unit
  def copy(source: java.lang.String, target: java.lang.String): scala.Unit
  def copyTree(source: java.lang.String, target: java.lang.String): scala.Unit
  def directory(path: java.lang.String): java.lang.String
  def dirname(path: java.lang.String): java.lang.String
  def exists(path: java.lang.String): scala.Boolean
  def extension(path: java.lang.String, withoutdot: scala.Boolean): java.lang.String
  def isAbsolute(path: java.lang.String): scala.Boolean
  def isDirectory(path: java.lang.String): scala.Boolean
  def isExecutable(path: java.lang.String): scala.Boolean
  def isFile(path: java.lang.String): scala.Boolean
  def isLink(path: java.lang.String): scala.Boolean
  def isReadable(path: java.lang.String): scala.Boolean
  def isWritable(path: java.lang.String): scala.Boolean
  // last argument should be the filename
  def join(basepath: java.lang.String, dirname: java.lang.String, args: java.lang.String*): java.lang.String
  def lastModified(path: java.lang.String): stdLib.Date
  def list(path: java.lang.String): js.Array[java.lang.String]
  def makeDirectory(path: java.lang.String): scala.Unit
  def makeTree(path: java.lang.String): scala.Unit
  def mkpath(path: java.lang.String): scala.Unit
  def move(source: java.lang.String, target: java.lang.String): scala.Unit
  def open(filename: java.lang.String, opts: Opts): scala.Unit
  def read(path: java.lang.String, mode: java.lang.String): java.lang.String
  def readLink(path: java.lang.String): java.lang.String
  def remove(path: java.lang.String): scala.Unit
  def removeDirectory(path: java.lang.String): scala.Unit
  def removeTree(path: java.lang.String): scala.Unit
  def rename(path: java.lang.String, newname: java.lang.String): scala.Unit
  def rmdir(path: java.lang.String): scala.Unit
  def size(path: java.lang.String): scala.Double
  def split(path: java.lang.String): js.Array[java.lang.String]
  def touch(path: java.lang.String, date: stdLib.Date): scala.Unit
  /*
    Mode is a string that can contain character which describes a characteristic of the returned stream.
    If the string contains "r", the file is opened in read-only mode.
    "w" opens the file in write-only mode.
    "b" opens the file in binary mode. If "b" is not present, the file is
    opened in text mode, and its contents are assumed to be UTF-8.
    "a" means to open as "append" mode: the file is open in write-only mode and all written character are append to the file
    */
  def write(path: java.lang.String, content: js.Any, mode: java.lang.String): scala.Unit
}

object FsModule {
  @scala.inline
  def apply(
    absolute: js.Function1[java.lang.String, java.lang.String],
    base: js.Function1[java.lang.String, java.lang.String],
    basename: js.Function1[java.lang.String, java.lang.String],
    changeWorkingDirectory: js.Function1[java.lang.String, scala.Unit],
    copy: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    copyTree: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    directory: js.Function1[java.lang.String, java.lang.String],
    dirname: js.Function1[java.lang.String, java.lang.String],
    exists: js.Function1[java.lang.String, scala.Boolean],
    extension: js.Function2[java.lang.String, scala.Boolean, java.lang.String],
    isAbsolute: js.Function1[java.lang.String, scala.Boolean],
    isDirectory: js.Function1[java.lang.String, scala.Boolean],
    isExecutable: js.Function1[java.lang.String, scala.Boolean],
    isFile: js.Function1[java.lang.String, scala.Boolean],
    isLink: js.Function1[java.lang.String, scala.Boolean],
    isReadable: js.Function1[java.lang.String, scala.Boolean],
    isWritable: js.Function1[java.lang.String, scala.Boolean],
    join: js.Function3[java.lang.String, java.lang.String, /* repeated */ java.lang.String, java.lang.String],
    lastModified: js.Function1[java.lang.String, stdLib.Date],
    list: js.Function1[java.lang.String, js.Array[java.lang.String]],
    makeDirectory: js.Function1[java.lang.String, scala.Unit],
    makeTree: js.Function1[java.lang.String, scala.Unit],
    mkpath: js.Function1[java.lang.String, scala.Unit],
    move: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    open: js.Function2[java.lang.String, Opts, scala.Unit],
    read: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    readLink: js.Function1[java.lang.String, java.lang.String],
    remove: js.Function1[java.lang.String, scala.Unit],
    removeDirectory: js.Function1[java.lang.String, scala.Unit],
    removeTree: js.Function1[java.lang.String, scala.Unit],
    rename: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    rmdir: js.Function1[java.lang.String, scala.Unit],
    separator: java.lang.String,
    size: js.Function1[java.lang.String, scala.Double],
    split: js.Function1[java.lang.String, js.Array[java.lang.String]],
    touch: js.Function2[java.lang.String, stdLib.Date, scala.Unit],
    workingDirectory: java.lang.String,
    write: js.Function3[java.lang.String, js.Any, java.lang.String, scala.Unit]
  ): FsModule = {
    val __obj = js.Dynamic.literal(absolute = absolute, base = base, basename = basename, changeWorkingDirectory = changeWorkingDirectory, copy = copy, copyTree = copyTree, directory = directory, dirname = dirname, exists = exists, extension = extension, isAbsolute = isAbsolute, isDirectory = isDirectory, isExecutable = isExecutable, isFile = isFile, isLink = isLink, isReadable = isReadable, isWritable = isWritable, join = join, lastModified = lastModified, list = list, makeDirectory = makeDirectory, makeTree = makeTree, mkpath = mkpath, move = move, open = open, read = read, readLink = readLink, remove = remove, removeDirectory = removeDirectory, removeTree = removeTree, rename = rename, rmdir = rmdir, separator = separator, size = size, split = split, touch = touch, workingDirectory = workingDirectory, write = write)
  
    __obj.asInstanceOf[FsModule]
  }
}

