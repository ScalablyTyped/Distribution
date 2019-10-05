package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPreloadManager extends js.Object {
  def disable(): js.Promise[Unit]
  def enable(): js.Promise[Unit]
  def getState(): js.Promise[NavigationPreloadState]
  def setHeaderValue(value: java.lang.String): js.Promise[Unit]
}

@JSGlobal("NavigationPreloadManager")
@js.native
object NavigationPreloadManager extends Instantiable0[NavigationPreloadManager]

