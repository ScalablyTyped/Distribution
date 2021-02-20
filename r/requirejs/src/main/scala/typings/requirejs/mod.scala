package typings.requirejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("module", "config")
  @js.native
  def config(): js.Any = js.native
  
  @JSImport("module", "id")
  @js.native
  def id: String = js.native
  @scala.inline
  def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  
  @JSImport("module", "uri")
  @js.native
  def uri: String = js.native
  @scala.inline
  def uri_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uri")(x.asInstanceOf[js.Any])
}
