package typings

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sketchapp {
  type SketchMSEncodedBase64BinaryPlist = String
  type SketchMSNSColorArchive = SketchMSKeyValueArchive
  type SketchMSPagesAndArtboards = StringDictionary[SketchMSArtboards]
  type SketchMSPointString = String
  type SketchMSUserData = SketchMSUserDocument | SketchMSUserPage
  type SketchMSUserPage = StringDictionary[Anon_ScrollOrigin]
}
