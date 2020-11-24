package typings.reactNativeShare.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityItemSource extends js.Object {
  
  var dataTypeIdentifier: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
  ] = js.native
  
  var item: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any] = js.native
  
  var linkMetadata: js.UndefOr[LinkMetadata] = js.native
  
  var placeholderItem: ActivityItem = js.native
  
  var subject: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
  ] = js.native
  
  var thumbnailImage: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
  ] = js.native
}
object ActivityItemSource {
  
  @scala.inline
  def apply(
    item: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any],
    placeholderItem: ActivityItem
  ): ActivityItemSource = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], placeholderItem = placeholderItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityItemSource]
  }
  
  @scala.inline
  implicit class ActivityItemSourceOps[Self <: ActivityItemSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItem(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined}
      */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
    ): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderItem(value: ActivityItem): Self = this.set("placeholderItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeIdentifier(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
      */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
    ): Self = this.set("dataTypeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTypeIdentifier: Self = this.set("dataTypeIdentifier", js.undefined)
    
    @scala.inline
    def setLinkMetadata(value: LinkMetadata): Self = this.set("linkMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkMetadata: Self = this.set("linkMetadata", js.undefined)
    
    @scala.inline
    def setSubject(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
      */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
    ): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setThumbnailImage(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
      */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
    ): Self = this.set("thumbnailImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailImage: Self = this.set("thumbnailImage", js.undefined)
  }
}
