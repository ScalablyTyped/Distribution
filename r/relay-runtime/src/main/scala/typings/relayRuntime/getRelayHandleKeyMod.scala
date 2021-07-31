package typings.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRelayHandleKeyMod {
  
  @JSImport("relay-runtime/lib/util/getRelayHandleKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(handleName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handleName.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(handleName: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(handleName.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(handleName: String, key: String, fieldName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(handleName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(handleName: String, key: Null, fieldName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(handleName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(handleName: String, key: Unit, fieldName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(handleName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[String]
}
