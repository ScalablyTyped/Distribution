package typings.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeDeclaration
  extends StObject
     with TypeDeclaration {
  
  /**
    * A Boolean that indicates if an object instance has additional properties.
    */
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type property name to be used as discriminator, or boolean
    */
  var discriminator: js.UndefOr[String] = js.undefined
  
  /**
    * The value of discriminator for the type
    */
  var discriminatorValue: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of properties allowed for instances of this type.
    */
  var maxProperties: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum number of properties allowed for instances of this type.
    */
  var minProperties: js.UndefOr[Double] = js.undefined
  
  /**
    * The properties that instances of this type may or must have.
    */
  var properties: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
}
object ObjectTypeDeclaration {
  
  inline def apply(displayName: String, name: String, `type`: js.Array[TypeReference10]): ObjectTypeDeclaration = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeDeclaration]
  }
  
  extension [Self <: ObjectTypeDeclaration](x: Self) {
    
    inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
    
    inline def setDiscriminatorValue(value: String): Self = StObject.set(x, "discriminatorValue", value.asInstanceOf[js.Any])
    
    inline def setDiscriminatorValueUndefined: Self = StObject.set(x, "discriminatorValue", js.undefined)
    
    inline def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
    
    inline def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
    
    inline def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
    
    inline def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
    
    inline def setProperties(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: TypeDeclaration*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
