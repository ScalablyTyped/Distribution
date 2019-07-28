package typings.slimerjs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsModule extends js.Object {
  var separator: String
  var workingDirectory: String
  def absolute(path: String): String
  def base(path: String): String
  def basename(path: String): String
  def changeWorkingDirectory(path: String): Unit
  def copy(source: String, target: String): Unit
  def copyTree(source: String, target: String): Unit
  def directory(path: String): String
  def dirname(path: String): String
  def exists(path: String): Boolean
  def extension(path: String, withoutdot: Boolean): String
  def isAbsolute(path: String): Boolean
  def isDirectory(path: String): Boolean
  def isExecutable(path: String): Boolean
  def isFile(path: String): Boolean
  def isLink(path: String): Boolean
  def isReadable(path: String): Boolean
  def isWritable(path: String): Boolean
  // last argument should be the filename
  def join(basepath: String, dirname: String, args: String*): String
  def lastModified(path: String): Date
  def list(path: String): js.Array[String]
  def makeDirectory(path: String): Unit
  def makeTree(path: String): Unit
  def mkpath(path: String): Unit
  def move(source: String, target: String): Unit
  def open(filename: String, opts: Opts): Unit
  def read(path: String, mode: String): String
  def readLink(path: String): String
  def remove(path: String): Unit
  def removeDirectory(path: String): Unit
  def removeTree(path: String): Unit
  def rename(path: String, newname: String): Unit
  def rmdir(path: String): Unit
  def size(path: String): Double
  def split(path: String): js.Array[String]
  def touch(path: String, date: Date): Unit
  /*
    Mode is a string that can contain character which describes a characteristic of the returned stream.
    If the string contains "r", the file is opened in read-only mode.
    "w" opens the file in write-only mode.
    "b" opens the file in binary mode. If "b" is not present, the file is
    opened in text mode, and its contents are assumed to be UTF-8.
    "a" means to open as "append" mode: the file is open in write-only mode and all written character are append to the file
    */
  def write(path: String, content: js.Any, mode: String): Unit
}

object FsModule {
  @scala.inline
  def apply(
    absolute: String => String,
    base: String => String,
    basename: String => String,
    changeWorkingDirectory: String => Unit,
    copy: (String, String) => Unit,
    copyTree: (String, String) => Unit,
    directory: String => String,
    dirname: String => String,
    exists: String => Boolean,
    extension: (String, Boolean) => String,
    isAbsolute: String => Boolean,
    isDirectory: String => Boolean,
    isExecutable: String => Boolean,
    isFile: String => Boolean,
    isLink: String => Boolean,
    isReadable: String => Boolean,
    isWritable: String => Boolean,
    join: (String, String, /* repeated */ String) => String,
    lastModified: String => Date,
    list: String => js.Array[String],
    makeDirectory: String => Unit,
    makeTree: String => Unit,
    mkpath: String => Unit,
    move: (String, String) => Unit,
    open: (String, Opts) => Unit,
    read: (String, String) => String,
    readLink: String => String,
    remove: String => Unit,
    removeDirectory: String => Unit,
    removeTree: String => Unit,
    rename: (String, String) => Unit,
    rmdir: String => Unit,
    separator: String,
    size: String => Double,
    split: String => js.Array[String],
    touch: (String, Date) => Unit,
    workingDirectory: String,
    write: (String, js.Any, String) => Unit
  ): FsModule = {
    val __obj = js.Dynamic.literal(absolute = js.Any.fromFunction1(absolute), base = js.Any.fromFunction1(base), basename = js.Any.fromFunction1(basename), changeWorkingDirectory = js.Any.fromFunction1(changeWorkingDirectory), copy = js.Any.fromFunction2(copy), copyTree = js.Any.fromFunction2(copyTree), directory = js.Any.fromFunction1(directory), dirname = js.Any.fromFunction1(dirname), exists = js.Any.fromFunction1(exists), extension = js.Any.fromFunction2(extension), isAbsolute = js.Any.fromFunction1(isAbsolute), isDirectory = js.Any.fromFunction1(isDirectory), isExecutable = js.Any.fromFunction1(isExecutable), isFile = js.Any.fromFunction1(isFile), isLink = js.Any.fromFunction1(isLink), isReadable = js.Any.fromFunction1(isReadable), isWritable = js.Any.fromFunction1(isWritable), join = js.Any.fromFunction3(join), lastModified = js.Any.fromFunction1(lastModified), list = js.Any.fromFunction1(list), makeDirectory = js.Any.fromFunction1(makeDirectory), makeTree = js.Any.fromFunction1(makeTree), mkpath = js.Any.fromFunction1(mkpath), move = js.Any.fromFunction2(move), open = js.Any.fromFunction2(open), read = js.Any.fromFunction2(read), readLink = js.Any.fromFunction1(readLink), remove = js.Any.fromFunction1(remove), removeDirectory = js.Any.fromFunction1(removeDirectory), removeTree = js.Any.fromFunction1(removeTree), rename = js.Any.fromFunction2(rename), rmdir = js.Any.fromFunction1(rmdir), separator = separator, size = js.Any.fromFunction1(size), split = js.Any.fromFunction1(split), touch = js.Any.fromFunction2(touch), workingDirectory = workingDirectory, write = js.Any.fromFunction3(write))
  
    __obj.asInstanceOf[FsModule]
  }
}

