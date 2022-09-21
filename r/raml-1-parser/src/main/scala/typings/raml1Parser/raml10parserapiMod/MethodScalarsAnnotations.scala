package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodScalarsAnnotations
  extends StObject
     with MethodBaseScalarsAnnotations
object MethodScalarsAnnotations {
  
  inline def apply(
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    is: () => js.Array[js.Array[AnnotationRef]],
    protocols: () => js.Array[js.Array[AnnotationRef]],
    securedBy: () => js.Array[js.Array[AnnotationRef]]
  ): MethodScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), is = js.Any.fromFunction0(is), protocols = js.Any.fromFunction0(protocols), securedBy = js.Any.fromFunction0(securedBy))
    __obj.asInstanceOf[MethodScalarsAnnotations]
  }
}
