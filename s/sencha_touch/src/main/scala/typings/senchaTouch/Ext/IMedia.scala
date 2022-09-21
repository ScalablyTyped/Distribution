package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMedia
  extends StObject
     with IComponent {
  
  /** [Config Option] (Boolean) */
  var autoPause: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoResume: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableControls: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the value of autoPause
    * @returns Boolean
    */
  var getAutoPause: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of autoResume
    * @returns Boolean
    */
  var getAutoResume: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the current time of the media in seconds
    * @returns Number
    */
  var getCurrentTime: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the duration of the media in seconds
    * @returns Number
    */
  var getDuration: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of enableControls
    * @returns Boolean
    */
  var getEnableControls: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of loop
    * @returns Boolean
    */
  var getLoop: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of media
    * @returns Ext.Element
    */
  var getMedia: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Returns the value of muted
    * @returns Boolean
    */
  var getMuted: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of preload
    * @returns Boolean
    */
  var getPreload: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of url
    * @returns String
    */
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of volume
    * @returns Number
    */
  var getVolume: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns if the media is currently playing
    * @returns Boolean playing true if the media is playing.
    */
  var isPlaying: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Ext.Element) */
  var media: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (Boolean) */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Pauses media playback  */
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Starts or resumes media playback  */
  var play: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var preload: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets the value of autoPause
    * @param autoPause Boolean The new value.
    */
  var setAutoPause: js.UndefOr[js.Function1[/* autoPause */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of autoResume
    * @param autoResume Boolean The new value.
    */
  var setAutoResume: js.UndefOr[js.Function1[/* autoResume */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of enableControls
    * @param enableControls Boolean The new value.
    */
  var setEnableControls: js.UndefOr[js.Function1[/* enableControls */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of loop
    * @param loop Boolean The new value.
    */
  var setLoop: js.UndefOr[js.Function1[/* loop */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of media
    * @param media Ext.Element The new value.
    */
  var setMedia: js.UndefOr[js.Function1[/* media */ js.UndefOr[IElement], Unit]] = js.undefined
  
  /** [Method] Sets the value of muted
    * @param muted Boolean The new value.
    */
  var setMuted: js.UndefOr[js.Function1[/* muted */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of preload
    * @param preload Boolean The new value.
    */
  var setPreload: js.UndefOr[js.Function1[/* preload */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of volume
    * @param volume Number The new value.
    */
  var setVolume: js.UndefOr[js.Function1[/* volume */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Stops media playback and returns to the beginning  */
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Toggles the media playback state  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Updates the controls of the video element
    * @param enableControls Object
    */
  var updateEnableControls: js.UndefOr[js.Function1[/* enableControls */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Updates the loop setting of the media element
    * @param loop Object
    */
  var updateLoop: js.UndefOr[js.Function1[/* loop */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the URL of the media element
    * @param newUrl Object
    */
  var updateUrl: js.UndefOr[js.Function1[/* newUrl */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Number) */
  var volume: js.UndefOr[Double] = js.undefined
}
object IMedia {
  
  inline def apply(): IMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMedia]
  }
  
  extension [Self <: IMedia](x: Self) {
    
    inline def setAutoPause(value: Boolean): Self = StObject.set(x, "autoPause", value.asInstanceOf[js.Any])
    
    inline def setAutoPauseUndefined: Self = StObject.set(x, "autoPause", js.undefined)
    
    inline def setAutoResume(value: Boolean): Self = StObject.set(x, "autoResume", value.asInstanceOf[js.Any])
    
    inline def setAutoResumeUndefined: Self = StObject.set(x, "autoResume", js.undefined)
    
    inline def setEnableControls(value: Boolean): Self = StObject.set(x, "enableControls", value.asInstanceOf[js.Any])
    
    inline def setEnableControlsUndefined: Self = StObject.set(x, "enableControls", js.undefined)
    
    inline def setGetAutoPause(value: () => Boolean): Self = StObject.set(x, "getAutoPause", js.Any.fromFunction0(value))
    
    inline def setGetAutoPauseUndefined: Self = StObject.set(x, "getAutoPause", js.undefined)
    
    inline def setGetAutoResume(value: () => Boolean): Self = StObject.set(x, "getAutoResume", js.Any.fromFunction0(value))
    
    inline def setGetAutoResumeUndefined: Self = StObject.set(x, "getAutoResume", js.undefined)
    
    inline def setGetCurrentTime(value: () => Double): Self = StObject.set(x, "getCurrentTime", js.Any.fromFunction0(value))
    
    inline def setGetCurrentTimeUndefined: Self = StObject.set(x, "getCurrentTime", js.undefined)
    
    inline def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
    
    inline def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
    
    inline def setGetEnableControls(value: () => Boolean): Self = StObject.set(x, "getEnableControls", js.Any.fromFunction0(value))
    
    inline def setGetEnableControlsUndefined: Self = StObject.set(x, "getEnableControls", js.undefined)
    
    inline def setGetLoop(value: () => Boolean): Self = StObject.set(x, "getLoop", js.Any.fromFunction0(value))
    
    inline def setGetLoopUndefined: Self = StObject.set(x, "getLoop", js.undefined)
    
    inline def setGetMedia(value: () => IElement): Self = StObject.set(x, "getMedia", js.Any.fromFunction0(value))
    
    inline def setGetMediaUndefined: Self = StObject.set(x, "getMedia", js.undefined)
    
    inline def setGetMuted(value: () => Boolean): Self = StObject.set(x, "getMuted", js.Any.fromFunction0(value))
    
    inline def setGetMutedUndefined: Self = StObject.set(x, "getMuted", js.undefined)
    
    inline def setGetPreload(value: () => Boolean): Self = StObject.set(x, "getPreload", js.Any.fromFunction0(value))
    
    inline def setGetPreloadUndefined: Self = StObject.set(x, "getPreload", js.undefined)
    
    inline def setGetUrl(value: () => java.lang.String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    inline def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
    
    inline def setGetVolume(value: () => Double): Self = StObject.set(x, "getVolume", js.Any.fromFunction0(value))
    
    inline def setGetVolumeUndefined: Self = StObject.set(x, "getVolume", js.undefined)
    
    inline def setIsPlaying(value: () => Boolean): Self = StObject.set(x, "isPlaying", js.Any.fromFunction0(value))
    
    inline def setIsPlayingUndefined: Self = StObject.set(x, "isPlaying", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMedia(value: IElement): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setSetAutoPause(value: /* autoPause */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoPause", js.Any.fromFunction1(value))
    
    inline def setSetAutoPauseUndefined: Self = StObject.set(x, "setAutoPause", js.undefined)
    
    inline def setSetAutoResume(value: /* autoResume */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoResume", js.Any.fromFunction1(value))
    
    inline def setSetAutoResumeUndefined: Self = StObject.set(x, "setAutoResume", js.undefined)
    
    inline def setSetEnableControls(value: /* enableControls */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEnableControls", js.Any.fromFunction1(value))
    
    inline def setSetEnableControlsUndefined: Self = StObject.set(x, "setEnableControls", js.undefined)
    
    inline def setSetLoop(value: /* loop */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setLoop", js.Any.fromFunction1(value))
    
    inline def setSetLoopUndefined: Self = StObject.set(x, "setLoop", js.undefined)
    
    inline def setSetMedia(value: /* media */ js.UndefOr[IElement] => Unit): Self = StObject.set(x, "setMedia", js.Any.fromFunction1(value))
    
    inline def setSetMediaUndefined: Self = StObject.set(x, "setMedia", js.undefined)
    
    inline def setSetMuted(value: /* muted */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setMuted", js.Any.fromFunction1(value))
    
    inline def setSetMutedUndefined: Self = StObject.set(x, "setMuted", js.undefined)
    
    inline def setSetPreload(value: /* preload */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setPreload", js.Any.fromFunction1(value))
    
    inline def setSetPreloadUndefined: Self = StObject.set(x, "setPreload", js.undefined)
    
    inline def setSetUrl(value: /* url */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
    
    inline def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
    
    inline def setSetVolume(value: /* volume */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setVolume", js.Any.fromFunction1(value))
    
    inline def setSetVolumeUndefined: Self = StObject.set(x, "setVolume", js.undefined)
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    inline def setUpdateEnableControls(value: /* enableControls */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "updateEnableControls", js.Any.fromFunction1(value))
    
    inline def setUpdateEnableControlsUndefined: Self = StObject.set(x, "updateEnableControls", js.undefined)
    
    inline def setUpdateLoop(value: /* loop */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "updateLoop", js.Any.fromFunction1(value))
    
    inline def setUpdateLoopUndefined: Self = StObject.set(x, "updateLoop", js.undefined)
    
    inline def setUpdateUrl(value: /* newUrl */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "updateUrl", js.Any.fromFunction1(value))
    
    inline def setUpdateUrlUndefined: Self = StObject.set(x, "updateUrl", js.undefined)
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
