package typings.reactNativeAudio

import typings.reactNativeAudio.mod.AudioEncodingAndroidType
import typings.reactNativeAudio.mod.AudioEncodingIOSType
import typings.reactNativeAudio.mod.AudioEncodingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeAudioStrings {
  
  @js.native
  sealed trait High extends StObject
  inline def High: High = "High".asInstanceOf[High]
  
  @js.native
  sealed trait Low extends StObject
  inline def Low: Low = "Low".asInstanceOf[Low]
  
  @js.native
  sealed trait MAC3
    extends StObject
       with AudioEncodingIOSType
       with AudioEncodingType
  inline def MAC3: MAC3 = "MAC3".asInstanceOf[MAC3]
  
  @js.native
  sealed trait MAC6
    extends StObject
       with AudioEncodingIOSType
       with AudioEncodingType
  inline def MAC6: MAC6 = "MAC6".asInstanceOf[MAC6]
  
  @js.native
  sealed trait Medium extends StObject
  inline def Medium: Medium = "Medium".asInstanceOf[Medium]
  
  @js.native
  sealed trait aac
    extends StObject
       with AudioEncodingType
  inline def aac: aac = "aac".asInstanceOf[aac]
  
  @js.native
  sealed trait aac_eld
    extends StObject
       with AudioEncodingAndroidType
       with AudioEncodingType
  inline def aac_eld: aac_eld = "aac_eld".asInstanceOf[aac_eld]
  
  @js.native
  sealed trait alac
    extends StObject
       with AudioEncodingIOSType
       with AudioEncodingType
  inline def alac: alac = "alac".asInstanceOf[alac]
  
  @js.native
  sealed trait alaw
    extends StObject
       with AudioEncodingIOSType
       with AudioEncodingType
  inline def alaw: alaw = "alaw".asInstanceOf[alaw]
  
  @js.native
  sealed trait amr
    extends StObject
       with AudioEncodingIOSType
       with AudioEncodingType
  inline def amr: amr = "amr".asInstanceOf[amr]
  
  @js.native
  sealed trait amr_nb
    extends StObject
       with AudioEncodingAndroidType
       with AudioEncodingType
  inline def amr_nb: amr_nb = "amr_nb".asInstanceOf[amr_nb]
  
  @js.native
  sealed trait amr_wb
    extends StObject
       with AudioEncodingAndroidType
       with AudioEncodingType
  inline def amr_wb: amr_wb = "amr_wb".asInstanceOf[amr_wb]
  
  @js.native
  sealed trait he_aac
    extends StObject
       with AudioEncodingAndroidType
       with AudioEncodingType
  inline def he_aac: he_aac = "he_aac".asInstanceOf[he_aac]
  
  @js.native
  sealed trait ima4
    extends StObject
       with AudioEncodingIOSType
       with AudioEncodingType
  inline def ima4: ima4 = "ima4".asInstanceOf[ima4]
  
  @js.native
  sealed trait lpcm
    extends StObject
       with AudioEncodingIOSType
       with AudioEncodingType
  inline def lpcm: lpcm = "lpcm".asInstanceOf[lpcm]
  
  @js.native
  sealed trait mp1
    extends StObject
       with AudioEncodingIOSType
       with AudioEncodingType
  inline def mp1: mp1 = "mp1".asInstanceOf[mp1]
  
  @js.native
  sealed trait mp2
    extends StObject
       with AudioEncodingIOSType
       with AudioEncodingType
  inline def mp2: mp2 = "mp2".asInstanceOf[mp2]
  
  @js.native
  sealed trait ulaw
    extends StObject
       with AudioEncodingIOSType
       with AudioEncodingType
  inline def ulaw: ulaw = "ulaw".asInstanceOf[ulaw]
  
  @js.native
  sealed trait vorbis
    extends StObject
       with AudioEncodingAndroidType
       with AudioEncodingType
  inline def vorbis: vorbis = "vorbis".asInstanceOf[vorbis]
}
