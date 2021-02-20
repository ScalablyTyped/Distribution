package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAppLayout ...
  */
@js.native
trait INxAppLayout extends StObject {
  
  /**
    * In Qlik Sense Enterprise, this property corresponds to the app identifier (GUID).
    * In Qlik Sense Desktop, this property corresponds to the full path of the app.
    */
  var qFileName: String = js.native
  
  /**
    * Is set to true if the app contains data following a script reload.
    */
  var qHasData: Boolean = js.native
  
  /**
    * Is set to true if a script is defined in the app.
    */
  var qHasScript: Boolean = js.native
  
  /**
    * If set to true, it means that the app was opened without loading its data.
    */
  var qIsOpenedWithoutData: Boolean = js.native
  
  /**
    * Date and time of the last reload of the app in ISO format.
    */
  var qLastReloadTime: String = js.native
  
  /**
    * Information about the locale.
    */
  var qLocaleInfo: ILocaleInfo = js.native
  
  /**
    * Information on publishing and permissions.
    */
  var qMeta: INxMeta = js.native
  
  /**
    * Is set to true if the app has been updated since the last save.
    */
  var qModified: Boolean = js.native
  
  /**
    * If set to true, it means that the app is read-only.
    */
  var qReadOnly: Boolean = js.native
  
  /**
    * Array of alternate states.
    */
  var qStateNames: js.Array[String] = js.native
  
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrl = js.native
  
  /**
    * Title of the app.
    */
  var qTitle: String = js.native
}
object INxAppLayout {
  
  @scala.inline
  def apply(
    qFileName: String,
    qHasData: Boolean,
    qHasScript: Boolean,
    qIsOpenedWithoutData: Boolean,
    qLastReloadTime: String,
    qLocaleInfo: ILocaleInfo,
    qMeta: INxMeta,
    qModified: Boolean,
    qReadOnly: Boolean,
    qStateNames: js.Array[String],
    qThumbnail: IStaticContentUrl,
    qTitle: String
  ): INxAppLayout = {
    val __obj = js.Dynamic.literal(qFileName = qFileName.asInstanceOf[js.Any], qHasData = qHasData.asInstanceOf[js.Any], qHasScript = qHasScript.asInstanceOf[js.Any], qIsOpenedWithoutData = qIsOpenedWithoutData.asInstanceOf[js.Any], qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qLocaleInfo = qLocaleInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qModified = qModified.asInstanceOf[js.Any], qReadOnly = qReadOnly.asInstanceOf[js.Any], qStateNames = qStateNames.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAppLayout]
  }
  
  @scala.inline
  implicit class INxAppLayoutMutableBuilder[Self <: INxAppLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFileName(value: String): Self = StObject.set(x, "qFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQHasData(value: Boolean): Self = StObject.set(x, "qHasData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQHasScript(value: Boolean): Self = StObject.set(x, "qHasScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsOpenedWithoutData(value: Boolean): Self = StObject.set(x, "qIsOpenedWithoutData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLastReloadTime(value: String): Self = StObject.set(x, "qLastReloadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLocaleInfo(value: ILocaleInfo): Self = StObject.set(x, "qLocaleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeta(value: INxMeta): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQModified(value: Boolean): Self = StObject.set(x, "qModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReadOnly(value: Boolean): Self = StObject.set(x, "qReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateNames(value: js.Array[String]): Self = StObject.set(x, "qStateNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateNamesVarargs(value: String*): Self = StObject.set(x, "qStateNames", js.Array(value :_*))
    
    @scala.inline
    def setQThumbnail(value: IStaticContentUrl): Self = StObject.set(x, "qThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTitle(value: String): Self = StObject.set(x, "qTitle", value.asInstanceOf[js.Any])
  }
}
