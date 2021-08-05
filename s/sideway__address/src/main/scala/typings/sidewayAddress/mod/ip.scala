package typings.sidewayAddress.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ip {
  
  @JSImport("@sideway/address", "ip")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generates a regular expression used to validate IP addresses.
    * 
    * @param options - optional settings.
    * 
    * @returns an object with the regular expression and meta data.
    */
  inline def regex(): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("regex")().asInstanceOf[Expression]
  inline def regex(options: Options): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("regex")(options.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sidewayAddress.sidewayAddressStrings.optional
    - typings.sidewayAddress.sidewayAddressStrings.required
    - typings.sidewayAddress.sidewayAddressStrings.forbidden
  */
  trait Cidr extends StObject
  object Cidr {
    
    inline def forbidden: typings.sidewayAddress.sidewayAddressStrings.forbidden = "forbidden".asInstanceOf[typings.sidewayAddress.sidewayAddressStrings.forbidden]
    
    inline def optional: typings.sidewayAddress.sidewayAddressStrings.optional = "optional".asInstanceOf[typings.sidewayAddress.sidewayAddressStrings.optional]
    
    inline def required: typings.sidewayAddress.sidewayAddressStrings.required = "required".asInstanceOf[typings.sidewayAddress.sidewayAddressStrings.required]
  }
  
  trait Expression extends StObject {
    
    /**
      * The CIDR mode.
      */
    var cidr: Cidr
    
    /**
      * The raw regular expression string.
      */
    var raw: String
    
    /**
      * The regular expression.
      */
    var regex: RegExp
    
    /**
      * The array of versions allowed.
      */
    var versions: js.Array[Version]
  }
  object Expression {
    
    inline def apply(cidr: Cidr, raw: String, regex: RegExp, versions: js.Array[Version]): Expression = {
      val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expression]
    }
    
    extension [Self <: Expression](x: Self) {
      
      inline def setCidr(value: Cidr): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: js.Array[Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: Version*): Self = StObject.set(x, "versions", js.Array(value :_*))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * The required CIDR mode.
      * 
      * @default 'optional'
      */
    val cidr: js.UndefOr[Cidr] = js.undefined
    
    /**
      * The allowed versions.
      * 
      * @default ['ipv4', 'ipv6', 'ipvfuture']
      */
    val version: js.UndefOr[Version | js.Array[Version]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCidr(value: Cidr): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
      
      inline def setVersion(value: Version | js.Array[Version]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVersionVarargs(value: Version*): Self = StObject.set(x, "version", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sidewayAddress.sidewayAddressStrings.ipv4
    - typings.sidewayAddress.sidewayAddressStrings.ipv6
    - typings.sidewayAddress.sidewayAddressStrings.ipvfuture
  */
  trait Version extends StObject
  object Version {
    
    inline def ipv4: typings.sidewayAddress.sidewayAddressStrings.ipv4 = "ipv4".asInstanceOf[typings.sidewayAddress.sidewayAddressStrings.ipv4]
    
    inline def ipv6: typings.sidewayAddress.sidewayAddressStrings.ipv6 = "ipv6".asInstanceOf[typings.sidewayAddress.sidewayAddressStrings.ipv6]
    
    inline def ipvfuture: typings.sidewayAddress.sidewayAddressStrings.ipvfuture = "ipvfuture".asInstanceOf[typings.sidewayAddress.sidewayAddressStrings.ipvfuture]
  }
}
