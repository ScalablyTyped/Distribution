package typings.sammy.Sammy

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormBuilder
  extends Instantiable2[/* name */ js.Any, /* object */ js.Any, js.Any] {
  
  def checkbox(keypath: String, value: js.Any, attributes: js.Any*): String = js.native
  
  def close(): String = js.native
  
  def hidden(keypath: String, attributes: js.Any*): String = js.native
  
  def label(keypath: String, content: js.Any, attributes: js.Any*): String = js.native
  
  def open(attributes: js.Any*): js.Any = js.native
  
  def password(keypath: String, attributes: js.Any*): String = js.native
  
  def radio(keypath: String, value: js.Any, attributes: js.Any*): String = js.native
  
  def select(keypath: String, options: js.Any, attributes: js.Any*): String = js.native
  
  def submit(attributes: js.Any*): String = js.native
  
  def text(keypath: String, attributes: js.Any*): String = js.native
  
  def textarea(keypath: String, attributes: js.Any*): String = js.native
}
