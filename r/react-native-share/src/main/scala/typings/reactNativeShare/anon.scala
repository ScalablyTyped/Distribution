package typings.reactNativeShare

import typings.reactNativeShare.mod.ActivityItemSource
import typings.reactNativeShare.mod.Share.Social
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined react-native-share.react-native-share.Options & {  social :react-native-share.react-native-share.Share.Social} */
  trait OptionssocialSocial extends StObject {
    
    var activityItemSources: js.UndefOr[js.Array[ActivityItemSource]] = js.undefined
    
    var excludedActivityTypes: js.UndefOr[String] = js.undefined
    
    var failOnCancel: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var saveToFiles: js.UndefOr[Boolean] = js.undefined
    
    var showAppsToView: js.UndefOr[Boolean] = js.undefined
    
    var social: Social
    
    var subject: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var urls: js.UndefOr[js.Array[String]] = js.undefined
  }
  object OptionssocialSocial {
    
    inline def apply(social: Social): OptionssocialSocial = {
      val __obj = js.Dynamic.literal(social = social.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionssocialSocial]
    }
    
    extension [Self <: OptionssocialSocial](x: Self) {
      
      inline def setActivityItemSources(value: js.Array[ActivityItemSource]): Self = StObject.set(x, "activityItemSources", value.asInstanceOf[js.Any])
      
      inline def setActivityItemSourcesUndefined: Self = StObject.set(x, "activityItemSources", js.undefined)
      
      inline def setActivityItemSourcesVarargs(value: ActivityItemSource*): Self = StObject.set(x, "activityItemSources", js.Array(value :_*))
      
      inline def setExcludedActivityTypes(value: String): Self = StObject.set(x, "excludedActivityTypes", value.asInstanceOf[js.Any])
      
      inline def setExcludedActivityTypesUndefined: Self = StObject.set(x, "excludedActivityTypes", js.undefined)
      
      inline def setFailOnCancel(value: Boolean): Self = StObject.set(x, "failOnCancel", value.asInstanceOf[js.Any])
      
      inline def setFailOnCancelUndefined: Self = StObject.set(x, "failOnCancel", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setSaveToFiles(value: Boolean): Self = StObject.set(x, "saveToFiles", value.asInstanceOf[js.Any])
      
      inline def setSaveToFilesUndefined: Self = StObject.set(x, "saveToFiles", js.undefined)
      
      inline def setShowAppsToView(value: Boolean): Self = StObject.set(x, "showAppsToView", value.asInstanceOf[js.Any])
      
      inline def setShowAppsToViewUndefined: Self = StObject.set(x, "showAppsToView", js.undefined)
      
      inline def setSocial(value: Social): Self = StObject.set(x, "social", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    }
  }
}
