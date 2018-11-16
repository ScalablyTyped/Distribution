package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Camera extends js.Object {
  var angle: scala.Double
  var ratio: scala.Double
  var readPrefix: java.lang.String
  var x: scala.Double
  var y: scala.Double
  def cameraPosition(x: scala.Double, y: scala.Double): sigmajsLib.Anon_Y
  def goTo(settings: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit
  def graphPosition(x: scala.Double, y: scala.Double): sigmajsLib.Anon_Y
  def settings(setting: java.lang.String): js.Any
}

