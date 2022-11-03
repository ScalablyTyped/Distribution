package typings.sift

import org.scalablytyped.runtime.StringDictionary
import typings.sift.anon.PartialOptions
import typings.sift.libUtilsMod.Comparator
import typings.sift.libUtilsMod.Key
import typings.sift.siftStrings.g
import typings.sift.siftStrings.i
import typings.sift.siftStrings.m
import typings.sift.siftStrings.u
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMod {
  
  @JSImport("sift/lib/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("sift/lib/core", "BaseOperation")
  @js.native
  open class BaseOperation[TParams, TItem] protected ()
    extends StObject
       with Operation[TItem] {
    def this(params: TParams, owneryQuery: Any, options: Options) = this()
    def this(params: TParams, owneryQuery: Any, options: Options, name: String) = this()
    
    /* protected */ def init(): Unit = js.native
    
    val name: js.UndefOr[String] = js.native
    
    val options: Options = js.native
    
    val owneryQuery: Any = js.native
    
    val params: TParams = js.native
  }
  
  @JSImport("sift/lib/core", "EqualsOperation")
  @js.native
  open class EqualsOperation[TParam] protected () extends BaseOperation[TParam, Any] {
    def this(params: TParam, owneryQuery: Any, options: Options) = this()
    def this(params: TParam, owneryQuery: Any, options: Options, name: String) = this()
    
    /* private */ var _test: Any = js.native
  }
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sift.libCoreMod.NamedOperation because var conflicts: name. Inlined  */ @JSImport("sift/lib/core", "NamedGroupOperation")
  @js.native
  open class NamedGroupOperation protected () extends GroupOperation {
    def this(params: Any, owneryQuery: Any, options: Options, children: js.Array[Operation[Any]], name: String) = this()
    
    @JSName("name")
    val name_NamedGroupOperation: String = js.native
  }
  
  @JSImport("sift/lib/core", "NestedOperation")
  @js.native
  open class NestedOperation protected () extends GroupOperation {
    def this(
      keyPath: js.Array[Key],
      params: Any,
      owneryQuery: Any,
      options: Options,
      children: js.Array[Operation[Any]]
    ) = this()
    
    /**
      */
    /* private */ var _nextNestedValue: Any = js.native
    
    val keyPath: js.Array[Key] = js.native
  }
  
  @JSImport("sift/lib/core", "NopeOperation")
  @js.native
  open class NopeOperation[TParam] protected () extends BaseOperation[TParam, Any] {
    def this(params: TParam, owneryQuery: Any, options: Options) = this()
    def this(params: TParam, owneryQuery: Any, options: Options, name: String) = this()
    
    def next(): Unit = js.native
  }
  
  @JSImport("sift/lib/core", "QueryOperation")
  @js.native
  open class QueryOperation[TItem] () extends GroupOperation
  
  inline def containsOperation(query: Any, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsOperation")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createEqualsOperation(params: Any, owneryQuery: Any, options: Options): EqualsOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEqualsOperation")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EqualsOperation[Any]]
  
  inline def createOperationTester[TItem](operation: Operation[TItem]): js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOperationTester")(operation.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean]]
  
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema]): QueryOperation[TItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any]).asInstanceOf[QueryOperation[TItem]]
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema], owneryQuery: Any): QueryOperation[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any])).asInstanceOf[QueryOperation[TItem]]
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema], owneryQuery: Any, param2: PartialOptions): QueryOperation[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[QueryOperation[TItem]]
  inline def createQueryOperation[TItem, TSchema](query: Query[TSchema], owneryQuery: Unit, param2: PartialOptions): QueryOperation[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryOperation")(query.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[QueryOperation[TItem]]
  
  inline def createQueryTester[TItem, TSchema](query: Query[TSchema]): js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryTester")(query.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean]]
  inline def createQueryTester[TItem, TSchema](query: Query[TSchema], options: PartialOptions): js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQueryTester")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* item */ TItem, /* key */ js.UndefOr[Key], /* owner */ js.UndefOr[Any], Boolean]]
  
  inline def createTester(a: Any, compare: Comparator): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createTester")(a.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def numericalOperation(createTester: js.Function1[/* any */ Any, Tester]): js.Function4[
    /* params */ Any, 
    /* owneryQuery */ Any, 
    /* options */ Options, 
    /* name */ String, 
    Operation[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("numericalOperation")(createTester.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* params */ Any, 
    /* owneryQuery */ Any, 
    /* options */ Options, 
    /* name */ String, 
    Operation[Any]
  ]]
  
  inline def numericalOperationCreator(createNumericalOperation: OperationCreator[Any]): js.Function4[
    /* params */ Any, 
    /* owneryQuery */ Any, 
    /* options */ Options, 
    /* name */ String, 
    Operation[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("numericalOperationCreator")(createNumericalOperation.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* params */ Any, 
    /* owneryQuery */ Any, 
    /* options */ Options, 
    /* name */ String, 
    Operation[Any]
  ]]
  
  trait ArrayValueQuery[TValue]
    extends StObject
       with BasicValueQuery[TValue] {
    
    @JSName("$elemMatch")
    var $elemMatch: js.UndefOr[Query[TValue]] = js.undefined
  }
  object ArrayValueQuery {
    
    inline def apply[TValue](): ArrayValueQuery[TValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayValueQuery[TValue]]
    }
    
    extension [Self <: ArrayValueQuery[?], TValue](x: Self & ArrayValueQuery[TValue]) {
      
      inline def set$elemMatch(value: Query[TValue]): Self = StObject.set(x, "$elemMatch", value.asInstanceOf[js.Any])
      
      inline def set$elemMatchUndefined: Self = StObject.set(x, "$elemMatch", js.undefined)
    }
  }
  
  trait BasicValueQuery[TValue] extends StObject {
    
    @JSName("$all")
    var $all: js.UndefOr[js.Array[TValue]] = js.undefined
    
    @JSName("$and")
    var $and: js.UndefOr[js.Array[NestedQuery[TValue]]] = js.undefined
    
    @JSName("$eq")
    var $eq: js.UndefOr[TValue] = js.undefined
    
    @JSName("$exists")
    var $exists: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$gt")
    var $gt: js.UndefOr[TValue] = js.undefined
    
    @JSName("$gte")
    var $gte: js.UndefOr[TValue] = js.undefined
    
    @JSName("$in")
    var $in: js.UndefOr[js.Array[TValue]] = js.undefined
    
    @JSName("$lt")
    var $lt: js.UndefOr[TValue] = js.undefined
    
    @JSName("$lte")
    var $lte: js.UndefOr[TValue] = js.undefined
    
    @JSName("$mod")
    var $mod: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    @JSName("$ne")
    var $ne: js.UndefOr[TValue] = js.undefined
    
    @JSName("$nin")
    var $nin: js.UndefOr[js.Array[TValue]] = js.undefined
    
    @JSName("$nor")
    var $nor: js.UndefOr[js.Array[NestedQuery[TValue]]] = js.undefined
    
    @JSName("$not")
    var $not: js.UndefOr[NestedQuery[TValue]] = js.undefined
    
    @JSName("$options")
    var $options: js.UndefOr[i | g | m | u] = js.undefined
    
    @JSName("$or")
    var $or: js.UndefOr[js.Array[NestedQuery[TValue]]] = js.undefined
    
    @JSName("$regex")
    var $regex: js.UndefOr[String | js.RegExp] = js.undefined
    
    @JSName("$size")
    var $size: js.UndefOr[Double] = js.undefined
    
    @JSName("$type")
    var $type: js.UndefOr[js.Function] = js.undefined
    
    @JSName("$where")
    var $where: js.UndefOr[(js.ThisFunction1[/* this */ TValue, /* obj */ TValue, Boolean]) | String] = js.undefined
  }
  object BasicValueQuery {
    
    inline def apply[TValue](): BasicValueQuery[TValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicValueQuery[TValue]]
    }
    
    extension [Self <: BasicValueQuery[?], TValue](x: Self & BasicValueQuery[TValue]) {
      
      inline def set$all(value: js.Array[TValue]): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
      
      inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
      
      inline def set$allVarargs(value: TValue*): Self = StObject.set(x, "$all", js.Array(value*))
      
      inline def set$and(value: js.Array[NestedQuery[TValue]]): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
      
      inline def set$andUndefined: Self = StObject.set(x, "$and", js.undefined)
      
      inline def set$andVarargs(value: NestedQuery[TValue]*): Self = StObject.set(x, "$and", js.Array(value*))
      
      inline def set$eq(value: TValue): Self = StObject.set(x, "$eq", value.asInstanceOf[js.Any])
      
      inline def set$eqUndefined: Self = StObject.set(x, "$eq", js.undefined)
      
      inline def set$exists(value: Boolean): Self = StObject.set(x, "$exists", value.asInstanceOf[js.Any])
      
      inline def set$existsUndefined: Self = StObject.set(x, "$exists", js.undefined)
      
      inline def set$gt(value: TValue): Self = StObject.set(x, "$gt", value.asInstanceOf[js.Any])
      
      inline def set$gtUndefined: Self = StObject.set(x, "$gt", js.undefined)
      
      inline def set$gte(value: TValue): Self = StObject.set(x, "$gte", value.asInstanceOf[js.Any])
      
      inline def set$gteUndefined: Self = StObject.set(x, "$gte", js.undefined)
      
      inline def set$in(value: js.Array[TValue]): Self = StObject.set(x, "$in", value.asInstanceOf[js.Any])
      
      inline def set$inUndefined: Self = StObject.set(x, "$in", js.undefined)
      
      inline def set$inVarargs(value: TValue*): Self = StObject.set(x, "$in", js.Array(value*))
      
      inline def set$lt(value: TValue): Self = StObject.set(x, "$lt", value.asInstanceOf[js.Any])
      
      inline def set$ltUndefined: Self = StObject.set(x, "$lt", js.undefined)
      
      inline def set$lte(value: TValue): Self = StObject.set(x, "$lte", value.asInstanceOf[js.Any])
      
      inline def set$lteUndefined: Self = StObject.set(x, "$lte", js.undefined)
      
      inline def set$mod(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "$mod", value.asInstanceOf[js.Any])
      
      inline def set$modUndefined: Self = StObject.set(x, "$mod", js.undefined)
      
      inline def set$ne(value: TValue): Self = StObject.set(x, "$ne", value.asInstanceOf[js.Any])
      
      inline def set$neUndefined: Self = StObject.set(x, "$ne", js.undefined)
      
      inline def set$nin(value: js.Array[TValue]): Self = StObject.set(x, "$nin", value.asInstanceOf[js.Any])
      
      inline def set$ninUndefined: Self = StObject.set(x, "$nin", js.undefined)
      
      inline def set$ninVarargs(value: TValue*): Self = StObject.set(x, "$nin", js.Array(value*))
      
      inline def set$nor(value: js.Array[NestedQuery[TValue]]): Self = StObject.set(x, "$nor", value.asInstanceOf[js.Any])
      
      inline def set$norUndefined: Self = StObject.set(x, "$nor", js.undefined)
      
      inline def set$norVarargs(value: NestedQuery[TValue]*): Self = StObject.set(x, "$nor", js.Array(value*))
      
      inline def set$not(value: NestedQuery[TValue]): Self = StObject.set(x, "$not", value.asInstanceOf[js.Any])
      
      inline def set$notUndefined: Self = StObject.set(x, "$not", js.undefined)
      
      inline def set$options(value: i | g | m | u): Self = StObject.set(x, "$options", value.asInstanceOf[js.Any])
      
      inline def set$optionsUndefined: Self = StObject.set(x, "$options", js.undefined)
      
      inline def set$or(value: js.Array[NestedQuery[TValue]]): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
      
      inline def set$orUndefined: Self = StObject.set(x, "$or", js.undefined)
      
      inline def set$orVarargs(value: NestedQuery[TValue]*): Self = StObject.set(x, "$or", js.Array(value*))
      
      inline def set$regex(value: String | js.RegExp): Self = StObject.set(x, "$regex", value.asInstanceOf[js.Any])
      
      inline def set$regexUndefined: Self = StObject.set(x, "$regex", js.undefined)
      
      inline def set$size(value: Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
      
      inline def set$type(value: js.Function): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
      
      inline def set$typeUndefined: Self = StObject.set(x, "$type", js.undefined)
      
      inline def set$where(value: (js.ThisFunction1[/* this */ TValue, /* obj */ TValue, Boolean]) | String): Self = StObject.set(x, "$where", value.asInstanceOf[js.Any])
      
      inline def set$whereUndefined: Self = StObject.set(x, "$where", js.undefined)
    }
  }
  
  @js.native
  trait GroupOperation extends BaseOperation[Any, Any] {
    
    val children: js.Array[Operation[Any]] = js.native
    
    /**
      */
    /* protected */ def childrenNext(item: Any, key: Key, owner: Any, root: Boolean): Unit = js.native
  }
  
  trait NamedOperation extends StObject {
    
    var name: String
  }
  object NamedOperation {
    
    inline def apply(name: String): NamedOperation = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedOperation]
    }
    
    extension [Self <: NamedOperation](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type NestedQuery[TItemSchema] = ValueQuery[TItemSchema] & ShapeQuery[TItemSchema]
  
  type NotObject = String | Double | js.Date | Boolean | js.Array[Any]
  
  @js.native
  trait Operation[TItem] extends StObject {
    
    val done: Boolean = js.native
    
    val keep: Boolean = js.native
    
    def next(item: TItem): Any = js.native
    def next(item: TItem, key: Unit, owner: Any): Any = js.native
    def next(item: TItem, key: Unit, owner: Any, root: Boolean): Any = js.native
    def next(item: TItem, key: Unit, owner: Unit, root: Boolean): Any = js.native
    def next(item: TItem, key: Key): Any = js.native
    def next(item: TItem, key: Key, owner: Any): Any = js.native
    def next(item: TItem, key: Key, owner: Any, root: Boolean): Any = js.native
    def next(item: TItem, key: Key, owner: Unit, root: Boolean): Any = js.native
    
    var propop: Boolean = js.native
    
    def reset(): Any = js.native
  }
  
  type OperationCreator[TItem] = js.Function4[
    /* params */ Any, 
    /* parentQuery */ Any, 
    /* options */ Options, 
    /* name */ String, 
    Operation[TItem]
  ]
  
  trait Options extends StObject {
    
    def compare(a: Any, b: Any): Boolean
    
    var operations: StringDictionary[OperationCreator[Any]]
  }
  object Options {
    
    inline def apply(compare: (Any, Any) => Boolean, operations: StringDictionary[OperationCreator[Any]]): Options = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), operations = operations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCompare(value: (Any, Any) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      inline def setOperations(value: StringDictionary[OperationCreator[Any]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    }
  }
  
  type Query[TItemSchema] = TItemSchema | js.RegExp | NestedQuery[TItemSchema]
  
  type QueryOperators[TValue] = /* keyof sift.sift/lib/core.ValueQuery<TValue> */ String
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TItemSchema extends sift.sift/lib/core.NotObject ? {} : {[ k in keyof TItemSchema ]:? TItemSchema[k] | sift.sift/lib/core.ValueQuery<TItemSchema[k]>}
    }}}
    */
  @js.native
  trait ShapeQuery[TItemSchema] extends StObject
  
  type Tester = js.Function4[
    /* item */ Any, 
    /* key */ js.UndefOr[Key], 
    /* owner */ js.UndefOr[Any], 
    /* root */ js.UndefOr[Boolean], 
    Boolean
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<infer U> ? U : T
    }}}
    */
  @js.native
  trait Unpacked[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TValue extends std.Array<any> ? sift.sift/lib/core.ArrayValueQuery<sift.sift/lib/core.Unpacked<TValue>> : sift.sift/lib/core.BasicValueQuery<TValue>
    }}}
    */
  @js.native
  trait ValueQuery[TValue] extends StObject
}
