package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPage extends js.Object {
  // Properties
  var canGoBack: scala.Boolean = js.native
  var canGoForward: scala.Boolean = js.native
  var captureContent: js.Array[stdLib.RegExp] = js.native
  var clipRect: ClipRect = js.native
  var content: java.lang.String = js.native
  var cookies: js.Array[Cookie] = js.native
  var customHeaders: ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  var event: js.Any = js.native
   // :TODO: elaborate this when documentation improves
  var focusedFrameName: java.lang.String = js.native
  var frameContent: java.lang.String = js.native
  var frameName: java.lang.String = js.native
  var framePlainText: java.lang.String = js.native
  var frameTitle: java.lang.String = js.native
  var frameUrl: java.lang.String = js.native
  var framesCount: scala.Double = js.native
  var framesName: js.Any = js.native
   // :TODO: elaborate this when documentation improves
  var libraryPath: java.lang.String = js.native
  var navigationLocked: scala.Boolean = js.native
  var offlineStoragePath: java.lang.String = js.native
  var offlineStorageQuota: scala.Double = js.native
  var ownsPages: scala.Boolean = js.native
  var pages: js.Array[WebPage] = js.native
  var pagesWindowName: java.lang.String = js.native
  var paperSize: PaperSize = js.native
  var plainText: java.lang.String = js.native
  var scrollPosition: TopLeft = js.native
  var settings: WebPageSettings = js.native
  var title: java.lang.String = js.native
  var url: java.lang.String = js.native
  var viewportSize: Size = js.native
  var windowName: java.lang.String = js.native
  var zoomFactor: scala.Double = js.native
   // slimerjs only
  // Functions
  def addCookie(cookie: Cookie): scala.Boolean = js.native
  def childFramesCount(): scala.Double = js.native
    // DEPRECATED
  def childFramesName(): java.lang.String = js.native
    // DEPRECATED
  def clearCookies(): scala.Unit = js.native
  def close(): js.Promise[scala.Unit] = js.native
  @JSName("close")
  def close_Unit(): scala.Unit = js.native
  // Callback triggers
  def closing(closingPage: WebPage): scala.Unit = js.native
  def currentFrameName(): java.lang.String = js.native
    // DEPRECATED
  def deleteCookie(cookieName: java.lang.String): scala.Boolean = js.native
  // evaluate<R>(callback: () => R): Promise<R>;
  // evaluate<T, R>(callback: (arg: T) => R, arg: T): Promise<R>;
  // evaluate<T1, T2, R>(callback: (arg1: T1, arg2: T2) => R, arg1: T1, arg2: T2): Promise<R>;
  // evaluate<T1, T2, T3, R>(callback: (arg1: T1, arg2: T2, arg3: T3) => R, arg1: T1, arg2: T2, arg3: T3): Promise<R>;
  // evaluate<R>(callback: (...args: any[]) => R, ...args: any[]): Promise<R>;
  def evaluate[R](callback: js.Function1[/* repeated */js.Any, R], args: js.Any*): R = js.native
  def evaluateAsync(fn: js.Function1[/* repeated */js.Any, scala.Unit], delayMilli: scala.Double, args: js.Any*): scala.Unit = js.native
  def evaluateJavaScript(str: java.lang.String): js.Any = js.native
   // :TODO: elaborate this when documentation improves
  def getPage(windowName: java.lang.String): WebPage = js.native
  def go(index: scala.Double): scala.Unit = js.native
  def goBack(): scala.Unit = js.native
  def goForward(): scala.Unit = js.native
  def includeJs(url: java.lang.String): js.Promise[scala.Unit] = js.native
  def includeJs(url: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def initialized(): scala.Unit = js.native
  def injectJs(filename: java.lang.String): js.Promise[scala.Boolean] = js.native
  @JSName("injectJs")
  def injectJs_Boolean(filename: java.lang.String): scala.Boolean = js.native
  def javaScriptAlertSent(msg: java.lang.String): scala.Unit = js.native
  def javaScriptConsoleMessageSent(msg: java.lang.String): scala.Unit = js.native
  def javaScriptConsoleMessageSent(msg: java.lang.String, lineNum: scala.Double): scala.Unit = js.native
  def javaScriptConsoleMessageSent(msg: java.lang.String, lineNum: scala.Double, sourceId: java.lang.String): scala.Unit = js.native
  def loadFinished(status: java.lang.String): scala.Unit = js.native
  def loadStarted(): scala.Unit = js.native
  def navigationRequested(url: java.lang.String, `type`: java.lang.String, willNavigate: scala.Boolean, main: scala.Boolean): scala.Unit = js.native
  // Callbacks
  def onAlert(msg: java.lang.String): js.Any = js.native
  def onCallback(): scala.Unit = js.native
    // EXPERIMENTAL
  def onClosing(closingPage: WebPage): js.Any = js.native
  def onConfirm(msg: java.lang.String): scala.Boolean = js.native
  def onConsoleMessage(msg: java.lang.String): js.Any = js.native
  def onConsoleMessage(msg: java.lang.String, lineNum: scala.Double): js.Any = js.native
  def onConsoleMessage(msg: java.lang.String, lineNum: scala.Double, sourceId: java.lang.String): js.Any = js.native
  def onError(msg: java.lang.String, trace: js.Array[java.lang.String]): js.Any = js.native
  def onFilePicker(oldFile: java.lang.String): java.lang.String = js.native
  def onInitialized(): js.Any = js.native
  def onLoadFinished(status: java.lang.String): js.Any = js.native
  def onLoadStarted(): js.Any = js.native
  def onNavigationRequested(url: java.lang.String, `type`: java.lang.String, willNavigate: scala.Boolean, main: scala.Boolean): js.Any = js.native
  def onPageCreated(newPage: WebPage): js.Any = js.native
  def onPrompt(msg: java.lang.String, defaultVal: java.lang.String): java.lang.String = js.native
  def onResourceError(resourceError: ResourceError): js.Any = js.native
  def onResourceReceived(response: ResourceResponse): js.Any = js.native
  def onResourceRequested(requestData: ResourceRequest, networkRequest: NetworkRequest): js.Any = js.native
  def onUrlChanged(targetUrl: java.lang.String): js.Any = js.native
  // open(url: string): Promise<string>;
  def open(url: java.lang.String): js.Promise[java.lang.String] = js.native
  // open(url: string): Promise<string>;
  def open(url: java.lang.String, callback: js.Function1[/* status */ java.lang.String, _]): js.Promise[java.lang.String] = js.native
  def open(
    url: java.lang.String,
    method: java.lang.String,
    callback: js.Function1[/* status */ java.lang.String, _]
  ): js.Promise[java.lang.String] = js.native
   // maybe data is missing
  def open(url: java.lang.String, method: java.lang.String, data: js.Any): js.Promise[java.lang.String] = js.native
   // maybe data is missing
  def open(
    url: java.lang.String,
    method: java.lang.String,
    data: js.Any,
    callback: js.Function1[/* status */ java.lang.String, _]
  ): js.Promise[java.lang.String] = js.native
  def open(
    url: java.lang.String,
    method: java.lang.String,
    data: js.Any,
    headers: js.Any,
    callback: js.Function1[/* status */ java.lang.String, _]
  ): js.Promise[java.lang.String] = js.native
  def openUrl(url: java.lang.String, httpConf: HttpConf, settings: js.Any): js.Promise[java.lang.String] = js.native
  def rawPageCreated(newPage: WebPage): scala.Unit = js.native
   // :TODO: elaborate this when documentation improves
  def release(): scala.Unit = js.native
    // DEPRECATED
  def reload(): scala.Unit = js.native
  def render(filename: java.lang.String): js.Promise[scala.Unit] = js.native
  def render(filename: java.lang.String, options: Anon_Quality): js.Promise[scala.Unit] = js.native
  def renderBase64(`type`: java.lang.String): js.Promise[java.lang.String] = js.native
  @JSName("renderBase64")
  def renderBase64_String(format: java.lang.String): java.lang.String = js.native
  // render(filename: string): Promise<void>;
  @JSName("render")
  def render_Unit(filename: java.lang.String): scala.Unit = js.native
  def resourceReceived(response: ResourceResponse): scala.Unit = js.native
  def resourceRequested(requestData: ResourceRequest, networkRequest: NetworkRequest): scala.Unit = js.native
  def sendEvent(keyboardEventType: java.lang.String, keyOrKeys: js.Any): scala.Unit = js.native
  def sendEvent(keyboardEventType: java.lang.String, keyOrKeys: js.Any, aNull: js.Any): scala.Unit = js.native
  def sendEvent(keyboardEventType: java.lang.String, keyOrKeys: js.Any, aNull: js.Any, bNull: js.Any): scala.Unit = js.native
  def sendEvent(
    keyboardEventType: java.lang.String,
    keyOrKeys: js.Any,
    aNull: js.Any,
    bNull: js.Any,
    modifier: scala.Double
  ): scala.Unit = js.native
  def sendEvent(keyboardEventType: java.lang.String, key: java.lang.String): js.Promise[scala.Unit] = js.native
  def sendEvent(
    keyboardEventType: java.lang.String,
    key: java.lang.String,
    null1: scala.Null,
    null2: scala.Null,
    modifier: scala.Double
  ): js.Promise[scala.Unit] = js.native
  def sendEvent(mouseEventType: java.lang.String): js.Promise[scala.Unit] = js.native
  def sendEvent(mouseEventType: java.lang.String, mouseX: scala.Double): js.Promise[scala.Unit] = js.native
  def sendEvent(mouseEventType: java.lang.String, mouseX: scala.Double, mouseY: scala.Double): js.Promise[scala.Unit] = js.native
  def sendEvent(
    mouseEventType: java.lang.String,
    mouseX: scala.Double,
    mouseY: scala.Double,
    button: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  @JSName("sendEvent")
  def sendEvent_Unit(mouseEventType: java.lang.String): scala.Unit = js.native
  @JSName("sendEvent")
  def sendEvent_Unit(mouseEventType: java.lang.String, mouseX: scala.Double): scala.Unit = js.native
  @JSName("sendEvent")
  def sendEvent_Unit(mouseEventType: java.lang.String, mouseX: scala.Double, mouseY: scala.Double): scala.Unit = js.native
  @JSName("sendEvent")
  def sendEvent_Unit(
    mouseEventType: java.lang.String,
    mouseX: scala.Double,
    mouseY: scala.Double,
    button: java.lang.String
  ): scala.Unit = js.native
  def setContent(html: java.lang.String, url: java.lang.String): js.Promise[java.lang.String] = js.native
  @JSName("setContent")
  def setContent_Unit(content: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  // switchToFrame(framePosition: number): void;
  def switchToChildFrame(framePosOrName: java.lang.String): scala.Unit = js.native
  // switchToFrame(framePosition: number): void;
  def switchToChildFrame(framePosOrName: scala.Double): scala.Unit = js.native
  def switchToFocusedFrame(): scala.Unit = js.native
  def switchToFrame(framePosOrName: java.lang.String): scala.Unit = js.native
  def switchToFrame(framePosOrName: scala.Double): scala.Unit = js.native
  // switchToChildFrame(framePosition: number): void;
  def switchToMainFrame(): scala.Unit = js.native
    // DEPRECATED
  def switchToParentFrame(): scala.Unit = js.native
    // DEPRECATED
  def uploadFile(selector: java.lang.String, filename: java.lang.String): scala.Unit = js.native
  def urlChanged(targetUrl: java.lang.String): scala.Unit = js.native
}

