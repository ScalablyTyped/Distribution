package typings.randombytes

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof _randomBytes` */
  @JSImport("randombytes", JSImport.Namespace)
  @js.native
  def apply(size: Double): Buffer = js.native
  /* was `typeof _randomBytes` */
  @JSImport("randombytes", JSImport.Namespace)
  @js.native
  def apply(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
}
