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

