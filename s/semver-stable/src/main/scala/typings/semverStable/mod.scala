package typings.semverStable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver-stable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def is(version: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(version.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def max(versions: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(versions.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def maxSatisfying(versions: js.Array[String], range: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("maxSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[String]
}
