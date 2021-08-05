package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sinksMod {
  
  @JSImport("pull-stream/sinks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collect[T](): Sink[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")().asInstanceOf[Sink[T]]
  inline def collect[T](cb: js.Function2[/* err */ EndOrError, /* results */ js.Array[T], js.Any]): Sink[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(cb.asInstanceOf[js.Any]).asInstanceOf[Sink[T]]
  
  @JSImport("pull-stream/sinks", "concat")
  @js.native
  val concat: js.Function1[
    /* cb */ js.UndefOr[js.Function2[/* err */ EndOrError, /* result */ String, js.Any]], 
    Sink[String]
  ] = js.native
  
  inline def drain[T](): Sink[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("drain")().asInstanceOf[Sink[T]]
  inline def drain[T](op: js.Function1[/* data */ T, js.Any]): Sink[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("drain")(op.asInstanceOf[js.Any]).asInstanceOf[Sink[T]]
  inline def drain[T](op: js.Function1[/* data */ T, js.Any], cb: js.Function1[/* err */ EndOrError, js.Any]): Sink[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("drain")(op.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
  inline def drain[T](op: Unit, cb: js.Function1[/* err */ EndOrError, js.Any]): Sink[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("drain")(op.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
  
  inline def find[T](): Sink[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")().asInstanceOf[Sink[T]]
  inline def find[T](cb: js.Function2[/* err */ EndOrError, /* results */ js.Array[T], js.Any]): Sink[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(cb.asInstanceOf[js.Any]).asInstanceOf[Sink[T]]
  inline def find[T](test: /* keyof T */ String): Sink[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(test.asInstanceOf[js.Any]).asInstanceOf[Sink[T]]
  inline def find[T](test: /* keyof T */ String, cb: js.Function2[/* err */ EndOrError, /* result */ T, js.Any]): Sink[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(test.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
  inline def find[T](test: js.Function1[/* data */ T, Boolean]): Sink[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(test.asInstanceOf[js.Any]).asInstanceOf[Sink[T]]
  inline def find[T](
    test: js.Function1[/* data */ T, Boolean],
    cb: js.Function2[/* err */ EndOrError, /* result */ T, js.Any]
  ): Sink[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(test.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
  
  @JSImport("pull-stream/sinks", "log")
  @js.native
  val log: js.Function0[Sink[js.Any]] = js.native
  
  @JSImport("pull-stream/sinks", "onEnd")
  @js.native
  val onEnd: js.Function1[/* cb */ js.UndefOr[js.Function1[/* err */ EndOrError, js.Any]], Sink[js.Any]] = js.native
  
  inline def reduce[T, U](
    reducer: js.Function2[/* acc */ U | Null, /* data */ T, U],
    cb: js.Function2[/* err */ EndOrError, /* result */ U, js.Any]
  ): Sink[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(reducer.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
  inline def reduce[T, U](
    reducer: js.Function2[/* acc */ U, /* data */ T, U],
    initial: U,
    cb: js.Function2[/* err */ EndOrError, /* result */ U, js.Any]
  ): Sink[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(reducer.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
}
