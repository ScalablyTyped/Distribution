package typings.qrcode

import typings.qrcode.mod.ModeId
import typings.qrcode.mod.QRCodeDataURLType
import typings.qrcode.mod.QRCodeErrorCorrectionLevel
import typings.qrcode.mod.QRCodeFileType
import typings.qrcode.mod.QRCodeSegmentMode
import typings.qrcode.mod.QRCodeStringType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qrcodeStrings {
  
  @js.native
  sealed trait Alphanumeric
    extends StObject
       with ModeId
  inline def Alphanumeric: Alphanumeric = "Alphanumeric".asInstanceOf[Alphanumeric]
  
  @js.native
  sealed trait Byte
    extends StObject
       with ModeId
  inline def Byte: Byte = "Byte".asInstanceOf[Byte]
  
  @js.native
  sealed trait H
    extends StObject
       with QRCodeErrorCorrectionLevel
  inline def H: H = "H".asInstanceOf[H]
  
  @js.native
  sealed trait Kanji
    extends StObject
       with ModeId
  inline def Kanji: Kanji = "Kanji".asInstanceOf[Kanji]
  
  @js.native
  sealed trait L
    extends StObject
       with QRCodeErrorCorrectionLevel
  inline def L: L = "L".asInstanceOf[L]
  
  @js.native
  sealed trait M
    extends StObject
       with QRCodeErrorCorrectionLevel
  inline def M: M = "M".asInstanceOf[M]
  
  @js.native
  sealed trait Numeric
    extends StObject
       with ModeId
  inline def Numeric: Numeric = "Numeric".asInstanceOf[Numeric]
  
  @js.native
  sealed trait Q
    extends StObject
       with QRCodeErrorCorrectionLevel
  inline def Q: Q = "Q".asInstanceOf[Q]
  
  @js.native
  sealed trait alphanumeric_
    extends StObject
       with QRCodeSegmentMode
  inline def alphanumeric_ : alphanumeric_ = "alphanumeric".asInstanceOf[alphanumeric_]
  
  @js.native
  sealed trait byte_
    extends StObject
       with QRCodeSegmentMode
  inline def byte_ : byte_ = "byte".asInstanceOf[byte_]
  
  @js.native
  sealed trait high
    extends StObject
       with QRCodeErrorCorrectionLevel
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait imageSlashjpeg
    extends StObject
       with QRCodeDataURLType
  inline def imageSlashjpeg: imageSlashjpeg = "image/jpeg".asInstanceOf[imageSlashjpeg]
  
  @js.native
  sealed trait imageSlashpng
    extends StObject
       with QRCodeDataURLType
  inline def imageSlashpng: imageSlashpng = "image/png".asInstanceOf[imageSlashpng]
  
  @js.native
  sealed trait imageSlashwebp
    extends StObject
       with QRCodeDataURLType
  inline def imageSlashwebp: imageSlashwebp = "image/webp".asInstanceOf[imageSlashwebp]
  
  @js.native
  sealed trait kanji_
    extends StObject
       with QRCodeSegmentMode
  inline def kanji_ : kanji_ = "kanji".asInstanceOf[kanji_]
  
  @js.native
  sealed trait low
    extends StObject
       with QRCodeErrorCorrectionLevel
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait medium
    extends StObject
       with QRCodeErrorCorrectionLevel
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait numeric_
    extends StObject
       with QRCodeSegmentMode
  inline def numeric_ : numeric_ = "numeric".asInstanceOf[numeric_]
  
  @js.native
  sealed trait png
    extends StObject
       with QRCodeFileType
  inline def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait quartile
    extends StObject
       with QRCodeErrorCorrectionLevel
  inline def quartile: quartile = "quartile".asInstanceOf[quartile]
  
  @js.native
  sealed trait svg
    extends StObject
       with QRCodeFileType
       with QRCodeStringType
  inline def svg: svg = "svg".asInstanceOf[svg]
  
  @js.native
  sealed trait terminal
    extends StObject
       with QRCodeStringType
  inline def terminal: terminal = "terminal".asInstanceOf[terminal]
  
  @js.native
  sealed trait utf8
    extends StObject
       with QRCodeFileType
       with QRCodeStringType
  inline def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
