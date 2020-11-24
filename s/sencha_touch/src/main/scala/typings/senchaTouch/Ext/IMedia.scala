package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMedia extends IComponent {
  
  /** [Config Option] (Boolean) */
  var autoPause: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var autoResume: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var enableControls: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the value of autoPause
    * @returns Boolean
    */
  var getAutoPause: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of autoResume
    * @returns Boolean
    */
  var getAutoResume: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the current time of the media in seconds
    * @returns Number
    */
  var getCurrentTime: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the duration of the media in seconds
    * @returns Number
    */
  var getDuration: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of enableControls
    * @returns Boolean
    */
  var getEnableControls: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of loop
    * @returns Boolean
    */
  var getLoop: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of media
    * @returns Ext.Element
    */
  var getMedia: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Returns the value of muted
    * @returns Boolean
    */
  var getMuted: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of preload
    * @returns Boolean
    */
  var getPreload: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of url
    * @returns String
    */
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of volume
    * @returns Number
    */
  var getVolume: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns if the media is currently playing
    * @returns Boolean playing true if the media is playing.
    */
  var isPlaying: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Boolean) */
  var loop: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.Element) */
  var media: js.UndefOr[IElement] = js.native
  
  /** [Config Option] (Boolean) */
  var muted: js.UndefOr[Boolean] = js.native
  
  /** [Method] Pauses media playback  */
  var pause: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Starts or resumes media playback  */
  var play: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var preload: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the value of autoPause
    * @param autoPause Boolean The new value.
    */
  var setAutoPause: js.UndefOr[js.Function1[/* autoPause */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of autoResume
    * @param autoResume Boolean The new value.
    */
  var setAutoResume: js.UndefOr[js.Function1[/* autoResume */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of enableControls
    * @param enableControls Boolean The new value.
    */
  var setEnableControls: js.UndefOr[js.Function1[/* enableControls */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of loop
    * @param loop Boolean The new value.
    */
  var setLoop: js.UndefOr[js.Function1[/* loop */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of media
    * @param media Ext.Element The new value.
    */
  var setMedia: js.UndefOr[js.Function1[/* media */ js.UndefOr[IElement], Unit]] = js.native
  
  /** [Method] Sets the value of muted
    * @param muted Boolean The new value.
    */
  var setMuted: js.UndefOr[js.Function1[/* muted */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of preload
    * @param preload Boolean The new value.
    */
  var setPreload: js.UndefOr[js.Function1[/* preload */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of volume
    * @param volume Number The new value.
    */
  var setVolume: js.UndefOr[js.Function1[/* volume */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Stops media playback and returns to the beginning  */
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Toggles the media playback state  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Updates the controls of the video element
    * @param enableControls Object
    */
  var updateEnableControls: js.UndefOr[js.Function1[/* enableControls */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Updates the loop setting of the media element
    * @param loop Object
    */
  var updateLoop: js.UndefOr[js.Function1[/* loop */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the URL of the media element
    * @param newUrl Object
    */
  var updateUrl: js.UndefOr[js.Function1[/* newUrl */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Number) */
  var volume: js.UndefOr[Double] = js.native
}
object IMedia {
  
  @scala.inline
  def apply(): IMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMedia]
  }
  
  @scala.inline
  implicit class IMediaOps[Self <: IMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoPause(value: Boolean): Self = this.set("autoPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPause: Self = this.set("autoPause", js.undefined)
    
    @scala.inline
    def setAutoResume(value: Boolean): Self = this.set("autoResume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResume: Self = this.set("autoResume", js.undefined)
    
    @scala.inline
    def setEnableControls(value: Boolean): Self = this.set("enableControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableControls: Self = this.set("enableControls", js.undefined)
    
    @scala.inline
    def setGetAutoPause(value: () => Boolean): Self = this.set("getAutoPause", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoPause: Self = this.set("getAutoPause", js.undefined)
    
    @scala.inline
    def setGetAutoResume(value: () => Boolean): Self = this.set("getAutoResume", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoResume: Self = this.set("getAutoResume", js.undefined)
    
    @scala.inline
    def setGetCurrentTime(value: () => Double): Self = this.set("getCurrentTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCurrentTime: Self = this.set("getCurrentTime", js.undefined)
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = this.set("getDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDuration: Self = this.set("getDuration", js.undefined)
    
    @scala.inline
    def setGetEnableControls(value: () => Boolean): Self = this.set("getEnableControls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEnableControls: Self = this.set("getEnableControls", js.undefined)
    
    @scala.inline
    def setGetLoop(value: () => Boolean): Self = this.set("getLoop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLoop: Self = this.set("getLoop", js.undefined)
    
    @scala.inline
    def setGetMedia(value: () => IElement): Self = this.set("getMedia", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMedia: Self = this.set("getMedia", js.undefined)
    
    @scala.inline
    def setGetMuted(value: () => Boolean): Self = this.set("getMuted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMuted: Self = this.set("getMuted", js.undefined)
    
    @scala.inline
    def setGetPreload(value: () => Boolean): Self = this.set("getPreload", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPreload: Self = this.set("getPreload", js.undefined)
    
    @scala.inline
    def setGetUrl(value: () => java.lang.String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    
    @scala.inline
    def setGetVolume(value: () => Double): Self = this.set("getVolume", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetVolume: Self = this.set("getVolume", js.undefined)
    
    @scala.inline
    def setIsPlaying(value: () => Boolean): Self = this.set("isPlaying", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsPlaying: Self = this.set("isPlaying", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMedia(value: IElement): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setSetAutoPause(value: /* autoPause */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoPause: Self = this.set("setAutoPause", js.undefined)
    
    @scala.inline
    def setSetAutoResume(value: /* autoResume */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoResume", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoResume: Self = this.set("setAutoResume", js.undefined)
    
    @scala.inline
    def setSetEnableControls(value: /* enableControls */ js.UndefOr[Boolean] => Unit): Self = this.set("setEnableControls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEnableControls: Self = this.set("setEnableControls", js.undefined)
    
    @scala.inline
    def setSetLoop(value: /* loop */ js.UndefOr[Boolean] => Unit): Self = this.set("setLoop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLoop: Self = this.set("setLoop", js.undefined)
    
    @scala.inline
    def setSetMedia(value: /* media */ js.UndefOr[IElement] => Unit): Self = this.set("setMedia", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMedia: Self = this.set("setMedia", js.undefined)
    
    @scala.inline
    def setSetMuted(value: /* muted */ js.UndefOr[Boolean] => Unit): Self = this.set("setMuted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMuted: Self = this.set("setMuted", js.undefined)
    
    @scala.inline
    def setSetPreload(value: /* preload */ js.UndefOr[Boolean] => Unit): Self = this.set("setPreload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPreload: Self = this.set("setPreload", js.undefined)
    
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUrl: Self = this.set("setUrl", js.undefined)
    
    @scala.inline
    def setSetVolume(value: /* volume */ js.UndefOr[Double] => Unit): Self = this.set("setVolume", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetVolume: Self = this.set("setVolume", js.undefined)
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def setUpdateEnableControls(value: /* enableControls */ js.UndefOr[js.Any] => Unit): Self = this.set("updateEnableControls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateEnableControls: Self = this.set("updateEnableControls", js.undefined)
    
    @scala.inline
    def setUpdateLoop(value: /* loop */ js.UndefOr[js.Any] => Unit): Self = this.set("updateLoop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateLoop: Self = this.set("updateLoop", js.undefined)
    
    @scala.inline
    def setUpdateUrl(value: /* newUrl */ js.UndefOr[js.Any] => Unit): Self = this.set("updateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateUrl: Self = this.set("updateUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
