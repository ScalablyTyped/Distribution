package typings.sift

import typings.sift.srcCoreMod.EqualsOperation
import typings.sift.srcCoreMod.NamedBaseOperation
import typings.sift.srcCoreMod.NamedGroupOperation
import typings.sift.srcCoreMod.Operation
import typings.sift.srcCoreMod.Options
import typings.sift.srcCoreMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOperationsMod {
  
  @JSImport("sift/src/operations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sift/src/operations", "$Size")
  @js.native
  open class $Size protected () extends NamedBaseOperation[Any, Any] {
    def this(params: Any, owneryQuery: Any, options: Options, name: String) = this()
  }
  
  inline def all(params: js.Array[Query[Any]], ownerQuery: Query[Any], options: Options, name: String): $All = (^.asInstanceOf[js.Dynamic].applyDynamic("$all")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$All]
  
  inline def and(params: js.Array[Query[Any]], ownerQuery: Query[Any], options: Options, name: String): $And = (^.asInstanceOf[js.Dynamic].applyDynamic("$and")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$And]
  
  inline def elemMatch(params: Any, owneryQuery: Query[Any], options: Options, name: String): $ElemMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("$elemMatch")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$ElemMatch]
  
  inline def eq(params: Any, owneryQuery: Query[Any], options: Options): EqualsOperation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$eq")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EqualsOperation[Any]]
  
  inline def exists(params: Boolean, owneryQuery: Query[Any], options: Options, name: String): $Exists = (^.asInstanceOf[js.Dynamic].applyDynamic("$exists")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Exists]
  
  inline def gt(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$gt")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any]]
  
  inline def gte(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$gte")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any]]
  
  inline def in(params: Any, owneryQuery: Query[Any], options: Options, name: String): $In = (^.asInstanceOf[js.Dynamic].applyDynamic("$in")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$In]
  
  inline def lt(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$lt")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any]]
  
  inline def lte(params: Any, owneryQuery: Any, options: Options, name: String): Operation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("$lte")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Operation[Any]]
  
  inline def mod(hasModEqualsValue: js.Array[Double], owneryQuery: Query[Any], options: Options): EqualsOperation[js.Function1[/* b */ Any, Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$mod")(hasModEqualsValue.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EqualsOperation[js.Function1[/* b */ Any, Boolean]]]
  
  inline def ne(params: Any, owneryQuery: Query[Any], options: Options, name: String): $Ne = (^.asInstanceOf[js.Dynamic].applyDynamic("$ne")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Ne]
  
  inline def nin(params: Any, owneryQuery: Query[Any], options: Options, name: String): $Nin = (^.asInstanceOf[js.Dynamic].applyDynamic("$nin")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Nin]
  
  inline def nor(params: js.Array[Query[Any]], owneryQuery: Query[Any], options: Options, name: String): $Nor = (^.asInstanceOf[js.Dynamic].applyDynamic("$nor")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Nor]
  
  inline def not(params: Any, owneryQuery: Query[Any], options: Options, name: String): $Not = (^.asInstanceOf[js.Dynamic].applyDynamic("$not")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Not]
  
  inline def options(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("$options")().asInstanceOf[Any]
  
  inline def or(params: js.Array[Query[Any]], owneryQuery: Query[Any], options: Options, name: String): $Or = (^.asInstanceOf[js.Dynamic].applyDynamic("$or")(params.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[$Or]
  
  inline def regex(pattern: String, owneryQuery: Query[Any], options: Options): EqualsOperation[js.RegExp] = (^.asInstanceOf[js.Dynamic].applyDynamic("$regex")(pattern.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EqualsOperation[js.RegExp]]
  
  inline def size(params: Double, ownerQuery: Query[Any], options: Options): $Size = (^.asInstanceOf[js.Dynamic].applyDynamic("$size")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[$Size]
  
  inline def `type`(clazz: String, owneryQuery: Query[Any], options: Options): EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$type")(clazz.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EqualsOperation[js.Function1[/* b */ Any, Any]]]
  inline def `type`(clazz: js.Function, owneryQuery: Query[Any], options: Options): EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$type")(clazz.asInstanceOf[js.Any], owneryQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EqualsOperation[js.Function1[/* b */ Any, Any]]]
  
  inline def where(params: String, ownerQuery: Query[Any], options: Options): EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$where")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EqualsOperation[js.Function1[/* b */ Any, Any]]]
  inline def where(params: js.Function, ownerQuery: Query[Any], options: Options): EqualsOperation[js.Function1[/* b */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$where")(params.asInstanceOf[js.Any], ownerQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EqualsOperation[js.Function1[/* b */ Any, Any]]]
  
  @js.native
  trait $All extends NamedGroupOperation
  
  @js.native
  trait $And extends NamedGroupOperation
  
  @js.native
  trait $ElemMatch extends NamedBaseOperation[Query[Any], Any] {
    
    /* private */ var _queryOperation: Any = js.native
  }
  
  @js.native
  trait $Exists extends NamedBaseOperation[Boolean, Any]
  
  @js.native
  trait $In extends NamedBaseOperation[Any, Any] {
    
    /* private */ var _testers: Any = js.native
  }
  
  @js.native
  trait $Ne extends NamedBaseOperation[Any, Any] {
    
    /* private */ var _test: Any = js.native
  }
  
  @js.native
  trait $Nin extends $In
  
  @js.native
  trait $Nor extends $Or
  
  @js.native
  trait $Not extends NamedBaseOperation[Query[Any], Any] {
    
    /* private */ var _queryOperation: Any = js.native
  }
  
  @js.native
  trait $Or extends NamedBaseOperation[Any, Any] {
    
    /* private */ var _ops: Any = js.native
  }
}
