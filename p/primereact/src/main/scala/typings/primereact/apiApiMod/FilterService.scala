package typings.primereact.apiApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilterService {
  
  @JSImport("primereact/api/api", "FilterService")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter(value: Any, fields: js.Array[String], filterValue: Any, filterMatchMode: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(value.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], filterMatchMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def filter(
    value: Any,
    fields: js.Array[String],
    filterValue: Any,
    filterMatchMode: String,
    filterLocale: String
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(value.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], filterMatchMode.asInstanceOf[js.Any], filterLocale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  object filters {
    
    @JSImport("primereact/api/api", "FilterService.filters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def between(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def contains(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains(value: Any, filter: String, filterLocale: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], filterLocale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def dateAfter(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dateAfter")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def dateBefore(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dateBefore")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def dateIs(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dateIs")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def dateIsNot(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dateIsNot")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def endsWith(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def endsWith(value: Any, filter: String, filterLocale: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], filterLocale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def equals_(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(value: Any, filter: String, filterLocale: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], filterLocale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def gt(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def gte(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def in(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("in")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def lt(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def lte(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def notContains(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notContains")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def notContains(value: Any, filter: String, filterLocale: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notContains")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], filterLocale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def notEquals(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notEquals")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def notEquals(value: Any, filter: String, filterLocale: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notEquals")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], filterLocale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def startsWith(value: Any, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def startsWith(value: Any, filter: String, filterLocale: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(value.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], filterLocale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  inline def register(rule: String, fn: js.Function1[/* repeated */ Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(rule.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
