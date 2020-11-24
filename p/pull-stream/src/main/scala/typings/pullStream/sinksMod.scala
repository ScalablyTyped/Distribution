package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pull-stream/sinks", JSImport.Namespace)
@js.native
object sinksMod extends js.Object {
  
  val concat: js.Function1[
    /* cb */ js.UndefOr[js.Function2[/* err */ EndOrError, /* result */ String, js.Any]], 
    Sink[String]
  ] = js.native
  
  val log: js.Function0[Sink[js.Any]] = js.native
  
  val onEnd: js.Function1[/* cb */ js.UndefOr[js.Function1[/* err */ EndOrError, js.Any]], Sink[js.Any]] = js.native
  
  @js.native
  object collect extends js.Object {
    
    def apply[T](): Sink[T] = js.native
    def apply[T](cb: js.Function2[/* err */ EndOrError, /* results */ js.Array[T], _]): Sink[T] = js.native
  }
  
  @js.native
  object drain extends js.Object {
    
    def apply[T](): Sink[T] = js.native
    def apply[T](op: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ EndOrError, _]): Sink[T] = js.native
    def apply[T](op: js.Function1[/* data */ T, _]): Sink[T] = js.native
    def apply[T](op: js.Function1[/* data */ T, _], cb: js.Function1[/* err */ EndOrError, _]): Sink[T] = js.native
  }
  
  @js.native
  object find extends js.Object {
    
    def apply[T](): Sink[T] = js.native
    def apply[T](cb: js.Function2[/* err */ EndOrError, /* results */ js.Array[T], _]): Sink[T] = js.native
    def apply[T](test: /* keyof T */ String): Sink[T] = js.native
    def apply[T](test: /* keyof T */ String, cb: js.Function2[/* err */ EndOrError, /* result */ T, _]): Sink[T] = js.native
    def apply[T](test: js.Function1[/* data */ T, Boolean]): Sink[T] = js.native
    def apply[T](
      test: js.Function1[/* data */ T, Boolean],
      cb: js.Function2[/* err */ EndOrError, /* result */ T, _]
    ): Sink[T] = js.native
  }
  
  @js.native
  object reduce extends js.Object {
    
    def apply[T, U](
      reducer: js.Function2[/* acc */ U | Null, /* data */ T, U],
      cb: js.Function2[/* err */ EndOrError, /* result */ U, _]
    ): Sink[T] = js.native
    def apply[T, U](
      reducer: js.Function2[/* acc */ U, /* data */ T, U],
      initial: U,
      cb: js.Function2[/* err */ EndOrError, /* result */ U, _]
    ): Sink[T] = js.native
  }
}
