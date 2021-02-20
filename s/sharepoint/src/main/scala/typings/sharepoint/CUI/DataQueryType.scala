package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataQueryType extends StObject
@JSGlobal("CUI.DataQueryType")
@js.native
object DataQueryType extends StObject {
  
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
}
