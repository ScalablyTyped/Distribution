package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sinksMod {
  
  @JSImport("pull-stream/sinks", "collect")
  @js.native
  def collect[T](): Sink[T] = js.native
  @JSImport("pull-stream/sinks", "collect")
  @js.native
  def collect[T](cb: js.Function2[/* err */ EndOrError, /* results */ js.Array[T], _]): Sink[T] = js.native
  
  @JSImport("pull-stream/sinks", "concat")
  @js.native
  val concat: js.Function1[
    /* cb */ js.UndefOr[js.Function2[/* err */ EndOrError, /* result */ String, js.Any]], 
    Sink[String]
  ] = js.native
  
  @JSImport("pull-stream/sinks", "drain")
  @js.native
  def drain[T](): Sink[T] = js.native
  @JSImport("pull-stream/sinks", "drain")
  @js.native
  def drain[T](op: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ EndOrError, _]): Sink[T] = js.native
  @JSImport("pull-stream/sinks", "drain")
  @js.native
  def drain[T](op: js.Function1[/* data */ T, _]): Sink[T] = js.native
  @JSImport("pull-stream/sinks", "drain")
  @js.native
  def drain[T](op: js.Function1[/* data */ T, _], cb: js.Function1[/* err */ EndOrError, _]): Sink[T] = js.native
  
  @JSImport("pull-stream/sinks", "find")
  @js.native
  def find[T](): Sink[T] = js.native
  @JSImport("pull-stream/sinks", "find")
  @js.native
  def find[T](cb: js.Function2[/* err */ EndOrError, /* results */ js.Array[T], _]): Sink[T] = js.native
  @JSImport("pull-stream/sinks", "find")
  @js.native
  def find[T](test: /* keyof T */ String): Sink[T] = js.native
  @JSImport("pull-stream/sinks", "find")
  @js.native
  def find[T](test: /* keyof T */ String, cb: js.Function2[/* err */ EndOrError, /* result */ T, _]): Sink[T] = js.native
  @JSImport("pull-stream/sinks", "find")
  @js.native
  def find[T](test: js.Function1[/* data */ T, Boolean]): Sink[T] = js.native
  @JSImport("pull-stream/sinks", "find")
  @js.native
  def find[T](
    test: js.Function1[/* data */ T, Boolean],
    cb: js.Function2[/* err */ EndOrError, /* result */ T, _]
  ): Sink[T] = js.native
  
  @JSImport("pull-stream/sinks", "log")
  @js.native
  val log: js.Function0[Sink[js.Any]] = js.native
  
  @JSImport("pull-stream/sinks", "onEnd")
  @js.native
  val onEnd: js.Function1[/* cb */ js.UndefOr[js.Function1[/* err */ EndOrError, js.Any]], Sink[js.Any]] = js.native
  
  @JSImport("pull-stream/sinks", "reduce")
  @js.native
  def reduce[T, U](
    reducer: js.Function2[/* acc */ U | Null, /* data */ T, U],
    cb: js.Function2[/* err */ EndOrError, /* result */ U, _]
  ): Sink[T] = js.native
  @JSImport("pull-stream/sinks", "reduce")
  @js.native
  def reduce[T, U](
    reducer: js.Function2[/* acc */ U, /* data */ T, U],
    initial: U,
    cb: js.Function2[/* err */ EndOrError, /* result */ U, _]
  ): Sink[T] = js.native
}
