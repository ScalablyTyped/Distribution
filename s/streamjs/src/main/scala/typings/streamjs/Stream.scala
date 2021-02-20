package typings.streamjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterator
import typings.std.Map
import typings.std.RegExp
import typings.streamjs.Stream.Accumulator
import typings.streamjs.Stream.Collector
import typings.streamjs.Stream.Comparator
import typings.streamjs.Stream.Consumer
import typings.streamjs.Stream.GroupingResult
import typings.streamjs.Stream.JoinOptions
import typings.streamjs.Stream.Optional
import typings.streamjs.Stream.Predicate
import typings.streamjs.Stream.Sample
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream[T] extends StObject {
  
  def allMatch(predicate: Predicate[T]): Boolean = js.native
  def allMatch(regexp: RegExp): Boolean = js.native
  def allMatch(sample: Sample): Boolean = js.native
  
  def anyMatch(predicate: Predicate[T]): Boolean = js.native
  def anyMatch(regexp: RegExp): Boolean = js.native
  def anyMatch(sample: Sample): Boolean = js.native
  
  def average(): Double = js.native
  def average(path: String): Double = js.native
  
  def avg(): Double = js.native
  def avg(path: String): Double = js.native
  
  def collect(collector: Collector[T]): T = js.native
  
  def count(): Double = js.native
  
  def distinct(): Stream[T] = js.native
  
  def dropWhile(predicate: Predicate[T]): Stream[T] = js.native
  def dropWhile(regexp: RegExp): Stream[String] = js.native
  def dropWhile(sample: Sample): Stream[T] = js.native
  
  def each(consumer: Consumer[T]): Unit = js.native
  
  def filter(predicate: Predicate[T]): Stream[T] = js.native
  def filter(regexp: RegExp): Stream[String] = js.native
  def filter(sample: Sample): Stream[T] = js.native
  
  def findAny(): Optional[T] = js.native
  
  def findFirst(): Optional[T] = js.native
  
  def flatMap[U](mapper: js.Function): Stream[U] = js.native
  
  def forEach(consumer: Consumer[T]): Unit = js.native
  
  def groupBy(mapper: js.Function): GroupingResult[T] = js.native
  def groupBy(path: String): GroupingResult[T] = js.native
  
  def groupingBy(mapper: js.Function): GroupingResult[T] = js.native
  def groupingBy(path: String): GroupingResult[T] = js.native
  
  def indexBy(keyMapper: js.Function): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ _
  ] = js.native
  def indexBy(keyMapper: js.Function, mergeFunction: Accumulator[T]): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ _
  ] = js.native
  
  def iterator(): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  
  def join(): String = js.native
  def join(delimiter: String): String = js.native
  def join(options: JoinOptions): String = js.native
  
  def joining(): String = js.native
  def joining(delimiter: String): String = js.native
  def joining(options: JoinOptions): String = js.native
  
  def limit(limit: Double): Stream[T] = js.native
  
  def map[U](mapper: js.Function): Stream[U] = js.native
  
  def max(): Optional[T] = js.native
  def max(comparator: Comparator[T]): Optional[T] = js.native
  def max(path: String): Optional[T] = js.native
  
  def min(): Optional[T] = js.native
  def min(comparator: Comparator[T]): Optional[T] = js.native
  def min(path: String): Optional[T] = js.native
  
  def noneMatch(predicate: js.Function1[/* elem */ T, Boolean]): Boolean = js.native
  def noneMatch(regexp: RegExp): Boolean = js.native
  
  def partitionBy(predicate: Predicate[T]): js.Array[js.Array[T]] = js.native
  def partitionBy(regexp: RegExp): js.Array[js.Array[T]] = js.native
  def partitionBy(sample: Sample): js.Array[js.Array[T]] = js.native
  def partitionBy(size: Double): js.Array[js.Array[T]] = js.native
  
  def partitioningBy(predicate: Predicate[T]): js.Array[js.Array[T]] = js.native
  def partitioningBy(regexp: RegExp): js.Array[js.Array[T]] = js.native
  def partitioningBy(sample: Sample): js.Array[js.Array[T]] = js.native
  def partitioningBy(size: Double): js.Array[js.Array[T]] = js.native
  
  def peek(consumer: Consumer[T]): Stream[T] = js.native
  
  def reduce(accumulator: Accumulator[T]): Optional[T] = js.native
  def reduce(identity: T, accumulator: Accumulator[T]): T = js.native
  
  def reverse(): Stream[T] = js.native
  
  def shuffle(): Stream[T] = js.native
  
  def size(): Double = js.native
  
  def skip(n: Double): Stream[T] = js.native
  
  def slice(begin: Double, end: Double): Stream[T] = js.native
  
  def sort(): Stream[T] = js.native
  def sort(comparator: Comparator[T]): Stream[T] = js.native
  def sort(path: String): Stream[T] = js.native
  
  def sorted(): Stream[T] = js.native
  def sorted(comparator: Comparator[T]): Stream[T] = js.native
  def sorted(path: String): Stream[T] = js.native
  
  def sum(): Double = js.native
  def sum(path: String): Double = js.native
  
  def takeWhile(predicate: Predicate[T]): Stream[T] = js.native
  def takeWhile(regexp: RegExp): Stream[String] = js.native
  def takeWhile(sample: Sample): Stream[T] = js.native
  
  def toArray(): js.Array[T] = js.native
  
  def toList(): js.Array[T] = js.native
  
  def toMap(keyMapper: js.Function): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ _
  ] = js.native
  def toMap(keyMapper: js.Function, mergeFunction: Accumulator[T]): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ _
  ] = js.native
  def toMap(path: String): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ _
  ] = js.native
  def toMap(path: String, mergeFunction: Accumulator[T]): Map[
    T, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ _
  ] = js.native
}
object Stream {
  
