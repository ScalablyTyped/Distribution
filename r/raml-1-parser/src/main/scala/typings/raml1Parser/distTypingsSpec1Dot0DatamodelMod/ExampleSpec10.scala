package typings.raml1Parser.distTypingsSpec1Dot0DatamodelMod

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.Annotable
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.AnnotationInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleSpec10
  extends StObject
     with Annotable {
  
  /**
    * A longer, human-friendly description of the example
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * An alternate, human-friendly name for the example
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Example identifier, if specified
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * By default, examples are validated against any type declaration.
    * Set this to false to allow examples that need not validate.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var structuredValue: Any
  
  /**
    * String representation of example
    */
  var value: String
}
object ExampleSpec10 {
  
  inline def apply(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    structuredValue: Any,
    value: String
  ): ExampleSpec10 = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any], structuredValue = structuredValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleSpec10]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExampleSpec10] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setStructuredValue(value: Any): Self = StObject.set(x, "structuredValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
