package typings.rxLiteExperimental

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.rxCore.Rx.IPromise
import typings.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Rx")
@js.native
object Rx extends js.Object {
  
  @js.native
  trait Observable[T] extends js.Object {
    
    /**
      *  Repeats source as long as condition holds emulating a do while loop.
      * @param condition The condition which determines if the source will be repeated.
      * @returns An observable sequence which is repeated as long as the condition holds.
      */
    def doWhile(condition: js.Function0[Boolean]): Observable[T] = js.native
    
    /**
      *  Expands an observable sequence by recursively invoking selector.
      *
      * @param selector Selector function to invoke for each produced element, resulting in another sequence to which the selector will be invoked recursively again.
      * @param [scheduler] Scheduler on which to perform the expansion. If not provided, this defaults to the current thread scheduler.
      * @returns An observable sequence containing all the elements produced by the recursive expansion.
      */
    def expand(selector: js.Function1[/* item */ T, Observable[T]]): Observable[T] = js.native
    def expand(selector: js.Function1[/* item */ T, Observable[T]], scheduler: IScheduler): Observable[T] = js.native
    
    def forkJoin[TSecond, TResult](
      second: IPromise[TSecond],
      resultSelector: js.Function2[/* left */ T, /* right */ TSecond, TResult]
    ): Observable[TResult] = js.native
    /**
      *  Runs two observable sequences in parallel and combines their last elemenets.
      *
      * @param second Second observable sequence or promise.
      * @param resultSelector Result selector function to invoke with the last elements of both sequences.
      * @returns An observable sequence with the result of calling the selector function with the last elements of both input sequences.
      */
    def forkJoin[TSecond, TResult](
      second: Observable[TSecond],
      resultSelector: js.Function2[/* left */ T, /* right */ TSecond, TResult]
    ): Observable[TResult] = js.native
    
    /**
      *  Returns an observable sequence that is the result of invoking the selector on the source sequence, without sharing subscriptions.
      *  This operator allows for a fluent style of writing queries that use the same sequence multiple times.
      *
      * @param selector Selector function which can use the source sequence as many times as needed, without sharing subscriptions to the source sequence.
      * @returns An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
      */
    def let[TResult](selector: js.Function1[/* source */ Observable[T], Observable[TResult]]): Observable[TResult] = js.native
    
    /**
      *  Returns an observable sequence that is the result of invoking the selector on the source sequence, without sharing subscriptions.
      *  This operator allows for a fluent style of writing queries that use the same sequence multiple times.
      *
      * @param selector Selector function which can use the source sequence as many times as needed, without sharing subscriptions to the source sequence.
      * @returns An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
      */
    def letBind[TResult](selector: js.Function1[/* source */ Observable[T], Observable[TResult]]): Observable[TResult] = js.native
    
    /**
      * Comonadic bind operator.
      * @param selector A transform function to apply to each element.
      * @param [scheduler] Scheduler used to execute the operation. If not specified, defaults to the ImmediateScheduler.
      * @returns An observable sequence which results from the comonadic bind operation.
      */
    def manySelect[TResult](
      selector: js.Function3[/* item */ Observable[T], /* index */ Double, /* source */ Observable[T], TResult]
    ): Observable[TResult] = js.native
    def manySelect[TResult](
      selector: js.Function3[/* item */ Observable[T], /* index */ Double, /* source */ Observable[T], TResult],
      scheduler: IScheduler
    ): Observable[TResult] = js.native
  }
  
  @js.native
  trait ObservableStatic extends js.Object {
    
