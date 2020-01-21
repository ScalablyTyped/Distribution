package typings.reactEmailEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventCallback = js.Function1[/* data */ js.Object, scala.Unit]
  type ExportHtmlCallback = js.Function1[/* data */ typings.reactEmailEditor.mod.HtmlExport, scala.Unit]
  type FileUploadCallback = js.Function2[
    /* file */ typings.reactEmailEditor.mod.FileInfo, 
    /* done */ typings.reactEmailEditor.mod.FileUploadDoneCallback, 
    scala.Unit
  ]
  type FileUploadDoneCallback = js.Function1[/* data */ typings.reactEmailEditor.mod.FileUploadDoneData, scala.Unit]
  type SaveDesignCallback = js.Function1[/* data */ typings.reactEmailEditor.mod.Design, scala.Unit]
  type StringList = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ToolsConfig = org.scalablytyped.runtime.StringDictionary[typings.reactEmailEditor.mod.ToolConfig]
}
