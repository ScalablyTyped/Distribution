package typings.semverStable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver-stable", "is")
  @js.native
  def is(version: String): Boolean = js.native
  
  @JSImport("semver-stable", "max")
  @js.native
  def max(versions: js.Array[String]): String = js.native
  
  @JSImport("semver-stable", "maxSatisfying")
  @js.native
  def maxSatisfying(versions: js.Array[String], range: String): String = js.native
}
