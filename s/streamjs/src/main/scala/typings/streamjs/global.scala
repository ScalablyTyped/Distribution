package typings.streamjs

import typings.streamjs.Stream.Supplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Stream")
  @js.native
  class Stream[T] ()
    extends StObject
       with typings.streamjs.Stream[T]
  object Stream {
    
    @JSGlobal("Stream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Stream.Optional")
    @js.native
    class Optional[T] ()
      extends StObject
         with typings.streamjs.Stream.Optional[T] {
      
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
    /* static members */
    object Optional {
      
      @JSGlobal("Stream.Optional")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def of[T](elem: T): typings.streamjs.Stream.Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.streamjs.Stream.Optional[T]]
      
      @scala.inline
      def ofNullable[T](elem: T): typings.streamjs.Stream.Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNullable")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.streamjs.Stream.Optional[T]]
    }
    
    /* static member */
    @scala.inline
    def from(str: String): typings.streamjs.Stream[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any]).asInstanceOf[typings.streamjs.Stream[String]]
    /* static member */
    @scala.inline
    def from[T](elems: js.Array[T]): typings.streamjs.Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(elems.asInstanceOf[js.Any]).asInstanceOf[typings.streamjs.Stream[T]]
    
    /* static member */
    @scala.inline
    def generate[T](supplier: Supplier[T]): typings.streamjs.Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(supplier.asInstanceOf[js.Any]).asInstanceOf[typings.streamjs.Stream[T]]
    
    /* static member */
    @scala.inline
    def iterate[T](seed: T, fn: js.Function): typings.streamjs.Stream[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(seed.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.streamjs.Stream[T]]
    
    /* static member */
    @scala.inline
    def of[T](elems: T*): typings.streamjs.Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(elems.asInstanceOf[js.Any]).asInstanceOf[typings.streamjs.Stream[T]]
    
    /* static member */
    @scala.inline
    def range(startInclusive: Double, endExclusive: Double): typings.streamjs.Stream[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(startInclusive.asInstanceOf[js.Any], endExclusive.asInstanceOf[js.Any])).asInstanceOf[typings.streamjs.Stream[Double]]
    
    /* static member */
    @scala.inline
    def rangeClosed(startInclusive: Double, endInclusive: Double): typings.streamjs.Stream[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeClosed")(startInclusive.asInstanceOf[js.Any], endInclusive.asInstanceOf[js.Any])).asInstanceOf[typings.streamjs.Stream[Double]]
  }
}
