package typings.routeDashRecognizer.distRouteDashRecognizerDslMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-recognizer/dist/route-recognizer/dsl", "Matcher")
@js.native
class Matcher () extends js.Object {
  def this(target: String) = this()
  var children: StringDictionary[js.UndefOr[Matcher]] = js.native
  var routes: StringDictionary[js.UndefOr[String]] = js.native
  var target: js.UndefOr[String] = js.native
  def add(path: String, target: String): Unit = js.native
  def addChild(path: String, target: String, callback: MatchCallback): Unit = js.native
  def addChild(path: String, target: String, callback: MatchCallback, delegate: Delegate): Unit = js.native
}

