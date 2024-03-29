package typings.sharepoint.global.SP.JsGrid

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.JsGrid.IGridData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.StaticDataSource")
@js.native
open class StaticDataSource protected ()
  extends StObject
     with typings.sharepoint.SP.JsGrid.StaticDataSource {
  def this(jsGridData: IGridData) = this()
  def this(
    jsGridData: IGridData,
    optFnGetPropType: js.Function3[/* recordKey */ String, /* key */ String, /* dataPropMap */ StringDictionary[Any], Any]
  ) = this()
}
