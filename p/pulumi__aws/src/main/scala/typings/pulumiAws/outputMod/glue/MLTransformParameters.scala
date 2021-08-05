package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MLTransformParameters extends StObject {
  
  /**
    * The parameters for the find matches algorithm. see Find Matches Parameters.
    */
  var findMatchesParameters: MLTransformParametersFindMatchesParameters
  
  /**
    * The type of machine learning transform. For information about the types of machine learning transforms, see [Creating Machine Learning Transforms](http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html).
    */
  var transformType: String
}
object MLTransformParameters {
  
  inline def apply(findMatchesParameters: MLTransformParametersFindMatchesParameters, transformType: String): MLTransformParameters = {
    val __obj = js.Dynamic.literal(findMatchesParameters = findMatchesParameters.asInstanceOf[js.Any], transformType = transformType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MLTransformParameters]
  }
  
  extension [Self <: MLTransformParameters](x: Self) {
    
    inline def setFindMatchesParameters(value: MLTransformParametersFindMatchesParameters): Self = StObject.set(x, "findMatchesParameters", value.asInstanceOf[js.Any])
    
    inline def setTransformType(value: String): Self = StObject.set(x, "transformType", value.asInstanceOf[js.Any])
  }
}
