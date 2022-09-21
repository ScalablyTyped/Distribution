package typings.scalike

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scalike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Failure[A](e: js.Error): Try[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("Failure")(e.asInstanceOf[js.Any]).asInstanceOf[Try[A]]
  
  trait Future[A] extends StObject {
    
    def andThen[B](f: js.Function1[/* t */ Try[A], B]): Future[A]
    
    def apply1[B, C](ob: Future[B], f: js.Function2[/* a */ A, /* b */ B, C]): Future[C]
    
    def apply2[B, C, D](ob: Future[B], oc: Future[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Future[D]
    
    def chain[B](ob: Future[B]): FutureBuilder1[A, B]
    
    def failed(): Future[js.Error]
    
    def fallbackTo[B /* <: A */](fu: Future[B]): Future[A]
    
    def filter(f: js.Function1[/* a */ A, Boolean]): Future[A]
    
    def flatMap[B](f: js.Function1[/* a */ A, Future[B]]): Future[B]
    
    def foreach[B](f: js.Function1[/* a */ A, B]): Unit
    
    def getPromise(): js.Promise[A]
    
    def isCompleted(): Boolean
    
    def map[B](f: js.Function1[/* a */ A, B]): Future[B]
    
    def onComplete[B](f: js.Function1[/* t */ Try[A], B]): Unit
    
    def recover[B /* <: A */](f: js.Function1[/* e */ js.Error, Optional[B]]): Future[A]
    
    def recoverWith[B /* <: A */](f: js.Function1[/* e */ js.Error, Optional[Future[B]]]): Future[A]
    
    def transform[B](f: js.Function1[/* t */ Try[A], Try[B]]): Future[B]
    
    def transform1[B](fs: js.Function1[/* a */ A, B], ff: js.Function1[/* e */ js.Error, js.Error]): Future[B]
    
    def transformWith[B](f: js.Function1[/* t */ Try[A], Future[B]]): Future[B]
    
    def value(): Optional[Try[A]]
    
    def zip[B](fu: Future[B]): Future[js.Tuple2[A, B]]
    
    def zipWith[B, C](fu: Future[B], f: js.Function2[/* a */ A, /* b */ B, C]): Future[C]
  }
  object Future {
    
    inline def apply[A](f: js.Function0[A]): Future[A] = ^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any]).asInstanceOf[Future[A]]
    inline def apply[A](f: js.Promise[A]): Future[A] = ^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any]).asInstanceOf[Future[A]]
    
    @JSImport("scalike", "Future")
    @js.native
    val ^ : js.Any = js.native
    
    inline def failed[A](e: js.Error): Future[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("failed")(e.asInstanceOf[js.Any]).asInstanceOf[Future[A]]
    
    inline def find[A](fus: js.Array[Future[A]], f: js.Function1[/* a */ A, Boolean]): Future[Optional[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(fus.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Future[Optional[A]]]
    
    inline def firstCompletedOf[A](fus: js.Array[Future[A]]): Future[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("firstCompletedOf")(fus.asInstanceOf[js.Any]).asInstanceOf[Future[A]]
    
    inline def foldLeft[A, B](fu: js.Array[Future[A]], zero: B, f: js.Function2[/* b */ B, /* a */ A, B]): Future[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLeft")(fu.asInstanceOf[js.Any], zero.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Future[B]]
    
    inline def fromPromise[A](p: js.Promise[A]): Future[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(p.asInstanceOf[js.Any]).asInstanceOf[Future[A]]
    
    inline def fromTry[A](t: Try[A]): Future[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTry")(t.asInstanceOf[js.Any]).asInstanceOf[Future[A]]
    
    inline def reduceLeft[A, B](fu: js.Array[Future[A]], f: js.Function2[/* b */ B, /* a */ A, B]): Future[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceLeft")(fu.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Future[B]]
    
    inline def sequence[A](fus: js.Array[Future[A]]): Future[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(fus.asInstanceOf[js.Any]).asInstanceOf[Future[js.Array[A]]]
    
    inline def successful[A](a: A): Future[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("successful")(a.asInstanceOf[js.Any]).asInstanceOf[Future[A]]
    
    inline def traverse[A, B](fu: js.Array[A], f: js.Function1[/* a */ A, Future[B]]): Future[js.Array[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(fu.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Future[js.Array[B]]]
    
    inline def unit(): Future[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unit")().asInstanceOf[Future[Unit]]
    
    extension [Self <: Future[?], A](x: Self & Future[A]) {
      
      inline def setAndThen(value: js.Function1[/* t */ Try[A], Any] => Future[A]): Self = StObject.set(x, "andThen", js.Any.fromFunction1(value))
      
      inline def setApply1(value: (Future[Any], js.Function2[/* a */ A, Any, Any]) => Future[Any]): Self = StObject.set(x, "apply1", js.Any.fromFunction2(value))
      
      inline def setApply2(value: (Future[Any], Future[Any], js.Function3[/* a */ A, Any, Any, Any]) => Future[Any]): Self = StObject.set(x, "apply2", js.Any.fromFunction3(value))
      
      inline def setChain(value: Future[Any] => FutureBuilder1[A, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      inline def setFailed(value: () => Future[js.Error]): Self = StObject.set(x, "failed", js.Any.fromFunction0(value))
      
      inline def setFallbackTo(value: Future[Any] => Future[A]): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
      
      inline def setFilter(value: js.Function1[/* a */ A, Boolean] => Future[A]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFlatMap(value: js.Function1[/* a */ A, Future[Any]] => Future[Any]): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setForeach(value: js.Function1[/* a */ A, Any] => Unit): Self = StObject.set(x, "foreach", js.Any.fromFunction1(value))
      
      inline def setGetPromise(value: () => js.Promise[A]): Self = StObject.set(x, "getPromise", js.Any.fromFunction0(value))
      
      inline def setIsCompleted(value: () => Boolean): Self = StObject.set(x, "isCompleted", js.Any.fromFunction0(value))
      
      inline def setMap(value: js.Function1[/* a */ A, Any] => Future[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setOnComplete(value: js.Function1[/* t */ Try[A], Any] => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setRecover(value: js.Function1[/* e */ js.Error, Optional[Any]] => Future[A]): Self = StObject.set(x, "recover", js.Any.fromFunction1(value))
      
      inline def setRecoverWith(value: js.Function1[/* e */ js.Error, Optional[Future[Any]]] => Future[A]): Self = StObject.set(x, "recoverWith", js.Any.fromFunction1(value))
      
      inline def setTransform(value: js.Function1[/* t */ Try[A], Try[Any]] => Future[Any]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransform1(value: (js.Function1[/* a */ A, Any], js.Function1[/* e */ js.Error, js.Error]) => Future[Any]): Self = StObject.set(x, "transform1", js.Any.fromFunction2(value))
      
      inline def setTransformWith(value: js.Function1[/* t */ Try[A], Future[Any]] => Future[Any]): Self = StObject.set(x, "transformWith", js.Any.fromFunction1(value))
      
      inline def setValue(value: () => Optional[Try[A]]): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
      
      inline def setZip(value: Future[Any] => Future[js.Tuple2[A, Any]]): Self = StObject.set(x, "zip", js.Any.fromFunction1(value))
      
      inline def setZipWith(value: (Future[Any], js.Function2[/* a */ A, Any, Any]) => Future[Any]): Self = StObject.set(x, "zipWith", js.Any.fromFunction2(value))
    }
  }
  
  @JSImport("scalike", "FutureBuilder1")
  @js.native
  open class FutureBuilder1[A, B] protected () extends StObject {
    def this(oa: Future[A], ob: Future[B]) = this()
    
    def chain[C](oc: Future[C]): FutureBuilder2[A, B, C] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Future[C] = js.native
  }
  
  @JSImport("scalike", "FutureBuilder2")
  @js.native
  open class FutureBuilder2[A, B, C] protected () extends StObject {
    def this(oa: Future[A], ob: Future[B], oc: Future[C]) = this()
    
    def chain[D](od: Future[D]): FutureBuilder3[A, B, C, D] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Future[D] = js.native
  }
  
  @JSImport("scalike", "FutureBuilder3")
  @js.native
  open class FutureBuilder3[A, B, C, D] protected () extends StObject {
    def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D]) = this()
    
    def chain[E](oe: Future[E]): FutureBuilder4[A, B, C, D, E] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    /* private */ var od: Any = js.native
    
    def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Future[E] = js.native
  }
  
  @JSImport("scalike", "FutureBuilder4")
  @js.native
  open class FutureBuilder4[A, B, C, D, E] protected () extends StObject {
    def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D], oe: Future[E]) = this()
    
    def chain[F](of: Future[F]): FutureBuilder5[A, B, C, D, E, F] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    /* private */ var od: Any = js.native
    
    /* private */ var oe: Any = js.native
    
    def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Future[F] = js.native
  }
  
  @JSImport("scalike", "FutureBuilder5")
  @js.native
  open class FutureBuilder5[A, B, C, D, E, F] protected () extends StObject {
    def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D], oe: Future[E], of: Future[F]) = this()
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    /* private */ var od: Any = js.native
    
    /* private */ var oe: Any = js.native
    
    /* private */ var of: Any = js.native
    
    def run[G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): Future[G] = js.native
  }
  
  inline def Left[A, B](a: A): Either[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("Left")(a.asInstanceOf[js.Any]).asInstanceOf[Either[A, B]]
  
  @JSImport("scalike", "LeftProjection")
  @js.native
  open class LeftProjection[A, B] protected () extends StObject {
    def this(self: Either[A, B]) = this()
    
    def exists(f: js.Function1[/* a */ A, Boolean]): Boolean = js.native
    
    def filter(f: js.Function1[/* a */ A, Boolean]): Optional[Either[A, B]] = js.native
    
    def flatMap[X](f: js.Function1[/* a */ A, Either[X, B]]): Either[X | A, B] = js.native
    
    def forall(f: js.Function1[/* a */ A, Boolean]): Boolean = js.native
    
    def foreach(f: js.Function1[/* a */ A, Unit]): Unit = js.native
    
    def get(): A = js.native
    
    def getOrElse[X /* <: A */](x: X): A = js.native
    
    def map[X](f: js.Function1[/* a */ A, X]): Either[X | A, B] = js.native
    
    /* private */ var self: Any = js.native
    
    def toOptional(): Optional[A] = js.native
  }
  
  @JSImport("scalike", "None")
  @js.native
  val None: Optional[Any] = js.native
  
  trait Optional[A] extends StObject {
    
    def apply1[B, C](ob: Optional[B], f: js.Function2[/* a */ A, /* b */ B, C]): Optional[C]
    
    def apply2[B, C, D](ob: Optional[B], oc: Optional[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Optional[D]
    
    def chain[B](ob: Optional[B]): OptionalBuilder1[A, B]
    
    def contains[B /* <: A */](b: B): Boolean
    
    def exists(f: js.Function1[/* a */ A, Boolean]): Boolean
    
    def filter(f: js.Function1[/* a */ A, Boolean]): Optional[A]
    
    def flatMap[B](f: js.Function1[/* a */ A, Optional[B]]): Optional[B]
    
    def flatten(): Optional[A]
    
    def fold[B](ifEmpty: B, f: js.Function1[/* a */ A, B]): B
    
    def forall(f: js.Function1[/* a */ A, Boolean]): Boolean
    
    def foreach(f: js.Function1[/* a */ A, Unit]): Unit
    
    def get(): A
    
    def getOrElse[B /* <: A */](a: B): A
    
    var isEmpty: Boolean
    
    def map[B](f: js.Function1[/* a */ A, B]): Optional[B]
    
    var nonEmpty: Boolean
    
    def orElse[B /* <: A */](ob: Optional[B]): Optional[A]
  }
  object Optional {
    
    @JSImport("scalike", "Optional")
    @js.native
    def apply[A](a: A): Optional[A] = js.native
    
    extension [Self <: Optional[?], A](x: Self & Optional[A]) {
      
      inline def setApply1(value: (Optional[Any], js.Function2[/* a */ A, Any, Any]) => Optional[Any]): Self = StObject.set(x, "apply1", js.Any.fromFunction2(value))
      
      inline def setApply2(value: (Optional[Any], Optional[Any], js.Function3[/* a */ A, Any, Any, Any]) => Optional[Any]): Self = StObject.set(x, "apply2", js.Any.fromFunction3(value))
      
      inline def setChain(value: Optional[Any] => OptionalBuilder1[A, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      inline def setContains(value: Any => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setExists(value: js.Function1[/* a */ A, Boolean] => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      inline def setFilter(value: js.Function1[/* a */ A, Boolean] => Optional[A]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFlatMap(value: js.Function1[/* a */ A, Optional[Any]] => Optional[Any]): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setFlatten(value: () => Optional[A]): Self = StObject.set(x, "flatten", js.Any.fromFunction0(value))
      
      inline def setFold(value: (Any, js.Function1[/* a */ A, Any]) => Any): Self = StObject.set(x, "fold", js.Any.fromFunction2(value))
      
      inline def setForall(value: js.Function1[/* a */ A, Boolean] => Boolean): Self = StObject.set(x, "forall", js.Any.fromFunction1(value))
      
      inline def setForeach(value: js.Function1[/* a */ A, Unit] => Unit): Self = StObject.set(x, "foreach", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => A): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGetOrElse(value: Any => A): Self = StObject.set(x, "getOrElse", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setMap(value: js.Function1[/* a */ A, Any] => Optional[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setNonEmpty(value: Boolean): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
      
      inline def setOrElse(value: Optional[Any] => Optional[A]): Self = StObject.set(x, "orElse", js.Any.fromFunction1(value))
    }
  }
  
  @JSImport("scalike", "OptionalBuilder1")
  @js.native
  open class OptionalBuilder1[A, B] protected () extends StObject {
    def this(oa: Optional[A], ob: Optional[B]) = this()
    
    def chain[C](oc: Optional[C]): OptionalBuilder2[A, B, C] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Optional[C] = js.native
  }
  
  @JSImport("scalike", "OptionalBuilder2")
  @js.native
  open class OptionalBuilder2[A, B, C] protected () extends StObject {
    def this(oa: Optional[A], ob: Optional[B], oc: Optional[C]) = this()
    
    def chain[D](od: Optional[D]): OptionalBuilder3[A, B, C, D] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Optional[D] = js.native
  }
  
  @JSImport("scalike", "OptionalBuilder3")
  @js.native
  open class OptionalBuilder3[A, B, C, D] protected () extends StObject {
    def this(oa: Optional[A], ob: Optional[B], oc: Optional[C], od: Optional[D]) = this()
    
    def chain[E](oe: Optional[E]): OptionalBuilder4[A, B, C, D, E] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    /* private */ var od: Any = js.native
    
    def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Optional[E] = js.native
  }
  
  @JSImport("scalike", "OptionalBuilder4")
  @js.native
  open class OptionalBuilder4[A, B, C, D, E] protected () extends StObject {
    def this(oa: Optional[A], ob: Optional[B], oc: Optional[C], od: Optional[D], oe: Optional[E]) = this()
    
    def chain[F](of: Optional[F]): OptionalBuilder5[A, B, C, D, E, F] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    /* private */ var od: Any = js.native
    
    /* private */ var oe: Any = js.native
    
    def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Optional[F] = js.native
  }
  
  @JSImport("scalike", "OptionalBuilder5")
  @js.native
  open class OptionalBuilder5[A, B, C, D, E, F] protected () extends StObject {
    def this(
      oa: Optional[A],
      ob: Optional[B],
      oc: Optional[C],
      od: Optional[D],
      oe: Optional[E],
      of: Optional[F]
    ) = this()
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    /* private */ var od: Any = js.native
    
    /* private */ var oe: Any = js.native
    
    /* private */ var of: Any = js.native
    
    def run[G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): Optional[G] = js.native
  }
  
  inline def Right[A, B](b: B): Either[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("Right")(b.asInstanceOf[js.Any]).asInstanceOf[Either[A, B]]
  
  @JSImport("scalike", "RightProjection")
  @js.native
  open class RightProjection[A, B] protected () extends StObject {
    def this(self: Either[A, B]) = this()
    
    def exists(f: js.Function1[/* b */ B, Boolean]): Boolean = js.native
    
    def filter(f: js.Function1[/* b */ B, Boolean]): Optional[Either[A, B]] = js.native
    
    def flatMap[X](f: js.Function1[/* a */ B, Either[A, X]]): Either[A, X | B] = js.native
    
    def forall(f: js.Function1[/* b */ B, Boolean]): Boolean = js.native
    
    def foreach(f: js.Function1[/* b */ B, Unit]): Unit = js.native
    
    def get(): B = js.native
    
    def getOrElse[X /* <: B */](x: X): B = js.native
    
    def map[X](f: js.Function1[/* b */ B, X]): Either[A, X | B] = js.native
    
    /* private */ var self: Any = js.native
    
    def toOptional(): Optional[B] = js.native
  }
  
  inline def Some[A](a: A): Optional[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("Some")(a.asInstanceOf[js.Any]).asInstanceOf[Optional[A]]
  
  inline def Success[A](a: A): Try[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("Success")(a.asInstanceOf[js.Any]).asInstanceOf[Try[A]]
  
  trait Try[A] extends StObject {
    
    def apply1[B, C](ob: Try[B], f: js.Function2[/* a */ A, /* b */ B, C]): Try[C]
    
    def apply2[B, C, D](ob: Try[B], oc: Try[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Try[D]
    
    def chain[B](ob: Try[B]): TryBuilder1[A, B]
    
    def failed(): Try[A]
    
    def filter(f: js.Function1[/* a */ A, Boolean]): Try[A]
    
    def flatMap[B](f: js.Function1[/* a */ A, Try[B]]): Try[B]
    
    def fold[B](fe: js.Function1[/* e */ js.Error, B], ff: js.Function1[/* a */ A, B]): B
    
    def foreach[B](f: js.Function1[/* a */ A, Unit]): Unit
    
    def get(): A
    
    def getError(): js.Error
    
    def getOrElse[B /* <: A */](a: B): A
    
    var isFailure: Boolean
    
    var isSuccess: Boolean
    
    def map[B](f: js.Function1[/* a */ A, B]): Try[B]
    
    def orElse[B /* <: A */](a: Try[B]): Try[A]
    
    def recover[B /* <: A */](f: js.Function1[/* e */ js.Error, Optional[Try[B]]]): Try[A]
    
    def toOptional(): Optional[A]
    
    def transform[B](fs: js.Function1[/* a */ A, Try[B]], ff: js.Function1[/* e */ js.Error, Try[B]]): Try[B]
  }
  object Try {
    
    @JSImport("scalike", "Try")
    @js.native
    def apply[A](f: js.Function0[A]): Try[A] = js.native
    
    extension [Self <: Try[?], A](x: Self & Try[A]) {
      
      inline def setApply1(value: (Try[Any], js.Function2[/* a */ A, Any, Any]) => Try[Any]): Self = StObject.set(x, "apply1", js.Any.fromFunction2(value))
      
      inline def setApply2(value: (Try[Any], Try[Any], js.Function3[/* a */ A, Any, Any, Any]) => Try[Any]): Self = StObject.set(x, "apply2", js.Any.fromFunction3(value))
      
      inline def setChain(value: Try[Any] => TryBuilder1[A, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      inline def setFailed(value: () => Try[A]): Self = StObject.set(x, "failed", js.Any.fromFunction0(value))
      
      inline def setFilter(value: js.Function1[/* a */ A, Boolean] => Try[A]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFlatMap(value: js.Function1[/* a */ A, Try[Any]] => Try[Any]): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setFold(value: (js.Function1[/* e */ js.Error, Any], js.Function1[/* a */ A, Any]) => Any): Self = StObject.set(x, "fold", js.Any.fromFunction2(value))
      
      inline def setForeach(value: js.Function1[/* a */ A, Unit] => Unit): Self = StObject.set(x, "foreach", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => A): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGetError(value: () => js.Error): Self = StObject.set(x, "getError", js.Any.fromFunction0(value))
      
      inline def setGetOrElse(value: Any => A): Self = StObject.set(x, "getOrElse", js.Any.fromFunction1(value))
      
      inline def setIsFailure(value: Boolean): Self = StObject.set(x, "isFailure", value.asInstanceOf[js.Any])
      
      inline def setIsSuccess(value: Boolean): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
      
      inline def setMap(value: js.Function1[/* a */ A, Any] => Try[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setOrElse(value: Try[Any] => Try[A]): Self = StObject.set(x, "orElse", js.Any.fromFunction1(value))
      
      inline def setRecover(value: js.Function1[/* e */ js.Error, Optional[Try[Any]]] => Try[A]): Self = StObject.set(x, "recover", js.Any.fromFunction1(value))
      
      inline def setToOptional(value: () => Optional[A]): Self = StObject.set(x, "toOptional", js.Any.fromFunction0(value))
      
      inline def setTransform(value: (js.Function1[/* a */ A, Try[Any]], js.Function1[/* e */ js.Error, Try[Any]]) => Try[Any]): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    }
  }
  
  @JSImport("scalike", "TryBuilder1")
  @js.native
  open class TryBuilder1[A, B] protected () extends StObject {
    def this(oa: Try[A], ob: Try[B]) = this()
    
    def chain[C](oc: Try[C]): TryBuilder2[A, B, C] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Try[C] = js.native
  }
  
  @JSImport("scalike", "TryBuilder2")
  @js.native
  open class TryBuilder2[A, B, C] protected () extends StObject {
    def this(oa: Try[A], ob: Try[B], oc: Try[C]) = this()
    
    def chain[D](od: Try[D]): TryBuilder3[A, B, C, D] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Try[D] = js.native
  }
  
  @JSImport("scalike", "TryBuilder3")
  @js.native
  open class TryBuilder3[A, B, C, D] protected () extends StObject {
    def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D]) = this()
    
    def chain[E](oe: Try[E]): TryBuilder4[A, B, C, D, E] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    /* private */ var od: Any = js.native
    
    def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Try[E] = js.native
  }
  
  @JSImport("scalike", "TryBuilder4")
  @js.native
  open class TryBuilder4[A, B, C, D, E] protected () extends StObject {
    def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D], oe: Try[E]) = this()
    
    def chain[F](of: Try[F]): TryBuilder5[A, B, C, D, E, F] = js.native
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    /* private */ var od: Any = js.native
    
    /* private */ var oe: Any = js.native
    
    def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Try[F] = js.native
  }
  
  @JSImport("scalike", "TryBuilder5")
  @js.native
  open class TryBuilder5[A, B, C, D, E, F] protected () extends StObject {
    def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D], oe: Try[E], of: Try[F]) = this()
    
    /* private */ var oa: Any = js.native
    
    /* private */ var ob: Any = js.native
    
    /* private */ var oc: Any = js.native
    
    /* private */ var od: Any = js.native
    
    /* private */ var oe: Any = js.native
    
    /* private */ var of: Any = js.native
    
    def run[G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): Try[G] = js.native
  }
  
  trait Either[A, B] extends StObject {
    
    def fold[X](fa: js.Function1[/* a */ A, X], fb: js.Function1[/* b */ B, X]): X
    
    var isLeft: Boolean
    
    var isRight: Boolean
    
    def left(): LeftProjection[A, B]
    
    def right(): RightProjection[A, B]
    
    def swap(): Either[B, A]
    
    var value: A | B
  }
  object Either {
    
    inline def apply[A, B](
      fold: (js.Function1[/* a */ A, Any], js.Function1[/* b */ B, Any]) => Any,
      isLeft: Boolean,
      isRight: Boolean,
      left: () => LeftProjection[A, B],
      right: () => RightProjection[A, B],
      swap: () => Either[B, A],
      value: A | B
    ): Either[A, B] = {
      val __obj = js.Dynamic.literal(fold = js.Any.fromFunction2(fold), isLeft = isLeft.asInstanceOf[js.Any], isRight = isRight.asInstanceOf[js.Any], left = js.Any.fromFunction0(left), right = js.Any.fromFunction0(right), swap = js.Any.fromFunction0(swap), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Either[A, B]]
    }
    
    extension [Self <: Either[?, ?], A, B](x: Self & (Either[A, B])) {
      
      inline def setFold(value: (js.Function1[/* a */ A, Any], js.Function1[/* b */ B, Any]) => Any): Self = StObject.set(x, "fold", js.Any.fromFunction2(value))
      
      inline def setIsLeft(value: Boolean): Self = StObject.set(x, "isLeft", value.asInstanceOf[js.Any])
      
      inline def setIsRight(value: Boolean): Self = StObject.set(x, "isRight", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: () => LeftProjection[A, B]): Self = StObject.set(x, "left", js.Any.fromFunction0(value))
      
      inline def setRight(value: () => RightProjection[A, B]): Self = StObject.set(x, "right", js.Any.fromFunction0(value))
      
      inline def setSwap(value: () => Either[B, A]): Self = StObject.set(x, "swap", js.Any.fromFunction0(value))
      
      inline def setValue(value: A | B): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