    /**
      *  Uses selector to determine which source in sources to use.
      *  There is an alias 'switchCase' for browsers <IE9.
      *
      * @example
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 });
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 }, scheduler);
      *
      * @param selector The function which extracts the value for to test in a case statement.
      * @param sources A object which has keys which correspond to the case statement labels.
      * @param scheduler Scheduler used to create Rx.Observabe.Empty.
      *
      * @returns An observable sequence which is determined by a case statement.
      */
    def `case`[T](selector: js.Function0[Double], sources: NumberDictionary[IPromise[T] | Observable[T]]): Observable[T] = js.native
    def `case`[T](
      selector: js.Function0[Double],
      sources: NumberDictionary[IPromise[T] | Observable[T]],
      elseSource: IPromise[T]
    ): Observable[T] = js.native
    /**
      *  Uses selector to determine which source in sources to use.
      *  There is an alias 'switchCase' for browsers <IE9.
      *
      * @example
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 }, obs0);
      * @param selector The function which extracts the value for to test in a case statement.
      * @param sources A object which has keys which correspond to the case statement labels.
      * @param elseSource The observable sequence or promise that will be run if the sources are not matched.
      *
      * @returns An observable sequence which is determined by a case statement.
      */
    def `case`[T](
      selector: js.Function0[Double],
      sources: NumberDictionary[IPromise[T] | Observable[T]],
      elseSource: Observable[T]
    ): Observable[T] = js.native
    def `case`[T](
      selector: js.Function0[Double],
      sources: NumberDictionary[IPromise[T] | Observable[T]],
      scheduler: IScheduler
    ): Observable[T] = js.native
    /**
      *  Uses selector to determine which source in sources to use.
      *  There is an alias 'switchCase' for browsers <IE9.
      *
      * @example
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 });
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 }, scheduler);
      *
      * @param selector The function which extracts the value for to test in a case statement.
      * @param sources A object which has keys which correspond to the case statement labels.
      * @param scheduler Scheduler used to create Rx.Observabe.Empty.
      *
      * @returns An observable sequence which is determined by a case statement.
      */
    def `case`[T](selector: js.Function0[String], sources: StringDictionary[IPromise[T] | Observable[T]]): Observable[T] = js.native
    def `case`[T](
      selector: js.Function0[String],
      sources: StringDictionary[IPromise[T] | Observable[T]],
      elseSource: IPromise[T]
    ): Observable[T] = js.native
    /**
      *  Uses selector to determine which source in sources to use.
      *  There is an alias 'switchCase' for browsers <IE9.
      *
      * @example
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 }, obs0);
      * @param selector The function which extracts the value for to test in a case statement.
      * @param sources A object which has keys which correspond to the case statement labels.
      * @param elseSource The observable sequence or promise that will be run if the sources are not matched.
      *
      * @returns An observable sequence which is determined by a case statement.
      */
    def `case`[T](
      selector: js.Function0[String],
      sources: StringDictionary[IPromise[T] | Observable[T]],
      elseSource: Observable[T]
    ): Observable[T] = js.native
    def `case`[T](
      selector: js.Function0[String],
      sources: StringDictionary[IPromise[T] | Observable[T]],
      scheduler: IScheduler
    ): Observable[T] = js.native
    
    /**
      *  Concatenates the observable sequences obtained by running the specified result selector for each element in source.
      * There is an alias for this method called 'forIn' for browsers <IE9
      * @param sources An array of values to turn into an observable sequence.
      * @param resultSelector A function to apply to each item in the sources array to turn it into an observable sequence.
      * @returns An observable sequence from the concatenated observable sequences.
      */
    def `for`[T, TResult](sources: js.Array[T], resultSelector: js.Function1[/* item */ T, Observable[TResult]]): Observable[TResult] = js.native
    
    /**
      *  Concatenates the observable sequences obtained by running the specified result selector for each element in source.
      * There is an alias for this method called 'forIn' for browsers <IE9
      * @param sources An array of values to turn into an observable sequence.
      * @param resultSelector A function to apply to each item in the sources array to turn it into an observable sequence.
      * @returns An observable sequence from the concatenated observable sequences.
      */
    def forIn[T, TResult](sources: js.Array[T], resultSelector: js.Function1[/* item */ T, Observable[TResult]]): Observable[TResult] = js.native
    
