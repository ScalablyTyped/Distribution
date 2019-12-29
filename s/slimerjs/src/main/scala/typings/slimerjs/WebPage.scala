package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPage extends js.Object {
  // Properties
  var canGoBack: Boolean = js.native
  var canGoForward: Boolean = js.native
  var captureContent: js.Array[RegExp] = js.native
  var clipRect: ClipRect = js.native
  var content: String = js.native
  var cookies: js.Array[Cookie] = js.native
  var customHeaders: StringDictionary[String] = js.native
  var event: js.Any = js.native
   // :TODO: elaborate this when documentation improves
  var focusedFrameName: String = js.native
  var frameContent: String = js.native
  var frameName: String = js.native
  var framePlainText: String = js.native
  var frameTitle: String = js.native
  var frameUrl: String = js.native
  var framesCount: Double = js.native
  var framesName: js.Any = js.native
   // :TODO: elaborate this when documentation improves
  var libraryPath: String = js.native
  var navigationLocked: Boolean = js.native
  var offlineStoragePath: String = js.native
  var offlineStorageQuota: Double = js.native
  var ownsPages: Boolean = js.native
  var pages: js.Array[WebPage] = js.native
  var pagesWindowName: String = js.native
  var paperSize: PaperSize = js.native
  var plainText: String = js.native
  var scrollPosition: TopLeft = js.native
  var settings: WebPageSettings = js.native
  var title: String = js.native
  var url: String = js.native
  var viewportSize: Size = js.native
  var windowName: String = js.native
  var zoomFactor: Double = js.native
   // slimerjs only
  // Functions
  def addCookie(cookie: Cookie): Boolean = js.native
  def childFramesCount(): Double = js.native
    // DEPRECATED
  def childFramesName(): String = js.native
    // DEPRECATED
  def clearCookies(): Unit = js.native
  def close(): Unit = js.native
  // Callback triggers
  def closing(closingPage: WebPage): Unit = js.native
  def currentFrameName(): String = js.native
    // DEPRECATED
  def deleteCookie(cookieName: String): Boolean = js.native
  // evaluate<R>(callback: () => R): Promise<R>;
  // evaluate<T, R>(callback: (arg: T) => R, arg: T): Promise<R>;
  // evaluate<T1, T2, R>(callback: (arg1: T1, arg2: T2) => R, arg1: T1, arg2: T2): Promise<R>;
  // evaluate<T1, T2, T3, R>(callback: (arg1: T1, arg2: T2, arg3: T3) => R, arg1: T1, arg2: T2, arg3: T3): Promise<R>;
  // evaluate<R>(callback: (...args: any[]) => R, ...args: any[]): Promise<R>;
  def evaluate[R](callback: js.Function1[/* repeated */ js.Any, R], args: js.Any*): R = js.native
  def evaluateAsync(fn: js.Function1[/* repeated */ js.Any, Unit], delayMilli: Double, args: js.Any*): Unit = js.native
  def evaluateJavaScript(str: String): js.Any = js.native
   // :TODO: elaborate this when documentation improves
  def getPage(windowName: String): WebPage = js.native
  def go(index: Double): Unit = js.native
  def goBack(): Unit = js.native
  def goForward(): Unit = js.native
  def includeJs(url: String): js.Promise[Unit] = js.native
  def includeJs(url: String, callback: js.Function0[Unit]): Unit = js.native
  def initialized(): Unit = js.native
  def injectJs(filename: String): Boolean = js.native
  @JSName("injectJs")
  def injectJs_Promise(filename: String): js.Promise[Boolean] = js.native
  def javaScriptAlertSent(msg: String): Unit = js.native
  def javaScriptConsoleMessageSent(msg: String): Unit = js.native
  def javaScriptConsoleMessageSent(msg: String, lineNum: Double): Unit = js.native
  def javaScriptConsoleMessageSent(msg: String, lineNum: Double, sourceId: String): Unit = js.native
  def loadFinished(status: String): Unit = js.native
  def loadStarted(): Unit = js.native
  def navigationRequested(url: String, `type`: String, willNavigate: Boolean, main: Boolean): Unit = js.native
  // Callbacks
  def onAlert(msg: String): js.Any = js.native
  def onCallback(): Unit = js.native
    // EXPERIMENTAL
  def onClosing(closingPage: WebPage): js.Any = js.native
  def onConfirm(msg: String): Boolean = js.native
  def onConsoleMessage(msg: String): js.Any = js.native
  def onConsoleMessage(msg: String, lineNum: Double): js.Any = js.native
  def onConsoleMessage(msg: String, lineNum: Double, sourceId: String): js.Any = js.native
  def onError(msg: String, trace: js.Array[String]): js.Any = js.native
  def onFilePicker(oldFile: String): String = js.native
  def onInitialized(): js.Any = js.native
  def onLoadFinished(status: String): js.Any = js.native
  def onLoadStarted(): js.Any = js.native
  def onNavigationRequested(url: String, `type`: String, willNavigate: Boolean, main: Boolean): js.Any = js.native
  def onPageCreated(newPage: WebPage): js.Any = js.native
  def onPrompt(msg: String, defaultVal: String): String = js.native
  def onResourceError(resourceError: ResourceError): js.Any = js.native
  def onResourceReceived(response: ResourceResponse): js.Any = js.native
  def onResourceRequested(requestData: ResourceRequest, networkRequest: NetworkRequest): js.Any = js.native
  def onUrlChanged(targetUrl: String): js.Any = js.native
  // open(url: string): Promise<string>;
  def open(url: String): js.Promise[String] = js.native
  def open(url: String, callback: js.Function1[/* status */ String, _]): js.Promise[String] = js.native
  def open(url: String, method: String, callback: js.Function1[/* status */ String, _]): js.Promise[String] = js.native
   // maybe data is missing
  def open(url: String, method: String, data: js.Any): js.Promise[String] = js.native
  def open(url: String, method: String, data: js.Any, callback: js.Function1[/* status */ String, _]): js.Promise[String] = js.native
  def open(
    url: String,
    method: String,
    data: js.Any,
    headers: js.Any,
    callback: js.Function1[/* status */ String, _]
  ): js.Promise[String] = js.native
  def openUrl(url: String, httpConf: HttpConf, settings: js.Any): js.Promise[String] = js.native
  def rawPageCreated(newPage: WebPage): Unit = js.native
   // :TODO: elaborate this when documentation improves
  def release(): Unit = js.native
    // DEPRECATED
  def reload(): Unit = js.native
  def render(filename: String): js.Promise[Unit] = js.native
  def render(filename: String, options: Anon_Format): js.Promise[Unit] = js.native
  def renderBase64(format: String): String = js.native
  @JSName("renderBase64")
  def renderBase64_Promise(`type`: String): js.Promise[String] = js.native
  // render(filename: string): Promise<void>;
  @JSName("render")
  def render_Unit(filename: String): Unit = js.native
  def resourceReceived(response: ResourceResponse): Unit = js.native
  def resourceRequested(requestData: ResourceRequest, networkRequest: NetworkRequest): Unit = js.native
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any): Unit = js.native
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any, aNull: js.Any): Unit = js.native
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any, aNull: js.Any, bNull: js.Any): Unit = js.native
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any, aNull: js.Any, bNull: js.Any, modifier: Double): Unit = js.native
  def sendEvent(keyboardEventType: String, key: String): js.Promise[Unit] = js.native
  def sendEvent(keyboardEventType: String, key: String, null1: Null, null2: Null, modifier: Double): js.Promise[Unit] = js.native
  def sendEvent(mouseEventType: String): Unit = js.native
  def sendEvent(mouseEventType: String, mouseX: Double): Unit = js.native
  def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double): Unit = js.native
  def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double, button: String): Unit = js.native
  @JSName("sendEvent")
  def sendEvent_Promise(mouseEventType: String): js.Promise[Unit] = js.native
  @JSName("sendEvent")
  def sendEvent_Promise(mouseEventType: String, mouseX: Double): js.Promise[Unit] = js.native
  @JSName("sendEvent")
  def sendEvent_Promise(mouseEventType: String, mouseX: Double, mouseY: Double): js.Promise[Unit] = js.native
  @JSName("sendEvent")
  def sendEvent_Promise(mouseEventType: String, mouseX: Double, mouseY: Double, button: String): js.Promise[Unit] = js.native
  def setContent(content: String, url: String): Unit = js.native
  @JSName("setContent")
  def setContent_Promise(html: String, url: String): js.Promise[String] = js.native
  def stop(): Unit = js.native
  def switchToChildFrame(framePosOrName: String): Unit = js.native
  // switchToFrame(framePosition: number): void;
  def switchToChildFrame(framePosOrName: Double): Unit = js.native
  def switchToFocusedFrame(): Unit = js.native
  def switchToFrame(framePosOrName: String): Unit = js.native
  def switchToFrame(framePosOrName: Double): Unit = js.native
  // switchToChildFrame(framePosition: number): void;
  def switchToMainFrame(): Unit = js.native
    // DEPRECATED
  def switchToParentFrame(): Unit = js.native
    // DEPRECATED
  def uploadFile(selector: String, filename: String): Unit = js.native
  def urlChanged(targetUrl: String): Unit = js.native
}

