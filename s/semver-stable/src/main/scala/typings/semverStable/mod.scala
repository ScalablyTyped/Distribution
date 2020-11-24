package typings.semverStable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver-stable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def is(version: String): Boolean = js.native
  
  def max(versions: js.Array[String]): String = js.native
  
  def maxSatisfying(versions: js.Array[String], range: String): String = js.native
}
