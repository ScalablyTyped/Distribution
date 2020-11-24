package typings.stringScore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait String extends js.Object {
  
  def score(word: java.lang.String): Double = js.native
  def score(word: java.lang.String, fuzzy: Double): Double = js.native
}
