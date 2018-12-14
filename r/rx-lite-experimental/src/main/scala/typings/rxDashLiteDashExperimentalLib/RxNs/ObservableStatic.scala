package typings
package rxDashLiteDashExperimentalLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def `case`[T](
    selector: js.Function0[scala.Double],
    sources: org.scalablytyped.runtime.NumberDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]]
  ): Observable[T] = js.native
  def `case`[T](
    selector: js.Function0[scala.Double],
    sources: org.scalablytyped.runtime.NumberDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    elseSource: rxDashCoreLib.RxNs.IPromise[T]
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
    selector: js.Function0[scala.Double],
    sources: org.scalablytyped.runtime.NumberDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    elseSource: Observable[T]
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
  def `case`[T](
    selector: js.Function0[scala.Double],
    sources: org.scalablytyped.runtime.NumberDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    scheduler: rxDashCoreLib.RxNs.IScheduler
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
  def `case`[T](
    selector: js.Function0[java.lang.String],
    sources: org.scalablytyped.runtime.StringDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]]
  ): Observable[T] = js.native
  def `case`[T](
    selector: js.Function0[java.lang.String],
    sources: org.scalablytyped.runtime.StringDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    elseSource: rxDashCoreLib.RxNs.IPromise[T]
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
    selector: js.Function0[java.lang.String],
    sources: org.scalablytyped.runtime.StringDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    elseSource: Observable[T]
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
  def `case`[T](
    selector: js.Function0[java.lang.String],
    sources: org.scalablytyped.runtime.StringDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    scheduler: rxDashCoreLib.RxNs.IScheduler
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
  def forkJoin[T](args: (rxDashCoreLib.RxNs.IPromise[T] | Observable[T])*): Observable[js.Array[T]] = js.native
  /**
           *  Runs all observable sequences in parallel and collect their last elements.
           *
           * @example
           * res = Rx.Observable.forkJoin([obs1, obs2]);
           * @param sources Array of source sequences or promises.
           * @returns An observable sequence with an array collecting the last elements of all the input sequences.
           */
  def forkJoin[T](sources: js.Array[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]]): Observable[js.Array[T]] = js.native
  def `if`[T](condition: js.Function0[scala.Boolean], thenSource: rxDashCoreLib.RxNs.IPromise[T]): Observable[T] = js.native
  def `if`[T](
    condition: js.Function0[scala.Boolean],
    thenSource: rxDashCoreLib.RxNs.IPromise[T],
    elseSource: rxDashCoreLib.RxNs.IPromise[T]
  ): Observable[T] = js.native
  def `if`[T](
    condition: js.Function0[scala.Boolean],
    thenSource: rxDashCoreLib.RxNs.IPromise[T],
    elseSource: Observable[T]
  ): Observable[T] = js.native
  def `if`[T](
    condition: js.Function0[scala.Boolean],
    thenSource: rxDashCoreLib.RxNs.IPromise[T],
    scheduler: rxDashCoreLib.RxNs.IScheduler
  ): Observable[T] = js.native
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
  def `if`[T](condition: js.Function0[scala.Boolean], thenSource: Observable[T]): Observable[T] = js.native
  def `if`[T](
    condition: js.Function0[scala.Boolean],
    thenSource: Observable[T],
    elseSource: rxDashCoreLib.RxNs.IPromise[T]
  ): Observable[T] = js.native
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
  def `if`[T](condition: js.Function0[scala.Boolean], thenSource: Observable[T], elseSource: Observable[T]): Observable[T] = js.native
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
  def `if`[T](
    condition: js.Function0[scala.Boolean],
    thenSource: Observable[T],
    scheduler: rxDashCoreLib.RxNs.IScheduler
  ): Observable[T] = js.native
  def ifThen[T](condition: js.Function0[scala.Boolean], thenSource: rxDashCoreLib.RxNs.IPromise[T]): Observable[T] = js.native
  def ifThen[T](
    condition: js.Function0[scala.Boolean],
    thenSource: rxDashCoreLib.RxNs.IPromise[T],
    elseSource: rxDashCoreLib.RxNs.IPromise[T]
  ): Observable[T] = js.native
  def ifThen[T](
    condition: js.Function0[scala.Boolean],
    thenSource: rxDashCoreLib.RxNs.IPromise[T],
    elseSource: Observable[T]
  ): Observable[T] = js.native
  def ifThen[T](
    condition: js.Function0[scala.Boolean],
    thenSource: rxDashCoreLib.RxNs.IPromise[T],
    scheduler: rxDashCoreLib.RxNs.IScheduler
  ): Observable[T] = js.native
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
  def ifThen[T](condition: js.Function0[scala.Boolean], thenSource: Observable[T]): Observable[T] = js.native
  def ifThen[T](
    condition: js.Function0[scala.Boolean],
    thenSource: Observable[T],
    elseSource: rxDashCoreLib.RxNs.IPromise[T]
  ): Observable[T] = js.native
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
  def ifThen[T](condition: js.Function0[scala.Boolean], thenSource: Observable[T], elseSource: Observable[T]): Observable[T] = js.native
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
  def ifThen[T](
    condition: js.Function0[scala.Boolean],
    thenSource: Observable[T],
    scheduler: rxDashCoreLib.RxNs.IScheduler
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
  def switchCase[T](
    selector: js.Function0[scala.Double],
    sources: org.scalablytyped.runtime.NumberDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]]
  ): Observable[T] = js.native
  def switchCase[T](
    selector: js.Function0[scala.Double],
    sources: org.scalablytyped.runtime.NumberDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    elseSource: rxDashCoreLib.RxNs.IPromise[T]
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
    selector: js.Function0[scala.Double],
    sources: org.scalablytyped.runtime.NumberDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    elseSource: Observable[T]
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
  def switchCase[T](
    selector: js.Function0[scala.Double],
    sources: org.scalablytyped.runtime.NumberDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    scheduler: rxDashCoreLib.RxNs.IScheduler
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
  def switchCase[T](
    selector: js.Function0[java.lang.String],
    sources: org.scalablytyped.runtime.StringDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]]
  ): Observable[T] = js.native
  def switchCase[T](
    selector: js.Function0[java.lang.String],
    sources: org.scalablytyped.runtime.StringDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    elseSource: rxDashCoreLib.RxNs.IPromise[T]
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
    selector: js.Function0[java.lang.String],
    sources: org.scalablytyped.runtime.StringDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    elseSource: Observable[T]
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
  def switchCase[T](
    selector: js.Function0[java.lang.String],
    sources: org.scalablytyped.runtime.StringDictionary[rxDashCoreLib.RxNs.IPromise[T] | Observable[T]],
    scheduler: rxDashCoreLib.RxNs.IScheduler
  ): Observable[T] = js.native
  def `while`[T](condition: js.Function0[scala.Boolean], source: rxDashCoreLib.RxNs.IPromise[T]): Observable[T] = js.native
  /**
           *  Repeats source as long as condition holds emulating a while loop.
           * There is an alias for this method called 'whileDo' for browsers <IE9
           * @param condition The condition which determines if the source will be repeated.
           * @param source The observable sequence or promise that will be run if the condition function returns true.
           * @returns An observable sequence which is repeated as long as the condition holds.
           */
  def `while`[T](condition: js.Function0[scala.Boolean], source: Observable[T]): Observable[T] = js.native
  def whileDo[T](condition: js.Function0[scala.Boolean], source: rxDashCoreLib.RxNs.IPromise[T]): Observable[T] = js.native
  /**
           *  Repeats source as long as condition holds emulating a while loop.
           * There is an alias for this method called 'whileDo' for browsers <IE9
           * @param condition The condition which determines if the source will be repeated.
           * @param source The observable sequence or promise that will be run if the condition function returns true.
           * @returns An observable sequence which is repeated as long as the condition holds.
           */
  def whileDo[T](condition: js.Function0[scala.Boolean], source: Observable[T]): Observable[T] = js.native
}

