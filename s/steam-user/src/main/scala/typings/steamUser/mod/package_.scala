package typings.steamUser.mod

import typings.std.Record
import typings.steamUser.anon.EnglishName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Formats a currency value and returns a string
  */
/* static member */
inline def formatCurrency(amount: Double, currency: ECurrencyCode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(amount.asInstanceOf[js.Any], currency.asInstanceOf[js.Any])).asInstanceOf[String]

// https://developer.valvesoftware.com/wiki/Master_Server_Query_Protocol#Region_codes
type OwnsFilterFunction = js.Function3[
/* element */ ProtoCMsgClientLicenseListLicense, 
/* index */ Double, 
/* array */ js.Array[ProtoCMsgClientLicenseListLicense], 
Boolean]

type PublishedFileDetails = Record[String, Record[String, Any]]

//#endregion "Helper Types"
//#region "Response Types"
type StoreTagNames = Record[String, EnglishName]
