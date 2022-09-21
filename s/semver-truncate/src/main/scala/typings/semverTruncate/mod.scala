package typings.semverTruncate

import typings.semverTruncate.semverTruncateStrings.major
import typings.semverTruncate.semverTruncateStrings.minor
import typings.semverTruncate.semverTruncateStrings.patch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver-truncate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(version: String, `type`: patch | minor | major): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(version.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
}
