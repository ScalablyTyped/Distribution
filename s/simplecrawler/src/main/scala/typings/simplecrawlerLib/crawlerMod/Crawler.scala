package typings
package simplecrawlerLib.crawlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crawler
  extends simplecrawlerLib.eventsMod.EventEmitter {
  var acceptCookies: scala.Boolean = js.native
  var allowInitialDomainChange: scala.Boolean = js.native
  var allowedProtocols: js.Array[stdLib.RegExp] = js.native
  var authPass: js.UndefOr[java.lang.String] = js.native
  var authUser: js.UndefOr[java.lang.String] = js.native
  var cache: js.UndefOr[simplecrawlerLib.cacheMod.default] = js.native
  var cookies: simplecrawlerLib.cookiesMod.default = js.native
  var customHeaders: js.Object = js.native
  var decodeResponses: scala.Boolean = js.native
  var decompressResponses: scala.Boolean = js.native
  var discoverRegex: js.Array[js.Function0[scala.Unit] | stdLib.RegExp] = js.native
  var domainWhitelist: js.Array[java.lang.String] = js.native
  var downloadUnsupported: scala.Boolean = js.native
  var filterByDomain: scala.Boolean = js.native
  var host: java.lang.String = js.native
  var httpAgent: simplecrawlerLib.httpMod.Agent = js.native
  var httpsAgent: simplecrawlerLib.httpsMod.Agent = js.native
  var ignoreInvalidSSL: scala.Boolean = js.native
  var ignoreWWWDomain: scala.Boolean = js.native
  var initialURL: java.lang.String = js.native
  var interval: scala.Double = js.native
  var listenerTTL: scala.Double = js.native
  var maxConcurrency: scala.Double = js.native
  var maxDepth: scala.Double = js.native
  var maxResourceSize: scala.Double = js.native
  var needsAuth: scala.Boolean = js.native
  var parseHTMLComments: scala.Boolean = js.native
  var parseScriptTags: scala.Boolean = js.native
  var proxyHostname: java.lang.String = js.native
  var proxyPass: js.UndefOr[java.lang.String] = js.native
  var proxyPort: scala.Double = js.native
  var proxyUser: js.UndefOr[java.lang.String] = js.native
  var queue: simplecrawlerLib.queueMod.default = js.native
  var respectRobotsTxt: scala.Boolean = js.native
  var scanSubdomains: scala.Boolean = js.native
  var sortQueryParameters: scala.Boolean = js.native
  var stripQuerystring: scala.Boolean = js.native
  var stripWWWDomain: scala.Boolean = js.native
  var supportedMimeTypes: js.Array[java.lang.String | stdLib.RegExp] = js.native
  var timeout: scala.Double = js.native
  var urlEncoding: java.lang.String = js.native
  var useProxy: scala.Boolean = js.native
  var userAgent: java.lang.String = js.native
  def addDownloadCondition(
    callback: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* response */ simplecrawlerLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): scala.Double = js.native
  def addFetchCondition(
    callback: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* referrerQueueItem */ simplecrawlerLib.queueMod.QueueItem, 
      scala.Unit
    ]
  ): scala.Double = js.native
  def cleanExpandResources(urlMatch: js.Array[java.lang.String], queueItem: simplecrawlerLib.queueMod.QueueItem): js.Array[java.lang.String] = js.native
  def cleanURL(url: java.lang.String, queueItem: simplecrawlerLib.queueMod.QueueItem): java.lang.String = js.native
  /**
    * @deprecated
    */
  def crawl(): scala.Nothing = js.native
  def decodeBuffer(buffer: simplecrawlerLib.Buffer): java.lang.String = js.native
  def decodeBuffer(buffer: simplecrawlerLib.Buffer, contentTypeHeader: java.lang.String): java.lang.String = js.native
  def discoverResources(resourceText: java.lang.String): js.Array[java.lang.String] = js.native
  def domainValid(host: java.lang.String): scala.Boolean = js.native
  def fetchQueueItem(queueItem: simplecrawlerLib.queueMod.QueueItem): this.type = js.native
  def getRequestOptions(queueItem: simplecrawlerLib.queueMod.QueueItem): RequestOptions = js.native
  def getRobotsTxt(
    url: java.lang.String,
    callback: js.Function3[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* href */ js.UndefOr[java.lang.String], 
      /* responseBody */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): this.type = js.native
  def handleResponse(queueItem: simplecrawlerLib.queueMod.QueueItem, response: simplecrawlerLib.httpMod.IncomingMessage): java.lang.String = js.native
  def handleResponse(
    queueItem: simplecrawlerLib.queueMod.QueueItem,
    response: simplecrawlerLib.httpMod.IncomingMessage,
    timeCommenced: stdLib.Date
  ): java.lang.String = js.native
  def mimeTypeSupported(mimetype: java.lang.String): scala.Boolean = js.native
  @JSName("on")
  def on_complete(event: simplecrawlerLib.simplecrawlerLibStrings.complete, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_cookieerror(
    event: simplecrawlerLib.simplecrawlerLibStrings.cookieerror,
    listener: js.Function3[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* error */ simplecrawlerLib.Error, 
      /* cookie */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_crawlstart(event: simplecrawlerLib.simplecrawlerLibStrings.crawlstart, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_discoverycomplete(
    event: simplecrawlerLib.simplecrawlerLibStrings.discoverycomplete,
    listener: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* resources */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_downloadconditionerror(
    event: simplecrawlerLib.simplecrawlerLibStrings.downloadconditionerror,
    listener: js.Function2[/* queueItem */ simplecrawlerLib.queueMod.QueueItem, /* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_downloadprevented(
    event: simplecrawlerLib.simplecrawlerLibStrings.downloadprevented,
    listener: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* response */ simplecrawlerLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fetch404(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetch404,
    listener: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* response */ simplecrawlerLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fetch410(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetch410,
    listener: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* response */ simplecrawlerLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fetchclienterror(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetchclienterror,
    listener: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* error */ js.UndefOr[js.Object], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fetchcomplete(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetchcomplete,
    listener: js.Function3[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* responseBody */ java.lang.String | simplecrawlerLib.Buffer, 
      /* response */ simplecrawlerLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fetchconditionerror(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetchconditionerror,
    listener: js.Function2[/* queueItem */ simplecrawlerLib.queueMod.QueueItem, /* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_fetchdataerror(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetchdataerror,
    listener: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* response */ simplecrawlerLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fetchdisallowed(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetchdisallowed,
    listener: js.Function1[/* queueItem */ simplecrawlerLib.queueMod.QueueItem, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_fetcherror(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetcherror,
    listener: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* response */ simplecrawlerLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fetchheaders(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetchheaders,
    listener: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* response */ simplecrawlerLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fetchprevented(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetchprevented,
    listener: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* fetchCondition */ js.Function0[scala.Boolean], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fetchredirect(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetchredirect,
    listener: js.Function3[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* redirectQueueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* response */ simplecrawlerLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fetchstart(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetchstart,
    listener: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* requestOptions */ RequestOptions, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fetchtimeout(
    event: simplecrawlerLib.simplecrawlerLibStrings.fetchtimeout,
    listener: js.Function2[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* timeout */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_gziperror(
    event: simplecrawlerLib.simplecrawlerLibStrings.gziperror,
    listener: js.Function3[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* responseBody */ java.lang.String | simplecrawlerLib.Buffer, 
      /* response */ simplecrawlerLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_invaliddomain(
    event: simplecrawlerLib.simplecrawlerLibStrings.invaliddomain,
    listener: js.Function1[/* queueItem */ simplecrawlerLib.queueMod.QueueItem, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_notmodified(
    event: simplecrawlerLib.simplecrawlerLibStrings.notmodified,
    listener: js.Function3[
      /* queueItem */ simplecrawlerLib.queueMod.QueueItem, 
      /* response */ simplecrawlerLib.httpMod.IncomingMessage, 
      /* cacheObject */ simplecrawlerLib.cacheMod.default, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_queueadd(
    event: simplecrawlerLib.simplecrawlerLibStrings.queueadd,
    listener: js.Function2[
      /* queueItem */ js.UndefOr[simplecrawlerLib.queueMod.QueueItem], 
      /* referrer */ js.UndefOr[simplecrawlerLib.queueMod.QueueItem], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_queueduplicate(
    event: simplecrawlerLib.simplecrawlerLibStrings.queueduplicate,
    listener: js.Function1[/* queueItem */ simplecrawlerLib.queueMod.QueueItem, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_queueerror(
    event: simplecrawlerLib.simplecrawlerLibStrings.queueerror,
    listener: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.queueMod.QueueItem], 
      /* queueItem */ js.UndefOr[simplecrawlerLib.queueMod.QueueItem], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_robotstxterror(
    event: simplecrawlerLib.simplecrawlerLibStrings.robotstxterror,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  def processURL(url: java.lang.String): simplecrawlerLib.queueMod.QueueItem = js.native
  def processURL(url: java.lang.String, referer: simplecrawlerLib.queueMod.QueueItem): simplecrawlerLib.queueMod.QueueItem = js.native
  def protocolSupported(url: java.lang.String): scala.Boolean = js.native
  def queueLinkedItems(resourceData: java.lang.String, queueItem: simplecrawlerLib.queueMod.QueueItem): this.type = js.native
  def queueLinkedItems(resourceData: simplecrawlerLib.Buffer, queueItem: simplecrawlerLib.queueMod.QueueItem): this.type = js.native
  def queueURL(url: java.lang.String): scala.Boolean = js.native
  def queueURL(url: java.lang.String, referrer: simplecrawlerLib.queueMod.QueueItem): scala.Boolean = js.native
  def queueURL(url: java.lang.String, referrer: simplecrawlerLib.queueMod.QueueItem, force: scala.Boolean): scala.Boolean = js.native
  def removeDownloadCondition(id: js.Function0[scala.Unit]): scala.Boolean = js.native
  def removeDownloadCondition(id: scala.Double): scala.Boolean = js.native
  def removeFetchCondition(id: js.Function0[scala.Unit]): scala.Boolean = js.native
  def removeFetchCondition(id: scala.Double): scala.Boolean = js.native
  def start(): this.type = js.native
  def stop(): this.type = js.native
  def stop(abortRequestsInFlight: scala.Boolean): this.type = js.native
  def urlIsAllowed(url: java.lang.String): scala.Boolean = js.native
}

