package typings.reactQuery.typesMod

import typings.reactQuery.utilsMod.QueryFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefetchQueryFilters[TPageData]
  extends StObject
     with QueryFilters
     with RefetchPageFilters[TPageData]
object RefetchQueryFilters {
  
  inline def apply[TPageData](): RefetchQueryFilters[TPageData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefetchQueryFilters[TPageData]]
  }
}
