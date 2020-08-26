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
      extends typings.streamjs.Stream.Optional[T]
    
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

