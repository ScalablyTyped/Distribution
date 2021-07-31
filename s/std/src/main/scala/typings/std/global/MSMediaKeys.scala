package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MSMediaKeys")
@js.native
class MSMediaKeys protected ()
  extends StObject
     with typings.std.MSMediaKeys {
  def this(keySystem: java.lang.String) = this()
}
object MSMediaKeys {
  
  @JSGlobal("MSMediaKeys")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isTypeSupported(keySystem: java.lang.String): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupported")(keySystem.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isTypeSupported(keySystem: java.lang.String, `type`: java.lang.String): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupported")(keySystem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTypeSupportedWithFeatures(keySystem: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupportedWithFeatures")(keySystem.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def isTypeSupportedWithFeatures(keySystem: java.lang.String, `type`: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupportedWithFeatures")(keySystem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
