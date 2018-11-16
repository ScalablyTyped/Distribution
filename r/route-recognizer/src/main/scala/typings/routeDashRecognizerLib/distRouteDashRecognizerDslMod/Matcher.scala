package typings
package routeDashRecognizerLib.distRouteDashRecognizerDslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-recognizer/dist/route-recognizer/dsl", "Matcher")
@js.native
class Matcher () extends js.Object {
  def this(target: java.lang.String) = this()
  var children: ScalablyTyped.runtime.StringDictionary[js.UndefOr[Matcher]] = js.native
  var routes: ScalablyTyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = js.native
  var target: js.UndefOr[java.lang.String] = js.native
  def add(path: java.lang.String, target: java.lang.String): scala.Unit = js.native
  def addChild(path: java.lang.String, target: java.lang.String, callback: MatchCallback): scala.Unit = js.native
  def addChild(path: java.lang.String, target: java.lang.String, callback: MatchCallback, delegate: Delegate): scala.Unit = js.native
}

