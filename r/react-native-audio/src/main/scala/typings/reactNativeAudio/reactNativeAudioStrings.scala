package typings.reactNativeAudio

import typings.reactNativeAudio.mod.AudioEncodingAndroidType
import typings.reactNativeAudio.mod.AudioEncodingIOSType
import typings.reactNativeAudio.mod.AudioEncodingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeAudioStrings {
  @js.native
  sealed trait High extends js.Object
  
  @js.native
  sealed trait Low extends js.Object
  
  @js.native
  sealed trait MAC3 extends AudioEncodingIOSType
  
  @js.native
  sealed trait MAC6 extends AudioEncodingIOSType
  
  @js.native
  sealed trait Medium extends js.Object
  
  @js.native
  sealed trait aac extends AudioEncodingType
  
  @js.native
  sealed trait aac_eld
    extends AudioEncodingAndroidType
       with AudioEncodingType
  
  @js.native
  sealed trait alac extends AudioEncodingIOSType
  
  @js.native
  sealed trait alaw extends AudioEncodingIOSType
  
  @js.native
  sealed trait amr extends AudioEncodingIOSType
  
  @js.native
  sealed trait amr_nb
    extends AudioEncodingAndroidType
       with AudioEncodingType
  
  @js.native
  sealed trait amr_wb
    extends AudioEncodingAndroidType
       with AudioEncodingType
  
  @js.native
  sealed trait he_aac
    extends AudioEncodingAndroidType
       with AudioEncodingType
  
  @js.native
  sealed trait ima4 extends AudioEncodingIOSType
  
  @js.native
  sealed trait lpcm extends AudioEncodingIOSType
  
  @js.native
  sealed trait mp1 extends AudioEncodingIOSType
  
  @js.native
  sealed trait mp2 extends AudioEncodingIOSType
  
  @js.native
  sealed trait ulaw extends AudioEncodingIOSType
  
  @js.native
  sealed trait vorbis
    extends AudioEncodingAndroidType
       with AudioEncodingType
  
  @scala.inline
  def High: High = "High".asInstanceOf[High]
  @scala.inline
  def Low: Low = "Low".asInstanceOf[Low]
  @scala.inline
  def MAC3: MAC3 = "MAC3".asInstanceOf[MAC3]
  @scala.inline
  def MAC6: MAC6 = "MAC6".asInstanceOf[MAC6]
  @scala.inline
  def Medium: Medium = "Medium".asInstanceOf[Medium]
  @scala.inline
  def aac: aac = "aac".asInstanceOf[aac]
  @scala.inline
  def aac_eld: aac_eld = "aac_eld".asInstanceOf[aac_eld]
  @scala.inline
  def alac: alac = "alac".asInstanceOf[alac]
  @scala.inline
  def alaw: alaw = "alaw".asInstanceOf[alaw]
  @scala.inline
  def amr: amr = "amr".asInstanceOf[amr]
  @scala.inline
  def amr_nb: amr_nb = "amr_nb".asInstanceOf[amr_nb]
  @scala.inline
  def amr_wb: amr_wb = "amr_wb".asInstanceOf[amr_wb]
  @scala.inline
  def he_aac: he_aac = "he_aac".asInstanceOf[he_aac]
  @scala.inline
  def ima4: ima4 = "ima4".asInstanceOf[ima4]
  @scala.inline
  def lpcm: lpcm = "lpcm".asInstanceOf[lpcm]
  @scala.inline
  def mp1: mp1 = "mp1".asInstanceOf[mp1]
  @scala.inline
  def mp2: mp2 = "mp2".asInstanceOf[mp2]
  @scala.inline
  def ulaw: ulaw = "ulaw".asInstanceOf[ulaw]
  @scala.inline
  def vorbis: vorbis = "vorbis".asInstanceOf[vorbis]
}

