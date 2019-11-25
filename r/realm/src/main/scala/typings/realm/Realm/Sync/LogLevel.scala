package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.realm.realmStrings.all
  - typings.realm.realmStrings.trace
  - typings.realm.realmStrings.debug
  - typings.realm.realmStrings.detail
  - typings.realm.realmStrings.info
  - typings.realm.realmStrings.warn
  - typings.realm.realmStrings.error
  - typings.realm.realmStrings.fatal
  - typings.realm.realmStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def all: typings.realm.realmStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.realm.realmStrings.debug = this.cast("debug")
  @scala.inline
  def detail: typings.realm.realmStrings.detail = this.cast("detail")
  @scala.inline
  def error: typings.realm.realmStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.realm.realmStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.realm.realmStrings.info = this.cast("info")
  @scala.inline
  def off: typings.realm.realmStrings.off = this.cast("off")
  @scala.inline
  def trace: typings.realm.realmStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typings.realm.realmStrings.warn = this.cast("warn")
}

