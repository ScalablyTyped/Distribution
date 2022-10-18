package typings.reactNativeShare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityItemSource extends StObject {
  
  var dataTypeIdentifier: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in react-native-share.react-native-share.ActivityType | string ]: string} */ js.Any
  ] = js.undefined
  
  var item: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined} */ js.Any
  
  var linkMetadata: js.UndefOr[LinkMetadata] = js.undefined
  
  var placeholderItem: ActivityItem
  
  var subject: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in react-native-share.react-native-share.ActivityType | string ]: string} */ js.Any
  ] = js.undefined
  
  var thumbnailImage: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in react-native-share.react-native-share.ActivityType | string ]: string} */ js.Any
  ] = js.undefined
}
object ActivityItemSource {
  
  inline def apply(
    item: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined} */ js.Any,
    placeholderItem: ActivityItem
  ): ActivityItemSource = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], placeholderItem = placeholderItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityItemSource]
  }
  
  extension [Self <: ActivityItemSource](x: Self) {
    
    inline def setDataTypeIdentifier(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in react-native-share.react-native-share.ActivityType | string ]: string} */ js.Any
    ): Self = StObject.set(x, "dataTypeIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDataTypeIdentifierUndefined: Self = StObject.set(x, "dataTypeIdentifier", js.undefined)
    
    inline def setItem(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined} */ js.Any
    ): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setLinkMetadata(value: LinkMetadata): Self = StObject.set(x, "linkMetadata", value.asInstanceOf[js.Any])
    
    inline def setLinkMetadataUndefined: Self = StObject.set(x, "linkMetadata", js.undefined)
    
    inline def setPlaceholderItem(value: ActivityItem): Self = StObject.set(x, "placeholderItem", value.asInstanceOf[js.Any])
    
    inline def setSubject(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in react-native-share.react-native-share.ActivityType | string ]: string} */ js.Any
    ): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setThumbnailImage(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in react-native-share.react-native-share.ActivityType | string ]: string} */ js.Any
    ): Self = StObject.set(x, "thumbnailImage", value.asInstanceOf[js.Any])
    
    inline def setThumbnailImageUndefined: Self = StObject.set(x, "thumbnailImage", js.undefined)
  }
}
