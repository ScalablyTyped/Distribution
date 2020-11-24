package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MLTransformParameters extends js.Object {
  
  /**
    * The parameters for the find matches algorithm. see Find Matches Parameters.
    */
  var findMatchesParameters: MLTransformParametersFindMatchesParameters = js.native
  
  /**
    * The type of machine learning transform. For information about the types of machine learning transforms, see [Creating Machine Learning Transforms](http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html).
    */
  var transformType: String = js.native
}
object MLTransformParameters {
  
  @scala.inline
  def apply(findMatchesParameters: MLTransformParametersFindMatchesParameters, transformType: String): MLTransformParameters = {
    val __obj = js.Dynamic.literal(findMatchesParameters = findMatchesParameters.asInstanceOf[js.Any], transformType = transformType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MLTransformParameters]
  }
  
  @scala.inline
  implicit class MLTransformParametersOps[Self <: MLTransformParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFindMatchesParameters(value: MLTransformParametersFindMatchesParameters): Self = this.set("findMatchesParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformType(value: String): Self = this.set("transformType", value.asInstanceOf[js.Any])
  }
}
