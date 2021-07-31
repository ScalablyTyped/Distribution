package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceAssetCallback extends StObject {
  
  var getRowData: js.UndefOr[
    js.Function3[
      /* dataBlob */ js.Any, 
      /* sectionID */ Double | String, 
      /* rowID */ Double | String, 
      js.Any
    ]
  ] = js.undefined
  
  var getSectionHeaderData: js.UndefOr[js.Function2[/* dataBlob */ js.Any, /* sectionID */ Double | String, js.Any]] = js.undefined
  
  var rowHasChanged: js.UndefOr[js.Function2[/* r1 */ js.Any, /* r2 */ js.Any, Boolean]] = js.undefined
  
  var sectionHeaderHasChanged: js.UndefOr[js.Function2[/* h1 */ js.Any, /* h2 */ js.Any, Boolean]] = js.undefined
}
object DataSourceAssetCallback {
  
  @scala.inline
  def apply(): DataSourceAssetCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceAssetCallback]
  }
  
  @scala.inline
  implicit class DataSourceAssetCallbackMutableBuilder[Self <: DataSourceAssetCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRowData(
      value: (/* dataBlob */ js.Any, /* sectionID */ Double | String, /* rowID */ Double | String) => js.Any
    ): Self = StObject.set(x, "getRowData", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetRowDataUndefined: Self = StObject.set(x, "getRowData", js.undefined)
    
    @scala.inline
    def setGetSectionHeaderData(value: (/* dataBlob */ js.Any, /* sectionID */ Double | String) => js.Any): Self = StObject.set(x, "getSectionHeaderData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSectionHeaderDataUndefined: Self = StObject.set(x, "getSectionHeaderData", js.undefined)
    
    @scala.inline
    def setRowHasChanged(value: (/* r1 */ js.Any, /* r2 */ js.Any) => Boolean): Self = StObject.set(x, "rowHasChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowHasChangedUndefined: Self = StObject.set(x, "rowHasChanged", js.undefined)
    
    @scala.inline
    def setSectionHeaderHasChanged(value: (/* h1 */ js.Any, /* h2 */ js.Any) => Boolean): Self = StObject.set(x, "sectionHeaderHasChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSectionHeaderHasChangedUndefined: Self = StObject.set(x, "sectionHeaderHasChanged", js.undefined)
  }
}
