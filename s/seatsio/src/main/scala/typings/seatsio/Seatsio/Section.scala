package typings.seatsio.Seatsio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Section
  extends BaseObject
     with BookableObject {
  
  var isInteractive: Boolean = js.native
  
  var numberOfSelectableObjects: Double = js.native
  
  var numberOfSelectedObjects: Double = js.native
  
  var sectionCategory: Category = js.native
  
  var selectableCategories: js.Array[Category] = js.native
}
