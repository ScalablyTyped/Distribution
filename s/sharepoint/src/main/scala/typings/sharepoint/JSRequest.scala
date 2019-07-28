package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to url and query string parts.*/
@JSGlobal("JSRequest")
@js.native
class JSRequest () extends js.Object

/* static members */
@JSGlobal("JSRequest")
@js.native
object JSRequest extends js.Object {
  /** Current file name (after last '/' in url).*/
  var FileName: String = js.native
  /** Current file path (before last '/' in url).*/
  var PathName: String = js.native
  /** Query string parts.*/
  var QueryString: StringDictionary[String] = js.native
  /** initializes class.*/
  def EnsureSetup(): Unit = js.native
}

