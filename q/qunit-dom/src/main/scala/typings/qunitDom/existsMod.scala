package typings.qunitDom

import typings.qunitDom.assertionsMod.ExistsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object existsMod {
  
  @JSImport("qunit-dom/dist/assertions/exists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  @scala.inline
  def default(options: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default(options: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def default(options: Unit, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def default(options: ExistsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default(options: ExistsOptions, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
