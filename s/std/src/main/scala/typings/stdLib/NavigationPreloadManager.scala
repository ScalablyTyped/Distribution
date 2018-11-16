package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigationPreloadManager extends js.Object {
  def disable(): Promise[scala.Unit]
  def enable(): Promise[scala.Unit]
  def getState(): Promise[NavigationPreloadState]
  def setHeaderValue(value: java.lang.String): Promise[scala.Unit]
}

@JSGlobal("NavigationPreloadManager")
@js.native
object NavigationPreloadManager
  extends ScalablyTyped.runtime.Instantiable0[NavigationPreloadManager]

