package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def callRepository(path: java.lang.String, method: java.lang.String, body: java.lang.String): js.Promise[js.Any] = (typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("callRepository")(path.asInstanceOf[js.Any], method.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]

inline def currApp(reference: js.Object): typings.qlik.mod.App = typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("currApp")(reference.asInstanceOf[js.Any]).asInstanceOf[typings.qlik.mod.App]

inline def getAppList(callback: js.Array[typings.qlik.mod.App], config: typings.qlik.mod.GetAppConfig): scala.Unit = (typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getAppList")(callback.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def getExtensionList(callback: js.Array[js.Any]): js.Promise[js.Any] = typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getExtensionList")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]

inline def getGlobal(config: typings.qlik.mod.GetGlobalConfig): typings.qlik.mod.Global = typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")(config.asInstanceOf[js.Any]).asInstanceOf[typings.qlik.mod.Global]

inline def openApp(appId: java.lang.String, config: typings.qlik.mod.GetAppConfig): typings.qlik.mod.App = (typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openApp")(appId.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.qlik.mod.App]

inline def registerExtension(id: java.lang.String, impl: typings.qlik.mod.Extension, metadata: js.Object): scala.Unit = (typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerExtension")(id.asInstanceOf[js.Any], impl.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def resize(): scala.Unit = typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resize")().asInstanceOf[scala.Unit]
inline def resize(ID: java.lang.String): scala.Unit = typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resize")(ID.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def setLanguage(lang: typings.qlik.mod.LanguageCodes.ALL): scala.Unit = typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(lang.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def setOnError(
  onError: js.Function1[/* error */ typings.qlik.mod.Error, scala.Unit],
  onWarning: js.Function1[/* warning */ java.lang.String, scala.Unit]
): scala.Unit = (typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setOnError")(onError.asInstanceOf[js.Any], onWarning.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def table(ext: js.Object): scala.Unit = typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("table")(ext.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def table(ext: js.Object, path: java.lang.String): scala.Unit = (typings.qlik.mod.^.asInstanceOf[js.Dynamic].applyDynamic("table")(ext.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

type CustomPropertyOptions = js.Array[typings.qlik.mod.CustomPropertyOption] | js.Function0[js.Array[typings.qlik.mod.CustomPropertyOption]]

type Global = js.Any

type NxCellRows = js.Array[typings.qlik.mod.NxCell]

type NxMeasureInfo = typings.qlik.mod.ColumnInfo

type Paint = js.ThisFunction10[
/* this */ typings.qlik.mod.ExtensionContext, 
/* $element */ js.UndefOr[typings.jquery.JQuery[typings.std.HTMLElement]], 
/* layout */ js.UndefOr[typings.qlik.mod.Layout], 
/* qDimensionInfo */ js.UndefOr[typings.qlik.mod.NxDimensionInfo], 
/* qMeasureInfo */ js.UndefOr[typings.qlik.mod.NxDimensionInfo], 
/* qMatrix */ js.UndefOr[js.Array[typings.qlik.mod.NxCellRows]], 
/* dimensions */ js.UndefOr[js.Array[typings.qlik.mod.NxCell]], 
/* measures */ js.UndefOr[js.Array[typings.qlik.mod.NxCell]], 
/* qSize */ js.UndefOr[typings.qlik.mod.Size], 
/* qId */ js.UndefOr[java.lang.String], 
/* qSelectionInfo */ js.UndefOr[typings.qlik.mod.Selectionobject], 
scala.Unit]

type ShowFunction = js.Function3[
/* layout */ typings.qlik.mod.Layout, 
/* cls */ js.Any, 
/* obj */ js.Any, 
scala.Boolean | (js.Function1[/* measure */ typings.qlik.mod.NxMeasure, scala.Boolean])]

type SupportFunction = js.Function1[/* layout */ typings.qlik.mod.Layout, scala.Boolean]

type SupportItem = scala.Boolean | typings.qlik.mod.SupportFunction

type VisualizationOptions = typings.qlik.mod.VisualizationCommon
