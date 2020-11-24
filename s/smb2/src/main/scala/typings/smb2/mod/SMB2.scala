package typings.smb2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMB2 extends js.Object {
  
  def close(): Unit = js.native
  
  def exists(path: String): Unit = js.native
  def exists(path: String, callback: js.Function2[/* error */ js.Any, /* exists */ Boolean, Unit]): Unit = js.native
  
  def mkdir(dir: String): Unit = js.native
  def mkdir(dir: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def mkdir(dir: String, mode: String): Unit = js.native
  def mkdir(dir: String, mode: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def readFile(fileName: String): Unit = js.native
  def readFile(fileName: String, callback: js.Function2[/* error */ js.Any, /* data */ String, Unit]): Unit = js.native
  def readFile(
    fileName: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Any, /* data */ String, Unit]
  ): Unit = js.native
  def readFile(fileName: String, options: SMB2ReadFileOptions): Unit = js.native
  def readFile(
    fileName: String,
    options: SMB2ReadFileOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ String, Unit]
  ): Unit = js.native
  
  def readdir(dir: String): Unit = js.native
  def readdir(dir: String, callback: js.Function2[/* error */ js.Any, /* files */ js.Array[String], Unit]): Unit = js.native
  
  def rename(oldPath: String, newPath: String): Unit = js.native
  def rename(oldPath: String, newPath: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def rmdir(dir: String): Unit = js.native
  def rmdir(dir: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def unlink(fileName: String): Unit = js.native
  def unlink(fileName: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def writeFile(fileName: String, data: String): Unit = js.native
  def writeFile(fileName: String, data: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def writeFile(
    fileName: String,
    data: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def writeFile(fileName: String, data: String, options: SMB2ReadFileOptions): Unit = js.native
  def writeFile(
    fileName: String,
    data: String,
    options: SMB2ReadFileOptions,
    callback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
}
