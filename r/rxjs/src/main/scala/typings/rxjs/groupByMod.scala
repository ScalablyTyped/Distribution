package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.internalTypesMod.SubjectLike
import typings.rxjs.rxjsBooleans.`false`
import typings.rxjs.rxjsBooleans.`true`
import typings.rxjs.subjectMod.Subject
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupByMod {
  
  @JSImport("rxjs/dist/types/internal/operators/groupBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def groupBy[T, K /* <: T */](key: js.Function1[/* value */ T, /* is K */ Boolean]): OperatorFunction[T, GroupedObservable[`true` | `false`, (Exclude[T, K]) | K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[`true` | `false`, (Exclude[T, K]) | K]]]
  inline def groupBy[T, K](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: js.Function1[/* grouped */ GroupedObservable[K, T], Observable[Any]]
  ): OperatorFunction[T, GroupedObservable[K, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  inline def groupBy[T, K](key: js.Function1[/* value */ T, K], options: BasicGroupByOptions[K, T]): OperatorFunction[T, GroupedObservable[K, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  inline def groupBy[T, K, R](key: js.Function1[/* value */ T, K], element: js.Function1[/* value */ T, R]): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: js.Function1[/* value */ T, R],
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: js.Function1[/* value */ T, R],
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]],
    connector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: js.Function1[/* value */ T, R],
    duration: Unit,
    connector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]],
    connector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: Unit,
    connector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, E](key: js.Function1[/* value */ T, K], options: GroupByOptionsWithElement[K, E, T]): OperatorFunction[T, GroupedObservable[K, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, E]]]
  
  inline def groupBy_TK[T, K](key: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  
  inline def groupBy_TKR[T, K, R](key: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy_TKR[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  
  trait BasicGroupByOptions[K, T] extends StObject {
    
    var connector: js.UndefOr[js.Function0[SubjectLike[T]]] = js.undefined
    
    var duration: js.UndefOr[js.Function1[/* grouped */ GroupedObservable[K, T], ObservableInput[Any]]] = js.undefined
    
    var element: Unit
  }
  object BasicGroupByOptions {
    
    inline def apply[K, T](element: Unit): BasicGroupByOptions[K, T] = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicGroupByOptions[K, T]]
    }
    
    extension [Self <: BasicGroupByOptions[?, ?], K, T](x: Self & (BasicGroupByOptions[K, T])) {
      
      inline def setConnector(value: () => SubjectLike[T]): Self = StObject.set(x, "connector", js.Any.fromFunction0(value))
      
      inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
      
      inline def setDuration(value: /* grouped */ GroupedObservable[K, T] => ObservableInput[Any]): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setElement(value: Unit): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  trait GroupByOptionsWithElement[K, E, T] extends StObject {
    
    var connector: js.UndefOr[js.Function0[SubjectLike[E]]] = js.undefined
    
    var duration: js.UndefOr[js.Function1[/* grouped */ GroupedObservable[K, E], ObservableInput[Any]]] = js.undefined
    
    def element(value: T): E
  }
  object GroupByOptionsWithElement {
    
    inline def apply[K, E, T](element: T => E): GroupByOptionsWithElement[K, E, T] = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction1(element))
      __obj.asInstanceOf[GroupByOptionsWithElement[K, E, T]]
    }
    
    extension [Self <: GroupByOptionsWithElement[?, ?, ?], K, E, T](x: Self & (GroupByOptionsWithElement[K, E, T])) {
      
      inline def setConnector(value: () => SubjectLike[E]): Self = StObject.set(x, "connector", js.Any.fromFunction0(value))
      
      inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
      
      inline def setDuration(value: /* grouped */ GroupedObservable[K, E] => ObservableInput[Any]): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setElement(value: T => E): Self = StObject.set(x, "element", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GroupedObservable[K, T] extends Observable[T] {
    
    /**
      * The key value for the grouped notifications.
      */
    val key: K = js.native
  }
}
