package typings.sift

import typings.sift.anon.PartialOptions
import typings.sift.libCoreMod.Operation
import typings.sift.libCoreMod.Options
import typings.sift.libCoreMod.Query
import typings.sift.libCoreMod.QueryOperation
import typings.sift.libOperationsMod.$All
import typings.sift.libOperationsMod.$And
import typings.sift.libOperationsMod.$ElemMatch
import typings.sift.libOperationsMod.$Exists
import typings.sift.libOperationsMod.$In
import typings.sift.libOperationsMod.$Ne
import typings.sift.libOperationsMod.$Nin
import typings.sift.libOperationsMod.$Nor
import typings.sift.libOperationsMod.$Not
import typings.sift.libOperationsMod.$Or
import typings.sift.libUtilsMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("sift/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TItem, TSchema /* <: TItem */](query: Query[TSchema]): js.Function3[/* item */ Any, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* item */ Any, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean]]
  inline def default[TItem, TSchema /* <: TItem */](query: Query[TSchema], options: PartialOptions): js.Function3[/* item */ Any, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* item */ Any, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean]]
  
  @JSImport("sift/lib", "$Size")
  @js.native
  open class $Size protected ()
    extends typings.sift.libOperationsMod.$Size {
    def this(params: Any, owneryQuery: Any, options: Options) = this()
    def this(params: Any, owneryQuery: Any, options: Options, name: String) = this()
  }
  
  @JSImport("sift/lib", "EqualsOperation")
  @js.native
  open class EqualsOperation[TParam] protected ()
    extends typings.sift.libCoreMod.EqualsOperation[TParam] {
    def this(params: TParam, owneryQuery: Any, options: Options) = this()
    def this(params: TParam, owneryQuery: Any, options: Options, name: String) = this()
  }
  
  inline def all(params: js.Array[Query[Any]], ownerQuery: Query[Any], options: Options, name: String): $All = (^.asInstanceOf[js.Dynamic].applyDynamic("$all")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$All]
  
  inline def and(params: js.Array[Query[Any]], ownerQuery: Query[Any], options: Options, name: String): $And = (^.asInstanceOf[js.Dynamic].applyDynamic("$and")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$And]
  
  inline def createDefaultQueryOperation[TItem, TSchema /* <: TItem */](query: Query[TSchema], ownerQuery: Any): QueryOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultQueryOperation")(query.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any])).asInstanceOf[QueryOperation[Any]]
  inline def createDefaultQueryOperation[TItem, TSchema /* <: TItem */](query: Query[TSchema], ownerQuery: Any, hasCompareOperations: PartialOptions): QueryOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultQueryOperation")(query.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], hasCompareOperations.asInstanceOf[js.Any])).asInstanceOf[QueryOperation[Any]]
  
  inline def createEqualsOperation(params: Any, owneryQuery: Any, options: Options): typings.sift.libCoreMod.EqualsOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEqualsOperation")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.libCoreMod.EqualsOperation[Any]]
  
  inline def createOperationTester[TItem](operation: Operation[TItem]): js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOperationTester")(operation.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean]]
  
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema]): QueryOperation[TItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any]).asInstanceOf[QueryOperation[TItem]]
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema], owneryQuery: Any): QueryOperation[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any])).asInstanceOf[QueryOperation[TItem]]
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema], owneryQuery: Any, hasCompareOperations: PartialOptions): QueryOperation[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], hasCompareOperations.asInstanceOf[js.Any])).asInstanceOf[QueryOperation[TItem]]
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema], owneryQuery: Unit, hasCompareOperations: PartialOptions): QueryOperation[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], hasCompareOperations.asInstanceOf[js.Any])).asInstanceOf[QueryOperation[TItem]]
  
  inline def createQueryTester[TItem, TSchema](query: Query[TSchema]): js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryTester")(query.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean]]
  inline def createQueryTester[TItem, TSchema](query: Query[TSchema], options: PartialOptions): js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryTester")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean]]
  
  inline def elemMatch(params: Any, owneryQuery: Query[Any], options: Options, name: String): $ElemMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("$elemMatch")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$ElemMatch]
  
  inline def eq(params: Any, owneryQuery: Query[Any], options: Options): typings.sift.libCoreMod.EqualsOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$eq")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.libCoreMod.EqualsOperation[Any]]
  
  inline def exists(params: Boolean, owneryQuery: Query[Any], options: Options, name: String): $Exists = (^.asInstanceOf[js.Dynamic].applyDynamic("$exists")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Exists]
  
  inline def gt(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$gt")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any]]
  
  inline def gte(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$gte")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any]]
  
  inline def in(params: Any, owneryQuery: Query[Any], options: Options, name: String): $In = (^.asInstanceOf[js.Dynamic].applyDynamic("$in")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$In]
  
  inline def lt(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$lt")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any]]
  
  inline def lte(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$lte")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any]]
  
  inline def mod(hasModEqualsValue: js.Array[Double], owneryQuery: Query[Any], options: Options): typings.sift.libCoreMod.EqualsOperation[js.Function1[/* b */ Any, Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$mod")(hasModEqualsValue.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.libCoreMod.EqualsOperation[js.Function1[/* b */ Any, Boolean]]]
  
  inline def ne(params: Any, owneryQuery: Query[Any], options: Options, name: String): $Ne = (^.asInstanceOf[js.Dynamic].applyDynamic("$ne")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Ne]
  
  inline def nin(params: Any, owneryQuery: Query[Any], options: Options, name: String): $Nin = (^.asInstanceOf[js.Dynamic].applyDynamic("$nin")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Nin]
  
  inline def nor(params: js.Array[Query[Any]], owneryQuery: Query[Any], options: Options, name: String): $Nor = (^.asInstanceOf[js.Dynamic].applyDynamic("$nor")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Nor]
  
  inline def not(params: Any, owneryQuery: Query[Any], options: Options, name: String): $Not = (^.asInstanceOf[js.Dynamic].applyDynamic("$not")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Not]
  
  inline def options(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("$options")().asInstanceOf[Any]
  
  inline def or(params: js.Array[Query[Any]], owneryQuery: Query[Any], options: Options, name: String): $Or = (^.asInstanceOf[js.Dynamic].applyDynamic("$or")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Or]
  
  inline def regex(pattern: String, owneryQuery: Query[Any], options: Options): typings.sift.libCoreMod.EqualsOperation[js.RegExp] = (^.asInstanceOf[js.Dynamic].applyDynamic("$regex")(pattern.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.libCoreMod.EqualsOperation[js.RegExp]]
  
  inline def size(params: Double, ownerQuery: Query[Any], options: Options): typings.sift.libOperationsMod.$Size = (^.asInstanceOf[js.Dynamic].applyDynamic("$size")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.libOperationsMod.$Size]
  
  inline def `type`(clazz: String, owneryQuery: Query[Any], options: Options): typings.sift.libCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$type")(clazz.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.libCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]]]
  inline def `type`(clazz: js.Function, owneryQuery: Query[Any], options: Options): typings.sift.libCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$type")(clazz.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.libCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]]]
  
  inline def where(params: String, ownerQuery: Query[Any], options: Options): typings.sift.libCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$where")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.libCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]]]
  inline def where(params: js.Function, ownerQuery: Query[Any], options: Options): typings.sift.libCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$where")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sift.libCoreMod.EqualsOperation[js.Function1[/* b */ Any, Any]]]
}
