package typings.sharepoint.CUI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataQueryType extends js.Object

@JSGlobal("CUI.DataQueryType")
@js.native
object DataQueryType extends js.Object {
  @js.native
  sealed trait all extends DataQueryType
  
  @js.native
  sealed trait none extends DataQueryType
  
  @js.native
  sealed trait ribbonShallow extends DataQueryType
  
  @js.native
  sealed trait ribbonTab extends DataQueryType
  
  @js.native
  sealed trait ribbonVisibleTabDeep extends DataQueryType
  
  @js.native
  sealed trait root extends DataQueryType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataQueryType with Double] = js.native
  /* 1 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object ribbonShallow extends TopLevel[ribbonShallow with Double]
  
  /* 4 */ @js.native
  object ribbonTab extends TopLevel[ribbonTab with Double]
  
  /* 2 */ @js.native
  object ribbonVisibleTabDeep extends TopLevel[ribbonVisibleTabDeep with Double]
  
  /* 5 */ @js.native
  object root extends TopLevel[root with Double]
  
}

