package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataQueryType extends StObject
@JSGlobal("CUI.DataQueryType")
@js.native
object DataQueryType extends StObject {
  
  @js.native
  sealed trait all
    extends StObject
       with DataQueryType
  
  @js.native
  sealed trait none
    extends StObject
       with DataQueryType
  
  @js.native
  sealed trait ribbonShallow
    extends StObject
       with DataQueryType
  
  @js.native
  sealed trait ribbonTab
    extends StObject
       with DataQueryType
  
  @js.native
  sealed trait ribbonVisibleTabDeep
    extends StObject
       with DataQueryType
  
  @js.native
  sealed trait root
    extends StObject
       with DataQueryType
}
