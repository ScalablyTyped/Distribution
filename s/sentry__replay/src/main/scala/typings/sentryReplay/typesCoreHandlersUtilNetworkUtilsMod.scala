package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.NetworkBody
import typings.sentryReplay.typesTypesMod.NetworkRequestData
import typings.sentryReplay.typesTypesMod.ReplayNetworkRequestData
import typings.sentryReplay.typesTypesMod.ReplayNetworkRequestOrResponse
import typings.sentryReplay.typesTypesMod.ReplayPerformanceEntry
import typings.sentryTypes.typesTextencoderMod.TextEncoderInternal
import typings.std.BodyInit
import typings.std.Record
import typings.std.TextEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersUtilNetworkUtilsMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/util/networkUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildNetworkRequestOrResponse(headers: Record[String, String]): js.UndefOr[ReplayNetworkRequestOrResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildNetworkRequestOrResponse")(headers.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReplayNetworkRequestOrResponse]]
  inline def buildNetworkRequestOrResponse(headers: Record[String, String], bodySize: Double): js.UndefOr[ReplayNetworkRequestOrResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNetworkRequestOrResponse")(headers.asInstanceOf[js.Any], bodySize.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReplayNetworkRequestOrResponse]]
  inline def buildNetworkRequestOrResponse(headers: Record[String, String], bodySize: Double, body: String): js.UndefOr[ReplayNetworkRequestOrResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNetworkRequestOrResponse")(headers.asInstanceOf[js.Any], bodySize.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReplayNetworkRequestOrResponse]]
  inline def buildNetworkRequestOrResponse(headers: Record[String, String], bodySize: Unit, body: String): js.UndefOr[ReplayNetworkRequestOrResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNetworkRequestOrResponse")(headers.asInstanceOf[js.Any], bodySize.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReplayNetworkRequestOrResponse]]
  
  inline def buildSkippedNetworkRequestOrResponse(): ReplayNetworkRequestOrResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSkippedNetworkRequestOrResponse")().asInstanceOf[ReplayNetworkRequestOrResponse]
  inline def buildSkippedNetworkRequestOrResponse(bodySize: Double): ReplayNetworkRequestOrResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSkippedNetworkRequestOrResponse")(bodySize.asInstanceOf[js.Any]).asInstanceOf[ReplayNetworkRequestOrResponse]
  
  inline def getAllowedHeaders(headers: Record[String, String], allowedHeaders: js.Array[String]): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllowedHeaders")(headers.asInstanceOf[js.Any], allowedHeaders.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  
  inline def getBodySize(body: Null, textEncoder: TextEncoderInternal): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBodySize")(body.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getBodySize(body: Null, textEncoder: TextEncoder): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBodySize")(body.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getBodySize(body: Unit, textEncoder: TextEncoderInternal): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBodySize")(body.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getBodySize(body: Unit, textEncoder: TextEncoder): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBodySize")(body.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getBodySize(body: BodyInit, textEncoder: TextEncoderInternal): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBodySize")(body.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getBodySize(body: BodyInit, textEncoder: TextEncoder): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBodySize")(body.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getBodyString(body: Any): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBodyString")(body.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getNetworkBody(): js.UndefOr[NetworkBody] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkBody")().asInstanceOf[js.UndefOr[NetworkBody]]
  inline def getNetworkBody(bodyText: String): js.UndefOr[NetworkBody] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkBody")(bodyText.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NetworkBody]]
  
  inline def makeNetworkReplayBreadcrumb(`type`: String): ReplayPerformanceEntry[NetworkRequestData] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNetworkReplayBreadcrumb")(`type`.asInstanceOf[js.Any]).asInstanceOf[ReplayPerformanceEntry[NetworkRequestData] | Null]
  inline def makeNetworkReplayBreadcrumb(`type`: String, data: ReplayNetworkRequestData): ReplayPerformanceEntry[NetworkRequestData] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("makeNetworkReplayBreadcrumb")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ReplayPerformanceEntry[NetworkRequestData] | Null]
  
  inline def parseContentLengthHeader(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContentLengthHeader")().asInstanceOf[js.UndefOr[Double]]
  inline def parseContentLengthHeader(header: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContentLengthHeader")(header.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def urlMatches(url: String, urls: js.Array[String | js.RegExp]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("urlMatches")(url.asInstanceOf[js.Any], urls.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
