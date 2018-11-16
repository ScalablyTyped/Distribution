package typings
package qlikDashVisualizationextensionsLib.GlobalAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlobal extends js.Object {
  /**
           * Cancels an ongoing reload. The reload of the app is stopped.
           * @return - A promise of a Qlik engine reply.
           */
  def cancelReload(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets a list of Qlik Sense apps that you potentially can connect to and
           * registers a callback to receive the data. Calling the getAppList method
           * opens a WebSocket, gets the app list, and then keeps the WebSocket open
           * for you to make other calls as well.
           * @param callback - Callback method.
           */
  def getAppList(callback: js.Any): scala.Unit = js.native
  /**
           * Gets information (user directory and user id) about the authenticated user.
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def getAuthenticatedUser(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets information (user directory and user id) about the authenticated user.
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def getAuthenticatedUser(callback: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets the product version.
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def getProductVersion(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets the product version.
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def getProductVersion(callback: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets information about progress of doReload and doSave calls.
           * @param qRequestId - Request id from doReload call or 0.
           * Complete information is returned if the identifier of the request is specified.
           * If qRequestId = 0, less information is returned.
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def getProgress(qRequestId: scala.Double): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets information about progress of doReload and doSave calls.
           * @param qRequestId - Request id from doReload call or 0.
           * Complete information is returned if the identifier of the request is specified.
           * If qRequestId = 0, less information is returned.
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def getProgress(qRequestId: scala.Double, callback: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets the Qlik product name.
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def getQTProduct(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets the Qlik product name.
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def getQTProduct(callback: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets the Qlik Sense version number.
           * @param [callback] - Optional. Callback method.
           * @return - A promise.
           */
  def getQvVersion(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets the Qlik Sense version number.
           * @param [callback] - Optional. Callback method.
           * @return - A promise.
           */
  def getQvVersion(callback: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets information if the user is working in personal mode
           * (returns true if Qlik Sense Desktop is used) or not
           * (returns false if Qlik Sense Desktop is not used).
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def isPersonalMode(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
           * Gets information if the user is working in personal mode
           * (returns true if Qlik Sense Desktop is used) or not
           * (returns false if Qlik Sense Desktop is not used).
           * @param [callback] - Optional. Callback method.
           * @return - A promise of a Qlik engine reply.
           */
  def isPersonalMode(callback: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
}

