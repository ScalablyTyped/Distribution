package typings.semverTruncate

import typings.semverTruncate.semverTruncateStrings.major
import typings.semverTruncate.semverTruncateStrings.minor
import typings.semverTruncate.semverTruncateStrings.patch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(version: String, `type`: major): String = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(version: String, `type`: minor): String = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(version: String, `type`: patch): String = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("semver-truncate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
