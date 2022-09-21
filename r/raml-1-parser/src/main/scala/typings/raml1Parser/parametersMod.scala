package typings.raml1Parser

import typings.raml1Parser.commonMod.HasSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parametersMod {
  
  trait NumberTypeDeclaration08
    extends StObject
       with Parameter08 {
    
    /**
      * (Optional, applicable only for parameters of type number or integer)
      * The maximum attribute specifies the parameter's maximum value.
      */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /**
      * (Optional, applicable only for parameters of type number or integer)
      * The minimum attribute specifies the parameter's minimum value.
      */
    var minimum: js.UndefOr[Double] = js.undefined
  }
  object NumberTypeDeclaration08 {
    
    inline def apply(name: String, `type`: String): NumberTypeDeclaration08 = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberTypeDeclaration08]
    }
    
    extension [Self <: NumberTypeDeclaration08](x: Self) {
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    }
  }
  
  trait Parameter08
    extends StObject
       with HasSource {
    
    /**
      * The default attribute specifies the default value to use for the
      * property if the property is omitted or its value is not specified.
      * This SHOULD NOT be interpreted as a requirement for the client
      * to send the default attribute's value if there is no other value
      * to send. Instead, the default attribute's value is the value the
      * server uses if the client does not send a value.
      */
    var default: js.UndefOr[Any] = js.undefined
    
    /**
      * The description attribute describes the intended use or meaning
      * of the $self. This value MAY be formatted using Markdown.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * An alternate, human-friendly name for the parameter
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * (Optional) The example attribute shows an example value for the property.
      * This can be used, e.g., by documentation generators to generate sample
      * values for the property.
      */
    var example: js.UndefOr[String] = js.undefined
    
    /**
      * Location of the parameter (can not be edited by user)
      */
    var location: js.UndefOr[String] = js.undefined
    
    /**
      * name of the parameter
      */
    var name: String
    
    /**
      * The repeat attribute specifies that the parameter can be repeated.
      * If the parameter can be used multiple times, the repeat parameter
      * value MUST be set to 'true'. Otherwise, the default value is 'false'
      * and the parameter may not be repeated.
      */
    var repeat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true if parameter is required
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The type attribute specifies the primitive type of the parameter's
      * resolved value. API clients MUST return/throw an error if the
      * parameter's resolved value does not match the specified type.
      * If type is not specified, it defaults to string
      */
    var `type`: String
  }
  object Parameter08 {
    
    inline def apply(name: String, `type`: String): Parameter08 = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parameter08]
    }
    
    extension [Self <: Parameter08](x: Self) {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringTypeDeclaration08
    extends StObject
       with Parameter08 {
    
    /**
      * (Optional, applicable only for parameters of type string) The enum
      * attribute provides an enumeration of the parameter's valid values.
      * This MUST be an array. If the enum attribute is defined, API clients
      * and servers MUST verify that a parameter's value matches a value
      * in the enum array. If there is no matching value, the clients and
      * servers MUST treat this as an error.
      */
    var `enum`: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * (Optional, applicable only for parameters of type string) The maxLength
      * attribute specifies the parameter value's maximum number of characters.
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * (Optional, applicable only for parameters of type string) The minLength
      * attribute specifies the parameter value's minimum number of characters.
      */
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * (Optional, applicable only for parameters of type string) The pattern
      * attribute is a regular expression that a parameter of type string
      * MUST match. Regular expressions MUST follow the regular expression
      * specification from ECMA 262/Perl 5. The pattern MAY be enclosed in
      * double quotes for readability and clarity.
      */
    var pattern: js.UndefOr[String] = js.undefined
  }
  object StringTypeDeclaration08 {
    
    inline def apply(name: String, `type`: String): StringTypeDeclaration08 = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringTypeDeclaration08]
    }
    
    extension [Self <: StringTypeDeclaration08](x: Self) {
      
      inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value*))
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
}
