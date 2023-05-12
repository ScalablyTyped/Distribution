package typings.steamUser.mod

import typings.node.bufferMod.global.Buffer
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

inline def parseAppTicket(ticket: typings.bytebuffer.mod.^): (Record[String, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAppTicket")(ticket.asInstanceOf[js.Any]).asInstanceOf[(Record[String, Any]) | Null]
inline def parseAppTicket(ticket: typings.bytebuffer.mod.^, allowInvalidSignature: Boolean): (Record[String, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAppTicket")(ticket.asInstanceOf[js.Any], allowInvalidSignature.asInstanceOf[js.Any])).asInstanceOf[(Record[String, Any]) | Null]
/* static member */
inline def parseAppTicket(ticket: Buffer): (Record[String, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAppTicket")(ticket.asInstanceOf[js.Any]).asInstanceOf[(Record[String, Any]) | Null]
inline def parseAppTicket(ticket: Buffer, allowInvalidSignature: Boolean): (Record[String, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAppTicket")(ticket.asInstanceOf[js.Any], allowInvalidSignature.asInstanceOf[js.Any])).asInstanceOf[(Record[String, Any]) | Null]

inline def parseEncryptedAppTicket(ticket: Buffer, encryptionKey: String): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEncryptedAppTicket")(ticket.asInstanceOf[js.Any], encryptionKey.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
/* static member */
inline def parseEncryptedAppTicket(ticket: Buffer, encryptionKey: Buffer): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEncryptedAppTicket")(ticket.asInstanceOf[js.Any], encryptionKey.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]

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
