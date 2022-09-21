package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DisplayConditionCallback = js.Function2[
/* data */ DisplayCondition | EmptyDisplayCondition, 
/* done */ DisplayConditionDoneCallback, 
Unit]

type DisplayConditionDoneCallback = js.Function1[/* data */ DisplayCondition | Null, Unit]

type EmptyDisplayCondition = js.Object

type EventCallback = js.Function1[/* data */ js.Object, Unit]

type ExportHtmlCallback = js.Function1[/* data */ HtmlExport, Unit]

type FileUploadCallback = js.Function2[/* file */ FileInfo, /* done */ FileUploadDoneCallback, Unit]

type FileUploadDoneCallback = js.Function1[/* data */ FileUploadDoneData, Unit]

type SaveDesignCallback = js.Function1[/* data */ Design, Unit]

type StringList = StringDictionary[String]

type ToolsConfig = StringDictionary[ToolConfig]

type Translations = Record[String, Record[String, String]]
