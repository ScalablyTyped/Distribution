package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Presents websites and evaluates JavaScript on websites._
  *
  * Constructs a new web view. Use a web view to evaluate JavaScript on websites.
  * @see https://docs.scriptable.app/webview/#-new-webview
  */
@js.native
trait WebView extends StObject {
  
  /**
    * _Evaluates JavaScript in the web view._
    *
    * Evaluates JavaScript in the current context of the web view. The returned promise carries the result of evaluating the JavaScript.
    *
    * When passing `false` to the `useCallback` parameter, which is the default value, evaluation will terminate after evaluating the last line of the JavaScript. The value on the last
    * line of the script will be carried by the promise returned by `evaluateJavaScript`.
    *
    * When passing `true` to the `useCallback` parameter, evaluation will only complete after the globally available `completion` function is called. Any value passed to the function,
    * will be carried by the promise returned by `evaluateJavaScript`.
    *
    * The log is available from the evaluated JavaScript, i.e. messages passed to the globally available `log` and `logError` functions will be shown in the log.
    * @param javaScript - JavaScript to evaluate in the web view.
    * @param useCallback - Optional. If true the web view waits for the globally available completion function of the web view to be called before terminating. Defaults to false.
    * @see https://docs.scriptable.app/webview/#-evaluatejavascript
    */
  def evaluateJavaScript(javaScript: String): js.Promise[_] = js.native
  def evaluateJavaScript(javaScript: String, useCallback: Boolean): js.Promise[_] = js.native
  
  /**
    * _Reads and returns HTML from the loaded website._
    * @see https://docs.scriptable.app/webview/#-gethtml
    */
  def getHTML(): js.Promise[_] = js.native
  
  /**
    * _Loads file in the web view._
    *
    * Files can be of various types, including HTML files and images.
    *
    * The supplied HTML file can reference files and nested directories in the same directory as the HTML file resides.
    * @param fileURL - URL of the file to load and render.
    * @see https://docs.scriptable.app/webview/#-loadfile
    */
  def loadFile(fileURL: String): js.Promise[Unit] = js.native
  
  /**
    * _Loads HTML in web view._
    *
    * Loads the HTML into the web view. The returned promise will complete once the web view has finished loading.
    * @param html - HTML to load into the web view.
    * @param baseURL - Optional. Base URL used to resolve relative URLs in the HTML.
    * @see https://docs.scriptable.app/webview/#-loadhtml
    */
  def loadHTML(html: String): js.Promise[Unit] = js.native
  def loadHTML(html: String, baseURL: String): js.Promise[Unit] = js.native
  
  /**
    * _Loads request in web view._
    *
    * When loading a request into the web view, the HTTP method, body and headers of the request will be respected. The onRedirect function on the request will not be invoked.
    * @param request - Request to load into the web view.
    * @see https://docs.scriptable.app/webview/#-loadrequest
    */
  def loadRequest(request: Request): js.Promise[Unit] = js.native
  
  /**
    * _Loads URL in web view._
    *
    * Loads the URL in the web view. The returned promise will complete once the web view has finished loading.
    * @param url - URL to load into the web view.
    * @see https://docs.scriptable.app/webview/#-loadurl
    */
  def loadURL(url: String): js.Promise[Unit] = js.native
  
  /**
    * _Presents the web view._
    *
    * The web view is presented with the content that has been loaded into it.
    * @param fullscreen - Set to true to present the web view in fullscreen. Defaults to false.
    * @see https://docs.scriptable.app/webview/#-present
    */
  def present(): js.Promise[Unit] = js.native
  def present(fullscreen: Boolean): js.Promise[Unit] = js.native
  
  /**
    * _Function called upon load of a request._
    *
    * When the web view performs a request to load a resource, the function can determine whether or not to allow the request. Disallowing request can speed up the time it takes to load
    * the website. Requests made from JavaScript in the page are not passed to this function.
    *
    * By default all requests are allowed.
    * @see https://docs.scriptable.app/webview/#shouldallowrequest
    */
  def shouldAllowRequest(arg0: Request): Boolean = js.native
  
  /**
    * _Waits for the web view to load._
    *
    * The returned promise will be fulfilled when the web view finishes loading. If the load fails, the promise will be fulfilled with an error. Use this with caution. If the web view is
    * not loading a new page or is not about to load a new page, the returned promise will never be fulfilled. This limitation exists because Scriptable cannot determine if a web view is
    * about to load a page in cases where evaluating JavaScript in the web view causes a new page to load.
    *
    * Generally this should only be used when loading causing a new page to load from `evaluateJavaScript`. In other cases, e.g. when loading a URL using `loadURL`, the returned promise
    * will be fulfilled when the page has been loaded.
    * @see https://docs.scriptable.app/webview/#-waitforload
    */
  def waitForLoad(): js.Promise[_] = js.native
}
