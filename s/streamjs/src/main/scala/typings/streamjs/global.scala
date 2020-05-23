package typings.streamjs

import typings.streamjs.Stream.Function
import typings.streamjs.Stream.Supplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Stream[T] ()
    extends typings.streamjs.Stream[T]
  
  /* static members */
  @js.native
  object Stream extends js.Object {
    @js.native
    class Optional[T] ()
      extends typings.streamjs.Stream.Optional[T] {
      /* CompleteClass */
      override def filter(predicate: js.Function1[T, Boolean]): typings.streamjs.Stream.Optional[T] = js.native
      /* CompleteClass */
      override def flatMap[U](mapper: js.Function1[T, typings.streamjs.Stream.Optional[U]]): typings.streamjs.Stream.Optional[U] = js.native
      /* CompleteClass */
      override def get(): T = js.native
      /* CompleteClass */
      override def ifPresent(consumer: js.Function1[T, Unit]): Unit = js.native
      /* CompleteClass */
      override def isPresent(): Boolean = js.native
      /* CompleteClass */
      override def map[U](mapper: js.Function1[T, U]): typings.streamjs.Stream.Optional[U] = js.native
      /* CompleteClass */
      override def orElse(other: T): T = js.native
      /* CompleteClass */
      override def orElseGet(supplier: Supplier[T]): T = js.native
      /* CompleteClass */
      override def orElseThrow(error: js.Any): T = js.native
    }
    
    def from(str: String): typings.streamjs.Stream[String] = js.native
    def from[T](elems: js.Array[T]): typings.streamjs.Stream[T] = js.native
    def generate[T](supplier: Supplier[T]): typings.streamjs.Stream[T] = js.native
    def iterate[T](seed: T, fn: Function[T, T]): typings.streamjs.Stream[T] = js.native
    def of[T](elems: T*): typings.streamjs.Stream[T] = js.native
    def range(startInclusive: Double, endExclusive: Double): typings.streamjs.Stream[Double] = js.native
    def rangeClosed(startInclusive: Double, endInclusive: Double): typings.streamjs.Stream[Double] = js.native
    /* static members */
    @js.native
    object Optional extends js.Object {
      def of[T](elem: T): typings.streamjs.Stream.Optional[T] = js.native
      def ofNullable[T](elem: T): typings.streamjs.Stream.Optional[T] = js.native
    }
    
  }
  
}

