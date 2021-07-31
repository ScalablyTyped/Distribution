package typings.reactNativeShare.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityItemSource extends StObject {
  
  var dataTypeIdentifier: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource & TopLevel[js.Any]
  ] = js.undefined
  
  var item: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource & TopLevel[js.Any]
  
  var linkMetadata: js.UndefOr[LinkMetadata] = js.undefined
  
  var placeholderItem: ActivityItem
  
  var subject: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource & TopLevel[js.Any]
  ] = js.undefined
  
  var thumbnailImage: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource & TopLevel[js.Any]
  ] = js.undefined
}
object ActivityItemSource {
  
  @scala.inline
  def apply(
    item: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource & TopLevel[js.Any],
    placeholderItem: ActivityItem
  ): ActivityItemSource = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], placeholderItem = placeholderItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityItemSource]
  }
  
  @scala.inline
  implicit class ActivityItemSourceMutableBuilder[Self <: ActivityItemSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTypeIdentifier(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
      */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource & TopLevel[js.Any]
    ): Self = StObject.set(x, "dataTypeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeIdentifierUndefined: Self = StObject.set(x, "dataTypeIdentifier", js.undefined)
    
    @scala.inline
    def setItem(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined}
      */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource & TopLevel[js.Any]
    ): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkMetadata(value: LinkMetadata): Self = StObject.set(x, "linkMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkMetadataUndefined: Self = StObject.set(x, "linkMetadata", js.undefined)
    
    @scala.inline
    def setPlaceholderItem(value: ActivityItem): Self = StObject.set(x, "placeholderItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
      */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource & TopLevel[js.Any]
    ): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setThumbnailImage(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
      */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource & TopLevel[js.Any]
    ): Self = StObject.set(x, "thumbnailImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailImageUndefined: Self = StObject.set(x, "thumbnailImage", js.undefined)
  }
}
