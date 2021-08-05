package typings.reactGeocode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-geocode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enableDebug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableDebug")().asInstanceOf[Unit]
  inline def enableDebug(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableDebug")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fromAddress(address: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def fromAddress(address: String, apiKey: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromAddress(address: String, apiKey: String, language: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromAddress(address: String, apiKey: String, language: String, region: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromAddress(address: String, apiKey: String, language: Unit, region: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromAddress(address: String, apiKey: Unit, language: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromAddress(address: String, apiKey: Unit, language: String, region: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromAddress(address: String, apiKey: Unit, language: Unit, region: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  inline def fromLatLng(latitude: String, longitude: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromLatLng(latitude: String, longitude: String, apiKey: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromLatLng(latitude: String, longitude: String, apiKey: String, language: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromLatLng(latitude: String, longitude: String, apiKey: String, language: String, region: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromLatLng(latitude: String, longitude: String, apiKey: String, language: Unit, region: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromLatLng(latitude: String, longitude: String, apiKey: Unit, language: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromLatLng(latitude: String, longitude: String, apiKey: Unit, language: String, region: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def fromLatLng(latitude: String, longitude: String, apiKey: Unit, language: Unit, region: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  inline def setApiKey(api_key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setApiKey")(api_key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLanguage(language: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setRegion(region: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRegion")(region.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
