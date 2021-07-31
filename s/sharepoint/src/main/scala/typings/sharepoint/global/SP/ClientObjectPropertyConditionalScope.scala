package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientObjectPropertyConditionalScope")
@js.native
class ClientObjectPropertyConditionalScope protected ()
  extends StObject
     with typings.sharepoint.SP.ConditionalScopeBase {
  def this(
    clientObject: typings.sharepoint.SP.ClientObject,
    propertyName: String,
    comparisonOperator: String,
    valueToCompare: js.Any
  ) = this()
  def this(
    clientObject: typings.sharepoint.SP.ClientObject,
    propertyName: String,
    comparisonOperator: String,
    valueToCompare: js.Any,
    allowAllActions: Boolean
  ) = this()
  
  /* CompleteClass */
  override def customFromJson(initValue: js.Any): Boolean = js.native
  
  /* CompleteClass */
  override def fromJson(initValue: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def get_testResult(): Boolean = js.native
  
  /* CompleteClass */
  override def startIfFalse(): js.Any = js.native
  
  /* CompleteClass */
  override def startIfTrue(): js.Any = js.native
  
  /* CompleteClass */
  override def startScope(): js.Any = js.native
}
