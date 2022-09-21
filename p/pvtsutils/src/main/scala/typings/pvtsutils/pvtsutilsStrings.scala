package typings.pvtsutils

import typings.pvtsutils.mod.TextEncoding
import typings.pvtsutils.mod._BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pvtsutilsStrings {
  
  @js.native
  sealed trait ascii
    extends StObject
       with TextEncoding
  inline def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait base64
    extends StObject
       with _BufferEncoding
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait base64url
    extends StObject
       with _BufferEncoding
  inline def base64url: base64url = "base64url".asInstanceOf[base64url]
  
  @js.native
  sealed trait binary
    extends StObject
       with _BufferEncoding
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait hex
    extends StObject
       with _BufferEncoding
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait usc2
    extends StObject
       with TextEncoding
  inline def usc2: usc2 = "usc2".asInstanceOf[usc2]
  
  @js.native
  sealed trait utf16
    extends StObject
       with TextEncoding
  inline def utf16: utf16 = "utf16".asInstanceOf[utf16]
  
  @js.native
  sealed trait utf16be
    extends StObject
       with TextEncoding
  inline def utf16be: utf16be = "utf16be".asInstanceOf[utf16be]
  
  @js.native
  sealed trait utf16le
    extends StObject
       with TextEncoding
  inline def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  
  @js.native
  sealed trait utf8
    extends StObject
       with TextEncoding
       with _BufferEncoding
  inline def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
