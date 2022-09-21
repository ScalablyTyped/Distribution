package typings.randomStringGen

import typings.randomStringGen.mod.Capitalization
import typings.randomStringGen.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomStringGenStrings {
  
  @js.native
  sealed trait alphabetic
    extends StObject
       with Type
  inline def alphabetic: alphabetic = "alphabetic".asInstanceOf[alphabetic]
  
  @js.native
  sealed trait alphanumeric
    extends StObject
       with Type
  inline def alphanumeric: alphanumeric = "alphanumeric".asInstanceOf[alphanumeric]
  
  @js.native
  sealed trait `ascii-printable`
    extends StObject
       with Type
  inline def `ascii-printable`: `ascii-printable` = "ascii-printable".asInstanceOf[`ascii-printable`]
  
  @js.native
  sealed trait binary
    extends StObject
       with Type
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait hex
    extends StObject
       with Type
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait lowercase
    extends StObject
       with Capitalization
  inline def lowercase: lowercase = "lowercase".asInstanceOf[lowercase]
  
  @js.native
  sealed trait numeric
    extends StObject
       with Type
  inline def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait octal
    extends StObject
       with Type
  inline def octal: octal = "octal".asInstanceOf[octal]
  
  @js.native
  sealed trait uppercase
    extends StObject
       with Capitalization
  inline def uppercase: uppercase = "uppercase".asInstanceOf[uppercase]
}
