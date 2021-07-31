package typings.reduxOrm

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.reduxOrm.anon.TypeofQuerySet
import typings.reduxOrm.databaseMod.Database
import typings.reduxOrm.databaseMod.QueryClause
import typings.reduxOrm.databaseMod.SchemaSpec
import typings.reduxOrm.fieldsMod.AttrCreator
import typings.reduxOrm.fieldsMod.AttributeOpts
import typings.reduxOrm.fieldsMod.AttributeWithDefault
import typings.reduxOrm.fieldsMod.FieldSpecMap
import typings.reduxOrm.fieldsMod.FkCreator
import typings.reduxOrm.fieldsMod.ManyCreator
import typings.reduxOrm.fieldsMod.OneToOneCreator
import typings.reduxOrm.fieldsMod.RelationalFieldOpts
import typings.reduxOrm.helpersMod.OptionalKeys
import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.modelMod.CreateProps
import typings.reduxOrm.modelMod.FieldSpecKeys
import typings.reduxOrm.modelMod.IdKeyOpt
import typings.reduxOrm.modelMod.IdType
import typings.reduxOrm.modelMod.ModelClass
import typings.reduxOrm.modelMod.ModelFieldMap
import typings.reduxOrm.modelMod.ModelFields
import typings.reduxOrm.modelMod.ModelType
import typings.reduxOrm.modelMod.Ref
import typings.reduxOrm.modelMod.SessionBoundModel
import typings.reduxOrm.modelMod.UpdateProps
import typings.reduxOrm.modelMod.UpsertProps
import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.ormMod.ORMOpts
import typings.reduxOrm.ormMod.OrmState
import typings.reduxOrm.querySetMod.QuerySet.LookupSpec
import typings.reduxOrm.querySetMod.QuerySet.SortIteratee
import typings.reduxOrm.querySetMod.QuerySet.SortOrder
import typings.reduxOrm.reduxMod.ORMReducer
import typings.reduxOrm.reduxMod.ORMSelector
import typings.reduxOrm.reduxMod.Selector
import typings.reduxOrm.reduxMod.defaultUpdater
import typings.reduxOrm.sessionMod.OrmSession
import typings.reduxOrm.tableMod.TableOpts
import typings.std.Extract
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-orm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-orm", JSImport.Default)
  @js.native
  class default[MClass /* <: Instantiable0[AnyModel] */, Fields /* <: ModelFieldMap */] protected ()
    extends typings.reduxOrm.modelMod.default[MClass, Fields] {
    /**
      * Creates a Model instance from it's properties.
      * Don't use this to create a new record; Use the static method {@link Model#create}.
      * @param props - the properties to instantiate with
      */
    def this(props: Fields) = this()
  }
  /* static members */
  object default {
    
    @JSImport("redux-orm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @see {@link QuerySet.all}
      */
    @scala.inline
    def all(): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    
    /**
      * @see {@link QuerySet.at}
      */
    @scala.inline
    def at(index: Double): js.UndefOr[SessionBoundModel[js.Any, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("at")(index.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SessionBoundModel[js.Any, js.Object]]]
    
    /**
      * @see {@link QuerySet.count}
      */
    @scala.inline
    def count(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Double]
    
    /**
      * Creates a new record in the database, instantiates a {@link Model} and returns it.
      *
      * If you pass values for many-to-many fields, instances are created on the through
      * model as well.
      *
      * @param  userProps - the new {@link Model}'s properties.
      * @return a new {@link SessionBoundModel} instance.
      */
    @scala.inline
    def create[M /* <: AnyModel */, TProps /* <: CreateProps[
        M, 
        ModelFields[M], 
        /* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelFields<M>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String, 
        FieldSpecKeys[M, AttributeWithDefault], 
        (/* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelFields<M>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String) | OptionalKeys[ModelFields[M]] | (FieldSpecKeys[M, AttributeWithDefault]) | IdKeyOpt[M]
      ] */](userProps: TProps): SessionBoundModel[M, TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(userProps.asInstanceOf[js.Any]).asInstanceOf[SessionBoundModel[M, TProps]]
    
    /**
      * @see {@link QuerySet.delete}
      */
    @scala.inline
    def delete(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[Unit]
    
    /**
      * @see {@link QuerySet.exclude}
      */
    @scala.inline
    def exclude(props: LookupSpec[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(props.asInstanceOf[js.Any]).asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    
    /**
      * Returns a boolean indicating if an entity
      * with the given props exists in the state.
      *
      * @param  props - a key-value that {@link Model} instances should have to be considered as existing.
      * @return a boolean indicating if entity with `props` exists in the state
      */
    @scala.inline
    def exists(props: Partial[Ref[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Model field descriptors.
      * @see {@link Attribute}
      * @see {@link OneToOne}
      * @see {@link ForeignKey}
      * @see {@link ManyToMany}
      */
    @JSImport("redux-orm", "default.fields")
    @js.native
    def fields: FieldSpecMap = js.native
    @scala.inline
    def fields_=(x: FieldSpecMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
    
    /**
      * @see {@link QuerySet.filter}
      */
    @scala.inline
    def filter(props: LookupSpec[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(props.asInstanceOf[js.Any]).asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    
    /**
      * @see {@link QuerySet.first}
      */
    @scala.inline
    def first(): js.UndefOr[SessionBoundModel[js.Any, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[js.UndefOr[SessionBoundModel[js.Any, js.Object]]]
    
    /**
      * Gets the {@link Model} instance that matches properties in `lookupObj`.
      * Throws an error if {@link Model} if multiple records match
      * the properties.
      *
      * @param  lookupObj - the properties used to match a single entity.
      * @throws {Error} If more than one entity matches the properties in `lookupObj`.
      * @return a {@link SessionBoundModel} instance that matches the properties in `lookupObj`.
      */
    @scala.inline
    def get[M /* <: AnyModel */](lookupObj: LookupSpec[M]): (SessionBoundModel[M, js.Object]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(lookupObj.asInstanceOf[js.Any]).asInstanceOf[(SessionBoundModel[M, js.Object]) | Null]
    
    /**
      * Returns an instance of the model's `querySetClass` field.
      * By default, this will be an empty {@link QuerySet}.
      *
      * @return An instance of the model's `querySetClass`.
      */
    @scala.inline
    def getQuerySet(): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuerySet")().asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    
    /**
      * The key of Model's identifier property
      */
    @JSImport("redux-orm", "default.idAttribute")
    @js.native
    val idAttribute: String = js.native
    
    /**
      * Returns a boolean indicating if an entity
      * with the id `id` exists in the state.
      *
      * @param   id - a value corresponding to the id attribute of the {@link Model} class.
      * @return a boolean indicating if entity with `id` exists in the state
      *
      * @since 0.11.0
      */
    @scala.inline
    def idExists(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("idExists")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def idExists(id: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("idExists")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * @see {@link QuerySet.last}
      */
    @scala.inline
    def last(): js.UndefOr[SessionBoundModel[js.Any, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[js.UndefOr[SessionBoundModel[js.Any, js.Object]]]
    
    /**
      * Manually mark individual instances as accessed.
      * This allows invalidating selector memoization within mutable sessions.
      *
      * @param ids - Array of primary key values
      */
    @scala.inline
    def markAccessed(ids: js.Array[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markAccessed")(ids.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Manually mark this model's table as scanned.
      * This allows invalidating selector memoization within mutable sessions.
      *
      */
    @scala.inline
    def markFullTableScanned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markFullTableScanned")().asInstanceOf[Unit]
    
    /**
      * A string constant identifying specific Model, necessary to retain the shape of state and relations through transpilation steps
      */
    @JSImport("redux-orm", "default.modelName")
    @js.native
    def modelName: String = js.native
    @scala.inline
    def modelName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modelName")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the options object passed to the database for the table that represents
      * this Model class.
      *
      * Returns an empty object by default, which means the database
      * will use default options. You can either override this function to return the options
      * you want to use, or assign the options object as a static property of the same name to the
      * Model class.
      *
      * @return the options object passed to the database for the table
      *                  representing this Model class.
      */
    @JSImport("redux-orm", "default.options")
    @js.native
    def options: js.Function0[TableOpts] | TableOpts = js.native
    @scala.inline
    def options_=(x: js.Function0[TableOpts] | TableOpts): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    /**
      * @see {@link QuerySet.orderBy}
      */
    @scala.inline
    def orderBy(
      iteratees: js.Array[SortIteratee[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]]
    ): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(iteratees.asInstanceOf[js.Any]).asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    @scala.inline
    def orderBy(
      iteratees: js.Array[SortIteratee[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]],
      orders: js.Array[SortOrder]
    ): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(iteratees.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    
    /**
      * @see {@link Model.getQuerySet}
      */
    @JSImport("redux-orm", "default.query")
    @js.native
    val query: typings.reduxOrm.querySetMod.default[js.Any, js.Object] = js.native
    
    /**
      * {@link QuerySet} class associated with this Model class.
      *
      * Defaults to base {@link QuerySet}
      */
    @JSImport("redux-orm", "default.querySetClass")
    @js.native
    def querySetClass: (Instantiable3[
        /* modelClass */ ModelClass[/* import warning: RewrittenClass.unapply cls was tparam M */ js.Any], 
        /* clauses */ js.Array[QueryClause[js.Object]], 
        /* opts */ js.UndefOr[js.Object], 
        typings.reduxOrm.querySetMod.default[AnyModel, js.Object]
      ]) & TypeofQuerySet = js.native
    @scala.inline
    def querySetClass_=(
      x: (Instantiable3[
          /* modelClass */ ModelClass[/* import warning: RewrittenClass.unapply cls was tparam M */ js.Any], 
          /* clauses */ js.Array[QueryClause[js.Object]], 
          /* opts */ js.UndefOr[js.Object], 
          typings.reduxOrm.querySetMod.default[AnyModel, js.Object]
        ]) & TypeofQuerySet
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("querySetClass")(x.asInstanceOf[js.Any])
    
    /**
      * Model specific reducer function.
      *
      * An alternative to standalone reducer function.
      *
      * @see {@link createReducer}
      *
      * @param action  - store-dispatched action instance
      * @param modelType - a {@link ModelType} parametrized with a
      *                      {@link Model} type that the reducer is being attached to.
      * @param session - an optional parameter, can be used for querying other Models (mutations are not supported)
      */
    @scala.inline
    def reducer(action: js.Any, modelType: ModelType[js.Any], session: OrmSession[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(action.asInstanceOf[js.Any], modelType.asInstanceOf[js.Any], session.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @see {@link QuerySet.update}
      */
    @scala.inline
    def update(props: UpdateProps[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Creates a new or update existing record in the database, instantiates a {@link Model} and returns it.
      *
      * If you pass values for many-to-many fields, instances are created on the through
      * model as well.
      *
      * @param  userProps - the upserted {@link Model}'s properties.
      * @return a {@link SessionBoundModel} instance.
      */
    @scala.inline
    def upsert[M /* <: AnyModel */, TProps /* <: UpsertProps[M] */](userProps: TProps): SessionBoundModel[M, TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("upsert")(userProps.asInstanceOf[js.Any]).asInstanceOf[SessionBoundModel[M, TProps]]
    
    /**
      * Returns a {@link Model} instance for the object with id `id`.
      * Returns `null` if the model has no instance with id `id`.
      *
      * You can use {@link Model#idExists} to check for existence instead.
      *
      * @param  id - the `id` of the object to get
      * @return a {@link SessionBoundModel} instance with id `id`
      */
    @scala.inline
    def withId[M /* <: AnyModel */](id: IdType[M]): (SessionBoundModel[M, js.Object]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("withId")(id.asInstanceOf[js.Any]).asInstanceOf[(SessionBoundModel[M, js.Object]) | Null]
  }
  
  @JSImport("redux-orm", "Attribute")
  @js.native
  class Attribute ()
    extends typings.reduxOrm.fieldsMod.Attribute {
    def this(opts: AttributeOpts) = this()
  }
  
  @JSImport("redux-orm", "ForeignKey")
  @js.native
  class ForeignKey protected ()
    extends typings.reduxOrm.fieldsMod.ForeignKey {
    def this(opts: RelationalFieldOpts) = this()
    def this(toModelName: String) = this()
    def this(toModelName: String, relatedName: String) = this()
  }
  
  @JSImport("redux-orm", "ManyToMany")
  @js.native
  class ManyToMany protected ()
    extends typings.reduxOrm.fieldsMod.ManyToMany {
    def this(opts: RelationalFieldOpts) = this()
    def this(toModelName: String) = this()
    def this(toModelName: String, relatedName: String) = this()
  }
  
  @JSImport("redux-orm", "Model")
  @js.native
  class Model[MClass /* <: Instantiable0[AnyModel] */, Fields /* <: ModelFieldMap */] protected ()
    extends typings.reduxOrm.modelMod.default[MClass, Fields] {
    /**
      * Creates a Model instance from it's properties.
      * Don't use this to create a new record; Use the static method {@link Model#create}.
      * @param props - the properties to instantiate with
      */
    def this(props: Fields) = this()
  }
  /* static members */
  object Model {
    
    @JSImport("redux-orm", "Model")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @see {@link QuerySet.all}
      */
    @scala.inline
    def all(): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    
    /**
      * @see {@link QuerySet.at}
      */
    @scala.inline
    def at(index: Double): js.UndefOr[SessionBoundModel[js.Any, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("at")(index.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SessionBoundModel[js.Any, js.Object]]]
    
    /**
      * @see {@link QuerySet.count}
      */
    @scala.inline
    def count(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Double]
    
    /**
      * Creates a new record in the database, instantiates a {@link Model} and returns it.
      *
      * If you pass values for many-to-many fields, instances are created on the through
      * model as well.
      *
      * @param  userProps - the new {@link Model}'s properties.
      * @return a new {@link SessionBoundModel} instance.
      */
    @scala.inline
    def create[M /* <: AnyModel */, TProps /* <: CreateProps[
        M, 
        ModelFields[M], 
        /* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelFields<M>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String, 
        FieldSpecKeys[M, AttributeWithDefault], 
        (/* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelFields<M>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String) | OptionalKeys[ModelFields[M]] | (FieldSpecKeys[M, AttributeWithDefault]) | IdKeyOpt[M]
      ] */](userProps: TProps): SessionBoundModel[M, TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(userProps.asInstanceOf[js.Any]).asInstanceOf[SessionBoundModel[M, TProps]]
    
    /**
      * @see {@link QuerySet.delete}
      */
    @scala.inline
    def delete(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[Unit]
    
    /**
      * @see {@link QuerySet.exclude}
      */
    @scala.inline
    def exclude(props: LookupSpec[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(props.asInstanceOf[js.Any]).asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    
    /**
      * Returns a boolean indicating if an entity
      * with the given props exists in the state.
      *
      * @param  props - a key-value that {@link Model} instances should have to be considered as existing.
      * @return a boolean indicating if entity with `props` exists in the state
      */
    @scala.inline
    def exists(props: Partial[Ref[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Model field descriptors.
      * @see {@link Attribute}
      * @see {@link OneToOne}
      * @see {@link ForeignKey}
      * @see {@link ManyToMany}
      */
    @JSImport("redux-orm", "Model.fields")
    @js.native
    def fields: FieldSpecMap = js.native
    @scala.inline
    def fields_=(x: FieldSpecMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
    
    /**
      * @see {@link QuerySet.filter}
      */
    @scala.inline
    def filter(props: LookupSpec[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(props.asInstanceOf[js.Any]).asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    
    /**
      * @see {@link QuerySet.first}
      */
    @scala.inline
    def first(): js.UndefOr[SessionBoundModel[js.Any, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[js.UndefOr[SessionBoundModel[js.Any, js.Object]]]
    
    /**
      * Gets the {@link Model} instance that matches properties in `lookupObj`.
      * Throws an error if {@link Model} if multiple records match
      * the properties.
      *
      * @param  lookupObj - the properties used to match a single entity.
      * @throws {Error} If more than one entity matches the properties in `lookupObj`.
      * @return a {@link SessionBoundModel} instance that matches the properties in `lookupObj`.
      */
    @scala.inline
    def get[M /* <: AnyModel */](lookupObj: LookupSpec[M]): (SessionBoundModel[M, js.Object]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(lookupObj.asInstanceOf[js.Any]).asInstanceOf[(SessionBoundModel[M, js.Object]) | Null]
    
    /**
      * Returns an instance of the model's `querySetClass` field.
      * By default, this will be an empty {@link QuerySet}.
      *
      * @return An instance of the model's `querySetClass`.
      */
    @scala.inline
    def getQuerySet(): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuerySet")().asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    
    /**
      * The key of Model's identifier property
      */
    @JSImport("redux-orm", "Model.idAttribute")
    @js.native
    val idAttribute: String = js.native
    
    /**
      * Returns a boolean indicating if an entity
      * with the id `id` exists in the state.
      *
      * @param   id - a value corresponding to the id attribute of the {@link Model} class.
      * @return a boolean indicating if entity with `id` exists in the state
      *
      * @since 0.11.0
      */
    @scala.inline
    def idExists(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("idExists")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def idExists(id: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("idExists")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * @see {@link QuerySet.last}
      */
    @scala.inline
    def last(): js.UndefOr[SessionBoundModel[js.Any, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[js.UndefOr[SessionBoundModel[js.Any, js.Object]]]
    
    /**
      * Manually mark individual instances as accessed.
      * This allows invalidating selector memoization within mutable sessions.
      *
      * @param ids - Array of primary key values
      */
    @scala.inline
    def markAccessed(ids: js.Array[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markAccessed")(ids.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Manually mark this model's table as scanned.
      * This allows invalidating selector memoization within mutable sessions.
      *
      */
    @scala.inline
    def markFullTableScanned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markFullTableScanned")().asInstanceOf[Unit]
    
    /**
      * A string constant identifying specific Model, necessary to retain the shape of state and relations through transpilation steps
      */
    @JSImport("redux-orm", "Model.modelName")
    @js.native
    def modelName: String = js.native
    @scala.inline
    def modelName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modelName")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the options object passed to the database for the table that represents
      * this Model class.
      *
      * Returns an empty object by default, which means the database
      * will use default options. You can either override this function to return the options
      * you want to use, or assign the options object as a static property of the same name to the
      * Model class.
      *
      * @return the options object passed to the database for the table
      *                  representing this Model class.
      */
    @JSImport("redux-orm", "Model.options")
    @js.native
    def options: js.Function0[TableOpts] | TableOpts = js.native
    @scala.inline
    def options_=(x: js.Function0[TableOpts] | TableOpts): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    /**
      * @see {@link QuerySet.orderBy}
      */
    @scala.inline
    def orderBy(
      iteratees: js.Array[SortIteratee[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]]
    ): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(iteratees.asInstanceOf[js.Any]).asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    @scala.inline
    def orderBy(
      iteratees: js.Array[SortIteratee[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]],
      orders: js.Array[SortOrder]
    ): typings.reduxOrm.querySetMod.default[js.Any, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(iteratees.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[typings.reduxOrm.querySetMod.default[js.Any, js.Object]]
    
    /**
      * @see {@link Model.getQuerySet}
      */
    @JSImport("redux-orm", "Model.query")
    @js.native
    val query: typings.reduxOrm.querySetMod.default[js.Any, js.Object] = js.native
    
    /**
      * {@link QuerySet} class associated with this Model class.
      *
      * Defaults to base {@link QuerySet}
      */
    @JSImport("redux-orm", "Model.querySetClass")
    @js.native
    def querySetClass: (Instantiable3[
        /* modelClass */ ModelClass[/* import warning: RewrittenClass.unapply cls was tparam M */ js.Any], 
        /* clauses */ js.Array[QueryClause[js.Object]], 
        /* opts */ js.UndefOr[js.Object], 
        typings.reduxOrm.querySetMod.default[AnyModel, js.Object]
      ]) & TypeofQuerySet = js.native
    @scala.inline
    def querySetClass_=(
      x: (Instantiable3[
          /* modelClass */ ModelClass[/* import warning: RewrittenClass.unapply cls was tparam M */ js.Any], 
          /* clauses */ js.Array[QueryClause[js.Object]], 
          /* opts */ js.UndefOr[js.Object], 
          typings.reduxOrm.querySetMod.default[AnyModel, js.Object]
        ]) & TypeofQuerySet
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("querySetClass")(x.asInstanceOf[js.Any])
    
    /**
      * Model specific reducer function.
      *
      * An alternative to standalone reducer function.
      *
      * @see {@link createReducer}
      *
      * @param action  - store-dispatched action instance
      * @param modelType - a {@link ModelType} parametrized with a
      *                      {@link Model} type that the reducer is being attached to.
      * @param session - an optional parameter, can be used for querying other Models (mutations are not supported)
      */
    @scala.inline
    def reducer(action: js.Any, modelType: ModelType[js.Any], session: OrmSession[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(action.asInstanceOf[js.Any], modelType.asInstanceOf[js.Any], session.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @see {@link QuerySet.update}
      */
    @scala.inline
    def update(props: UpdateProps[typings.reduxOrm.modelMod.Model[Instantiable0[AnyModel], js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Creates a new or update existing record in the database, instantiates a {@link Model} and returns it.
      *
      * If you pass values for many-to-many fields, instances are created on the through
      * model as well.
      *
      * @param  userProps - the upserted {@link Model}'s properties.
      * @return a {@link SessionBoundModel} instance.
      */
    @scala.inline
    def upsert[M /* <: AnyModel */, TProps /* <: UpsertProps[M] */](userProps: TProps): SessionBoundModel[M, TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("upsert")(userProps.asInstanceOf[js.Any]).asInstanceOf[SessionBoundModel[M, TProps]]
    
    /**
      * Returns a {@link Model} instance for the object with id `id`.
      * Returns `null` if the model has no instance with id `id`.
      *
      * You can use {@link Model#idExists} to check for existence instead.
      *
      * @param  id - the `id` of the object to get
      * @return a {@link SessionBoundModel} instance with id `id`
      */
    @scala.inline
    def withId[M /* <: AnyModel */](id: IdType[M]): (SessionBoundModel[M, js.Object]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("withId")(id.asInstanceOf[js.Any]).asInstanceOf[(SessionBoundModel[M, js.Object]) | Null]
  }
  
  @JSImport("redux-orm", "ORM")
  @js.native
  /**
    * Creates a new ORM instance.
    */
  class ORM[I /* <: IndexedModelClasses[
    js.Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */, ModelNames /* <: /* keyof I */ String */] ()
    extends typings.reduxOrm.ormMod.ORM[I, ModelNames] {
    def this(opts: ORMOpts) = this()
  }
  
  @JSImport("redux-orm", "OneToOne")
  @js.native
  class OneToOne_ protected ()
    extends typings.reduxOrm.fieldsMod.OneToOne_ {
    def this(opts: RelationalFieldOpts) = this()
    def this(toModelName: String) = this()
    def this(toModelName: String, relatedName: String) = this()
  }
  
  @JSImport("redux-orm", "QuerySet")
  @js.native
  class QuerySet[M /* <: AnyModel */, InstanceProps /* <: js.Object */] protected ()
    extends typings.reduxOrm.querySetMod.default[M, InstanceProps] {
    /**
      * Creates a `QuerySet`. The constructor is mainly for internal use;
      * Access QuerySet instances from {@link Model}.
      *
      * @param  modelClass - the {@link Model} class of objects in this QuerySet.
      * @param  clauses - query clauses needed to evaluate the set.
      * @param  [opts] - additional options
      */
    def this(modelClass: ModelClass[M], clauses: js.Array[QueryClause[js.Object]]) = this()
    def this(modelClass: ModelClass[M], clauses: js.Array[QueryClause[js.Object]], opts: js.Object) = this()
  }
  object QuerySet {
    
    @JSImport("redux-orm", "QuerySet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Register custom method on a `QuerySet` class specification.
      * QuerySet class may be attached to a {@link Model} class via {@link Model#querySetClass}
      *
      * @param methodName - name of a method to be available on specific QuerySet class instances
      *
      * @example:
      * class CustomQuerySet extends QuerySet<Book> {
      *     static currentYear = 2019
      *     unreleased(): QuerySet<Book> {
      *         return this.filter(book => book.releaseYear > CustomQuerySet.currentYear);
      *     }
      * }
      * CustomQuerySet.addSharedMethod('unreleased');
      * // assign specific QuerySet to a Model class
      * Book.querySetClass = typeof CustomQuerySet;
      * // register models
      * const schema = {Book };
      * const orm = new ORM<typeof schema>();
      * orm.register(Book);
      * const session = orm.session(orm.getEmptyState());
      * // use shared method
      * const unreleased = customQs.unreleased();
      */
    @scala.inline
    def addSharedMethod(methodName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSharedMethod")(methodName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("redux-orm", "attr")
  @js.native
  val attr: AttrCreator = js.native
  
  @scala.inline
  def createDatabase[I /* <: IndexedModelClasses[
    js.Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */](schemaSpec: SchemaSpec[I]): Database[
    I, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.createDatabase & TopLevel[I]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDatabase")(schemaSpec.asInstanceOf[js.Any]).asInstanceOf[Database[
    I, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.createDatabase & TopLevel[I]
  ]]
  
  @scala.inline
  def createReducer[I /* <: IndexedModelClasses[
    js.Object, 
    Extract[
      /* keyof {} */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: {}[keyof {}]['modelName'] */ js.Any
    ]
  ] */, TAction /* <: js.Any */](orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String]): ORMReducer[I, TAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReducer")(orm.asInstanceOf[js.Any]).asInstanceOf[ORMReducer[I, TAction]]
  @scala.inline
  def createReducer[I /* <: IndexedModelClasses[
    js.Object, 
    Extract[
      /* keyof {} */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: {}[keyof {}]['modelName'] */ js.Any
    ]
  ] */, TAction /* <: js.Any */](orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String], updater: defaultUpdater[I, TAction]): ORMReducer[I, TAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReducer")(orm.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[ORMReducer[I, TAction]]
  
  @scala.inline
  def createSelector[I, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormSelector: ORMSelector[I, js.Array[js.Any], R]
  ): Selector[OrmState[I], R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[OrmState[I], R]]
  @scala.inline
  def createSelector[S, I, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    ormSelector: ORMSelector[I, js.Array[js.Any], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  @scala.inline
  def createSelector[S, I, R1, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    ormSelector: ORMSelector[I, js.Array[R1], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  @scala.inline
  def createSelector[S, I, R1, R2, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    ormSelector: ORMSelector[I, js.Tuple2[R1, R2], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  @scala.inline
  def createSelector[S, I, R1, R2, R3, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    ormSelector: ORMSelector[I, js.Tuple3[R1, R2, R3], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  @scala.inline
  def createSelector[S, I, R1, R2, R3, R4, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    ormSelector: ORMSelector[I, js.Tuple4[R1, R2, R3, R4], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  @scala.inline
  def createSelector[S, I, R1, R2, R3, R4, R5, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    ormSelector: ORMSelector[I, js.Tuple5[R1, R2, R3, R4, R5], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  @scala.inline
  def createSelector[S, I, R1, R2, R3, R4, R5, R6, R](
    orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    ormStateSelector: Selector[S, OrmState[I]],
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    ormSelector: ORMSelector[I, js.Tuple6[R1, R2, R3, R4, R5, R6], R]
  ): Selector[S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelector")(orm.asInstanceOf[js.Any], ormStateSelector.asInstanceOf[js.Any], selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], ormSelector.asInstanceOf[js.Any])).asInstanceOf[Selector[S, R]]
  
  @JSImport("redux-orm", "fk")
  @js.native
  val fk: FkCreator = js.native
  
  @JSImport("redux-orm", "many")
  @js.native
  val many: ManyCreator = js.native
  
  @JSImport("redux-orm", "oneToOne")
  @js.native
  val oneToOne: OneToOneCreator = js.native
}
