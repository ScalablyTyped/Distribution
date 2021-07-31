package typings.sharedb

import typings.sharedb.mod.middleware.SnapshotType
import typings.sharedb.sharedbMod.DocEvent
import typings.sharedb.sharedbMod.OTType
import typings.sharedb.sharedbMod.QueryEvent
import typings.sharedb.sharedbMod.RequestAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedbStrings {
  
  @js.native
  sealed trait afterSubmit extends StObject
  @scala.inline
  def afterSubmit: afterSubmit = "afterSubmit".asInstanceOf[afterSubmit]
  
  @js.native
  sealed trait apply extends StObject
  @scala.inline
  def apply: apply = "apply".asInstanceOf[apply]
  
  @js.native
  sealed trait `before op`
    extends StObject
       with DocEvent
  @scala.inline
  def `before op`: `before op` = ("before op").asInstanceOf[`before op`]
  
  @js.native
  sealed trait bf
    extends StObject
       with RequestAction
  @scala.inline
  def bf: bf = "bf".asInstanceOf[bf]
  
  @js.native
  sealed trait bs
    extends StObject
       with RequestAction
  @scala.inline
  def bs: bs = "bs".asInstanceOf[bs]
  
  @js.native
  sealed trait bu
    extends StObject
       with RequestAction
  @scala.inline
  def bu: bu = "bu".asInstanceOf[bu]
  
  @js.native
  sealed trait byTimestamp
    extends StObject
       with SnapshotType
  @scala.inline
  def byTimestamp: byTimestamp = "byTimestamp".asInstanceOf[byTimestamp]
  
  @js.native
  sealed trait byVersion
    extends StObject
       with SnapshotType
  @scala.inline
  def byVersion: byVersion = "byVersion".asInstanceOf[byVersion]
  
  @js.native
  sealed trait changed
    extends StObject
       with QueryEvent
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  
  @js.native
  sealed trait close extends StObject
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait commit extends StObject
  @scala.inline
  def commit: commit = "commit".asInstanceOf[commit]
  
  @js.native
  sealed trait connect extends StObject
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait create
    extends StObject
       with DocEvent
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait current
    extends StObject
       with SnapshotType
  @scala.inline
  def current: current = "current".asInstanceOf[current]
  
  @js.native
  sealed trait data extends StObject
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait del
    extends StObject
       with DocEvent
  @scala.inline
  def del: del = "del".asInstanceOf[del]
  
  @js.native
  sealed trait doc extends StObject
  @scala.inline
  def doc: doc = "doc".asInstanceOf[doc]
  
  @js.native
  sealed trait drain extends StObject
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  
  @js.native
  sealed trait end extends StObject
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error
    extends StObject
       with DocEvent
       with QueryEvent
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait extra
    extends StObject
       with QueryEvent
  @scala.inline
  def extra: extra = "extra".asInstanceOf[extra]
  
  @js.native
  sealed trait f
    extends StObject
       with RequestAction
  @scala.inline
  def f: f = "f".asInstanceOf[f]
  
  @js.native
  sealed trait finish extends StObject
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  
  @js.native
  sealed trait insert
    extends StObject
       with QueryEvent
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait left extends StObject
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait load
    extends StObject
       with DocEvent
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait move
    extends StObject
       with QueryEvent
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait nf
    extends StObject
       with RequestAction
  @scala.inline
  def nf: nf = "nf".asInstanceOf[nf]
  
  @js.native
  sealed trait `no write pending`
    extends StObject
       with DocEvent
  @scala.inline
  def `no write pending`: `no write pending` = ("no write pending").asInstanceOf[`no write pending`]
  
  @js.native
  sealed trait `nothing pending`
    extends StObject
       with DocEvent
  @scala.inline
  def `nothing pending`: `nothing pending` = ("nothing pending").asInstanceOf[`nothing pending`]
  
  @js.native
  sealed trait nt
    extends StObject
       with RequestAction
  @scala.inline
  def nt: nt = "nt".asInstanceOf[nt]
  
  @js.native
  sealed trait op
    extends StObject
       with DocEvent
       with RequestAction
  @scala.inline
  def op: op = "op".asInstanceOf[op]
  
  @js.native
  sealed trait `ot-json0`
    extends StObject
       with OTType
  @scala.inline
  def `ot-json0`: `ot-json0` = "ot-json0".asInstanceOf[`ot-json0`]
  
  @js.native
  sealed trait `ot-json1`
    extends StObject
       with OTType
  @scala.inline
  def `ot-json1`: `ot-json1` = "ot-json1".asInstanceOf[`ot-json1`]
  
  @js.native
  sealed trait `ot-text`
    extends StObject
       with OTType
  @scala.inline
  def `ot-text`: `ot-text` = "ot-text".asInstanceOf[`ot-text`]
  
  @js.native
  sealed trait `ot-text-tp2`
    extends StObject
       with OTType
  @scala.inline
  def `ot-text-tp2`: `ot-text-tp2` = "ot-text-tp2".asInstanceOf[`ot-text-tp2`]
  
  @js.native
  sealed trait pause extends StObject
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait pipe extends StObject
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
  
  @js.native
  sealed trait qf
    extends StObject
       with RequestAction
  @scala.inline
  def qf: qf = "qf".asInstanceOf[qf]
  
  @js.native
  sealed trait qs
    extends StObject
       with RequestAction
  @scala.inline
  def qs: qs = "qs".asInstanceOf[qs]
  
  @js.native
  sealed trait qu
    extends StObject
       with RequestAction
  @scala.inline
  def qu: qu = "qu".asInstanceOf[qu]
  
  @js.native
  sealed trait query extends StObject
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait readSnapshots extends StObject
  @scala.inline
  def readSnapshots: readSnapshots = "readSnapshots".asInstanceOf[readSnapshots]
  
  @js.native
  sealed trait readable extends StObject
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
  
  @js.native
  sealed trait ready
    extends StObject
       with QueryEvent
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait receive extends StObject
  @scala.inline
  def receive: receive = "receive".asInstanceOf[receive]
  
  @js.native
  sealed trait remove
    extends StObject
       with QueryEvent
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait reply extends StObject
  @scala.inline
  def reply: reply = "reply".asInstanceOf[reply]
  
  @js.native
  sealed trait resume extends StObject
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  
  @js.native
  sealed trait `rich-text`
    extends StObject
       with OTType
  @scala.inline
  def `rich-text`: `rich-text` = "rich-text".asInstanceOf[`rich-text`]
  
  @js.native
  sealed trait right extends StObject
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait s
    extends StObject
       with RequestAction
  @scala.inline
  def s: s = "s".asInstanceOf[s]
  
  @js.native
  sealed trait submit extends StObject
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait u
    extends StObject
       with RequestAction
  @scala.inline
  def u: u = "u".asInstanceOf[u]
  
  @js.native
  sealed trait unpipe extends StObject
  @scala.inline
  def unpipe: unpipe = "unpipe".asInstanceOf[unpipe]
}
