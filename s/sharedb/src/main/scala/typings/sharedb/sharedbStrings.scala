package typings.sharedb

import typings.sharedb.libSharedbMod.ConnectionState
import typings.sharedb.libSharedbMod.DocEvent
import typings.sharedb.libSharedbMod.OTType
import typings.sharedb.libSharedbMod.QueryEvent
import typings.sharedb.libSharedbMod.RequestAction
import typings.sharedb.mod.middleware.SnapshotType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedbStrings {
  
  @js.native
  sealed trait afterSubmit extends StObject
  inline def afterSubmit: afterSubmit = "afterSubmit".asInstanceOf[afterSubmit]
  
  @js.native
  sealed trait afterWrite extends StObject
  inline def afterWrite: afterWrite = "afterWrite".asInstanceOf[afterWrite]
  
  @js.native
  sealed trait apply extends StObject
  inline def apply: apply = "apply".asInstanceOf[apply]
  
  @js.native
  sealed trait `before op`
    extends StObject
       with DocEvent
  inline def `before op`: `before op` = ("before op").asInstanceOf[`before op`]
  
  @js.native
  sealed trait `before op batch`
    extends StObject
       with DocEvent
  inline def `before op batch`: `before op batch` = ("before op batch").asInstanceOf[`before op batch`]
  
  @js.native
  sealed trait bf
    extends StObject
       with RequestAction
  inline def bf: bf = "bf".asInstanceOf[bf]
  
  @js.native
  sealed trait bs
    extends StObject
       with RequestAction
  inline def bs: bs = "bs".asInstanceOf[bs]
  
  @js.native
  sealed trait bu
    extends StObject
       with RequestAction
  inline def bu: bu = "bu".asInstanceOf[bu]
  
  @js.native
  sealed trait byTimestamp
    extends StObject
       with SnapshotType
  inline def byTimestamp: byTimestamp = "byTimestamp".asInstanceOf[byTimestamp]
  
  @js.native
  sealed trait byVersion
    extends StObject
       with SnapshotType
  inline def byVersion: byVersion = "byVersion".asInstanceOf[byVersion]
  
  @js.native
  sealed trait changed
    extends StObject
       with QueryEvent
  inline def changed: changed = "changed".asInstanceOf[changed]
  
  @js.native
  sealed trait closed
    extends StObject
       with ConnectionState
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait commit extends StObject
  inline def commit: commit = "commit".asInstanceOf[commit]
  
  @js.native
  sealed trait connect extends StObject
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait connected
    extends StObject
       with ConnectionState
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting
    extends StObject
       with ConnectionState
  inline def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait create
    extends StObject
       with DocEvent
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait current
    extends StObject
       with SnapshotType
  inline def current: current = "current".asInstanceOf[current]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait del
    extends StObject
       with DocEvent
  inline def del: del = "del".asInstanceOf[del]
  
  @js.native
  sealed trait destroy
    extends StObject
       with DocEvent
  inline def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with ConnectionState
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait doc extends StObject
  inline def doc: doc = "doc".asInstanceOf[doc]
  
  @js.native
  sealed trait error
    extends StObject
       with DocEvent
       with QueryEvent
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait extra
    extends StObject
       with QueryEvent
  inline def extra: extra = "extra".asInstanceOf[extra]
  
  @js.native
  sealed trait f
    extends StObject
       with RequestAction
  inline def f: f = "f".asInstanceOf[f]
  
  @js.native
  sealed trait insert
    extends StObject
       with QueryEvent
  inline def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait load
    extends StObject
       with DocEvent
  inline def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait move
    extends StObject
       with QueryEvent
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait nf
    extends StObject
       with RequestAction
  inline def nf: nf = "nf".asInstanceOf[nf]
  
  @js.native
  sealed trait `no write pending`
    extends StObject
       with DocEvent
  inline def `no write pending`: `no write pending` = ("no write pending").asInstanceOf[`no write pending`]
  
  @js.native
  sealed trait `nothing pending`
    extends StObject
       with DocEvent
  inline def `nothing pending`: `nothing pending` = ("nothing pending").asInstanceOf[`nothing pending`]
  
  @js.native
  sealed trait nt
    extends StObject
       with RequestAction
  inline def nt: nt = "nt".asInstanceOf[nt]
  
  @js.native
  sealed trait op
    extends StObject
       with DocEvent
       with RequestAction
  inline def op: op = "op".asInstanceOf[op]
  
  @js.native
  sealed trait `op batch`
    extends StObject
       with DocEvent
  inline def `op batch`: `op batch` = ("op batch").asInstanceOf[`op batch`]
  
  @js.native
  sealed trait `ot-json0`
    extends StObject
       with OTType
  inline def `ot-json0`: `ot-json0` = "ot-json0".asInstanceOf[`ot-json0`]
  
  @js.native
  sealed trait `ot-json1`
    extends StObject
       with OTType
  inline def `ot-json1`: `ot-json1` = "ot-json1".asInstanceOf[`ot-json1`]
  
  @js.native
  sealed trait `ot-text`
    extends StObject
       with OTType
  inline def `ot-text`: `ot-text` = "ot-text".asInstanceOf[`ot-text`]
  
  @js.native
  sealed trait `ot-text-tp2`
    extends StObject
       with OTType
  inline def `ot-text-tp2`: `ot-text-tp2` = "ot-text-tp2".asInstanceOf[`ot-text-tp2`]
  
  @js.native
  sealed trait p extends StObject
  inline def p: p = "p".asInstanceOf[p]
  
  @js.native
  sealed trait qf
    extends StObject
       with RequestAction
  inline def qf: qf = "qf".asInstanceOf[qf]
  
  @js.native
  sealed trait qs
    extends StObject
       with RequestAction
  inline def qs: qs = "qs".asInstanceOf[qs]
  
  @js.native
  sealed trait qu
    extends StObject
       with RequestAction
  inline def qu: qu = "qu".asInstanceOf[qu]
  
  @js.native
  sealed trait query extends StObject
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait readSnapshots extends StObject
  inline def readSnapshots: readSnapshots = "readSnapshots".asInstanceOf[readSnapshots]
  
  @js.native
  sealed trait ready
    extends StObject
       with QueryEvent
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait receive extends StObject
  inline def receive: receive = "receive".asInstanceOf[receive]
  
  @js.native
  sealed trait receivePresence extends StObject
  inline def receivePresence: receivePresence = "receivePresence".asInstanceOf[receivePresence]
  
  @js.native
  sealed trait remove
    extends StObject
       with QueryEvent
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait reply extends StObject
  inline def reply: reply = "reply".asInstanceOf[reply]
  
  @js.native
  sealed trait `rich-text`
    extends StObject
       with OTType
  inline def `rich-text`: `rich-text` = "rich-text".asInstanceOf[`rich-text`]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait s
    extends StObject
       with RequestAction
  inline def s: s = "s".asInstanceOf[s]
  
  @js.native
  sealed trait send extends StObject
  inline def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait sendPresence extends StObject
  inline def sendPresence: sendPresence = "sendPresence".asInstanceOf[sendPresence]
  
  @js.native
  sealed trait stopped
    extends StObject
       with ConnectionState
  inline def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait submit extends StObject
  inline def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait submitRequestEnd extends StObject
  inline def submitRequestEnd: submitRequestEnd = "submitRequestEnd".asInstanceOf[submitRequestEnd]
  
  @js.native
  sealed trait timing extends StObject
  inline def timing: timing = "timing".asInstanceOf[timing]
  
  @js.native
  sealed trait `type` extends StObject
  inline def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait u
    extends StObject
       with RequestAction
  inline def u: u = "u".asInstanceOf[u]
  
  @js.native
  sealed trait v extends StObject
  inline def v: v = "v".asInstanceOf[v]
}
