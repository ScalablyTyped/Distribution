package typings.reactDashEmailDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashEmailDashEditorMod {
  import org.scalablytyped.runtime.StringDictionary

  type EventCallback = js.Function1[/* data */ js.Object, Unit]
  type ExportHtmlCallback = js.Function1[/* data */ HtmlExport, Unit]
  type FileUploadCallback = js.Function2[/* file */ FileInfo, /* done */ FileUploadDoneCallback, Unit]
  type FileUploadDoneCallback = js.Function1[/* data */ FileUploadDoneData, Unit]
  type SaveDesignCallback = js.Function1[/* data */ Design, Unit]
  type StringList = StringDictionary[String]
  type ToolsConfig = StringDictionary[ToolConfig]
}
