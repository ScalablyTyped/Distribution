package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationTarget extends StObject {
  
  /**
    * Either `InstanceIds` or `tag:Tag Name` to specify an EC2 tag.
    */
  var key: Input[String]
  
  /**
    * A list of instance IDs or tag values. AWS currently limits this list size to one value.
    */
  var values: Input[js.Array[Input[String]]]
}
object AssociationTarget {
  
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): AssociationTarget = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationTarget]
  }
  
  @scala.inline
  implicit class AssociationTargetMutableBuilder[Self <: AssociationTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
