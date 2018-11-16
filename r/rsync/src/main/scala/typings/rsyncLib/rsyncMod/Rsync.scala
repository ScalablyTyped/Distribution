package typings
package rsyncLib.rsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rsync extends js.Object {
  def archive(): Rsync = js.native
  def args(): js.Array[java.lang.String] = js.native
  def chmod(flags: java.lang.String): Rsync = js.native
  def command(): java.lang.String = js.native
  def compress(): Rsync = js.native
  // cwd
  def cwd(cwd: java.lang.String): java.lang.String = js.native
  def delete(): Rsync = js.native
  def destination(): java.lang.String = js.native
  def destination(d: java.lang.String): Rsync = js.native
  def dirs(): Rsync = js.native
  def dry(): Rsync = js.native
  def exclude(p: java.lang.String): Rsync = js.native
  def exclude(p: js.Array[java.lang.String]): Rsync = js.native
  // accessor methods
  def executable(): java.lang.String = js.native
  def executable(e: java.lang.String): Rsync = js.native
  def executableShell(): java.lang.String = js.native
  def executableShell(e: java.lang.String): Rsync = js.native
  def execute(
    callback: js.Function3[
      /* err */ nodeLib.Error, 
      /* code */ scala.Double, 
      /* cmd */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execute(
    callback: js.Function3[
      /* err */ nodeLib.Error, 
      /* code */ scala.Double, 
      /* cmd */ java.lang.String, 
      scala.Unit
    ],
    stdout: StreamDataHandler,
    stderr: StreamDataHandler
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def flags(flags: js.Any*): Rsync = js.native
  def flags(flags: java.lang.String): Rsync = js.native
  def flags(flags: java.lang.String, set: scala.Boolean): Rsync = js.native
  def flags(flags: js.Array[java.lang.String]): Rsync = js.native
  def flags(flags: js.Array[java.lang.String], set: scala.Boolean): Rsync = js.native
  def flags(flags: Flag): Rsync = js.native
  def include(p: java.lang.String): Rsync = js.native
  def include(p: js.Array[java.lang.String]): Rsync = js.native
  def isSet(option: java.lang.String): scala.Boolean = js.native
  def links(): Rsync = js.native
  def option(option: java.lang.String): js.Any = js.native
  def output(stdout: StreamDataHandler, stderr: StreamDataHandler): Rsync = js.native
  // pattern accessors
  def patterns(patterns: js.Array[java.lang.String | Pattern]): Rsync = js.native
  def progress(): Rsync = js.native
  def quiet(): Rsync = js.native
  def recursive(): Rsync = js.native
  def set(option: java.lang.String): Rsync = js.native
  // instance methods
  def set(option: java.lang.String, value: java.lang.String): Rsync = js.native
  // option shorthands
  def shell(shell: java.lang.String): Rsync = js.native
  def source(): js.Array[java.lang.String] = js.native
  def source(s: java.lang.String): Rsync = js.native
  def source(s: js.Array[java.lang.String]): Rsync = js.native
  def unset(option: java.lang.String): Rsync = js.native
  def update(): Rsync = js.native
}

