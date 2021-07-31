package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.sentryCore.anon.Dictkey
import typings.sentryTypes.dsnMod.DsnLike
import typings.sentryUtils.mod.Dsn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("@sentry/core/dist/api", "API")
  @js.native
  class API protected () extends StObject {
    /** Create a new instance of API */
    def this(dsn: DsnLike) = this()
    
    /** The internally used Dsn object. */
    val _dsnObject: js.Any = js.native
    
    /** Returns a URL-encoded string with auth config suitable for a query string. */
    var _encodedAuth: js.Any = js.native
    
    /** Returns the envelope endpoint URL. */
    var _getEnvelopeEndpoint: js.Any = js.native
    
    /** Returns the ingest API endpoint for target. */
    var _getIngestEndpoint: js.Any = js.native
    
    var dsn: DsnLike = js.native
    
    /** Returns the prefix to construct Sentry ingestion API endpoints. */
    def getBaseApiEndpoint(): String = js.native
    
    /** Returns the Dsn object. */
    def getDsn(): Dsn = js.native
    
    /**
      * Returns the envelope endpoint URL with auth in the query string.
      *
      * Sending auth as part of the query string and not as custom HTTP headers avoids CORS preflight requests.
      */
    def getEnvelopeEndpointWithUrlEncodedAuth(): String = js.native
    
    /** Returns the url to the report dialog endpoint. */
    def getReportDialogEndpoint(): String = js.native
    def getReportDialogEndpoint(dialogOptions: Dictkey): String = js.native
    
    /**
      * Returns an object that can be used in request headers.
      * This is needed for node and the old /store endpoint in sentry
      */
    def getRequestHeaders(clientName: String, clientVersion: String): StringDictionary[String] = js.native
    
    /** Returns the store endpoint URL. */
    def getStoreEndpoint(): String = js.native
    
    /** Returns only the path component for the store endpoint. */
    def getStoreEndpointPath(): String = js.native
    
    /**
      * Returns the store endpoint URL with auth in the query string.
      *
      * Sending auth as part of the query string and not as custom HTTP headers avoids CORS preflight requests.
      */
    def getStoreEndpointWithUrlEncodedAuth(): String = js.native
  }
}
