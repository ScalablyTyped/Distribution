package typings.reactNativeWindowsCli.versionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/version", JSImport.Default)
@js.native
class default protected () extends Version {
  def this(major: Double) = this()
  def this(major: Double, minor: Double) = this()
  def this(major: Double, minor: js.UndefOr[scala.Nothing], build: Double) = this()
  def this(major: Double, minor: Double, build: Double) = this()
  def this(major: Double, minor: js.UndefOr[scala.Nothing], build: js.UndefOr[scala.Nothing], qfe: Double) = this()
  def this(major: Double, minor: js.UndefOr[scala.Nothing], build: Double, qfe: Double) = this()
  def this(major: Double, minor: Double, build: js.UndefOr[scala.Nothing], qfe: Double) = this()
  def this(major: Double, minor: Double, build: Double, qfe: Double) = this()
}
/* static members */
@JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/version", JSImport.Default)
@js.native
object default extends js.Object {
  
  def compare(x: Version, y: Version): Double = js.native
  
  def fromString(str: String): Version = js.native
  
  def tryParse(str: String): Version | Null = js.native
}
