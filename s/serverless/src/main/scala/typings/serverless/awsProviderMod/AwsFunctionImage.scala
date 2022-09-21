package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsFunctionImage
  extends StObject
     with AwsFunction {
  
  var image: String
}
object AwsFunctionImage {
  
  inline def apply(image: String): AwsFunctionImage = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsFunctionImage]
  }
  
  extension [Self <: AwsFunctionImage](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
