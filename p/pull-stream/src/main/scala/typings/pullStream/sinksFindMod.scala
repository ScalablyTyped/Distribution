package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sinksFindMod {
  
  inline def apply[T](): Sink[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Sink[T]]
  inline def apply[T](cb: js.Function2[/* err */ EndOrError, /* results */ js.Array[T], Any]): Sink[T] = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Sink[T]]
  inline def apply[T](test: /* keyof T */ String): Sink[T] = ^.asInstanceOf[js.Dynamic].apply(test.asInstanceOf[js.Any]).asInstanceOf[Sink[T]]
  inline def apply[T](test: /* keyof T */ String, cb: js.Function2[/* err */ EndOrError, /* result */ T, Any]): Sink[T] = (^.asInstanceOf[js.Dynamic].apply(test.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
  inline def apply[T](test: js.Function1[/* data */ T, Boolean]): Sink[T] = ^.asInstanceOf[js.Dynamic].apply(test.asInstanceOf[js.Any]).asInstanceOf[Sink[T]]
  inline def apply[T](
    test: js.Function1[/* data */ T, Boolean],
    cb: js.Function2[/* err */ EndOrError, /* result */ T, Any]
  ): Sink[T] = (^.asInstanceOf[js.Dynamic].apply(test.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
  
  @JSImport("pull-stream/sinks/find", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
