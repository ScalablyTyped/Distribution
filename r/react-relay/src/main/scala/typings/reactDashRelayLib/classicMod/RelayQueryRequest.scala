package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RelayQueryRequest extends js.Object {
  def getDebugName(): java.lang.String
  def getID(): java.lang.String
  def getQueryString(): java.lang.String
  def getVariables(): RelayVariables
  def reject(errors: js.Any): js.Any
  def resolve(result: RelayQueryRequestResolve): js.Any
}

