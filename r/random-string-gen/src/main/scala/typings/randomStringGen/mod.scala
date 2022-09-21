package typings.randomStringGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A Library to help you create random strings in your code. Can be useful for
    * creating an identifier (id), slug, salt, PIN code, strong passwords, fixture, etc.
    *
    * Based on whatever is preferred, this takes any of three parameters (or no parameters
    * at all and returns a `32` length `alphanumeric` random string by default).
    *
    * @param String Sets the character set with the remaining option default values
    * @param Number Sets the length of the string with the remaining option default values
    * @param Options An object with the preferred options for the string
    *
    * @returns a random `string` based on the options set.
    */
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(options: String): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(options: Double): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(options: GenerateOptions): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("random-string-gen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.randomStringGen.randomStringGenStrings.lowercase
    - typings.randomStringGen.randomStringGenStrings.uppercase
  */
  trait Capitalization extends StObject
  object Capitalization {
    
    inline def lowercase: typings.randomStringGen.randomStringGenStrings.lowercase = "lowercase".asInstanceOf[typings.randomStringGen.randomStringGenStrings.lowercase]
    
    inline def uppercase: typings.randomStringGen.randomStringGenStrings.uppercase = "uppercase".asInstanceOf[typings.randomStringGen.randomStringGenStrings.uppercase]
  }
  
  trait GenerateOptions extends StObject {
    
    /**
      * Define whether the output should be `lowercase` or `uppercase` only.
      * Ignore this option to return both in the string.
      *
      * @default null
      */
    var capitalization: js.UndefOr[Capitalization] = js.undefined
    
    /**
      * Define a custom character set to use.
      * This overrides whatever `type` is set.
      *
      * @default ' '
      */
    var charset: js.UndefOr[String] = js.undefined
    
    /**
      * This is the length of the returned string. Setting this to `0` or a negative
      * eg: `-1` means an empty string will be returned.
      *
      * @default 32
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * Define the character set for the string.
      *
      * @param alphanumeric [0-9 a-z A-Z]
      * @param alphabetic [a-z A-Z]
      * @param numeric [0-9]
      * @param hex [0-9 a-f]
      * @param binary [01]
      * @param octal [0-7]
      * @param ascii-printable [0-7 a-z A-Z !"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ ]
      *
      * @default 'alphanumeric'
      */
    var `type`: js.UndefOr[Type] = js.undefined
  }
  object GenerateOptions {
    
    inline def apply(): GenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateOptions]
    }
    
    extension [Self <: GenerateOptions](x: Self) {
      
      inline def setCapitalization(value: Capitalization): Self = StObject.set(x, "capitalization", value.asInstanceOf[js.Any])
      
      inline def setCapitalizationUndefined: Self = StObject.set(x, "capitalization", js.undefined)
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.randomStringGen.randomStringGenStrings.alphanumeric
    - typings.randomStringGen.randomStringGenStrings.alphabetic
    - typings.randomStringGen.randomStringGenStrings.numeric
    - typings.randomStringGen.randomStringGenStrings.hex
    - typings.randomStringGen.randomStringGenStrings.binary
    - typings.randomStringGen.randomStringGenStrings.octal
    - typings.randomStringGen.randomStringGenStrings.`ascii-printable`
  */
  trait Type extends StObject
  object Type {
    
    inline def alphabetic: typings.randomStringGen.randomStringGenStrings.alphabetic = "alphabetic".asInstanceOf[typings.randomStringGen.randomStringGenStrings.alphabetic]
    
    inline def alphanumeric: typings.randomStringGen.randomStringGenStrings.alphanumeric = "alphanumeric".asInstanceOf[typings.randomStringGen.randomStringGenStrings.alphanumeric]
    
    inline def `ascii-printable`: typings.randomStringGen.randomStringGenStrings.`ascii-printable` = "ascii-printable".asInstanceOf[typings.randomStringGen.randomStringGenStrings.`ascii-printable`]
    
    inline def binary: typings.randomStringGen.randomStringGenStrings.binary = "binary".asInstanceOf[typings.randomStringGen.randomStringGenStrings.binary]
    
    inline def hex: typings.randomStringGen.randomStringGenStrings.hex = "hex".asInstanceOf[typings.randomStringGen.randomStringGenStrings.hex]
    
    inline def numeric: typings.randomStringGen.randomStringGenStrings.numeric = "numeric".asInstanceOf[typings.randomStringGen.randomStringGenStrings.numeric]
    
    inline def octal: typings.randomStringGen.randomStringGenStrings.octal = "octal".asInstanceOf[typings.randomStringGen.randomStringGenStrings.octal]
  }
}
