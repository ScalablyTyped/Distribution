package typings.scalike

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scalike", "Failure")
  @js.native
  def Failure[A](e: Error): Try[A] = js.native
  
  @js.native
  trait Future[A] extends StObject {
    
    def andThen[B](f: js.Function1[/* t */ Try[A], B]): Future[A] = js.native
    
    def apply1[B, C](ob: Future[B], f: js.Function2[/* a */ A, /* b */ B, C]): Future[C] = js.native
    
    def apply2[B, C, D](ob: Future[B], oc: Future[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Future[D] = js.native
    
    def chain[B](ob: Future[B]): FutureBuilder1[A, B] = js.native
    
    def failed(): Future[Error] = js.native
    
    def fallbackTo[B /* <: A */](fu: Future[B]): Future[A] = js.native
    
    def filter(f: js.Function1[/* a */ A, Boolean]): Future[A] = js.native
    
    def flatMap[B](f: js.Function1[/* a */ A, Future[B]]): Future[B] = js.native
    
    def foreach[B](f: js.Function1[/* a */ A, B]): Unit = js.native
    
    def getPromise(): js.Promise[A] = js.native
    
    def isCompleted(): Boolean = js.native
    
    def map[B](f: js.Function1[/* a */ A, B]): Future[B] = js.native
    
    def onComplete[B](f: js.Function1[/* t */ Try[A], B]): Unit = js.native
    
    def recover[B /* <: A */](f: js.Function1[/* e */ Error, Optional[B]]): Future[A] = js.native
    
    def recoverWith[B /* <: A */](f: js.Function1[/* e */ Error, Optional[Future[B]]]): Future[A] = js.native
    
    def transform[B](f: js.Function1[/* t */ Try[A], Try[B]]): Future[B] = js.native
    
    def transform1[B](fs: js.Function1[/* a */ A, B], ff: js.Function1[/* e */ Error, Error]): Future[B] = js.native
    
    def transformWith[B](f: js.Function1[/* t */ Try[A], Future[B]]): Future[B] = js.native
    
    def value(): Optional[Try[A]] = js.native
    
    def zip[B](fu: Future[B]): Future[js.Tuple2[A, B]] = js.native
    
    def zipWith[B, C](fu: Future[B], f: js.Function2[/* a */ A, /* b */ B, C]): Future[C] = js.native
  }
  object Future {
    
    @JSImport("scalike", "Future")
    @js.native
    def apply[A](f: js.Function0[A]): Future[A] = js.native
    @JSImport("scalike", "Future")
    @js.native
    def apply[A](f: js.Promise[A]): Future[A] = js.native
    
    @JSImport("scalike", "Future.failed")
    @js.native
    def failed[A](e: Error): Future[A] = js.native
    
    @JSImport("scalike", "Future.find")
    @js.native
    def find[A](fus: js.Array[Future[A]], f: js.Function1[/* a */ A, Boolean]): Future[Optional[A]] = js.native
    
    @JSImport("scalike", "Future.firstCompletedOf")
    @js.native
    def firstCompletedOf[A](fus: js.Array[Future[A]]): Future[A] = js.native
    
    @JSImport("scalike", "Future.foldLeft")
    @js.native
    def foldLeft[A, B](fu: js.Array[Future[A]], zero: B, f: js.Function2[/* b */ B, /* a */ A, B]): Future[B] = js.native
    
    @JSImport("scalike", "Future.fromPromise")
    @js.native
    def fromPromise[A](p: js.Promise[A]): Future[A] = js.native
    
    @JSImport("scalike", "Future.fromTry")
    @js.native
    def fromTry[A](t: Try[A]): Future[A] = js.native
    
    @JSImport("scalike", "Future.reduceLeft")
    @js.native
    def reduceLeft[A, B](fu: js.Array[Future[A]], f: js.Function2[/* b */ B, /* a */ A, B]): Future[B] = js.native
    
    @JSImport("scalike", "Future.sequence")
    @js.native
    def sequence[A](fus: js.Array[Future[A]]): Future[js.Array[A]] = js.native
    
    @JSImport("scalike", "Future.successful")
    @js.native
    def successful[A](a: A): Future[A] = js.native
    
    @JSImport("scalike", "Future.traverse")
    @js.native
    def traverse[A, B](fu: js.Array[A], f: js.Function1[/* a */ A, Future[B]]): Future[js.Array[B]] = js.native
    
    @JSImport("scalike", "Future.unit")
    @js.native
    def unit(): Future[Unit] = js.native
    
    @scala.inline
    implicit class FutureMutableBuilder[Self <: Future[_], A] (val x: Self with Future[A]) extends AnyVal {
      
      @scala.inline
      def setAndThen(value: js.Function1[/* t */ Try[A], js.Any] => Future[A]): Self = StObject.set(x, "andThen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApply1(value: (Future[js.Any], js.Function2[/* a */ A, js.Any, js.Any]) => Future[js.Any]): Self = StObject.set(x, "apply1", js.Any.fromFunction2(value))
      
      @scala.inline
      def setApply2(
        value: (Future[js.Any], Future[js.Any], js.Function3[/* a */ A, js.Any, js.Any, js.Any]) => Future[js.Any]
      ): Self = StObject.set(x, "apply2", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChain(value: Future[js.Any] => FutureBuilder1[A, js.Any]): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFailed(value: () => Future[Error]): Self = StObject.set(x, "failed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFallbackTo(value: Future[js.Any] => Future[A]): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilter(value: js.Function1[/* a */ A, Boolean] => Future[A]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlatMap(value: js.Function1[/* a */ A, Future[js.Any]] => Future[js.Any]): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForeach(value: js.Function1[/* a */ A, js.Any] => Unit): Self = StObject.set(x, "foreach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPromise(value: () => js.Promise[A]): Self = StObject.set(x, "getPromise", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCompleted(value: () => Boolean): Self = StObject.set(x, "isCompleted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMap(value: js.Function1[/* a */ A, js.Any] => Future[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnComplete(value: js.Function1[/* t */ Try[A], js.Any] => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRecover(value: js.Function1[/* e */ Error, Optional[js.Any]] => Future[A]): Self = StObject.set(x, "recover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRecoverWith(value: js.Function1[/* e */ Error, Optional[Future[js.Any]]] => Future[A]): Self = StObject.set(x, "recoverWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransform(value: js.Function1[/* t */ Try[A], Try[js.Any]] => Future[js.Any]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransform1(value: (js.Function1[/* a */ A, js.Any], js.Function1[/* e */ Error, Error]) => Future[js.Any]): Self = StObject.set(x, "transform1", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformWith(value: js.Function1[/* t */ Try[A], Future[js.Any]] => Future[js.Any]): Self = StObject.set(x, "transformWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: () => Optional[Try[A]]): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZip(value: Future[js.Any] => Future[js.Tuple2[A, js.Any]]): Self = StObject.set(x, "zip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZipWith(value: (Future[js.Any], js.Function2[/* a */ A, js.Any, js.Any]) => Future[js.Any]): Self = StObject.set(x, "zipWith", js.Any.fromFunction2(value))
    }
  }
  
  @JSImport("scalike", "FutureBuilder1")
  @js.native
  class FutureBuilder1[A, B] protected () extends StObject {
    def this(oa: Future[A], ob: Future[B]) = this()
    
    def chain[C](oc: Future[C]): FutureBuilder2[A, B, C] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Future[C] = js.native
  }
  
  @JSImport("scalike", "FutureBuilder2")
  @js.native
  class FutureBuilder2[A, B, C] protected () extends StObject {
    def this(oa: Future[A], ob: Future[B], oc: Future[C]) = this()
    
    def chain[D](od: Future[D]): FutureBuilder3[A, B, C, D] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Future[D] = js.native
  }
  
  @JSImport("scalike", "FutureBuilder3")
  @js.native
  class FutureBuilder3[A, B, C, D] protected () extends StObject {
    def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D]) = this()
    
    def chain[E](oe: Future[E]): FutureBuilder4[A, B, C, D, E] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    var od: js.Any = js.native
    
    def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Future[E] = js.native
  }
  
  @JSImport("scalike", "FutureBuilder4")
  @js.native
  class FutureBuilder4[A, B, C, D, E] protected () extends StObject {
    def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D], oe: Future[E]) = this()
    
    def chain[F](of: Future[F]): FutureBuilder5[A, B, C, D, E, F] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    var od: js.Any = js.native
    
    var oe: js.Any = js.native
    
    def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Future[F] = js.native
  }
  
  @JSImport("scalike", "FutureBuilder5")
  @js.native
  class FutureBuilder5[A, B, C, D, E, F] protected () extends StObject {
    def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D], oe: Future[E], of: Future[F]) = this()
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    var od: js.Any = js.native
    
    var oe: js.Any = js.native
    
    var of: js.Any = js.native
    
    def run[G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): Future[G] = js.native
  }
  
  @JSImport("scalike", "Left")
  @js.native
  def Left[A, B](a: A): Either[A, B] = js.native
  
  @JSImport("scalike", "LeftProjection")
  @js.native
  class LeftProjection[A, B] protected () extends StObject {
    def this(self: Either[A, B]) = this()
    
    def exists(f: js.Function1[/* a */ A, Boolean]): Boolean = js.native
    
    def filter(f: js.Function1[/* a */ A, Boolean]): Optional[Either[A, B]] = js.native
    
    def flatMap[X](f: js.Function1[/* a */ A, Either[X, B]]): Either[X | A, B] = js.native
    
    def forall(f: js.Function1[/* a */ A, Boolean]): Boolean = js.native
    
    def foreach(f: js.Function1[/* a */ A, Unit]): Unit = js.native
    
    def get(): A = js.native
    
    def getOrElse[X /* <: A */](x: X): A = js.native
    
    def map[X](f: js.Function1[/* a */ A, X]): Either[X | A, B] = js.native
    
    var self: js.Any = js.native
    
    def toOptional(): Optional[A] = js.native
  }
  
  @JSImport("scalike", "None")
  @js.native
  val None: Optional[js.Any] = js.native
  
  @js.native
  trait Optional[A] extends StObject {
    
    def apply1[B, C](ob: Optional[B], f: js.Function2[/* a */ A, /* b */ B, C]): Optional[C] = js.native
    
    def apply2[B, C, D](ob: Optional[B], oc: Optional[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Optional[D] = js.native
    
    def chain[B](ob: Optional[B]): OptionalBuilder1[A, B] = js.native
    
    def contains[B /* <: A */](b: B): Boolean = js.native
    
    def exists(f: js.Function1[/* a */ A, Boolean]): Boolean = js.native
    
    def filter(f: js.Function1[/* a */ A, Boolean]): Optional[A] = js.native
    
    def flatMap[B](f: js.Function1[/* a */ A, Optional[B]]): Optional[B] = js.native
    
    def flatten(): Optional[A] = js.native
    
    def fold[B](ifEmpty: B, f: js.Function1[/* a */ A, B]): B = js.native
    
    def forall(f: js.Function1[/* a */ A, Boolean]): Boolean = js.native
    
    def foreach(f: js.Function1[/* a */ A, Unit]): Unit = js.native
    
    def get(): A = js.native
    
    def getOrElse[B /* <: A */](a: B): A = js.native
    
    var isEmpty: Boolean = js.native
    
    def map[B](f: js.Function1[/* a */ A, B]): Optional[B] = js.native
    
    var nonEmpty: Boolean = js.native
    
    def orElse[B /* <: A */](ob: Optional[B]): Optional[A] = js.native
  }
  object Optional {
    
    @JSImport("scalike", "Optional")
    @js.native
    def apply[A](a: A): Optional[A] = js.native
    
    @scala.inline
    implicit class OptionalMutableBuilder[Self <: Optional[_], A] (val x: Self with Optional[A]) extends AnyVal {
      
      @scala.inline
      def setApply1(value: (Optional[js.Any], js.Function2[/* a */ A, js.Any, js.Any]) => Optional[js.Any]): Self = StObject.set(x, "apply1", js.Any.fromFunction2(value))
      
      @scala.inline
      def setApply2(
        value: (Optional[js.Any], Optional[js.Any], js.Function3[/* a */ A, js.Any, js.Any, js.Any]) => Optional[js.Any]
      ): Self = StObject.set(x, "apply2", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChain(value: Optional[js.Any] => OptionalBuilder1[A, js.Any]): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContains(value: js.Any => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExists(value: js.Function1[/* a */ A, Boolean] => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilter(value: js.Function1[/* a */ A, Boolean] => Optional[A]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlatMap(value: js.Function1[/* a */ A, Optional[js.Any]] => Optional[js.Any]): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlatten(value: () => Optional[A]): Self = StObject.set(x, "flatten", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFold(value: (js.Any, js.Function1[/* a */ A, js.Any]) => js.Any): Self = StObject.set(x, "fold", js.Any.fromFunction2(value))
      
      @scala.inline
      def setForall(value: js.Function1[/* a */ A, Boolean] => Boolean): Self = StObject.set(x, "forall", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForeach(value: js.Function1[/* a */ A, Unit] => Unit): Self = StObject.set(x, "foreach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: () => A): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOrElse(value: js.Any => A): Self = StObject.set(x, "getOrElse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Function1[/* a */ A, js.Any] => Optional[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNonEmpty(value: Boolean): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrElse(value: Optional[js.Any] => Optional[A]): Self = StObject.set(x, "orElse", js.Any.fromFunction1(value))
    }
  }
  
  @JSImport("scalike", "OptionalBuilder1")
  @js.native
  class OptionalBuilder1[A, B] protected () extends StObject {
    def this(oa: Optional[A], ob: Optional[B]) = this()
    
    def chain[C](oc: Optional[C]): OptionalBuilder2[A, B, C] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Optional[C] = js.native
  }
  
  @JSImport("scalike", "OptionalBuilder2")
  @js.native
  class OptionalBuilder2[A, B, C] protected () extends StObject {
    def this(oa: Optional[A], ob: Optional[B], oc: Optional[C]) = this()
    
    def chain[D](od: Optional[D]): OptionalBuilder3[A, B, C, D] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Optional[D] = js.native
  }
  
  @JSImport("scalike", "OptionalBuilder3")
  @js.native
  class OptionalBuilder3[A, B, C, D] protected () extends StObject {
    def this(oa: Optional[A], ob: Optional[B], oc: Optional[C], od: Optional[D]) = this()
    
    def chain[E](oe: Optional[E]): OptionalBuilder4[A, B, C, D, E] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    var od: js.Any = js.native
    
    def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Optional[E] = js.native
  }
  
  @JSImport("scalike", "OptionalBuilder4")
  @js.native
  class OptionalBuilder4[A, B, C, D, E] protected () extends StObject {
    def this(oa: Optional[A], ob: Optional[B], oc: Optional[C], od: Optional[D], oe: Optional[E]) = this()
    
    def chain[F](of: Optional[F]): OptionalBuilder5[A, B, C, D, E, F] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    var od: js.Any = js.native
    
    var oe: js.Any = js.native
    
    def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Optional[F] = js.native
  }
  
  @JSImport("scalike", "OptionalBuilder5")
  @js.native
  class OptionalBuilder5[A, B, C, D, E, F] protected () extends StObject {
    def this(
      oa: Optional[A],
      ob: Optional[B],
      oc: Optional[C],
      od: Optional[D],
      oe: Optional[E],
      of: Optional[F]
    ) = this()
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    var od: js.Any = js.native
    
    var oe: js.Any = js.native
    
    var of: js.Any = js.native
    
    def run[G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): Optional[G] = js.native
  }
  
  @JSImport("scalike", "Right")
  @js.native
  def Right[A, B](b: B): Either[A, B] = js.native
  
  @JSImport("scalike", "RightProjection")
  @js.native
  class RightProjection[A, B] protected () extends StObject {
    def this(self: Either[A, B]) = this()
    
    def exists(f: js.Function1[/* b */ B, Boolean]): Boolean = js.native
    
    def filter(f: js.Function1[/* b */ B, Boolean]): Optional[Either[A, B]] = js.native
    
    def flatMap[X](f: js.Function1[/* a */ B, Either[A, X]]): Either[A, X | B] = js.native
    
    def forall(f: js.Function1[/* b */ B, Boolean]): Boolean = js.native
    
    def foreach(f: js.Function1[/* b */ B, Unit]): Unit = js.native
    
    def get(): B = js.native
    
    def getOrElse[X /* <: B */](x: X): B = js.native
    
    def map[X](f: js.Function1[/* b */ B, X]): Either[A, X | B] = js.native
    
    var self: js.Any = js.native
    
    def toOptional(): Optional[B] = js.native
  }
  
  @JSImport("scalike", "Some")
  @js.native
  def Some[A](a: A): Optional[A] = js.native
  
  @JSImport("scalike", "Success")
  @js.native
  def Success[A](a: A): Try[A] = js.native
  
  @js.native
  trait Try[A] extends StObject {
    
    def apply1[B, C](ob: Try[B], f: js.Function2[/* a */ A, /* b */ B, C]): Try[C] = js.native
    
    def apply2[B, C, D](ob: Try[B], oc: Try[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Try[D] = js.native
    
    def chain[B](ob: Try[B]): TryBuilder1[A, B] = js.native
    
    def failed(): Try[A] = js.native
    
    def filter(f: js.Function1[/* a */ A, Boolean]): Try[A] = js.native
    
    def flatMap[B](f: js.Function1[/* a */ A, Try[B]]): Try[B] = js.native
    
    def fold[B](fe: js.Function1[/* e */ Error, B], ff: js.Function1[/* a */ A, B]): B = js.native
    
    def foreach[B](f: js.Function1[/* a */ A, Unit]): Unit = js.native
    
    def get(): A = js.native
    
    def getError(): Error = js.native
    
    def getOrElse[B /* <: A */](a: B): A = js.native
    
    var isFailure: Boolean = js.native
    
    var isSuccess: Boolean = js.native
    
    def map[B](f: js.Function1[/* a */ A, B]): Try[B] = js.native
    
    def orElse[B /* <: A */](a: Try[B]): Try[A] = js.native
    
    def recover[B /* <: A */](f: js.Function1[/* e */ Error, Optional[Try[B]]]): Try[A] = js.native
    
    def toOptional(): Optional[A] = js.native
    
    def transform[B](fs: js.Function1[/* a */ A, Try[B]], ff: js.Function1[/* e */ Error, Try[B]]): Try[B] = js.native
  }
  object Try {
    
    @JSImport("scalike", "Try")
    @js.native
    def apply[A](f: js.Function0[A]): Try[A] = js.native
    
    @scala.inline
    implicit class TryMutableBuilder[Self <: Try[_], A] (val x: Self with Try[A]) extends AnyVal {
      
      @scala.inline
      def setApply1(value: (Try[js.Any], js.Function2[/* a */ A, js.Any, js.Any]) => Try[js.Any]): Self = StObject.set(x, "apply1", js.Any.fromFunction2(value))
      
      @scala.inline
      def setApply2(value: (Try[js.Any], Try[js.Any], js.Function3[/* a */ A, js.Any, js.Any, js.Any]) => Try[js.Any]): Self = StObject.set(x, "apply2", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChain(value: Try[js.Any] => TryBuilder1[A, js.Any]): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFailed(value: () => Try[A]): Self = StObject.set(x, "failed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFilter(value: js.Function1[/* a */ A, Boolean] => Try[A]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlatMap(value: js.Function1[/* a */ A, Try[js.Any]] => Try[js.Any]): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFold(value: (js.Function1[/* e */ Error, js.Any], js.Function1[/* a */ A, js.Any]) => js.Any): Self = StObject.set(x, "fold", js.Any.fromFunction2(value))
      
      @scala.inline
      def setForeach(value: js.Function1[/* a */ A, Unit] => Unit): Self = StObject.set(x, "foreach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: () => A): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetError(value: () => Error): Self = StObject.set(x, "getError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOrElse(value: js.Any => A): Self = StObject.set(x, "getOrElse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsFailure(value: Boolean): Self = StObject.set(x, "isFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSuccess(value: Boolean): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Function1[/* a */ A, js.Any] => Try[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrElse(value: Try[js.Any] => Try[A]): Self = StObject.set(x, "orElse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRecover(value: js.Function1[/* e */ Error, Optional[Try[js.Any]]] => Try[A]): Self = StObject.set(x, "recover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToOptional(value: () => Optional[A]): Self = StObject.set(x, "toOptional", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTransform(
        value: (js.Function1[/* a */ A, Try[js.Any]], js.Function1[/* e */ Error, Try[js.Any]]) => Try[js.Any]
      ): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    }
  }
  
  @JSImport("scalike", "TryBuilder1")
  @js.native
  class TryBuilder1[A, B] protected () extends StObject {
    def this(oa: Try[A], ob: Try[B]) = this()
    
    def chain[C](oc: Try[C]): TryBuilder2[A, B, C] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Try[C] = js.native
  }
  
  @JSImport("scalike", "TryBuilder2")
  @js.native
  class TryBuilder2[A, B, C] protected () extends StObject {
    def this(oa: Try[A], ob: Try[B], oc: Try[C]) = this()
    
    def chain[D](od: Try[D]): TryBuilder3[A, B, C, D] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Try[D] = js.native
  }
  
  @JSImport("scalike", "TryBuilder3")
  @js.native
  class TryBuilder3[A, B, C, D] protected () extends StObject {
    def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D]) = this()
    
    def chain[E](oe: Try[E]): TryBuilder4[A, B, C, D, E] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    var od: js.Any = js.native
    
    def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Try[E] = js.native
  }
  
  @JSImport("scalike", "TryBuilder4")
  @js.native
  class TryBuilder4[A, B, C, D, E] protected () extends StObject {
    def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D], oe: Try[E]) = this()
    
    def chain[F](of: Try[F]): TryBuilder5[A, B, C, D, E, F] = js.native
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    var od: js.Any = js.native
    
    var oe: js.Any = js.native
    
    def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Try[F] = js.native
  }
  
  @JSImport("scalike", "TryBuilder5")
  @js.native
  class TryBuilder5[A, B, C, D, E, F] protected () extends StObject {
    def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D], oe: Try[E], of: Try[F]) = this()
    
    var oa: js.Any = js.native
    
    var ob: js.Any = js.native
    
    var oc: js.Any = js.native
    
    var od: js.Any = js.native
    
    var oe: js.Any = js.native
    
    var of: js.Any = js.native
    
    def run[G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): Try[G] = js.native
  }
  
  @js.native
  trait Either[A, B] extends StObject {
    
    def fold[X](fa: js.Function1[/* a */ A, X], fb: js.Function1[/* b */ B, X]): X = js.native
    
    var isLeft: Boolean = js.native
    
    var isRight: Boolean = js.native
    
    def left(): LeftProjection[A, B] = js.native
    
    def right(): RightProjection[A, B] = js.native
    
    def swap(): Either[B, A] = js.native
    
    var value: A | B = js.native
  }
  object Either {
    
    @scala.inline
    def apply[A, B](
      fold: (js.Function1[/* a */ A, js.Any], js.Function1[/* b */ B, js.Any]) => js.Any,
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
    
    @scala.inline
    implicit class EitherMutableBuilder[Self <: Either[_, _], A, B] (val x: Self with (Either[A, B])) extends AnyVal {
      
      @scala.inline
      def setFold(value: (js.Function1[/* a */ A, js.Any], js.Function1[/* b */ B, js.Any]) => js.Any): Self = StObject.set(x, "fold", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsLeft(value: Boolean): Self = StObject.set(x, "isLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRight(value: Boolean): Self = StObject.set(x, "isRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: () => LeftProjection[A, B]): Self = StObject.set(x, "left", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRight(value: () => RightProjection[A, B]): Self = StObject.set(x, "right", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSwap(value: () => Either[B, A]): Self = StObject.set(x, "swap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValue(value: A | B): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
