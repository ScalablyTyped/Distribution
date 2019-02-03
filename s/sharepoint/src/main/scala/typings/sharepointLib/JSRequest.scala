package typings
package sharepointLib

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
  var FileName: java.lang.String = js.native
  /** Current file path (before last '/' in url).*/
  var PathName: java.lang.String = js.native
  /** Query string parts.*/
  var QueryString: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /** initializes class.*/
  def EnsureSetup(): scala.Unit = js.native
}

