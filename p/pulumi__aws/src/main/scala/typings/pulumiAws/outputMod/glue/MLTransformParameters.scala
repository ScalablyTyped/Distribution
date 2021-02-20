package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MLTransformParameters extends StObject {
  
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
  implicit class MLTransformParametersMutableBuilder[Self <: MLTransformParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindMatchesParameters(value: MLTransformParametersFindMatchesParameters): Self = StObject.set(x, "findMatchesParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformType(value: String): Self = StObject.set(x, "transformType", value.asInstanceOf[js.Any])
  }
}
