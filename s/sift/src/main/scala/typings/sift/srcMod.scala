package typings.sift

import typings.sift.anon.PartialOptionsCompare
import typings.sift.libCoreMod.QueryOperation
import typings.sift.libUtilsMod.Key
import typings.sift.srcCoreMod.NopeOperation
import typings.sift.srcCoreMod.Operation
import typings.sift.srcCoreMod.Options
import typings.sift.srcCoreMod.Query
import typings.sift.srcOperationsMod.$All
import typings.sift.srcOperationsMod.$And
import typings.sift.srcOperationsMod.$ElemMatch
import typings.sift.srcOperationsMod.$Exists
import typings.sift.srcOperationsMod.$In
import typings.sift.srcOperationsMod.$Ne
import typings.sift.srcOperationsMod.$Nin
import typings.sift.srcOperationsMod.$Nor
import typings.sift.srcOperationsMod.$Not
import typings.sift.srcOperationsMod.$Or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("sift/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TItem, TSchema /* <: TItem */](query: Query[TSchema]): js.Function3[/* item */ Any, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* item */ Any, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean]]
  inline def default[TItem, TSchema /* <: TItem */](query: Query[TSchema], options: PartialOptionsCompare): js.Function3[/* item */ Any, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* item */ Any, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean]]
  
  @JSImport("sift/src", "$Size")
  @js.native
  open class $Size protected ()
    extends typings.sift.srcOperationsMod.$Size {
    def this(params: Any, owneryQuery: Any, options: Options) = this()
    def this(params: Any, owneryQuery: Any, options: Options, name: String) = this()
  }
  
  @JSImport("sift/src", "EqualsOperation")
  @js.native
  open class EqualsOperation[TParam] protected ()
    extends typings.sift.srcCoreMod.EqualsOperation[TParam] {
    def this(params: TParam, owneryQuery: Any, options: Options) = this()
    def this(params: TParam, owneryQuery: Any, options: Options, name: String) = this()
  }
  
  inline def all(params: js.Array[Query[Any]], ownerQuery: Query[Any], options: Options, name: String): $All = (^.asInstanceOf[js.Dynamic].applyDynamic("$all")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$All]
  
  inline def and(params: js.Array[Query[Any]], ownerQuery: Query[Any], options: Options, name: String): $And = (^.asInstanceOf[js.Dynamic].applyDynamic("$and")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$And]
  
  inline def createDefaultQueryOperation[TItem, TSchema /* <: TItem */](query: Query[TSchema], ownerQuery: Any): QueryOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultQueryOperation")(query.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any])).asInstanceOf[QueryOperation[Any]]
  inline def createDefaultQueryOperation[TItem, TSchema /* <: TItem */](query: Query[TSchema], ownerQuery: Any, param2: PartialOptionsCompare): QueryOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultQueryOperation")(query.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[QueryOperation[Any]]
  
  inline def createEqualsOperation(params: Any, owneryQuery: Any, options: Options): typings.sift.srcCoreMod.EqualsOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEqualsOperation")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcCoreMod.EqualsOperation[Any]]
  
  inline def createOperationTester[TItem](operation: Operation[TItem]): js.Function3[
    /* item */ TItem, 
    /* key */ js.UndefOr[typings.sift.srcUtilsMod.Key], 
    /* owner */ js.UndefOr[Any], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOperationTester")(operation.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* item */ TItem, 
    /* key */ js.UndefOr[typings.sift.srcUtilsMod.Key], 
    /* owner */ js.UndefOr[Any], 
    Boolean
  ]]
  
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema]): typings.sift.srcCoreMod.QueryOperation[TItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any]).asInstanceOf[typings.sift.srcCoreMod.QueryOperation[TItem]]
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema], owneryQuery: Any): typings.sift.srcCoreMod.QueryOperation[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcCoreMod.QueryOperation[TItem]]
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema], owneryQuery: Any, param2: PartialOptionsCompare): typings.sift.srcCoreMod.QueryOperation[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcCoreMod.QueryOperation[TItem]]
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema], owneryQuery: Unit, param2: PartialOptionsCompare): typings.sift.srcCoreMod.QueryOperation[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcCoreMod.QueryOperation[TItem]]
  
  inline def createQueryTester[TItem, TSchema](query: Query[TSchema]): js.Function3[
    /* item */ TItem, 
    /* key */ js.UndefOr[typings.sift.srcUtilsMod.Key], 
    /* owner */ js.UndefOr[Any], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryTester")(query.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* item */ TItem, 
    /* key */ js.UndefOr[typings.sift.srcUtilsMod.Key], 
    /* owner */ js.UndefOr[Any], 
    Boolean
  ]]
  inline def createQueryTester[TItem, TSchema](query: Query[TSchema], options: PartialOptionsCompare): js.Function3[
    /* item */ TItem, 
    /* key */ js.UndefOr[typings.sift.srcUtilsMod.Key], 
    /* owner */ js.UndefOr[Any], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryTester")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* item */ TItem, 
    /* key */ js.UndefOr[typings.sift.srcUtilsMod.Key], 
    /* owner */ js.UndefOr[Any], 
    Boolean
  ]]
  
  inline def elemMatch(params: Any, owneryQuery: Query[Any], options: Options, name: String): $ElemMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("$elemMatch")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$ElemMatch]
  
  inline def eq(params: Any, owneryQuery: Query[Any], options: Options): typings.sift.srcCoreMod.EqualsOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$eq")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcCoreMod.EqualsOperation[Any]]
  
  inline def exists(params: Boolean, owneryQuery: Query[Any], options: Options, name: String): $Exists = (^.asInstanceOf[js.Dynamic].applyDynamic("$exists")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Exists]
  
  inline def gt(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] | NopeOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$gt")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any] | NopeOperation[Any]]
  
  inline def gte(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] | NopeOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$gte")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any] | NopeOperation[Any]]
  
  inline def in(params: Any, owneryQuery: Query[Any], options: Options, name: String): $In = (^.asInstanceOf[js.Dynamic].applyDynamic("$in")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$In]
  
  inline def lt(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] | NopeOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$lt")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any] | NopeOperation[Any]]
  
  inline def lte(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] | NopeOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$lte")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any] | NopeOperation[Any]]
  
  inline def mod(param0: js.Array[Double], owneryQuery: Query[Any], options: Options): typings.sift.srcCoreMod.EqualsOperation[js.Function1[/* b */ Any, Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$mod")(param0.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcCoreMod.EqualsOperation[js.Function1[/* b */ Any, Boolean]]]
  
  inline def ne(params: Any, owneryQuery: Query[Any], options: Options, name: String): $Ne = (^.asInstanceOf[js.Dynamic].applyDynamic("$ne")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Ne]
  
  inline def nin(params: Any, owneryQuery: Query[Any], options: Options, name: String): $Nin = (^.asInstanceOf[js.Dynamic].applyDynamic("$nin")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Nin]
  
  inline def nor(params: js.Array[Query[Any]], owneryQuery: Query[Any], options: Options, name: String): $Nor = (^.asInstanceOf[js.Dynamic].applyDynamic("$nor")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Nor]
  
  inline def not(params: Any, owneryQuery: Query[Any], options: Options, name: String): $Not = (^.asInstanceOf[js.Dynamic].applyDynamic("$not")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Not]
  
  inline def options(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("$options")().asInstanceOf[Any]
  
  inline def or(params: js.Array[Query[Any]], owneryQuery: Query[Any], options: Options, name: String): $Or = (^.asInstanceOf[js.Dynamic].applyDynamic("$or")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Or]
  
  inline def regex(pattern: String, owneryQuery: Query[Any], options: Options): typings.sift.srcCoreMod.EqualsOperation[js.RegExp] = (^.asInstanceOf[js.Dynamic].applyDynamic("$regex")(pattern.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcCoreMod.EqualsOperation[js.RegExp]]
  
  inline def size(params: Double, ownerQuery: Query[Any], options: Options): typings.sift.srcOperationsMod.$Size = (^.asInstanceOf[js.Dynamic].applyDynamic("$size")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcOperationsMod.$Size]
  
  inline def `type`(clazz: String, owneryQuery: Query[Any], options: Options): typings.sift.srcCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$type")(clazz.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]]]
  inline def `type`(clazz: js.Function, owneryQuery: Query[Any], options: Options): typings.sift.srcCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$type")(clazz.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]]]
  
  inline def where(params: String, ownerQuery: Query[Any], options: Options): typings.sift.srcCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$where")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]]]
  inline def where(params: js.Function, ownerQuery: Query[Any], options: Options): typings.sift.srcCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$where")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.srcCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]]]
}
