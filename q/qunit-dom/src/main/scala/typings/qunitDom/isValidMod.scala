package typings.qunitDom

import typings.qunitDom.anon.Inverted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidMod {
  
  @JSImport("qunit-dom/dist/assertions/is-valid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  @scala.inline
  def default(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default(message: String, options: Inverted): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def default(message: Unit, options: Inverted): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
