package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceAssetCallback extends StObject {
  
  var getRowData: js.UndefOr[
    js.Function3[/* dataBlob */ Any, /* sectionID */ Double | String, /* rowID */ Double | String, Any]
  ] = js.undefined
  
  var getSectionHeaderData: js.UndefOr[js.Function2[/* dataBlob */ Any, /* sectionID */ Double | String, Any]] = js.undefined
  
  var rowHasChanged: js.UndefOr[js.Function2[/* r1 */ Any, /* r2 */ Any, Boolean]] = js.undefined
  
  var sectionHeaderHasChanged: js.UndefOr[js.Function2[/* h1 */ Any, /* h2 */ Any, Boolean]] = js.undefined
}
object DataSourceAssetCallback {
  
  inline def apply(): DataSourceAssetCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceAssetCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceAssetCallback] (val x: Self) extends AnyVal {
    
    inline def setGetRowData(value: (/* dataBlob */ Any, /* sectionID */ Double | String, /* rowID */ Double | String) => Any): Self = StObject.set(x, "getRowData", js.Any.fromFunction3(value))
    
    inline def setGetRowDataUndefined: Self = StObject.set(x, "getRowData", js.undefined)
    
    inline def setGetSectionHeaderData(value: (/* dataBlob */ Any, /* sectionID */ Double | String) => Any): Self = StObject.set(x, "getSectionHeaderData", js.Any.fromFunction2(value))
    
    inline def setGetSectionHeaderDataUndefined: Self = StObject.set(x, "getSectionHeaderData", js.undefined)
    
    inline def setRowHasChanged(value: (/* r1 */ Any, /* r2 */ Any) => Boolean): Self = StObject.set(x, "rowHasChanged", js.Any.fromFunction2(value))
    
    inline def setRowHasChangedUndefined: Self = StObject.set(x, "rowHasChanged", js.undefined)
    
    inline def setSectionHeaderHasChanged(value: (/* h1 */ Any, /* h2 */ Any) => Boolean): Self = StObject.set(x, "sectionHeaderHasChanged", js.Any.fromFunction2(value))
    
    inline def setSectionHeaderHasChangedUndefined: Self = StObject.set(x, "sectionHeaderHasChanged", js.undefined)
  }
}
