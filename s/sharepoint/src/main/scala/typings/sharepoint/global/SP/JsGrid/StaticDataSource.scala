package typings.sharepoint.global.SP.JsGrid

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.JsGrid.IGridData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.StaticDataSource")
@js.native
class StaticDataSource protected ()
  extends typings.sharepoint.SP.JsGrid.StaticDataSource {
  def this(jsGridData: IGridData) = this()
  def this(
    jsGridData: IGridData,
    optFnGetPropType: js.Function3[
        /* recordKey */ String, 
        /* key */ String, 
        /* dataPropMap */ StringDictionary[js.Any], 
        _
      ]
  ) = this()
}
