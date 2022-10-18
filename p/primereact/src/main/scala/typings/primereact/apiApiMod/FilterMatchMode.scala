package typings.primereact.apiApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterMatchMode extends StObject
@JSImport("primereact/api/api", "FilterMatchMode")
@js.native
object FilterMatchMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterMatchMode & String] = js.native
  
  @js.native
  sealed trait BETWEEN
    extends StObject
       with FilterMatchMode
  /* "between" */ val BETWEEN: typings.primereact.apiApiMod.FilterMatchMode.BETWEEN & String = js.native
  
  @js.native
  sealed trait CONTAINS
    extends StObject
       with FilterMatchMode
  /* "contains" */ val CONTAINS: typings.primereact.apiApiMod.FilterMatchMode.CONTAINS & String = js.native
  
  @js.native
  sealed trait CUSTOM
    extends StObject
       with FilterMatchMode
  /* "custom" */ val CUSTOM: typings.primereact.apiApiMod.FilterMatchMode.CUSTOM & String = js.native
  
  @js.native
  sealed trait DATE_AFTER
    extends StObject
       with FilterMatchMode
  /* "dateAfter" */ val DATE_AFTER: typings.primereact.apiApiMod.FilterMatchMode.DATE_AFTER & String = js.native
  
  @js.native
  sealed trait DATE_BEFORE
    extends StObject
       with FilterMatchMode
  /* "dateBefore" */ val DATE_BEFORE: typings.primereact.apiApiMod.FilterMatchMode.DATE_BEFORE & String = js.native
  
  @js.native
  sealed trait DATE_IS
    extends StObject
       with FilterMatchMode
  /* "dateIs" */ val DATE_IS: typings.primereact.apiApiMod.FilterMatchMode.DATE_IS & String = js.native
  
  @js.native
  sealed trait DATE_IS_NOT
    extends StObject
       with FilterMatchMode
  /* "dateIsNot" */ val DATE_IS_NOT: typings.primereact.apiApiMod.FilterMatchMode.DATE_IS_NOT & String = js.native
  
  @js.native
  sealed trait ENDS_WITH
    extends StObject
       with FilterMatchMode
  /* "endsWith" */ val ENDS_WITH: typings.primereact.apiApiMod.FilterMatchMode.ENDS_WITH & String = js.native
  
  @js.native
  sealed trait EQUALS
    extends StObject
       with FilterMatchMode
  /* "equals" */ val EQUALS: typings.primereact.apiApiMod.FilterMatchMode.EQUALS & String = js.native
  
  @js.native
  sealed trait GREATER_THAN
    extends StObject
       with FilterMatchMode
  /* "gt" */ val GREATER_THAN: typings.primereact.apiApiMod.FilterMatchMode.GREATER_THAN & String = js.native
  
  @js.native
  sealed trait GREATER_THAN_OR_EQUAL_TO
    extends StObject
       with FilterMatchMode
  /* "gte" */ val GREATER_THAN_OR_EQUAL_TO: typings.primereact.apiApiMod.FilterMatchMode.GREATER_THAN_OR_EQUAL_TO & String = js.native
  
  @js.native
  sealed trait IN
    extends StObject
       with FilterMatchMode
  /* "in" */ val IN: typings.primereact.apiApiMod.FilterMatchMode.IN & String = js.native
  
  @js.native
  sealed trait LESS_THAN
    extends StObject
       with FilterMatchMode
  /* "lt" */ val LESS_THAN: typings.primereact.apiApiMod.FilterMatchMode.LESS_THAN & String = js.native
  
  @js.native
  sealed trait LESS_THAN_OR_EQUAL_TO
    extends StObject
       with FilterMatchMode
  /* "lte" */ val LESS_THAN_OR_EQUAL_TO: typings.primereact.apiApiMod.FilterMatchMode.LESS_THAN_OR_EQUAL_TO & String = js.native
  
  @js.native
  sealed trait NOT_CONTAINS
    extends StObject
       with FilterMatchMode
  /* "notContains" */ val NOT_CONTAINS: typings.primereact.apiApiMod.FilterMatchMode.NOT_CONTAINS & String = js.native
  
  @js.native
  sealed trait NOT_EQUALS
    extends StObject
       with FilterMatchMode
  /* "notEquals" */ val NOT_EQUALS: typings.primereact.apiApiMod.FilterMatchMode.NOT_EQUALS & String = js.native
  
  @js.native
  sealed trait STARTS_WITH
    extends StObject
       with FilterMatchMode
  /* "startsWith" */ val STARTS_WITH: typings.primereact.apiApiMod.FilterMatchMode.STARTS_WITH & String = js.native
}