    /**
      *  Runs all observable sequences in parallel and collect their last elements.
      *
      * @example
      * res = Rx.Observable.forkJoin(obs1, obs2, ...);
      * @param args Source sequences or promises.
      * @returns An observable sequence with an array collecting the last elements of all the input sequences.
      */
    def forkJoin[T](args: (IPromise[T] | Observable[T])*): Observable[js.Array[T]] = js.native
    /**
      *  Runs all observable sequences in parallel and collect their last elements.
      *
      * @example
      * res = Rx.Observable.forkJoin([obs1, obs2]);
      * @param sources Array of source sequences or promises.
      * @returns An observable sequence with an array collecting the last elements of all the input sequences.
      */
    def forkJoin[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[js.Array[T]] = js.native
    
    def `if`[T](condition: js.Function0[Boolean], thenSource: IPromise[T]): Observable[T] = js.native
    def `if`[T](condition: js.Function0[Boolean], thenSource: IPromise[T], elseSource: IPromise[T]): Observable[T] = js.native
    def `if`[T](condition: js.Function0[Boolean], thenSource: IPromise[T], elseSource: Observable[T]): Observable[T] = js.native
    def `if`[T](condition: js.Function0[Boolean], thenSource: IPromise[T], scheduler: IScheduler): Observable[T] = js.native
    /**
      *  Determines whether an observable collection contains values. There is an alias for this method called 'ifThen' for browsers <IE9
      *
      * @example
      * res = Rx.Observable.if(condition, obs1, scheduler);
      * @param condition The condition which determines if the thenSource or empty sequence will be run.
      * @param thenSource The observable sequence or promise that will be run if the condition function returns true.
      * @param scheduler Scheduler used to create Rx.Observabe.Empty.
      * @returns An observable sequence which is either the thenSource or empty sequence.
      */
    def `if`[T](condition: js.Function0[Boolean], thenSource: Observable[T]): Observable[T] = js.native
    def `if`[T](condition: js.Function0[Boolean], thenSource: Observable[T], elseSource: IPromise[T]): Observable[T] = js.native
    /**
      *  Determines whether an observable collection contains values. There is an alias for this method called 'ifThen' for browsers <IE9
      *
      * @example
      * res = Rx.Observable.if(condition, obs1, obs2);
      * @param condition The condition which determines if the thenSource or elseSource will be run.
      * @param thenSource The observable sequence or promise that will be run if the condition function returns true.
      * @param elseSource The observable sequence or promise that will be run if the condition function returns false.
      * @returns An observable sequence which is either the thenSource or elseSource.
      */
    def `if`[T](condition: js.Function0[Boolean], thenSource: Observable[T], elseSource: Observable[T]): Observable[T] = js.native
    def `if`[T](condition: js.Function0[Boolean], thenSource: Observable[T], scheduler: IScheduler): Observable[T] = js.native
    
    def ifThen[T](condition: js.Function0[Boolean], thenSource: IPromise[T]): Observable[T] = js.native
    def ifThen[T](condition: js.Function0[Boolean], thenSource: IPromise[T], elseSource: IPromise[T]): Observable[T] = js.native
    def ifThen[T](condition: js.Function0[Boolean], thenSource: IPromise[T], elseSource: Observable[T]): Observable[T] = js.native
    def ifThen[T](condition: js.Function0[Boolean], thenSource: IPromise[T], scheduler: IScheduler): Observable[T] = js.native
    /**
      *  Determines whether an observable collection contains values. There is an alias for this method called 'ifThen' for browsers <IE9
      *
      * @example
      * res = Rx.Observable.if(condition, obs1, scheduler);
      * @param condition The condition which determines if the thenSource or empty sequence will be run.
      * @param thenSource The observable sequence or promise that will be run if the condition function returns true.
      * @param scheduler Scheduler used to create Rx.Observabe.Empty.
      * @returns An observable sequence which is either the thenSource or empty sequence.
      */
    def ifThen[T](condition: js.Function0[Boolean], thenSource: Observable[T]): Observable[T] = js.native
    def ifThen[T](condition: js.Function0[Boolean], thenSource: Observable[T], elseSource: IPromise[T]): Observable[T] = js.native
    /**
      *  Determines whether an observable collection contains values. There is an alias for this method called 'ifThen' for browsers <IE9
      *
      * @example
      * res = Rx.Observable.if(condition, obs1, obs2);
      * @param condition The condition which determines if the thenSource or elseSource will be run.
      * @param thenSource The observable sequence or promise that will be run if the condition function returns true.
      * @param elseSource The observable sequence or promise that will be run if the condition function returns false.
      * @returns An observable sequence which is either the thenSource or elseSource.
      */
    def ifThen[T](condition: js.Function0[Boolean], thenSource: Observable[T], elseSource: Observable[T]): Observable[T] = js.native
    def ifThen[T](condition: js.Function0[Boolean], thenSource: Observable[T], scheduler: IScheduler): Observable[T] = js.native
    
    /**
      *  Uses selector to determine which source in sources to use.
      *  There is an alias 'switchCase' for browsers <IE9.
      *
      * @example
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 });
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 }, scheduler);
      *
      * @param selector The function which extracts the value for to test in a case statement.
      * @param sources A object which has keys which correspond to the case statement labels.
      * @param scheduler Scheduler used to create Rx.Observabe.Empty.
      *
      * @returns An observable sequence which is determined by a case statement.
      */
    def switchCase[T](selector: js.Function0[Double], sources: NumberDictionary[IPromise[T] | Observable[T]]): Observable[T] = js.native
    def switchCase[T](
      selector: js.Function0[Double],
      sources: NumberDictionary[IPromise[T] | Observable[T]],
      elseSource: IPromise[T]
    ): Observable[T] = js.native
    /**
      *  Uses selector to determine which source in sources to use.
      *  There is an alias 'switchCase' for browsers <IE9.
      *
      * @example
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 }, obs0);
      * @param selector The function which extracts the value for to test in a case statement.
      * @param sources A object which has keys which correspond to the case statement labels.
      * @param elseSource The observable sequence or promise that will be run if the sources are not matched.
      *
      * @returns An observable sequence which is determined by a case statement.
      */
    def switchCase[T](
      selector: js.Function0[Double],
      sources: NumberDictionary[IPromise[T] | Observable[T]],
      elseSource: Observable[T]
    ): Observable[T] = js.native
    def switchCase[T](
      selector: js.Function0[Double],
      sources: NumberDictionary[IPromise[T] | Observable[T]],
      scheduler: IScheduler
    ): Observable[T] = js.native
    /**
      *  Uses selector to determine which source in sources to use.
      *  There is an alias 'switchCase' for browsers <IE9.
      *
      * @example
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 });
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 }, scheduler);
      *
      * @param selector The function which extracts the value for to test in a case statement.
      * @param sources A object which has keys which correspond to the case statement labels.
      * @param scheduler Scheduler used to create Rx.Observabe.Empty.
      *
      * @returns An observable sequence which is determined by a case statement.
      */
    def switchCase[T](selector: js.Function0[String], sources: StringDictionary[IPromise[T] | Observable[T]]): Observable[T] = js.native
    def switchCase[T](
      selector: js.Function0[String],
      sources: StringDictionary[IPromise[T] | Observable[T]],
      elseSource: IPromise[T]
    ): Observable[T] = js.native
    /**
      *  Uses selector to determine which source in sources to use.
      *  There is an alias 'switchCase' for browsers <IE9.
      *
      * @example
      *  res = Rx.Observable.case(selector, { '1': obs1, '2': obs2 }, obs0);
      * @param selector The function which extracts the value for to test in a case statement.
      * @param sources A object which has keys which correspond to the case statement labels.
      * @param elseSource The observable sequence or promise that will be run if the sources are not matched.
      *
      * @returns An observable sequence which is determined by a case statement.
      */
    def switchCase[T](
      selector: js.Function0[String],
      sources: StringDictionary[IPromise[T] | Observable[T]],
      elseSource: Observable[T]
    ): Observable[T] = js.native
    def switchCase[T](
      selector: js.Function0[String],
      sources: StringDictionary[IPromise[T] | Observable[T]],
      scheduler: IScheduler
    ): Observable[T] = js.native
    
    def `while`[T](condition: js.Function0[Boolean], source: IPromise[T]): Observable[T] = js.native
    /**
      *  Repeats source as long as condition holds emulating a while loop.
      * There is an alias for this method called 'whileDo' for browsers <IE9
      * @param condition The condition which determines if the source will be repeated.
      * @param source The observable sequence or promise that will be run if the condition function returns true.
      * @returns An observable sequence which is repeated as long as the condition holds.
      */
    def `while`[T](condition: js.Function0[Boolean], source: Observable[T]): Observable[T] = js.native
    
    def whileDo[T](condition: js.Function0[Boolean], source: IPromise[T]): Observable[T] = js.native
    /**
      *  Repeats source as long as condition holds emulating a while loop.
      * There is an alias for this method called 'whileDo' for browsers <IE9
      * @param condition The condition which determines if the source will be repeated.
      * @param source The observable sequence or promise that will be run if the condition function returns true.
      * @returns An observable sequence which is repeated as long as the condition holds.
      */
    def whileDo[T](condition: js.Function0[Boolean], source: Observable[T]): Observable[T] = js.native
  }
}
