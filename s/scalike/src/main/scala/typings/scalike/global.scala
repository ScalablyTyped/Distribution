package typings.scalike

import typings.scalike.mod.Either
import typings.scalike.mod.Future
import typings.scalike.mod.Optional
import typings.scalike.mod.Try
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object scalike {
    
    @JSGlobal("scalike")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Failure[A](e: js.Error): Try[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("Failure")(e.asInstanceOf[js.Any]).asInstanceOf[Try[A]]
    
    object Future {
      
      inline def apply[A](f: js.Function0[A]): typings.scalike.mod.Future[A] = ^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any]).asInstanceOf[typings.scalike.mod.Future[A]]
      inline def apply[A](f: js.Promise[A]): typings.scalike.mod.Future[A] = ^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any]).asInstanceOf[typings.scalike.mod.Future[A]]
      
      @JSGlobal("scalike.Future")
      @js.native
      val ^ : js.Any = js.native
      
      inline def failed[A](e: js.Error): typings.scalike.mod.Future[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("failed")(e.asInstanceOf[js.Any]).asInstanceOf[typings.scalike.mod.Future[A]]
      
      inline def find[A](fus: js.Array[typings.scalike.mod.Future[A]], f: js.Function1[/* a */ A, Boolean]): typings.scalike.mod.Future[Optional[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(fus.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.scalike.mod.Future[Optional[A]]]
      
      inline def firstCompletedOf[A](fus: js.Array[typings.scalike.mod.Future[A]]): typings.scalike.mod.Future[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("firstCompletedOf")(fus.asInstanceOf[js.Any]).asInstanceOf[typings.scalike.mod.Future[A]]
      
      inline def foldLeft[A, B](fu: js.Array[typings.scalike.mod.Future[A]], zero: B, f: js.Function2[/* b */ B, /* a */ A, B]): typings.scalike.mod.Future[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLeft")(fu.asInstanceOf[js.Any], zero.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.scalike.mod.Future[B]]
      
      inline def fromPromise[A](p: js.Promise[A]): typings.scalike.mod.Future[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(p.asInstanceOf[js.Any]).asInstanceOf[typings.scalike.mod.Future[A]]
      
      inline def fromTry[A](t: Try[A]): typings.scalike.mod.Future[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTry")(t.asInstanceOf[js.Any]).asInstanceOf[typings.scalike.mod.Future[A]]
      
      inline def reduceLeft[A, B](fu: js.Array[typings.scalike.mod.Future[A]], f: js.Function2[/* b */ B, /* a */ A, B]): typings.scalike.mod.Future[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceLeft")(fu.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.scalike.mod.Future[B]]
      
      inline def sequence[A](fus: js.Array[typings.scalike.mod.Future[A]]): typings.scalike.mod.Future[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(fus.asInstanceOf[js.Any]).asInstanceOf[typings.scalike.mod.Future[js.Array[A]]]
      
      inline def successful[A](a: A): typings.scalike.mod.Future[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("successful")(a.asInstanceOf[js.Any]).asInstanceOf[typings.scalike.mod.Future[A]]
      
      inline def traverse[A, B](fu: js.Array[A], f: js.Function1[/* a */ A, typings.scalike.mod.Future[B]]): typings.scalike.mod.Future[js.Array[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(fu.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.scalike.mod.Future[js.Array[B]]]
      
      inline def unit(): typings.scalike.mod.Future[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unit")().asInstanceOf[typings.scalike.mod.Future[Unit]]
    }
    
    @JSGlobal("scalike.FutureBuilder1")
    @js.native
    open class FutureBuilder1[A, B] protected ()
      extends typings.scalike.mod.FutureBuilder1[A, B] {
      def this(oa: Future[A], ob: Future[B]) = this()
    }
    
    @JSGlobal("scalike.FutureBuilder2")
    @js.native
    open class FutureBuilder2[A, B, C] protected ()
      extends typings.scalike.mod.FutureBuilder2[A, B, C] {
      def this(oa: Future[A], ob: Future[B], oc: Future[C]) = this()
    }
    
    @JSGlobal("scalike.FutureBuilder3")
    @js.native
    open class FutureBuilder3[A, B, C, D] protected ()
      extends typings.scalike.mod.FutureBuilder3[A, B, C, D] {
      def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D]) = this()
    }
    
    @JSGlobal("scalike.FutureBuilder4")
    @js.native
    open class FutureBuilder4[A, B, C, D, E] protected ()
      extends typings.scalike.mod.FutureBuilder4[A, B, C, D, E] {
      def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D], oe: Future[E]) = this()
    }
    
    @JSGlobal("scalike.FutureBuilder5")
    @js.native
    open class FutureBuilder5[A, B, C, D, E, F] protected ()
      extends typings.scalike.mod.FutureBuilder5[A, B, C, D, E, F] {
      def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D], oe: Future[E], of: Future[F]) = this()
    }
    
    inline def Left[A, B](a: A): Either[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("Left")(a.asInstanceOf[js.Any]).asInstanceOf[Either[A, B]]
    
    @JSGlobal("scalike.LeftProjection")
    @js.native
    open class LeftProjection[A, B] protected ()
      extends typings.scalike.mod.LeftProjection[A, B] {
      def this(self: Either[A, B]) = this()
    }
    
    @JSGlobal("scalike.None")
    @js.native
    val None: Optional[Any] = js.native
    
    inline def Optional[A](a: A): typings.scalike.mod.Optional[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(a.asInstanceOf[js.Any]).asInstanceOf[typings.scalike.mod.Optional[A]]
    
    @JSGlobal("scalike.OptionalBuilder1")
    @js.native
    open class OptionalBuilder1[A, B] protected ()
      extends typings.scalike.mod.OptionalBuilder1[A, B] {
      def this(oa: Optional[A], ob: Optional[B]) = this()
    }
    
    @JSGlobal("scalike.OptionalBuilder2")
    @js.native
    open class OptionalBuilder2[A, B, C] protected ()
      extends typings.scalike.mod.OptionalBuilder2[A, B, C] {
      def this(oa: Optional[A], ob: Optional[B], oc: Optional[C]) = this()
    }
    
    @JSGlobal("scalike.OptionalBuilder3")
    @js.native
    open class OptionalBuilder3[A, B, C, D] protected ()
      extends typings.scalike.mod.OptionalBuilder3[A, B, C, D] {
      def this(oa: Optional[A], ob: Optional[B], oc: Optional[C], od: Optional[D]) = this()
    }
    
    @JSGlobal("scalike.OptionalBuilder4")
    @js.native
    open class OptionalBuilder4[A, B, C, D, E] protected ()
      extends typings.scalike.mod.OptionalBuilder4[A, B, C, D, E] {
      def this(oa: Optional[A], ob: Optional[B], oc: Optional[C], od: Optional[D], oe: Optional[E]) = this()
    }
    
    @JSGlobal("scalike.OptionalBuilder5")
    @js.native
    open class OptionalBuilder5[A, B, C, D, E, F] protected ()
      extends typings.scalike.mod.OptionalBuilder5[A, B, C, D, E, F] {
      def this(
        oa: Optional[A],
        ob: Optional[B],
        oc: Optional[C],
        od: Optional[D],
        oe: Optional[E],
        of: Optional[F]
      ) = this()
    }
    
    inline def Right[A, B](b: B): Either[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("Right")(b.asInstanceOf[js.Any]).asInstanceOf[Either[A, B]]
    
    @JSGlobal("scalike.RightProjection")
    @js.native
    open class RightProjection[A, B] protected ()
      extends typings.scalike.mod.RightProjection[A, B] {
      def this(self: Either[A, B]) = this()
    }
    
    inline def Some[A](a: A): Optional[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("Some")(a.asInstanceOf[js.Any]).asInstanceOf[Optional[A]]
    
    inline def Success[A](a: A): Try[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("Success")(a.asInstanceOf[js.Any]).asInstanceOf[Try[A]]
    
    inline def Try[A](f: js.Function0[A]): typings.scalike.mod.Try[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("Try")(f.asInstanceOf[js.Any]).asInstanceOf[typings.scalike.mod.Try[A]]
    
    @JSGlobal("scalike.TryBuilder1")
    @js.native
    open class TryBuilder1[A, B] protected ()
      extends typings.scalike.mod.TryBuilder1[A, B] {
      def this(oa: Try[A], ob: Try[B]) = this()
    }
    
    @JSGlobal("scalike.TryBuilder2")
    @js.native
    open class TryBuilder2[A, B, C] protected ()
      extends typings.scalike.mod.TryBuilder2[A, B, C] {
      def this(oa: Try[A], ob: Try[B], oc: Try[C]) = this()
    }
    
    @JSGlobal("scalike.TryBuilder3")
    @js.native
    open class TryBuilder3[A, B, C, D] protected ()
      extends typings.scalike.mod.TryBuilder3[A, B, C, D] {
      def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D]) = this()
    }
    
    @JSGlobal("scalike.TryBuilder4")
    @js.native
    open class TryBuilder4[A, B, C, D, E] protected ()
      extends typings.scalike.mod.TryBuilder4[A, B, C, D, E] {
      def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D], oe: Try[E]) = this()
    }
    
    @JSGlobal("scalike.TryBuilder5")
    @js.native
    open class TryBuilder5[A, B, C, D, E, F] protected ()
      extends typings.scalike.mod.TryBuilder5[A, B, C, D, E, F] {
      def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D], oe: Try[E], of: Try[F]) = this()
    }
  }
}
