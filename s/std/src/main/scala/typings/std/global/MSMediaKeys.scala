package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSMediaKeys")
@js.native
class MSMediaKeys protected ()
  extends typings.std.MSMediaKeys {
  def this(keySystem: java.lang.String) = this()
}

@JSGlobal("MSMediaKeys")
@js.native
object MSMediaKeys
  extends Instantiable1[/* keySystem */ java.lang.String, typings.std.MSMediaKeys] {
  def isTypeSupported(keySystem: java.lang.String): scala.Boolean = js.native
  def isTypeSupported(keySystem: java.lang.String, `type`: java.lang.String): scala.Boolean = js.native
  def isTypeSupportedWithFeatures(keySystem: java.lang.String): java.lang.String = js.native
  def isTypeSupportedWithFeatures(keySystem: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
}

