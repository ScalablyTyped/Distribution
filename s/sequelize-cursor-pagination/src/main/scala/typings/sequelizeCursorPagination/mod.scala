package typings.sequelizeCursorPagination

import typings.sequelize.anon.Exclude
import typings.sequelize.mod.FindOptionsAttributesArray
import typings.sequelize.mod.IncludeOptions
import typings.sequelize.mod.Model
import typings.sequelize.mod.WhereOptions
import typings.sequelize.mod.and
import typings.sequelize.mod.cast
import typings.sequelize.mod.col
import typings.sequelize.mod.fn
import typings.sequelize.mod.literal
import typings.sequelize.mod.or
import typings.sequelize.mod.where
import typings.sequelizeCursorPagination.mod.SequelizeCursorPagination.WithPaginationModel
import typings.sequelizeCursorPagination.mod.SequelizeCursorPagination.WithPaginationOptions
import typings.sequelizeCursorPagination.sequelizeCursorPaginationBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[MethodName /* <: String */](): js.Function1[/* model */ Any, WithPaginationModel[MethodName, Any, Any, Any]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function1[/* model */ Any, WithPaginationModel[MethodName, Any, Any, Any]]]
  inline def apply[MethodName /* <: String */](options: WithPaginationOptions[MethodName]): js.Function1[/* model */ Any, WithPaginationModel[MethodName, Any, Any, Any]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* model */ Any, WithPaginationModel[MethodName, Any, Any, Any]]]
  
  @JSImport("sequelize-cursor-pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object SequelizeCursorPagination {
    
    trait BasicPaginateOptions[T] extends StObject {
      
      // the before cursor
      var after: js.UndefOr[String] = js.undefined
      
      var attributes: js.UndefOr[FindOptionsAttributesArray | Exclude] = js.undefined
      
      // [default: false]
      var before: js.UndefOr[String] = js.undefined
      
      // limit the number of records returned
      var desc: js.UndefOr[Boolean] = js.undefined
      
      var include: js.UndefOr[
            (js.Array[(Model[Any, Any, Any]) | IncludeOptions]) | (Model[Any, Any, Any]) | IncludeOptions
          ] = js.undefined
      
      var limit: js.UndefOr[Double] = js.undefined
      
      // the after cursor
      var paginationField: js.UndefOr[String] = js.undefined
      
      // [default: primaryKeyField]
      var subQuery: js.UndefOr[Boolean] = js.undefined
      
      var where: js.UndefOr[
            WhereOptions[T] | typings.sequelize.mod.where | fn | (js.Array[col | and | or | String])
          ] = js.undefined
    }
    object BasicPaginateOptions {
      
      inline def apply[T](): BasicPaginateOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BasicPaginateOptions[T]]
      }
      
      extension [Self <: BasicPaginateOptions[?], T](x: Self & BasicPaginateOptions[T]) {
        
        inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
        
        inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
        
        inline def setAttributes(value: FindOptionsAttributesArray | Exclude): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
        
        inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
        
        inline def setAttributesVarargs(value: (String | literal | (js.Tuple2[String | cast | fn | literal, String]) | fn | cast)*): Self = StObject.set(x, "attributes", js.Array(value*))
        
        inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
        
        inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
        
        inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
        
        inline def setInclude(
          value: (js.Array[(Model[Any, Any, Any]) | IncludeOptions]) | (Model[Any, Any, Any]) | IncludeOptions
        ): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
        
        inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
        
        inline def setIncludeVarargs(value: ((Model[Any, Any, Any]) | IncludeOptions)*): Self = StObject.set(x, "include", js.Array(value*))
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setPaginationField(value: String): Self = StObject.set(x, "paginationField", value.asInstanceOf[js.Any])
        
        inline def setPaginationFieldUndefined: Self = StObject.set(x, "paginationField", js.undefined)
        
        inline def setSubQuery(value: Boolean): Self = StObject.set(x, "subQuery", value.asInstanceOf[js.Any])
        
        inline def setSubQueryUndefined: Self = StObject.set(x, "subQuery", js.undefined)
        
        inline def setWhere(value: WhereOptions[T] | where | fn | (js.Array[col | and | or | String])): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
        
        inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
        
        inline def setWhereVarargs(value: (col | and | or | String)*): Self = StObject.set(x, "where", js.Array(value*))
      }
    }
    
    trait Cursors extends StObject {
      
      var after: String | Null
      
      var before: String | Null
      
      var hasNext: Boolean
      
      var hasPrevious: Boolean
    }
    object Cursors {
      
      inline def apply(hasNext: Boolean, hasPrevious: Boolean): Cursors = {
        val __obj = js.Dynamic.literal(hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], after = null, before = null)
        __obj.asInstanceOf[Cursors]
      }
      
      extension [Self <: Cursors](x: Self) {
        
        inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
        
        inline def setAfterNull: Self = StObject.set(x, "after", null)
        
        inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
        
        inline def setBeforeNull: Self = StObject.set(x, "before", null)
        
        inline def setHasNext(value: Boolean): Self = StObject.set(x, "hasNext", value.asInstanceOf[js.Any])
        
        inline def setHasPrevious(value: Boolean): Self = StObject.set(x, "hasPrevious", value.asInstanceOf[js.Any])
      }
    }
    
    trait PaginateInstOptions[T]
      extends StObject
         with BasicPaginateOptions[T] {
      
      var raw: js.UndefOr[Boolean] = js.undefined
    }
    object PaginateInstOptions {
      
      inline def apply[T](): PaginateInstOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PaginateInstOptions[T]]
      }
      
      extension [Self <: PaginateInstOptions[?], T](x: Self & PaginateInstOptions[T]) {
        
        inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      }
    }
    
    trait PaginateRawOptions[T]
      extends StObject
         with BasicPaginateOptions[T] {
      
      var raw: `true`
    }
    object PaginateRawOptions {
      
      inline def apply[T](): PaginateRawOptions[T] = {
        val __obj = js.Dynamic.literal(raw = true)
        __obj.asInstanceOf[PaginateRawOptions[T]]
      }
      
      extension [Self <: PaginateRawOptions[?], T](x: Self & PaginateRawOptions[T]) {
        
        inline def setRaw(value: `true`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      }
    }
    
    type WithPaginationModel[MethodName /* <: String */, Model, ModelInst, ModelAttrs] = Model & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in MethodName ]: {None (): {  results :std.Array<ModelAttrs>,   cursors :sequelize-cursor-pagination.sequelize-cursor-pagination.SequelizeCursorPagination.Cursors}, None (options : sequelize-cursor-pagination.sequelize-cursor-pagination.SequelizeCursorPagination.PaginateRawOptions<ModelAttrs>): {  results :std.Array<ModelAttrs>,   cursors :sequelize-cursor-pagination.sequelize-cursor-pagination.SequelizeCursorPagination.Cursors}, None (): {  results :std.Array<ModelInst>,   cursors :sequelize-cursor-pagination.sequelize-cursor-pagination.SequelizeCursorPagination.Cursors}, None (options : sequelize-cursor-pagination.sequelize-cursor-pagination.SequelizeCursorPagination.PaginateInstOptions<ModelAttrs>): {  results :std.Array<ModelInst>,   cursors :sequelize-cursor-pagination.sequelize-cursor-pagination.SequelizeCursorPagination.Cursors}}} */ js.Any)
    
    trait WithPaginationOptions[MethodName /* <: String */] extends StObject {
      
      var methodName: js.UndefOr[MethodName] = js.undefined
      
      // [default: 'paginate']
      var primaryKeyField: js.UndefOr[String] = js.undefined
    }
    object WithPaginationOptions {
      
      inline def apply[MethodName /* <: String */](): WithPaginationOptions[MethodName] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WithPaginationOptions[MethodName]]
      }
      
      extension [Self <: WithPaginationOptions[?], MethodName /* <: String */](x: Self & WithPaginationOptions[MethodName]) {
        
        inline def setMethodName(value: MethodName): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
        
        inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
        
        inline def setPrimaryKeyField(value: String): Self = StObject.set(x, "primaryKeyField", value.asInstanceOf[js.Any])
        
        inline def setPrimaryKeyFieldUndefined: Self = StObject.set(x, "primaryKeyField", js.undefined)
      }
    }
  }
}
