package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warningMod {
  
  @JSImport("rc-util/lib/warning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def call(
    method: js.Function2[/* valid */ Boolean, /* message */ String, Unit],
    valid: Boolean,
    message: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def note(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("note")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def noteOnce(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noteOnce")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarned")().asInstanceOf[Unit]
  
  @scala.inline
  def warning(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def warningOnce(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warningOnce")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
