package typings.reactNativeShare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityItemSource extends js.Object {
  var dataTypeIdentifier: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with js.Any
  ] = js.undefined
  var item: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with js.Any
  var linkMetadata: js.UndefOr[LinkMetadata] = js.undefined
  var placeholderItem: ActivityItem
  var subject: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with js.Any
  ] = js.undefined
  var thumbnailImage: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with js.Any
  ] = js.undefined
}

object ActivityItemSource {
  @scala.inline
  def apply(
    item: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with js.Any,
    placeholderItem: ActivityItem,
    dataTypeIdentifier: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with js.Any = null,
    linkMetadata: LinkMetadata = null,
    subject: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with js.Any = null,
    thumbnailImage: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typings.reactNativeShare.reactNativeShareStrings.ActivityItemSource with js.Any = null
  ): ActivityItemSource = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], placeholderItem = placeholderItem.asInstanceOf[js.Any])
    if (dataTypeIdentifier != null) __obj.updateDynamic("dataTypeIdentifier")(dataTypeIdentifier.asInstanceOf[js.Any])
    if (linkMetadata != null) __obj.updateDynamic("linkMetadata")(linkMetadata.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (thumbnailImage != null) __obj.updateDynamic("thumbnailImage")(thumbnailImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityItemSource]
  }
}

