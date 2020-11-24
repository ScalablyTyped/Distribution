package typings.quadstore.mod

import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait quadstore[CK /* <: String */, TermType, Q] extends EventEmitter {
  
  var boundary: String = js.native
  
  def close(): Unit = js.native
  def close(cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  def del(matchTermsOrOldQuads: js.Array[Q]): js.Promise[Unit] = js.native
  def del(matchTermsOrOldQuads: js.Array[Q], cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def del(matchTermsOrOldQuads: MatchTerms[TermType, CK]): js.Promise[Unit] = js.native
  def del(matchTermsOrOldQuads: MatchTerms[TermType, CK], cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  def delStream(stream: ReadableStream): js.Promise[Unit] = js.native
  def delStream(stream: ReadableStream, cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  def get(matchTerms: MatchTerms[TermType, CK]): js.Promise[js.Array[Q]] = js.native
  def get(
    matchTerms: MatchTerms[TermType, CK],
    cb: js.Function2[/* err */ js.Any, /* quads */ js.Array[Q], Unit]
  ): Unit = js.native
  
  def getApproximateCount(matchTerms: MatchTerms[TermType, CK]): js.Promise[Double] = js.native
  def getApproximateCount(matchTerms: MatchTerms[TermType, CK], cb: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Unit = js.native
  def getApproximateCount(matchTerms: MatchTerms[TermType, CK], opts: js.Any): js.Promise[Double] = js.native
  def getApproximateCount(
    matchTerms: MatchTerms[TermType, CK],
    opts: js.Any,
    cb: js.Function2[/* err */ js.Any, /* count */ Double, Unit]
  ): Unit = js.native
  
  def getByIndex(name: String): js.Promise[js.Array[Q]] = js.native
  def getByIndex(name: String, cb: js.Function2[/* err */ js.Any, /* quads */ js.Array[Q], Unit]): Unit = js.native
  def getByIndex(name: String, opts: IndexOptions): js.Promise[js.Array[Q]] = js.native
  def getByIndex(
    name: String,
    opts: IndexOptions,
    cb: js.Function2[/* err */ js.Any, /* quads */ js.Array[Q], Unit]
  ): Unit = js.native
  
  def getByIndexStream(name: String): ReadableStream = js.native
  def getByIndexStream(name: String, opts: IndexOptions): ReadableStream = js.native
  
  def getStream(): ReadableStream = js.native
  def getStream(matchTerms: js.UndefOr[scala.Nothing], opts: StreamOptions): ReadableStream = js.native
  def getStream(matchTerms: MatchTerms[TermType, CK]): ReadableStream = js.native
  def getStream(matchTerms: MatchTerms[TermType, CK], opts: StreamOptions): ReadableStream = js.native
  
  def patch(matchTermsOrOldQuads: js.Array[Q], newQuads: js.Array[Q]): Unit = js.native
  def patch(
    matchTermsOrOldQuads: js.Array[Q],
    newQuads: js.Array[Q],
    opts: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  def patch(matchTermsOrOldQuads: js.Array[Q], newQuads: js.Array[Q], opts: js.Any): Unit = js.native
  def patch(
    matchTermsOrOldQuads: js.Array[Q],
    newQuads: js.Array[Q],
    opts: js.Any,
    cb: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  def patch(matchTermsOrOldQuads: MatchTerms[TermType, CK], newQuads: js.Array[Q]): Unit = js.native
  def patch(
    matchTermsOrOldQuads: MatchTerms[TermType, CK],
    newQuads: js.Array[Q],
    opts: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  def patch(matchTermsOrOldQuads: MatchTerms[TermType, CK], newQuads: js.Array[Q], opts: js.Any): Unit = js.native
  def patch(
    matchTermsOrOldQuads: MatchTerms[TermType, CK],
    newQuads: js.Array[Q],
    opts: js.Any,
    cb: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  
  def put(quads: js.Array[Q]): js.Promise[Unit] = js.native
  def put(quads: js.Array[Q], cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  def putStream(source: ReadableStream): js.Promise[Unit] = js.native
  def putStream(source: ReadableStream, cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def putStream(source: ReadableStream, opts: js.Any): js.Promise[Unit] = js.native
  def putStream(source: ReadableStream, opts: js.Any, cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  def registerIndex(name: String, keyFn: js.Function1[/* quad */ Q, String]): Unit = js.native
  
  var separator: String = js.native
  
  def toJSON(): String = js.native
}
