package typings.speedtestNet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): js.Promise[typings.speedtestNet.mod.ResultEvent] = typings.speedtestNet.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[typings.speedtestNet.mod.ResultEvent]]
  @scala.inline
  def apply(options: typings.speedtestNet.mod.Options): js.Promise[typings.speedtestNet.mod.ResultEvent] = typings.speedtestNet.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.speedtestNet.mod.ResultEvent]]
  
  type CancelFunction = js.Function2[
    /* setCancelHandler */ js.UndefOr[js.Symbol], 
    /* newHandler */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Boolean | scala.Unit
  ]
  
  type ProgressFunction = js.Function1[/* event */ js.UndefOr[typings.speedtestNet.mod.SpeedTestEvent], scala.Unit]
  
  @scala.inline
  def defaultBinaryVersion: java.lang.String = typings.speedtestNet.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultBinaryVersion").asInstanceOf[java.lang.String]
  
  @scala.inline
  def makeCancel(): typings.speedtestNet.mod.CancelFunction = typings.speedtestNet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeCancel")().asInstanceOf[typings.speedtestNet.mod.CancelFunction]
}
