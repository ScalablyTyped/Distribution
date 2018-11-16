package typings
package senchaUnderscoreTouchLib.ExtNs.eventNs.recognizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRecognizer
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IIdentifiable {
  /** [Method] Returns the value of callbackScope
  		* @returns Object
  		*/
  var getCallbackScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Retrieves the id of this component
  		* @returns String id
  		*/
  @JSName("getId")
  var getId_IRecognizer: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of onFailed
  		* @returns Object
  		*/
  var getOnFailed: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of onRecognized
  		* @returns Object
  		*/
  var getOnRecognized: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of callbackScope
  		* @param callbackScope Object The new value.
  		*/
  var setCallbackScope: js.UndefOr[js.Function1[/* callbackScope */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of onFailed
  		* @param onFailed Object The new value.
  		*/
  var setOnFailed: js.UndefOr[js.Function1[/* onFailed */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of onRecognized
  		* @param onRecognized Object The new value.
  		*/
  var setOnRecognized: js.UndefOr[js.Function1[/* onRecognized */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

