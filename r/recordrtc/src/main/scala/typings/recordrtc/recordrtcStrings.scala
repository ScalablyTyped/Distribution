package typings.recordrtc

import typings.recordrtc.mod.MediaStreamKind
import typings.recordrtc.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordrtcStrings {
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait audio extends StObject
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait audioSlashogg extends StObject
  @scala.inline
  def audioSlashogg: audioSlashogg = "audio/ogg".asInstanceOf[audioSlashogg]
  
  @js.native
  sealed trait audioSlashwav extends StObject
  @scala.inline
  def audioSlashwav: audioSlashwav = "audio/wav".asInstanceOf[audioSlashwav]
  
  @js.native
  sealed trait audioSlashwebm extends StObject
  @scala.inline
  def audioSlashwebm: audioSlashwebm = "audio/webm".asInstanceOf[audioSlashwebm]
  
  @js.native
  sealed trait audioSlashwebmSemicoloncodecsEqualssignpcm extends StObject
  @scala.inline
  def audioSlashwebmSemicoloncodecsEqualssignpcm: audioSlashwebmSemicoloncodecsEqualssignpcm = "audio/webm;codecs=pcm".asInstanceOf[audioSlashwebmSemicoloncodecsEqualssignpcm]
  
  @js.native
  sealed trait audioinput
    extends StObject
       with MediaStreamKind
  @scala.inline
  def audioinput: audioinput = "audioinput".asInstanceOf[audioinput]
  
  @js.native
  sealed trait audiooutput
    extends StObject
       with MediaStreamKind
  @scala.inline
  def audiooutput: audiooutput = "audiooutput".asInstanceOf[audiooutput]
  
  @js.native
  sealed trait canvas extends StObject
  @scala.inline
  def canvas: canvas = "canvas".asInstanceOf[canvas]
  
  @js.native
  sealed trait destroyed
    extends StObject
       with State
  @scala.inline
  def destroyed: destroyed = "destroyed".asInstanceOf[destroyed]
  
  @js.native
  sealed trait gif extends StObject
  @scala.inline
  def gif: gif = "gif".asInstanceOf[gif]
  
  @js.native
  sealed trait inactive
    extends StObject
       with State
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait paused
    extends StObject
       with State
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait recording
    extends StObject
       with State
  @scala.inline
  def recording: recording = "recording".asInstanceOf[recording]
  
  @js.native
  sealed trait stopped
    extends StObject
       with State
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait video extends StObject
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait videoSlashmp4 extends StObject
  @scala.inline
  def videoSlashmp4: videoSlashmp4 = "video/mp4".asInstanceOf[videoSlashmp4]
  
  @js.native
  sealed trait videoSlashmpeg extends StObject
  @scala.inline
  def videoSlashmpeg: videoSlashmpeg = "video/mpeg".asInstanceOf[videoSlashmpeg]
  
  @js.native
  sealed trait videoSlashwebm extends StObject
  @scala.inline
  def videoSlashwebm: videoSlashwebm = "video/webm".asInstanceOf[videoSlashwebm]
  
  @js.native
  sealed trait videoSlashwebmSemicoloncodecsEqualssignh264 extends StObject
  @scala.inline
  def videoSlashwebmSemicoloncodecsEqualssignh264: videoSlashwebmSemicoloncodecsEqualssignh264 = "video/webm;codecs=h264".asInstanceOf[videoSlashwebmSemicoloncodecsEqualssignh264]
  
  @js.native
  sealed trait videoSlashwebmSemicoloncodecsEqualssignvp8 extends StObject
  @scala.inline
  def videoSlashwebmSemicoloncodecsEqualssignvp8: videoSlashwebmSemicoloncodecsEqualssignvp8 = "video/webm;codecs=vp8".asInstanceOf[videoSlashwebmSemicoloncodecsEqualssignvp8]
  
  @js.native
  sealed trait videoSlashwebmSemicoloncodecsEqualssignvp9 extends StObject
  @scala.inline
  def videoSlashwebmSemicoloncodecsEqualssignvp9: videoSlashwebmSemicoloncodecsEqualssignvp9 = "video/webm;codecs=vp9".asInstanceOf[videoSlashwebmSemicoloncodecsEqualssignvp9]
  
  @js.native
  sealed trait `videoSlashx-matroskaSemicoloncodecsEqualssignavc1` extends StObject
  @scala.inline
  def `videoSlashx-matroskaSemicoloncodecsEqualssignavc1`: `videoSlashx-matroskaSemicoloncodecsEqualssignavc1` = "video/x-matroska;codecs=avc1".asInstanceOf[`videoSlashx-matroskaSemicoloncodecsEqualssignavc1`]
  
  @js.native
  sealed trait videoinput
    extends StObject
       with MediaStreamKind
  @scala.inline
  def videoinput: videoinput = "videoinput".asInstanceOf[videoinput]
}
