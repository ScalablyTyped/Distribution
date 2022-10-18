package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.typesCoreUtilsMod.QueryFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetQueryFilters[TPageData]
  extends StObject
     with QueryFilters
     with RefetchPageFilters[TPageData]
object ResetQueryFilters {
  
  inline def apply[TPageData](): ResetQueryFilters[TPageData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetQueryFilters[TPageData]]
  }
}
