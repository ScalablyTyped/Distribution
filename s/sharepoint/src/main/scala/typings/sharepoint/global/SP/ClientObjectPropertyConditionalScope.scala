package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientObjectPropertyConditionalScope")
@js.native
open class ClientObjectPropertyConditionalScope protected ()
  extends StObject
     with typings.sharepoint.SP.ConditionalScopeBase {
  def this(
    clientObject: typings.sharepoint.SP.ClientObject,
    propertyName: String,
    comparisonOperator: String,
    valueToCompare: Any
  ) = this()
  def this(
    clientObject: typings.sharepoint.SP.ClientObject,
    propertyName: String,
    comparisonOperator: String,
    valueToCompare: Any,
    allowAllActions: Boolean
  ) = this()
  
  /* CompleteClass */
  override def customFromJson(initValue: Any): Boolean = js.native
  
  /* CompleteClass */
  override def fromJson(initValue: Any): Unit = js.native
  
  /* CompleteClass */
  override def get_testResult(): Boolean = js.native
  
  /* CompleteClass */
  override def startIfFalse(): Any = js.native
  
  /* CompleteClass */
  override def startIfTrue(): Any = js.native
  
  /* CompleteClass */
  override def startScope(): Any = js.native
}
