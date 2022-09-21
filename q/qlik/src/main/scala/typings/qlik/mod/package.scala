package typings.qlik.mod

import typings.jquery.JQuery
import typings.qlik.mod.LanguageCodes.ALL
import typings.qlik.mod.^
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def callRepository(path: String, method: String, body: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("callRepository")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

inline def currApp(reference: js.Object): App = ^.asInstanceOf[js.Dynamic].applyDynamic("currApp")(reference.asInstanceOf[js.Any]).asInstanceOf[App]

inline def getAppList(callback: js.Array[App], config: GetAppConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppList")(callback.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def getExtensionList(callback: js.Array[Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtensionList")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]

inline def getGlobal(config: GetGlobalConfig): Global = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")(config.asInstanceOf[js.Any]).asInstanceOf[Global]

inline def openApp(appId: String, config: GetAppConfig): App = (^.asInstanceOf[js.Dynamic].applyDynamic("openApp")(appId.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[App]

inline def registerExtension(id: String, impl: Extension, metadata: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerExtension")(id.asInstanceOf[js.Any], impl.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")().asInstanceOf[Unit]
inline def resize(ID: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")(ID.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setLanguage(lang: ALL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(lang.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setOnError(
  onError: js.Function1[/* error */ Error, Unit],
  onWarning: js.Function1[/* warning */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOnError")(onError.asInstanceOf[js.Any], onWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def table(ext: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("table")(ext.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def table(ext: js.Object, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(ext.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]

type CustomPropertyOptions = js.Array[CustomPropertyOption] | js.Function0[js.Array[CustomPropertyOption]]

type Global = Any

type NxCellRows = js.Array[NxCell]

type NxMeasureInfo = ColumnInfo

type Paint = js.ThisFunction10[
/* this */ ExtensionContext, 
/* $element */ js.UndefOr[JQuery[HTMLElement]], 
/* layout */ js.UndefOr[Layout], 
/* qDimensionInfo */ js.UndefOr[NxDimensionInfo], 
/* qMeasureInfo */ js.UndefOr[NxDimensionInfo], 
/* qMatrix */ js.UndefOr[js.Array[NxCellRows]], 
/* dimensions */ js.UndefOr[js.Array[NxCell]], 
/* measures */ js.UndefOr[js.Array[NxCell]], 
/* qSize */ js.UndefOr[Size], 
/* qId */ js.UndefOr[String], 
/* qSelectionInfo */ js.UndefOr[Selectionobject], 
Unit]

type ShowFunction = js.Function3[
/* layout */ Layout, 
/* cls */ Any, 
/* obj */ Any, 
Boolean | (js.Function1[/* measure */ NxMeasure, Boolean])]

type SupportFunction = js.Function1[/* layout */ Layout, Boolean]

type SupportItem = Boolean | SupportFunction

type VisualizationOptions = VisualizationCommon
