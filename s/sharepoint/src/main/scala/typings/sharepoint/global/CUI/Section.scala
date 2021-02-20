package typings.sharepoint.global.CUI

import typings.sharepoint.CUI.Alignment
import typings.sharepoint.CUI.RowType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CUI.Section")
@js.native
class Section protected ()
  extends typings.sharepoint.CUI.Section {
  /**
    * @param type  2 - OneRow, 3 - TwoRow, 4 - ThreeRow.
    * @param alignment 0 - Top, 2  - Middle,
    */
  def this(ribbon: typings.sharepoint.CUI.Ribbon, id: String, `type`: RowType, alignment: Alignment) = this()
}
