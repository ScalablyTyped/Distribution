package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Network.ResourceTiming
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "HTTPResponse")
@js.native
open class HTTPResponse () extends StObject {
  
  /**
    * @returns Promise which resolves to a buffer with response body.
    */
  def buffer(): js.Promise[Buffer] = js.native
  
  /**
    * @returns A {@link Frame} that initiated this response, or `null` if
    * navigating to error pages.
    */
  def frame(): Frame | Null = js.native
  
  /**
    * @returns True if the response was served from either the browser's disk
    * cache or memory cache.
    */
  def fromCache(): Boolean = js.native
  
  /**
    * @returns True if the response was served by a service worker.
    */
  def fromServiceWorker(): Boolean = js.native
  
  /**
    * @returns An object with HTTP headers associated with the response. All
    * header names are lower-case.
    */
  def headers(): Record[String, String] = js.native
  
  /**
    *
    * @returns Promise which resolves to a JSON representation of response body.
    *
    * @remarks
    *
    * This method will throw if the response body is not parsable via
    * `JSON.parse`.
    */
  def json(): js.Promise[Any] = js.native
  
  /**
    * @returns True if the response was successful (status in the range 200-299).
    */
  def ok(): Boolean = js.native
  
  /* private */ var `private`: Any = js.native
  
  /* Excluded from this release type: __constructor */
  /* Excluded from this release type: _resolveBody */
  /**
    * @returns The IP address and port number used to connect to the remote
    * server.
    */
  def remoteAddress(): RemoteAddress = js.native
  
  /**
    * @returns A matching {@link HTTPRequest} object.
    */
  def request(): HTTPRequest = js.native
  
  /**
    * @returns {@link SecurityDetails} if the response was received over the
    * secure connection, or `null` otherwise.
    */
  def securityDetails(): SecurityDetails | Null = js.native
  
  /**
    * @returns The status code of the response (e.g., 200 for a success).
    */
  def status(): Double = js.native
  
  /**
    * @returns The status text of the response (e.g. usually an "OK" for a
    * success).
    */
  def statusText(): String = js.native
  
  /**
    * @returns Promise which resolves to a text representation of response body.
    */
  def text(): js.Promise[String] = js.native
  
  /**
    * @returns Timing information related to the response.
    */
  def timing(): ResourceTiming | Null = js.native
  
  /**
    * @returns The URL of the response.
    */
  def url(): String = js.native
}
