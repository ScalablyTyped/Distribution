package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.ConfirmSiteSpecificExceptionsInformation
import typings.std.ExceptionInformation
import typings.std.Navigator
import typings.std.StoreExceptionsInformation
import typings.std.StoreSiteSpecificExceptionsInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Navigator")
@js.native
class Navigator_ () extends Navigator {
  /* CompleteClass */
  override val appCodeName: java.lang.String = js.native
  /* CompleteClass */
  override val appName: java.lang.String = js.native
  /* CompleteClass */
  override val appVersion: java.lang.String = js.native
  /* CompleteClass */
  override val cookieEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override val hardwareConcurrency: Double = js.native
  /* CompleteClass */
  override val language: java.lang.String = js.native
  /* CompleteClass */
  override val languages: js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override val mimeTypes: typings.std.MimeTypeArray = js.native
  /* CompleteClass */
  override val onLine: scala.Boolean = js.native
  /* CompleteClass */
  override val platform: java.lang.String = js.native
  /* CompleteClass */
  override val plugins: typings.std.PluginArray = js.native
  /* CompleteClass */
  override val product: java.lang.String = js.native
  /* CompleteClass */
  override val productSub: java.lang.String = js.native
  /* CompleteClass */
  override val storage: typings.std.StorageManager = js.native
  /* CompleteClass */
  override val userAgent: java.lang.String = js.native
  /* CompleteClass */
  override val vendor: java.lang.String = js.native
  /* CompleteClass */
  override val vendorSub: java.lang.String = js.native
  /* CompleteClass */
  override val webdriver: scala.Boolean = js.native
  /* CompleteClass */
  override def confirmSiteSpecificTrackingException(args: ConfirmSiteSpecificExceptionsInformation): scala.Boolean = js.native
  /* CompleteClass */
  override def confirmWebWideTrackingException(args: ExceptionInformation): scala.Boolean = js.native
  /* CompleteClass */
  override def javaEnabled(): scala.Boolean = js.native
  /* CompleteClass */
  override def registerProtocolHandler(scheme: java.lang.String, url: java.lang.String, title: java.lang.String): Unit = js.native
  /* CompleteClass */
  override def removeSiteSpecificTrackingException(args: ExceptionInformation): Unit = js.native
  /* CompleteClass */
  override def removeWebWideTrackingException(args: ExceptionInformation): Unit = js.native
  /* CompleteClass */
  override def storeSiteSpecificTrackingException(args: StoreSiteSpecificExceptionsInformation): Unit = js.native
  /* CompleteClass */
  override def storeWebWideTrackingException(args: StoreExceptionsInformation): Unit = js.native
  /* CompleteClass */
  override def unregisterProtocolHandler(scheme: java.lang.String, url: java.lang.String): Unit = js.native
}

@JSGlobal("Navigator")
@js.native
object Navigator_ extends Instantiable0[Navigator]

