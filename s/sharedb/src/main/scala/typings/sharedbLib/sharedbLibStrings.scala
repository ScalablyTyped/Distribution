package typings
package sharedbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sharedbLibStrings {
  @js.native
  sealed trait `after submit`
    extends sharedbLib.sharedbMod.sharedbNs.UseAction
  
  @js.native
  sealed trait apply
    extends sharedbLib.sharedbMod.sharedbNs.UseAction
  
  @js.native
  sealed trait `before op`
    extends sharedbLib.libSharedbMod.DocEvent
  
  @js.native
  sealed trait changed
    extends sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait commit
    extends sharedbLib.sharedbMod.sharedbNs.UseAction
  
  @js.native
  sealed trait connect
    extends sharedbLib.sharedbMod.sharedbNs.UseAction
  
  @js.native
  sealed trait create
    extends sharedbLib.libSharedbMod.DocEvent
  
  @js.native
  sealed trait del
    extends sharedbLib.libSharedbMod.DocEvent
  
  @js.native
  sealed trait doc
    extends sharedbLib.sharedbMod.sharedbNs.UseAction
  
  @js.native
  sealed trait error
    extends sharedbLib.libSharedbMod.DocEvent
       with sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait extra
    extends sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait insert
    extends sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait load
    extends sharedbLib.libSharedbMod.DocEvent
  
  @js.native
  sealed trait move
    extends sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait `no write pending`
    extends sharedbLib.libSharedbMod.DocEvent
  
  @js.native
  sealed trait `nothing pending`
    extends sharedbLib.libSharedbMod.DocEvent
  
  @js.native
  sealed trait op
    extends sharedbLib.libSharedbMod.DocEvent
       with sharedbLib.sharedbMod.sharedbNs.UseAction
  
  @js.native
  sealed trait `ot-json0`
    extends sharedbLib.libSharedbMod.OTType
  
  @js.native
  sealed trait `ot-text`
    extends sharedbLib.libSharedbMod.OTType
  
  @js.native
  sealed trait `ot-text-tp2`
    extends sharedbLib.libSharedbMod.OTType
  
  @js.native
  sealed trait query
    extends sharedbLib.sharedbMod.sharedbNs.UseAction
  
  @js.native
  sealed trait ready
    extends sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait receive
    extends sharedbLib.sharedbMod.sharedbNs.UseAction
  
  @js.native
  sealed trait remove
    extends sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait `rich-text`
    extends sharedbLib.libSharedbMod.OTType
  
  @js.native
  sealed trait submit
    extends sharedbLib.sharedbMod.sharedbNs.UseAction
  
  @scala.inline
  def `after submit`: `after submit` = "after submit".asInstanceOf[`after submit`]
  @JSName("apply")
  @scala.inline
  def apply: apply = "apply".asInstanceOf[apply]
  @scala.inline
  def `before op`: `before op` = "before op".asInstanceOf[`before op`]
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  @scala.inline
  def commit: commit = "commit".asInstanceOf[commit]
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def del: del = "del".asInstanceOf[del]
  @scala.inline
  def doc: doc = "doc".asInstanceOf[doc]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def extra: extra = "extra".asInstanceOf[extra]
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def `no write pending`: `no write pending` = "no write pending".asInstanceOf[`no write pending`]
  @scala.inline
  def `nothing pending`: `nothing pending` = "nothing pending".asInstanceOf[`nothing pending`]
  @scala.inline
  def op: op = "op".asInstanceOf[op]
  @scala.inline
  def `ot-json0`: `ot-json0` = "ot-json0".asInstanceOf[`ot-json0`]
  @scala.inline
  def `ot-text`: `ot-text` = "ot-text".asInstanceOf[`ot-text`]
  @scala.inline
  def `ot-text-tp2`: `ot-text-tp2` = "ot-text-tp2".asInstanceOf[`ot-text-tp2`]
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def receive: receive = "receive".asInstanceOf[receive]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def `rich-text`: `rich-text` = "rich-text".asInstanceOf[`rich-text`]
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
}

