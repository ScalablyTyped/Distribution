package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MSMediaKeys")
@js.native
class MSMediaKeys protected ()
  extends typings.std.MSMediaKeys {
  def this(keySystem: java.lang.String) = this()
}
object MSMediaKeys {
  
  @JSGlobal("MSMediaKeys.isTypeSupported")
  @js.native
  def isTypeSupported(keySystem: java.lang.String): scala.Boolean = js.native
  @JSGlobal("MSMediaKeys.isTypeSupported")
  @js.native
  def isTypeSupported(keySystem: java.lang.String, `type`: java.lang.String): scala.Boolean = js.native
  
  @JSGlobal("MSMediaKeys.isTypeSupportedWithFeatures")
  @js.native
  def isTypeSupportedWithFeatures(keySystem: java.lang.String): java.lang.String = js.native
  @JSGlobal("MSMediaKeys.isTypeSupportedWithFeatures")
  @js.native
  def isTypeSupportedWithFeatures(keySystem: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
}
