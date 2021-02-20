package typings.sequelizeCursorPagination

import org.scalablytyped.runtime.TopLevel
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sequelize-cursor-pagination", JSImport.Namespace)
  @js.native
  def apply[MethodName /* <: String */](): js.Function1[/* model */ js.Any, WithPaginationModel[MethodName, _, _, _]] = js.native
  @JSImport("sequelize-cursor-pagination", JSImport.Namespace)
  @js.native
  def apply[MethodName /* <: String */](options: WithPaginationOptions[MethodName]): js.Function1[/* model */ js.Any, WithPaginationModel[MethodName, _, _, _]] = js.native
  
  object SequelizeCursorPagination {
    
    @js.native
    trait BasicPaginateOptions[T] extends StObject {
      
      // the before cursor
      var after: js.UndefOr[String] = js.native
      
      var attributes: js.UndefOr[FindOptionsAttributesArray | Exclude] = js.native
      
      // [default: false]
      var before: js.UndefOr[String] = js.native
      
      // limit the number of records returned
      var desc: js.UndefOr[Boolean] = js.native
      
      var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.native
      
      var limit: js.UndefOr[Double] = js.native
      
      // the after cursor
      var paginationField: js.UndefOr[String] = js.native
      
      // [default: primaryKeyField]
      var subQuery: js.UndefOr[Boolean] = js.native
      
      var where: js.UndefOr[
            WhereOptions[T] | typings.sequelize.mod.where | fn | (js.Array[col | and | or | String])
          ] = js.native
    }
    object BasicPaginateOptions {
      
      @scala.inline
      def apply[T](): BasicPaginateOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BasicPaginateOptions[T]]
      }
      
      @scala.inline
      implicit class BasicPaginateOptionsMutableBuilder[Self <: BasicPaginateOptions[_], T] (val x: Self with BasicPaginateOptions[T]) extends AnyVal {
        
        @scala.inline
        def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
        
        @scala.inline
        def setAttributes(value: FindOptionsAttributesArray | Exclude): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
        
        @scala.inline
        def setAttributesVarargs(value: (String | literal | (js.Tuple2[String | cast | fn | literal, String]) | fn | cast)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
        
        @scala.inline
        def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
        
        @scala.inline
        def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
        
        @scala.inline
        def setInclude(value: js.Array[(Model[_, _, _]) | IncludeOptions]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
        
        @scala.inline
        def setIncludeVarargs(value: ((Model[js.Any, js.Any, js.Any]) | IncludeOptions)*): Self = StObject.set(x, "include", js.Array(value :_*))
        
        @scala.inline
        def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setPaginationField(value: String): Self = StObject.set(x, "paginationField", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaginationFieldUndefined: Self = StObject.set(x, "paginationField", js.undefined)
        
        @scala.inline
        def setSubQuery(value: Boolean): Self = StObject.set(x, "subQuery", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubQueryUndefined: Self = StObject.set(x, "subQuery", js.undefined)
        
        @scala.inline
        def setWhere(value: WhereOptions[T] | where | fn | (js.Array[col | and | or | String])): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
        
        @scala.inline
        def setWhereVarargs(value: (col | and | or | String)*): Self = StObject.set(x, "where", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Cursors extends StObject {
      
      var after: String | Null = js.native
      
      var before: String | Null = js.native
      
      var hasNext: Boolean = js.native
      
      var hasPrevious: Boolean = js.native
    }
    object Cursors {
      
      @scala.inline
      def apply(hasNext: Boolean, hasPrevious: Boolean): Cursors = {
        val __obj = js.Dynamic.literal(hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any])
        __obj.asInstanceOf[Cursors]
      }
      
      @scala.inline
      implicit class CursorsMutableBuilder[Self <: Cursors] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAfterNull: Self = StObject.set(x, "after", null)
        
        @scala.inline
        def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBeforeNull: Self = StObject.set(x, "before", null)
        
        @scala.inline
        def setHasNext(value: Boolean): Self = StObject.set(x, "hasNext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHasPrevious(value: Boolean): Self = StObject.set(x, "hasPrevious", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait PaginateInstOptions[T] extends BasicPaginateOptions[T] {
      
      var raw: js.UndefOr[Boolean] = js.native
    }
    object PaginateInstOptions {
      
      @scala.inline
      def apply[T](): PaginateInstOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PaginateInstOptions[T]]
      }
      
      @scala.inline
      implicit class PaginateInstOptionsMutableBuilder[Self <: PaginateInstOptions[_], T] (val x: Self with PaginateInstOptions[T]) extends AnyVal {
        
        @scala.inline
        def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      }
    }
    
    @js.native
    trait PaginateRawOptions[T] extends BasicPaginateOptions[T] {
      
      var raw: `true` = js.native
    }
    object PaginateRawOptions {
      
      @scala.inline
      def apply[T](raw: `true`): PaginateRawOptions[T] = {
        val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
        __obj.asInstanceOf[PaginateRawOptions[T]]
      }
      
      @scala.inline
      implicit class PaginateRawOptionsMutableBuilder[Self <: PaginateRawOptions[_], T] (val x: Self with PaginateRawOptions[T]) extends AnyVal {
        
        @scala.inline
        def setRaw(value: `true`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      }
    }
    
    type WithPaginationModel[MethodName /* <: String */, Model, ModelInst, ModelAttrs] = Model with typings.sequelizeCursorPagination.sequelizeCursorPaginationStrings.WithPaginationModel with TopLevel[js.Any]
    
    @js.native
    trait WithPaginationOptions[MethodName /* <: String */] extends StObject {
      
      var methodName: js.UndefOr[MethodName] = js.native
      
      // [default: 'paginate']
      var primaryKeyField: js.UndefOr[String] = js.native
    }
    object WithPaginationOptions {
      
      @scala.inline
      def apply[MethodName /* <: String */](): WithPaginationOptions[MethodName] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WithPaginationOptions[MethodName]]
      }
      
      @scala.inline
      implicit class WithPaginationOptionsMutableBuilder[Self <: WithPaginationOptions[_], MethodName /* <: String */] (val x: Self with WithPaginationOptions[MethodName]) extends AnyVal {
        
        @scala.inline
        def setMethodName(value: MethodName): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
        
        @scala.inline
        def setPrimaryKeyField(value: String): Self = StObject.set(x, "primaryKeyField", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimaryKeyFieldUndefined: Self = StObject.set(x, "primaryKeyField", js.undefined)
      }
    }
  }
}
