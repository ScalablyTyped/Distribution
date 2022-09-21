package typings.speedtestNet.mod

import typings.speedtestNet.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): js.Promise[ResultEvent] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[ResultEvent]]
inline def apply(options: Options): js.Promise[ResultEvent] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultEvent]]

inline def defaultBinaryVersion: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultBinaryVersion").asInstanceOf[String]

inline def makeCancel(): CancelFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCancel")().asInstanceOf[CancelFunction]

type CancelFunction = js.Function2[
/* setCancelHandler */ js.UndefOr[js.Symbol], 
/* newHandler */ js.UndefOr[js.Function0[Unit]], 
Boolean | Unit]

type ProgressFunction = js.Function1[/* event */ js.UndefOr[SpeedTestEvent], Unit]
