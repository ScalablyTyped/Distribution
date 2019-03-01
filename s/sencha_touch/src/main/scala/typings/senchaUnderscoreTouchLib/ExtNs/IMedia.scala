package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMedia extends IComponent {
  /** [Config Option] (Boolean) */
  var autoPause: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoResume: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableControls: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of autoPause
  		* @returns Boolean
  		*/
  var getAutoPause: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of autoResume
  		* @returns Boolean
  		*/
  var getAutoResume: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the current time of the media in seconds
  		* @returns Number
  		*/
  var getCurrentTime: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the duration of the media in seconds
  		* @returns Number
  		*/
  var getDuration: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of enableControls
  		* @returns Boolean
  		*/
  var getEnableControls: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of loop
  		* @returns Boolean
  		*/
  var getLoop: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of media
  		* @returns Ext.Element
  		*/
  var getMedia: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Returns the value of muted
  		* @returns Boolean
  		*/
  var getMuted: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of preload
  		* @returns Boolean
  		*/
  var getPreload: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of volume
  		* @returns Number
  		*/
  var getVolume: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns if the media is currently playing
  		* @returns Boolean playing true if the media is playing.
  		*/
  var isPlaying: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.Element) */
  var media: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (Boolean) */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Pauses media playback  */
  var pause: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Starts or resumes media playback  */
  var play: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var preload: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the value of autoPause
  		* @param autoPause Boolean The new value.
  		*/
  var setAutoPause: js.UndefOr[js.Function1[/* autoPause */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoResume
  		* @param autoResume Boolean The new value.
  		*/
  var setAutoResume: js.UndefOr[js.Function1[/* autoResume */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of enableControls
  		* @param enableControls Boolean The new value.
  		*/
  var setEnableControls: js.UndefOr[js.Function1[/* enableControls */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of loop
  		* @param loop Boolean The new value.
  		*/
  var setLoop: js.UndefOr[js.Function1[/* loop */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of media
  		* @param media Ext.Element The new value.
  		*/
  var setMedia: js.UndefOr[js.Function1[/* media */ js.UndefOr[IElement], scala.Unit]] = js.undefined
  /** [Method] Sets the value of muted
  		* @param muted Boolean The new value.
  		*/
  var setMuted: js.UndefOr[js.Function1[/* muted */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of preload
  		* @param preload Boolean The new value.
  		*/
  var setPreload: js.UndefOr[js.Function1[/* preload */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of volume
  		* @param volume Number The new value.
  		*/
  var setVolume: js.UndefOr[js.Function1[/* volume */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Stops media playback and returns to the beginning  */
  var stop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Toggles the media playback state  */
  var toggle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Updates the controls of the video element
  		* @param enableControls Object
  		*/
  var updateEnableControls: js.UndefOr[js.Function1[/* enableControls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Updates the loop setting of the media element
  		* @param loop Object
  		*/
  var updateLoop: js.UndefOr[js.Function1[/* loop */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the URL of the media element
  		* @param newUrl Object
  		*/
  var updateUrl: js.UndefOr[js.Function1[/* newUrl */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object IMedia {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    autoPause: js.UndefOr[scala.Boolean] = js.undefined,
    autoResume: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: js.Function0[scala.Unit] = null,
    enableControls: js.UndefOr[scala.Boolean] = js.undefined,
    getAutoPause: js.Function0[scala.Boolean] = null,
    getAutoResume: js.Function0[scala.Boolean] = null,
    getCurrentTime: js.Function0[scala.Double] = null,
    getDuration: js.Function0[scala.Double] = null,
    getEnableControls: js.Function0[scala.Boolean] = null,
    getLoop: js.Function0[scala.Boolean] = null,
    getMedia: js.Function0[IElement] = null,
    getMuted: js.Function0[scala.Boolean] = null,
    getPreload: js.Function0[scala.Boolean] = null,
    getUrl: js.Function0[java.lang.String] = null,
    getVolume: js.Function0[scala.Double] = null,
    initialize: js.Function0[scala.Unit] = null,
    isPlaying: js.Function0[scala.Boolean] = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    media: IElement = null,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    pause: js.Function0[scala.Unit] = null,
    play: js.Function0[scala.Unit] = null,
    preload: js.UndefOr[scala.Boolean] = js.undefined,
    setAutoPause: js.Function1[/* autoPause */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAutoResume: js.Function1[/* autoResume */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setEnableControls: js.Function1[/* enableControls */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setLoop: js.Function1[/* loop */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setMedia: js.Function1[/* media */ js.UndefOr[IElement], scala.Unit] = null,
    setMuted: js.Function1[/* muted */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setPreload: js.Function1[/* preload */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUrl: js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setVolume: js.Function1[/* volume */ js.UndefOr[scala.Double], scala.Unit] = null,
    stop: js.Function0[scala.Unit] = null,
    toggle: js.Function0[scala.Unit] = null,
    updateEnableControls: js.Function1[/* enableControls */ js.UndefOr[js.Any], scala.Unit] = null,
    updateLoop: js.Function1[/* loop */ js.UndefOr[js.Any], scala.Unit] = null,
    updateUrl: js.Function1[/* newUrl */ js.UndefOr[js.Any], scala.Unit] = null,
    url: java.lang.String = null,
    volume: scala.Int | scala.Double = null
  ): IMedia = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(autoPause)) __obj.updateDynamic("autoPause")(autoPause)
    if (!js.isUndefined(autoResume)) __obj.updateDynamic("autoResume")(autoResume)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enableControls)) __obj.updateDynamic("enableControls")(enableControls)
    if (getAutoPause != null) __obj.updateDynamic("getAutoPause")(getAutoPause)
    if (getAutoResume != null) __obj.updateDynamic("getAutoResume")(getAutoResume)
    if (getCurrentTime != null) __obj.updateDynamic("getCurrentTime")(getCurrentTime)
    if (getDuration != null) __obj.updateDynamic("getDuration")(getDuration)
    if (getEnableControls != null) __obj.updateDynamic("getEnableControls")(getEnableControls)
    if (getLoop != null) __obj.updateDynamic("getLoop")(getLoop)
    if (getMedia != null) __obj.updateDynamic("getMedia")(getMedia)
    if (getMuted != null) __obj.updateDynamic("getMuted")(getMuted)
    if (getPreload != null) __obj.updateDynamic("getPreload")(getPreload)
    if (getUrl != null) __obj.updateDynamic("getUrl")(getUrl)
    if (getVolume != null) __obj.updateDynamic("getVolume")(getVolume)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (isPlaying != null) __obj.updateDynamic("isPlaying")(isPlaying)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (media != null) __obj.updateDynamic("media")(media)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (pause != null) __obj.updateDynamic("pause")(pause)
    if (play != null) __obj.updateDynamic("play")(play)
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload)
    if (setAutoPause != null) __obj.updateDynamic("setAutoPause")(setAutoPause)
    if (setAutoResume != null) __obj.updateDynamic("setAutoResume")(setAutoResume)
    if (setEnableControls != null) __obj.updateDynamic("setEnableControls")(setEnableControls)
    if (setLoop != null) __obj.updateDynamic("setLoop")(setLoop)
    if (setMedia != null) __obj.updateDynamic("setMedia")(setMedia)
    if (setMuted != null) __obj.updateDynamic("setMuted")(setMuted)
    if (setPreload != null) __obj.updateDynamic("setPreload")(setPreload)
    if (setUrl != null) __obj.updateDynamic("setUrl")(setUrl)
    if (setVolume != null) __obj.updateDynamic("setVolume")(setVolume)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (updateEnableControls != null) __obj.updateDynamic("updateEnableControls")(updateEnableControls)
    if (updateLoop != null) __obj.updateDynamic("updateLoop")(updateLoop)
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl)
    if (url != null) __obj.updateDynamic("url")(url)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMedia]
  }
}

