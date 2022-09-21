package typings.raml1Parser.spec1Dot0SecurityMod

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.spec1Dot0CommonMod.AnnotationInstance
import typings.raml1Parser.spec1Dot0MethodsMod.Operation10
import typings.raml1Parser.spec1Dot0MethodsMod.Response10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemePart10
  extends StObject
     with Operation10 {
  
  /**
    * Information about the expected responses to a request
    */
  var responses: js.Array[Response10]
}
object SecuritySchemePart10 {
  
  inline def apply(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    responses: js.Array[Response10],
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
  ): SecuritySchemePart10 = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemePart10]
  }
  
  extension [Self <: SecuritySchemePart10](x: Self) {
    
    inline def setResponses(value: js.Array[Response10]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesVarargs(value: Response10*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
