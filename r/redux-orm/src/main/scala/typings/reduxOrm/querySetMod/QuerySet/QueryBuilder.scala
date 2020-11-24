package typings.reduxOrm.querySetMod.QuerySet

import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.modelMod.SessionBoundModel
import typings.reduxOrm.modelMod.UpdateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for building queries in fluent style
  */
@js.native
trait QueryBuilder[M /* <: AnyModel */, InstanceProps /* <: js.Object */] extends js.Object {
  
  /**
    * Returns a new {@link QuerySet} instance with the same entities.
    * @return a new QuerySet with the same entities.
    */
  def all(): typings.reduxOrm.querySetMod.QuerySet[M, InstanceProps] = js.native
  
  /**
    * Returns the {@link SessionBoundModel} instance at index `index` in the {@link QuerySet} instance if
    * `withRefs` flag is set to `false`, or a reference to the plain JavaScript
    * object in the model state if `true`.
    *
    * @param  index - index of the model instance to get
    * @return a {@link Model} derived {@link SessionBoundModel} instance at index
    *                           `index` in the {@link QuerySet} instance,
    *                           or undefined if the index is out of bounds.
    */
  def at(index: Double): js.UndefOr[SessionBoundModel[M, InstanceProps]] = js.native
  
  /**
    * Returns the number of {@link Model} instances represented by the QuerySet.
    *
    * @return length of the QuerySet
    */
  def count(): Double = js.native
  
  /**
    * Records a deletion of all the objects in this {@link QuerySet} instance.
    */
  def delete(): Unit = js.native
  
  /**
    * Returns a new {@link QuerySet} instance with entities that do not match properties in `lookupObj`.
    *
    * @param  lookupObj - the properties to match objects with ({@link LookupProps}).
    * Can also be a function ({@link LookupPredicate}).
    *
    * @return a new {@link QuerySet} instance with objects that passed the filter.
    */
  def exclude(lookupObj: LookupSpec[M]): typings.reduxOrm.querySetMod.QuerySet[M, InstanceProps] = js.native
  
  /**
    * Returns a new {@link QuerySet} instance with entities that match properties in `lookupObj`.
    *
    * @param  lookupObj - the properties to match objects with ({@link LookupProps}).
    * Can also be a function ({@link LookupPredicate}).
    *
    * @return a new {@link QuerySet} instance with objects that passed the filter.
    */
  def filter(lookupObj: LookupSpec[M]): typings.reduxOrm.querySetMod.QuerySet[M, InstanceProps] = js.native
  
  /**
    * Returns the session bound {@link Model} instance at index 0
    * in the {@link QuerySet} instance or undefined if the instance is empty.
    *
    *  @return a {@link Model} derived {@link SessionBoundModel} instance or undefined.
    */
  def first(): js.UndefOr[SessionBoundModel[M, InstanceProps]] = js.native
  
  /**
    * Returns the session bound {@link Model} instance at index `QuerySet.count() - 1`
    * in the {@link QuerySet} instance or undefined if the instance is empty.
    *
    *  @return a {@link Model} derived {@link SessionBoundModel} instance or undefined.
    */
  def last(): js.UndefOr[SessionBoundModel[M, InstanceProps]] = js.native
  
  def orderBy(iteratees: js.Array[SortIteratee[M]]): typings.reduxOrm.querySetMod.QuerySet[M, InstanceProps] = js.native
  def orderBy(iteratees: js.Array[SortIteratee[M]], orders: js.Array[SortOrder]): typings.reduxOrm.querySetMod.QuerySet[M, InstanceProps] = js.native
  def orderBy(iteratees: js.Array[SortIteratee[M]], orders: SortOrder): typings.reduxOrm.querySetMod.QuerySet[M, InstanceProps] = js.native
  /**
    * Returns a new {@link QuerySet} instance with entities ordered by `iteratees` in ascending
    * order, unless otherwise specified. Delegates to `lodash.orderBy`.
    *
    * @param  iteratees - an array or a single {@link SortIteratee} where each item can be a string or a
    *                                           function. If a string is supplied, it should
    *                                           correspond to property on the entity that will
    *                                           determine the order. If a function is supplied,
    *                                           it should return the value to order by.
    *
    * @param [orders] - the sort orders of `iteratees`. If unspecified, all iteratees
    *                               will be sorted in ascending order. `true` and `'asc'`
    *                               correspond to ascending order, and `false` and `'desc`
    *                               to descending order. Accepts an array or a single {@link SortOrder}.
    *
    * @return a new {@link QuerySet} with objects ordered by `iteratees`.
    */
  def orderBy(iteratees: SortIteratee[M]): typings.reduxOrm.querySetMod.QuerySet[M, InstanceProps] = js.native
  def orderBy(iteratees: SortIteratee[M], orders: js.Array[SortOrder]): typings.reduxOrm.querySetMod.QuerySet[M, InstanceProps] = js.native
  def orderBy(iteratees: SortIteratee[M], orders: SortOrder): typings.reduxOrm.querySetMod.QuerySet[M, InstanceProps] = js.native
  
  /**
    * Records an update specified with `mergeObj` to all the objects
    * in the {@link QuerySet} instance.
    *
    * @param  mergeObj - an object extending {@link UpdateProps}, to be merged with all the objects in this QuerySet.
    */
  def update(mergeObj: UpdateProps[M]): Unit = js.native
}