  type Accumulator[T] = js.Function2[/* e1 */ T, /* e2 */ T, T]
  
  @js.native
  trait Collector[T] extends StObject {
    
    def accumulator(e1: T, e2: T): T = js.native
    @JSName("accumulator")
    var accumulator_Original: Accumulator[T] = js.native
    
    def finisher(elem: T): T = js.native
    @JSName("finisher")
    var finisher_Original: Function[T, T] = js.native
    
    def supplier(): T = js.native
    @JSName("supplier")
    var supplier_Original: Supplier[T] = js.native
  }
  
  type Comparator[T] = js.Function2[/* e1 */ T, /* e2 */ T, Double]
  
  type Consumer[T] = js.Function1[/* elem */ T, Unit]
  
  type Function[T, U] = js.Function1[/* elem */ T, U]
  
  type GroupingResult[T] = StringDictionary[js.Array[T]]
  
  @js.native
  trait Iterator[T] extends StObject {
    
    var done: Boolean = js.native
    
    def next(): T = js.native
  }
  object Iterator {
    
    @scala.inline
    def apply[T](done: Boolean, next: () => T): typings.streamjs.Stream.Iterator[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[typings.streamjs.Stream.Iterator[T]]
    }
    
    @scala.inline
    implicit class IteratorMutableBuilder[Self <: typings.streamjs.Stream.Iterator[_], T] (val x: Self with typings.streamjs.Stream.Iterator[T]) extends AnyVal {
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: () => T): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait JoinOptions extends StObject {
    
    var delimiter: String = js.native
    
    var prefix: String = js.native
    
    var suffix: String = js.native
  }
  object JoinOptions {
    
    @scala.inline
    def apply(delimiter: String, prefix: String, suffix: String): JoinOptions = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinOptions]
    }
    
    @scala.inline
    implicit class JoinOptionsMutableBuilder[Self <: JoinOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
  
  type Map[T] = StringDictionary[T]
  
  @js.native
  trait Optional[T] extends StObject {
    
    def filter(predicate: js.Function1[/* elem */ T, Boolean]): Optional[T] = js.native
    
    def flatMap[U](mapper: js.Function1[/* elem */ T, Optional[U]]): Optional[U] = js.native
    
    def get(): T = js.native
    
    def ifPresent(consumer: js.Function1[/* elem */ T, Unit]): Unit = js.native
    
    def isPresent(): Boolean = js.native
    
    def map[U](mapper: js.Function1[/* elem */ T, U]): Optional[U] = js.native
    
    def orElse(other: T): T = js.native
    
    def orElseGet(supplier: Supplier[T]): T = js.native
    
    def orElseThrow(error: js.Any): T = js.native
  }
  object Optional {
    
    @scala.inline
    def apply[T](
      filter: js.Function1[/* elem */ T, Boolean] => Optional[T],
      flatMap: js.Function1[/* elem */ T, Optional[js.Any]] => Optional[js.Any],
      get: () => T,
      ifPresent: js.Function1[/* elem */ T, Unit] => Unit,
      isPresent: () => Boolean,
      map: js.Function1[/* elem */ T, js.Any] => Optional[js.Any],
      orElse: T => T,
      orElseGet: Supplier[T] => T,
      orElseThrow: js.Any => T
    ): Optional[T] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), get = js.Any.fromFunction0(get), ifPresent = js.Any.fromFunction1(ifPresent), isPresent = js.Any.fromFunction0(isPresent), map = js.Any.fromFunction1(map), orElse = js.Any.fromFunction1(orElse), orElseGet = js.Any.fromFunction1(orElseGet), orElseThrow = js.Any.fromFunction1(orElseThrow))
      __obj.asInstanceOf[Optional[T]]
    }
    
    @scala.inline
    implicit class OptionalMutableBuilder[Self <: Optional[_], T] (val x: Self with Optional[T]) extends AnyVal {
      
      @scala.inline
      def setFilter(value: js.Function1[/* elem */ T, Boolean] => Optional[T]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlatMap(value: js.Function1[/* elem */ T, Optional[js.Any]] => Optional[js.Any]): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIfPresent(value: js.Function1[/* elem */ T, Unit] => Unit): Self = StObject.set(x, "ifPresent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsPresent(value: () => Boolean): Self = StObject.set(x, "isPresent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMap(value: js.Function1[/* elem */ T, js.Any] => Optional[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrElse(value: T => T): Self = StObject.set(x, "orElse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrElseGet(value: Supplier[T] => T): Self = StObject.set(x, "orElseGet", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrElseThrow(value: js.Any => T): Self = StObject.set(x, "orElseThrow", js.Any.fromFunction1(value))
    }
  }
  
  type Predicate[T] = js.Function1[/* elem */ T, Boolean]
  
  type Sample = StringDictionary[js.Any]
  
  type Supplier[T] = js.Function0[T]
}
