package typings
package sharedbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sharedbLibStrings {
  @js.native
  sealed trait afterSubmit extends js.Object
  
  @js.native
  sealed trait apply extends js.Object
  
  @js.native
  sealed trait `before op`
    extends sharedbLib.libSharedbMod.DocEvent
  
  @js.native
  sealed trait bf
    extends sharedbLib.libSharedbMod.RequestAction
  
  @js.native
  sealed trait bs
    extends sharedbLib.libSharedbMod.RequestAction
  
  @js.native
  sealed trait bu
    extends sharedbLib.libSharedbMod.RequestAction
  
  @js.native
  sealed trait byTimestamp
    extends sharedbLib.sharedbMod.middlewareNs.SnapshotType
  
  @js.native
  sealed trait byVersion
    extends sharedbLib.sharedbMod.middlewareNs.SnapshotType
  
  @js.native
  sealed trait changed
    extends sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait commit extends js.Object
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait create
    extends sharedbLib.libSharedbMod.DocEvent
  
  @js.native
  sealed trait current
    extends sharedbLib.sharedbMod.middlewareNs.SnapshotType
  
  @js.native
  sealed trait del
    extends sharedbLib.libSharedbMod.DocEvent
  
  @js.native
  sealed trait doc extends js.Object
  
  @js.native
  sealed trait error
    extends sharedbLib.libSharedbMod.DocEvent
       with sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait extra
    extends sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait f
    extends sharedbLib.libSharedbMod.RequestAction
  
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
  sealed trait nf
    extends sharedbLib.libSharedbMod.RequestAction
  
  @js.native
  sealed trait `no write pending`
    extends sharedbLib.libSharedbMod.DocEvent
  
  @js.native
  sealed trait `nothing pending`
    extends sharedbLib.libSharedbMod.DocEvent
  
  @js.native
  sealed trait nt
    extends sharedbLib.libSharedbMod.RequestAction
  
  @js.native
  sealed trait op
    extends sharedbLib.libSharedbMod.DocEvent
       with sharedbLib.libSharedbMod.RequestAction
  
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
  sealed trait qf
    extends sharedbLib.libSharedbMod.RequestAction
  
  @js.native
  sealed trait qs
    extends sharedbLib.libSharedbMod.RequestAction
  
  @js.native
  sealed trait qu
    extends sharedbLib.libSharedbMod.RequestAction
  
  @js.native
  sealed trait query extends js.Object
  
  @js.native
  sealed trait readSnapshots extends js.Object
  
  @js.native
  sealed trait ready
    extends sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait receive extends js.Object
  
  @js.native
  sealed trait remove
    extends sharedbLib.libSharedbMod.QueryEvent
  
  @js.native
  sealed trait reply extends js.Object
  
  @js.native
  sealed trait `rich-text`
    extends sharedbLib.libSharedbMod.OTType
  
  @js.native
  sealed trait s
    extends sharedbLib.libSharedbMod.RequestAction
  
  @js.native
  sealed trait submit extends js.Object
  
  @js.native
  sealed trait u
    extends sharedbLib.libSharedbMod.RequestAction
  
  @scala.inline
  def afterSubmit: afterSubmit = "afterSubmit".asInstanceOf[afterSubmit]
  @JSName("apply")
  @scala.inline
  def apply: apply = "apply".asInstanceOf[apply]
  @scala.inline
  def `before op`: `before op` = "before op".asInstanceOf[`before op`]
  @scala.inline
  def bf: bf = "bf".asInstanceOf[bf]
  @scala.inline
  def bs: bs = "bs".asInstanceOf[bs]
  @scala.inline
  def bu: bu = "bu".asInstanceOf[bu]
  @scala.inline
  def byTimestamp: byTimestamp = "byTimestamp".asInstanceOf[byTimestamp]
  @scala.inline
  def byVersion: byVersion = "byVersion".asInstanceOf[byVersion]
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  @scala.inline
  def commit: commit = "commit".asInstanceOf[commit]
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def current: current = "current".asInstanceOf[current]
  @scala.inline
  def del: del = "del".asInstanceOf[del]
  @scala.inline
  def doc: doc = "doc".asInstanceOf[doc]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def extra: extra = "extra".asInstanceOf[extra]
  @scala.inline
  def f: f = "f".asInstanceOf[f]
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def nf: nf = "nf".asInstanceOf[nf]
  @scala.inline
  def `no write pending`: `no write pending` = "no write pending".asInstanceOf[`no write pending`]
  @scala.inline
  def `nothing pending`: `nothing pending` = "nothing pending".asInstanceOf[`nothing pending`]
  @scala.inline
  def nt: nt = "nt".asInstanceOf[nt]
  @scala.inline
  def op: op = "op".asInstanceOf[op]
  @scala.inline
  def `ot-json0`: `ot-json0` = "ot-json0".asInstanceOf[`ot-json0`]
  @scala.inline
  def `ot-text`: `ot-text` = "ot-text".asInstanceOf[`ot-text`]
  @scala.inline
  def `ot-text-tp2`: `ot-text-tp2` = "ot-text-tp2".asInstanceOf[`ot-text-tp2`]
  @scala.inline
  def qf: qf = "qf".asInstanceOf[qf]
  @scala.inline
  def qs: qs = "qs".asInstanceOf[qs]
  @scala.inline
  def qu: qu = "qu".asInstanceOf[qu]
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  @scala.inline
  def readSnapshots: readSnapshots = "readSnapshots".asInstanceOf[readSnapshots]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def receive: receive = "receive".asInstanceOf[receive]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def reply: reply = "reply".asInstanceOf[reply]
  @scala.inline
  def `rich-text`: `rich-text` = "rich-text".asInstanceOf[`rich-text`]
  @scala.inline
  def s: s = "s".asInstanceOf[s]
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  @scala.inline
  def u: u = "u".asInstanceOf[u]
}

